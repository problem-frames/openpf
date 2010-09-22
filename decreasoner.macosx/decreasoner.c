/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors: 
 * IBM - Initial implementation
 */

#include <ctype.h>
#include <stdarg.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/stat.h>
#include <time.h>
#include <unistd.h>

#define CREATE(type) ((type *) Malloc(sizeof(type)))
/* STREQ does not work on length 0 strings */
#define STREQ(a,b) (((a)[0]==(b)[0]) && \
                    ((a)[1]==(b)[1]) && \
                    (strcmp((a),(b))==0))
#define NAMELEN 256
#define INTNA -999999999
#define LISTDEFLEN 16
#define AtomToString(a) ((a)->type==LIST_ATOM ? (a)->u.atom : "")
#define IntegerToInt(a) ((a)->type==LIST_INTEGER ? (a)->u.integer : INTNA)
#define AtomEquals(a1,a2) ((a1)==(a2))
#define ListLen(l) ((l)->type==LIST_LIST ? (int)l->u.list->len : 0)
#define ListNth(l,n) ((l)->type==LIST_LIST && \
                      (n)>=0 && (n)<=(l)->u.list->len ? \
                      (l)->u.list->elems[n] : NULL)
#define ListNthString(l,n) ((l)->type==LIST_LIST && \
                            (n)>=0 && (n)<=(l)->u.list->len ? \
                            AtomToString((l)->u.list->elems[n]) : NULL)
#define ListNthInteger(l,n) ((l)->type==LIST_LIST && \
                             (n)>=0 && (n)<=(l)->u.list->len ? \
                             IntegerToInt((l)->u.list->elems[n]) : INTNA)
#define ListNthSet(l,n,v) ((l)->u.list->elems[n]=(v))

typedef short Bool;

typedef struct DictEntry_s {
  char  *symbol;
  char  *value;
  struct DictEntry_s *next;
} DictEntry;

typedef struct Dict_s {
  size_t        size;
  DictEntry     *dictentries[5];
} Dict;

#define LIST_ATOM 'a'
#define LIST_INTEGER 'i'
#define LIST_LIST 'l'

typedef struct ListList_s {
  size_t len;
  struct List_s *elems[5];
} ListList;

typedef struct List_s {
  char type;
  union {
    char *atom;
    int integer;
    ListList *list;
  } u;
} List;

typedef struct StringBuffer_s {
  size_t len;
  size_t size;
  char *s;
} StringBuffer;

FILE *StreamOpen(char *filename,char *mode);
void StreamClose(FILE *stream);
char *ReadFile(char *filename);
void *Malloc(size_t size);
void *Realloc(void *ptr,size_t size);
void Free(void *ptr);
int IntParse(char *s);
int IntParseWErr(char *s);
Bool IsValidInt(char *s);
StringBuffer *StringBufferCreate();
int StringBufferLength(StringBuffer *sb);
char *StringBufferToString(StringBuffer *sb);
void StringBufferFree(StringBuffer *sb);
void StringBufferAppend(StringBuffer *sb,char *s);
void StringBufferAppendChar(StringBuffer *sb,int c);
List *StringSplit(char *s,int c);
List *StringSplitToNewline(char *s,int c,/* OUTPUT */ char **nextp);
Bool StringHeadEqualAdvance(char *s1,char *s2,/* OUTPUT */ char **nextp);
Bool StringHeadEqual(char *s1,char *s2);
char *StringReadTo(char *in,int sep,/* OUTPUT */ char *out,int maxlen);
int DictHash(Dict *d,char *symbol);
Dict *DictCreate(size_t size);
void DictFree(Dict *d);
void *DictGet(Dict *d,char *symbol);
void DictSet(Dict *d,char *symbol,void *value);
Bool DictHasKey(Dict *d, char *symbol);
List *DictKeys(Dict *d);
char *DictToString(Dict *d);
char *AtomDictToString(Dict *d);
char *ListDictToString(Dict *d);
Dict *DictCopy(Dict *d);
void DictAppend(Dict *d, char *symbol, List *x);
int DictGetInteger(Dict *d, char *symbol, int defaultx);
void DictIncr(Dict *d, char *symbol, int n);
void LogInit(FILE *stream);
void Log(char *fmt,...);
void RandomInit();
void RandomSeed(long seed);
int Roll(int n);
double RandomDouble0_1();
double RandomDoubleFromTo(double from, double to);
int RandomIntFromTo(int from, int to);
Bool WithProbability(double x);
Bool IsAtom(List *x);
Bool IsInteger(List *x);
Bool IsList(List *x);
void ListInit();
List *AtomCreate(char *s);
List *IntegerCreate(int i);
List *IntToAtom(int i);
List *ListCreate();
void ListAppend(List *l,List *e);
void ListAppendCopy(List *l,List *e);
List *ListCopy(List *l);
List *ListDefine(List *elem0,...);
void ListDelete(List *l, int i);
void ListFree(List *l);
char *ListNthStringWErr(List *l,int n);
void ListAppendList(List *l,List *l1);
void ListAppendListCopy(List *l,List *l1);
List *ListDrop(int n,List *l);
List *ListShuffle(List *l);
List *ListRandomElement(List *l);
Bool ListEquals(List *l1,List *l2);
Bool AtomIn(List *a,List *l);
Bool ListIn(List *e,List *l);
Bool ListDeepIn(List *e,List *l);
Bool ListIsDistinct(List *e);
List *ListMinus(List *x0, List *x1);
List *ListUniq(List *x);
int ListDiota(List *x,List *e);
Bool ListLenNot(List *l,int len);
List *ListRead(char *s);
void ListRead1(char *s,int i,/* OUTPUT */ List **rList,int *rI);
char *ListToString(List *x);
void ListLeakCheck(char *fn,int numlistsBefore,List *in,List *out);

extern int numlists;

/*
#define CHECKX
*/

#define FORMULAS_SOURCECODE_I 0
#define FORMULAS_WEIGHT_I     1
#define FORMULAS_FORMULA_I    2

#define CLAUSES_POS_I        0
#define CLAUSES_NEG_I        1
#define CLAUSES_SOURCECODE_I 2
#define CLAUSES_WEIGHT_I     3

#define SOURCECODE_AXIOM                     '0'
#define SOURCECODE_TRANSFORMED_EFFECT_AXIOM  '1'
#define SOURCECODE_ORIGINAL_EFFECT_AXIOM     '2'
#define SOURCECODE_ORIGINAL_TRAJECTORY_AXIOM '3'
#define SOURCECODE_EC_AXIOM                  '4'
#define SOURCECODE_LABEL_BEGIN               '5'

#define LINELEN 4096

#define A AtomCreate
#define C ListCopy
#define L ListDefine
#define E NULL
#define Nth ListNth
#define NthString ListNthString

typedef struct CrossProductIterator_s {
  Bool done;
  List *x;
  int len;
  int *indices;
  int *lens;
  int n;
  struct PercentComplete_s *pc;
} CrossProductIterator;

typedef struct Clause_s {
  List *clause;
  struct Clause_s *next;
} Clause;

typedef struct Encoder_s {
  int debug;
  int renaming;
  int encoding;
  int weighted;
  char *inputFilename;
  char *outputFilename;
  char *propositionFilename;
  FILE *propositionStream;
  Dict *sortD;
  Dict *constantD;
  Dict *formulaD;
  List *formulas;
  List *predicatesToComplete;
  int nextproposition;
  Clause *clauses;
  double minobjective;
  struct Sort_s *sorts;
  int mintime;
  int maxtime;
  List *initiates;
  List *terminates;
  List *releases;
  List *trajectory;
  List *antitrajectory;
  List *clipped;
  List *declipped;
} Encoder;

typedef struct Constant_s {
  char *name;
  Bool noninertial;
  List *sorts;
  List *argsorts;
  struct Sort_s *resultsort;
  Dict *valueD;
} Constant;

#define MAXPARENTS 16
#define MAXCHILDREN 32

typedef struct Sort_s {
  char *name;
  Bool reified;
  int numparents;
  struct Sort_s *parents[MAXPARENTS];
  int numchildren;
  struct Sort_s *children[MAXCHILDREN];
  List *constants;
  List *rconstants;
  int minint;
  int maxint;
  struct Sort_s *next;
} Sort;

typedef struct PercentComplete_s {
  char *name;
  int n;
  time_t start;
  time_t last;
  int cnt;
} PercentComplete;

#ifdef CHECK

void MemoryReport(Encoder *e)
{
  int numlistsFormulas,numlistsClauses;
  Clause *clause;

  numlistsFormulas=NumberOfListsIn(e->formulas);
  numlistsClauses=0;
  for (clause=e->clauses;clause;clause=clause->next) {
    numlistsClauses+=NumberOfListsIn(clause->clause);
  } 
  Log("%d lists (%d+%d=%d)",numlists,numlistsFormulas,numlistsClauses,
      numlistsFormulas+numlistsClauses);
}

#endif

PercentComplete *PercentCompleteCreate(char *name,int n)
{
  PercentComplete *pc;
  pc=CREATE(PercentComplete);
  pc->name=strdup(name);
  pc->n=n;
  pc->start=time(0);
  pc->last=pc->start;
  pc->cnt=0;
  return pc;
}

void PercentCompleteFree(PercentComplete *pc)
{
  Free(pc->name);
  Free(pc);
}

void PercentCompleteNext(PercentComplete *pc)
{
  time_t used;
  double frac, remain;
  if ((time(0)-pc->last)>15) {
    pc->last=time(0);
    frac=pc->cnt/(0.0+pc->n);
    used=pc->last-pc->start;
    remain=(used*((1/frac)-1))/60.0;
    Log("%s: %3.1f%% (%d/%d) %3.1fm left", pc->name, 100.0*frac,
        pc->cnt, pc->n, remain);
  }
  pc->cnt++;
}

Bool PredIs(char *pred,List *x)
{
  return IsList(x) && STREQ(pred,NthString(x,0));
}

/* x is not copied, so caller must keep it allocated until
 * CrossProductIteratorFree is called
 */
CrossProductIterator *CrossProductIteratorCreate(char *name, List *x)
{
  int i;
  CrossProductIterator *cpi;
  cpi=CREATE(CrossProductIterator);
  cpi->done=0;
  cpi->x=x;
  cpi->len=ListLen(x);
  cpi->indices=Malloc(cpi->len*sizeof(int));
  for (i=0;i<cpi->len;i++) cpi->indices[i]=0;
  cpi->lens=Malloc(cpi->len*sizeof(int));
  cpi->n=1;
  for (i=0;i<cpi->len;i++) {
    cpi->lens[i]=ListLen(Nth(x,i));
    cpi->n *= ListLen(Nth(x,i));
  }
  cpi->pc=PercentCompleteCreate(name,cpi->n);
  return cpi;
}

void CrossProductIteratorFree(CrossProductIterator *cpi)
{
  Free(cpi->indices);
  Free(cpi->lens);
  PercentCompleteFree(cpi->pc);
  Free(cpi);
}

/* returns freeable list */
List *CrossProductIteratorNext(CrossProductIterator *cpi)
{
  int i,j;
  List *r;
  PercentCompleteNext(cpi->pc);
  r=ListCreate();
  for (i=0;i<cpi->len;i++) {
    ListAppendCopy(r,Nth(Nth(cpi->x,i),cpi->indices[i]));
  }
  for (i=0;;i++) {
    if (i==cpi->len) {
      cpi->done=1;
      break;
    }
    cpi->indices[i]++;
    if (cpi->indices[i]!=cpi->lens[i]) break;
    for (j=i;j>=0;j--) cpi->indices[j]=0;
  }
  return r;
}

Bool CrossProductIteratorHasMoreElements(CrossProductIterator *cpi)
{
  return cpi->n>0 && !cpi->done;
}

Sort *SortCreate(Sort *next)
{
  Sort *sort;
  sort=CREATE(Sort);
  sort->name=NULL;
  sort->reified=0;
  sort->numparents=0;
  sort->numchildren=0;
  sort->constants=ListCreate();
  sort->rconstants=NULL;
  sort->minint=0;
  sort->maxint=-1;
  sort->next=next;
  return sort;
}

Constant *ConstantCreate()
{
  Constant *c;
  c=CREATE(Constant);
  c->name=NULL;
  c->noninertial=0;
  c->sorts=ListCreate();
  c->argsorts=ListCreate();
  c->resultsort=NULL;
  c->valueD=NULL;
  return c;
}

List *ConstantValueGet(Constant *c,List *arguments)
{
  char *key;
  List *r;
  if (c->valueD==NULL) return NULL;
  key=ListToString(arguments);
  r=(List *)DictGet(c->valueD,key);
  Free(key);
  return r;
}

void ConstantValueSet(Constant *c,List *arguments,List *value)
{
  char *key;
  if (c->valueD==NULL) {
    c->valueD=DictCreate(51L);
  }
  key=ListToString(arguments);
  DictSet(c->valueD,key,(void *)C(value));
  Free(key);
}

Sort *ESortGet(Encoder *e,char *name)
{
  return (Sort *)DictGet(e->sortD,name);
}

Sort *ESortGetWErr(Encoder *e,char *name)
{
  Sort *sort;
  if (NULL==(sort=ESortGet(e,name))) {
    Log("ERROR: unable to get sort <%s>",name);
    return NULL;
  }
  return sort;
}

Bool SortSubsort1(Sort *anc,Sort *des)
{
  int i;
  if (anc==des) return 1;
  for (i=0;i<des->numparents;i++) {
    if (SortSubsort1(anc,des->parents[i])) return 1;
  }
  return 0;
}

Bool SortSubsort(Encoder *e,char *ancname,Sort *des)
{
  Sort *anc;
  anc=ESortGetWErr(e,ancname);
  if (anc==NULL) return 0;
  return SortSubsort1(anc,des);
}

Bool SortSubsortString(Encoder *e,char *ancname,char *desname)
{
  Sort *des;
  des=ESortGetWErr(e,desname);
  if (des==NULL) return 0;
  return SortSubsort(e,ancname,des);
}

Bool ConstantSubsort(Encoder *e,char *s,Constant *c)
{
  int len,i;
  Sort *sort;
  len=ListLen(c->sorts);
  for (i=0;i<len;i++) {
    sort=ESortGetWErr(e,AtomToString(Nth(c->sorts,i)));
    if (sort==NULL) continue;
    if (SortSubsort(e,s,sort)) return 1;
  }
  return 0;
}

void SortParentAdd(Sort *sort,Sort *parent)
{
  if (sort->numparents>=MAXPARENTS) {
    Log("ERROR: increase MAXPARENTS %s %s",sort->name,parent->name);
    exit(1);
  }
  sort->parents[sort->numparents]=parent;
  sort->numparents++;
  if (parent->numchildren>=MAXCHILDREN) {
    Log("ERROR: increase MAXCHILDREN %s %s",sort->name,parent->name);
    exit(1);
  }
  parent->children[parent->numchildren]=sort;
  parent->numchildren++;
}

void SortConstantAdd(Sort *sort,Constant *c)
{
  ListAppend(sort->constants,A(c->name));
}

void ConstantSortAdd(Constant *c,Sort *sort)
{
  if (!AtomIn(A(sort->name),c->sorts)) {
    ListAppend(c->sorts,A(sort->name));
    SortConstantAdd(sort,c);
  }
}

Sort *ESortCreate(Encoder *e,char *name,Bool reified,char *parentname)
{
  Sort *sort,*parent;
  if (NULL!=(sort=ESortGet(e,name))) {
    Log("ignored redefinition of sort <%s>",name);
    return sort;
  }
  sort=SortCreate(e->sorts);
  sort->name=strdup(name);
  sort->reified=reified;
  if (!STREQ(parentname,"na")) {
    if (NULL!=(parent=ESortGetWErr(e,parentname))) {
      SortParentAdd(sort,parent);
    }
  }
  DictSet(e->sortD,name,(void *)sort);
  e->sorts=sort;
  return sort;
}

Constant *EConstantGet(Encoder *e,char *name)
{
  return (Constant *)DictGet(e->constantD,name);
}

Constant *ListNthConstant(Encoder *e,List *l,int n)
{
  List *l1;
  l1=Nth(l,n);
  if (l1==NULL) return NULL;
  return EConstantGet(e,AtomToString(l1));
}

Constant *ListNthConstantWErr(Encoder *e,List *l,int n)
{
  Constant *r;
  r=ListNthConstant(e,l,n);
  if (r==NULL) {
    Log("ERROR: trouble getting nth constant");
  }
  return r;
}

Constant *EConstantGetWErr(Encoder *e,char *name)
{
  Constant *r;
  r=EConstantGet(e,name);
  if (r==NULL) {
    Log("ERROR: trouble getting constant <%s>",name);
  }
  return r;
}

Constant *EConstantCreate(Encoder *e,char *name,Sort *sort,
                              List *argsorts,char *resultsortname,
                              Bool redefineOK)
{
  Constant *c;
  if (NULL!=(c=EConstantGet(e,name))) {
    if (!redefineOK) {
      Log("ignored redefinition of constant <%s>",name);
      return c;
    }
  } else {
    c=ConstantCreate();
    c->name=strdup(name);
    DictSet(e->constantD,name,(void *)c);
  }
  ConstantSortAdd(c,sort);
  if (argsorts!=NULL) {
    c->argsorts=C(argsorts);
  }
  if (resultsortname!=NULL) {
    c->resultsort=ESortGetWErr(e,resultsortname);
  }
  return c;
}

List *ESortConstants(Encoder *e,List *sortnames);

List *ESortRConstantsGet(Encoder *e,Sort *sort)
{
  int len,i;
  Constant *constant;
  CrossProductIterator *cpi;
  List *constants,*r,*e1,*e2,*t;
  r=ListCreate();
  len=ListLen(sort->constants);
  for (i=0;i<len;i++) {
    e1=Nth(sort->constants,i);
    if ((constant=EConstantGetWErr(e,AtomToString(e1)))) {
      if (ListLen(constant->argsorts)==0) {
        ListAppend(r,L(C(e1),E));
      } else {
        constants=ESortConstants(e,constant->argsorts);
        cpi=CrossProductIteratorCreate("rconstants",constants);
        while (CrossProductIteratorHasMoreElements(cpi)) {
          e2=CrossProductIteratorNext(cpi);
          t=L(C(e1),E);
          ListAppendListCopy(t,e2);
          ListFree(e2);
          ListAppend(r,t);
        }
        CrossProductIteratorFree(cpi);
        ListFree(constants);
      }
    }   
  }
  return r;
}

void ESortConstantsGet2(Encoder *e,Sort *sort,/* OUTPUT */ List *r)
{
  int len,i;
  if (sort->reified) {
    if (!sort->rconstants) {
      sort->rconstants=ESortRConstantsGet(e,sort);
    }
    len=ListLen(sort->rconstants);
    for (i=0;i<len;i++) {
      ListAppendCopy(r,Nth(sort->rconstants,i));
    }
  } else {
    len=ListLen(sort->constants);
    for (i=0;i<len;i++) {
      ListAppendCopy(r,Nth(sort->constants,i));
    }
  }
}

void ESortConstantsGet1(Encoder *e,Sort *sort,/* OUTPUT */ List *r)
{
  int i;
  for (i=0;i<sort->numchildren;i++) {
    ESortConstantsGet1(e,sort->children[i],r);
  }
  ESortConstantsGet2(e,sort,r);
}

/* returns freeable list */
List *ESortConstantsGet(Encoder *e,Sort *sort)
{
  List *r;
  r=ListCreate();
  ESortConstantsGet1(e,sort,r);
  return r;
}

void SortNonReifiedConstantsGet1(Sort *sort,/* OUTPUT */ List *r)
{
  int i, len;
  for (i=0;i<sort->numchildren;i++) {
    SortNonReifiedConstantsGet1(sort->children[i],r);
  }
  len=ListLen(sort->constants);
  for (i=0;i<len;i++) {
    ListAppendCopy(r,Nth(sort->constants,i));
  }
}

/* returns freeable list
 * includes descendants
 */
List *SortNonReifiedConstantsGet(Sort *sort)
{
  List *r;
  r=ListCreate();
  SortNonReifiedConstantsGet1(sort,r);
  return r;
}

/* returns freeable list */
List *ESortConstants(Encoder *e,List *sortnames)
{
  int len,i;
  Sort *sort;
  List *r;
  r=ListCreate();
  len=ListLen(sortnames);
  for (i=0;i<len;i++) {
    if ((sort=ESortGetWErr(e,ListNthStringWErr(sortnames,i)))) {
      ListAppend(r,ESortConstantsGet(e,sort));
    }
  }
  return r;
}

Encoder *ECreate()
{
  Encoder *e;
  e=CREATE(Encoder);
  e->debug=0;
  e->renaming=0;
  e->encoding=3;
  e->weighted=0;
  e->inputFilename=NULL;
  e->outputFilename=NULL;
  e->propositionFilename=NULL;
  e->propositionStream=NULL;
  e->sortD=DictCreate(5021L);
  e->constantD=DictCreate(5021L);
  e->formulaD=DictCreate(5021L);
  e->formulas=ListCreate();
  e->predicatesToComplete=ListCreate();
  e->nextproposition=1;
  e->clauses=NULL;
  e->minobjective=0.0;
  e->sorts=NULL;
  e->mintime=0;
  e->maxtime=0;
  e->initiates=NULL;
  e->terminates=NULL;
  e->releases=NULL;
  e->trajectory=NULL;
  e->antitrajectory=NULL;
  e->clipped=NULL;
  e->declipped=NULL;
  return e;
}

int numberOfClauses;

/* copies so caller may free clause */
void EClauseAdd(Encoder *e,List *clause,Bool isHardweight)
{
  int weight;
  Clause *c;
  c=CREATE(Clause);
  c->clause=C(clause);
  c->next=e->clauses;
  e->clauses=c;
  numberOfClauses++;
  if (e->weighted && !isHardweight) {
    weight = IntParseWErr(NthString(clause,CLAUSES_WEIGHT_I));
    e->minobjective += (double)weight;
  }
}

/* copies so caller may free clauses */
void EClauseAddMany(Encoder *e,List *clauses,Bool isHardweight)
{
  int len,i;
  len=ListLen(clauses);
  for(i=0;i<len;i++) {
    EClauseAdd(e,Nth(clauses,i),isHardweight);
  }
}

Bool ELoadRange(Encoder *e,char *s)
{
  int minint,maxint;
  int i;
  char t[NAMELEN];
  List *l;
  Sort *sort;
  Constant *c;
  if (!StringHeadEqualAdvance("range ",s,&s)) return 0;
  if (ListLenNot(l=StringSplit(s,' '),3)) goto done;
  if (NULL==(sort=ESortGetWErr(e,NthString(l,0)))) goto done;
  if (INTNA==(minint=IntParseWErr(NthString(l,1)))) goto done;
  if (INTNA==(maxint=IntParseWErr(NthString(l,2)))) goto done;
  sort->minint=minint;
  sort->maxint=maxint;
  if (STREQ(sort->name,"time")) {
    e->mintime=sort->minint;
    e->maxtime=sort->maxint;
  }
  for (i=minint; i<=maxint; i++) {
    sprintf(t,"%d",i);
    if (NULL==(c=EConstantGet(e,t))) {
      c=EConstantCreate(e,t,sort,NULL,NULL,0);
    } else {
      ConstantSortAdd(c,sort);
    }
  }
done:
  ListFree(l);
  return 1;
}

/* sort name parent */
Bool ELoadSort1(Encoder *e,char *s,Bool reified)
{
  List *l;
  if (ListLenNot(l=StringSplit(s,' '),2)) goto done;
  ESortCreate(e,NthString(l,0),reified,NthString(l,1));
done:
  ListFree(l);
  return 1;
}

Bool ELoadSortNonreified(Encoder *e,char *s)
{
  if (!StringHeadEqualAdvance("sort ",s,&s)) return 0;
  return ELoadSort1(e,s,0);
}

Bool ELoadSortReified(Encoder *e,char *s)
{
  if (!StringHeadEqualAdvance("reified sort ",s,&s)) return 0;
  return ELoadSort1(e,s,1);
}

Bool ELoadNoninertial(Encoder *e,char *s)
{
  int i,len;
  List *l;
  Constant *c;
  if (!StringHeadEqualAdvance("noninertial ",s,&s)) return 0;
  l=StringSplit(s,' ');
  len=ListLen(l);
  for (i=0;i<len;i++) {
    c=ListNthConstantWErr(e,l,i);
    if (c==NULL) continue;
    if (!ConstantSubsort(e,"event",c) &
        !ConstantSubsort(e,"fluent",c)) {
      Log("ERROR: <%s> not event/fluent",c->name);
      continue;
    }
    c->noninertial=1;
  }
  ListFree(l);
  return 1;
}

Bool ELoadCompletion(Encoder *e,char *s)
{
  char *label, *pred;
  List *l;
  if (!StringHeadEqualAdvance("completion ",s,&s)) return 0;
  l=StringSplit(s,' ');
  if (ListLen(l)!=2) {
    Log("ERROR: completion wrong length");
    return 1;
  }
  label=NthString(l,0);
  pred=NthString(l,1);
  ListAppend(e->predicatesToComplete,L(A(label),A(pred),E));
  ListFree(l);
  return 1;
}

/* constant sortname constantname ... */
Bool ELoadConstantNonreified(Encoder *e,char *s)
{
  char sortname[NAMELEN],*defn;
  int len,i;
  Sort *sort;
  List *l;
  if (!StringHeadEqualAdvance("constant ",s,&s)) return 0;
  defn=StringReadTo(s,' ',sortname,NAMELEN);
  if (NULL==(sort=ESortGetWErr(e,sortname))) return 1;
  if (sort->reified) {
    Log("ERROR: defining nonreified constant for reified sort <%s>",
        sortname);
    return 1;
  }
  l=StringSplit(defn,' ');
  len=ListLen(l);
  for (i=0;i<len;i++) {
    EConstantCreate(e,NthString(l,i),sort,NULL,NULL,1);
  }
  ListFree(l);
  return 1;
}

/* reified constant sortname name resultsortname argsortname ... */
Bool ELoadConstantReified(Encoder *e,char *s)
{
  char sortname[NAMELEN],*defn,*constantname,*resultsortname;
  Sort *sort;
  List *l,*argsorts;
  if (!StringHeadEqualAdvance("reified constant ",s,&s)) return 0;
  defn=StringReadTo(s,' ',sortname,NAMELEN);
  if (NULL==(sort=ESortGetWErr(e,sortname))) return 1;
  if (!sort->reified) {
    Log("ERROR: defining reified constant for nonreified sort <%s>",
        sort->name);
    return 1;
  }
  l=StringSplit(defn,' ');
  constantname=ListNthStringWErr(l,0);
  resultsortname=ListNthStringWErr(l,1);
  argsorts=ListDrop(2,l);
  EConstantCreate(e,constantname,sort,argsorts,resultsortname,1);
  ListFree(argsorts);
  ListFree(l);
  return 1;
}

/* function value functionname value argument ... */
Bool ELoadFunctionValue(Encoder *e,char *s)
{
  Constant *c;
  List *l,*arguments,*value;
  if (!StringHeadEqualAdvance("function value ",s,&s)) return 0;
  l=StringSplit(s,' ');
  if (NULL==(c=ListNthConstantWErr(e,l,0))) goto done;
  if (!ConstantSubsort(e,"function",c)) {
    Log("ERROR: <%s> not function",c->name);
    goto done;
  }
  value=C(Nth(l,1));
  arguments=ListDrop(2,l);
  ConstantValueSet(c,arguments,value);
  ListFree(arguments);
done:
  ListFree(l);
  return 1;
}

/* formula [sourcecode formula] */
Bool ELoadFormula(Encoder *e,char *s)
{
  List *f;
  if (!StringHeadEqualAdvance("formula ",s,&s)) return 0;
  f=ListRead(s);
  ListAppend(e->formulas,f);
  return 1;
}

void ELoadLine(Encoder *e,char *s)
{
  /*
  Log("loading line <%s>",s);
   */
  if (ELoadRange(e,s)) return;
  if (ELoadSortNonreified(e,s)) return;
  if (ELoadSortReified(e,s)) return;
  if (ELoadNoninertial(e,s)) return;
  if (ELoadCompletion(e,s)) return;
  if (ELoadConstantNonreified(e,s)) return;
  if (ELoadConstantReified(e,s)) return;
  if (ELoadFunctionValue(e,s)) return;
  if (ELoadFormula(e,s)) return;
  Log("ERROR: unable to parse line <%s>",s);
}

void ELoad(Encoder *e)
{
  char line[LINELEN];
  FILE *stream;
  Log("loading %s",e->inputFilename);
  if (NULL==(stream=StreamOpen(e->inputFilename,"r"))) {
    exit(1);
  }
  while (fgets(line,LINELEN,stream)) {
    line[strlen(line)-1]='\0';
    ELoadLine(e,line);
  }
  StreamClose(stream);
}

List *EFormulaToProposition(Encoder *e,List *f)
{
  char *s;
  int proposition;
  s=ListToString(f);
  proposition=(int)DictGet(e->formulaD,s);
  if (proposition!=0) {
    Free(s);
    return IntToAtom(proposition);
  }
  proposition=e->nextproposition;
  e->nextproposition++;
  DictSet(e->formulaD,s,(void *)proposition);
  if (e->propositionStream) {
    fprintf(e->propositionStream,"%.6d %s\n",proposition,s);
  }
  Free(s);
  return IntToAtom(proposition);
}

Bool IsVariable(char *s)
{
  return strlen(s)>0 && islower(s[0]); 
}

Bool IsVariableList(List *x)
{
  int len,i;
  len=ListLen(x);
  for (i=0;i<len;i++) {
    if (!IsVariable(NthString(x,i))) return 0;
  }
  return 1; 
}

Bool ListContainsVariable(List *x)
{
  int len,i;
  len=ListLen(x);
  for (i=0;i<len;i++) {
    if (IsVariable(NthString(x,i))) return 1;
  }
  return 0;
}

Bool IsConstant(char *s)
{
  return strlen(s)>0 && s[0]!='$' && !IsVariable(s);
}

Bool IsQuantifier(char *s)
{
  return STREQ(s,"$ForAll")||STREQ(s,"$Exists");
}

Bool IsConnective(char *s)
{
  return STREQ(s,"$Not")||
         STREQ(s,"$Or")||
         STREQ(s,"$And")||
         STREQ(s,"$Implies")||
         STREQ(s,"$Equiv");
}

Bool IsComparative(char *s)
{
  return STREQ(s,"$NE")||
         STREQ(s,"$EQ")||
         STREQ(s,"$LT")||
         STREQ(s,"$LE")||
         STREQ(s,"$GE")||
         STREQ(s,"$GT");
}

Bool IsFunction(char *s)
{
  return STREQ(s,"$Neg")||
         STREQ(s,"$Plus")||
         STREQ(s,"$Minus")||
         STREQ(s,"$Times")||
         STREQ(s,"$Divide")||
         STREQ(s,"$Raise")||
         STREQ(s,"$Remainder");
}

/* returns freeable list */
List *EEncodePropositions(Encoder *e,List *f)
{
  int len,i;
  List *r;
  if (IsList(f) && IsConnective(NthString(f,0))) {
    r=ListCreate();
    ListAppendCopy(r,Nth(f,0));
    len=ListLen(f);
    for (i=1;i<len;i++) {
      ListAppend(r,EEncodePropositions(e,Nth(f,i)));
    }
    return r;
  } else {
    return EFormulaToProposition(e,f);
  }
}

char *EndOf(char *s)
{
  while (*s) s++;
  return s;
}

void ElimTrailingDigits(char *s)
{
  char *p;
  p=EndOf(s);
  while (p!=s) {
    p--;
    if (!isdigit(*p)) break;
  }
  p++;
  *p='\0';
}

char *TrailingDigits(char *s)
{
  char *p;
  p=EndOf(s);
  while (p!=s) {
    p--;
    if (!isdigit(*p)) return p;
  }
  return NULL;
}

Sort *EVariableNameToSort(Encoder *e,char *varname)
{
  char buf[NAMELEN];
  strncpy(buf,varname,NAMELEN);
  ElimTrailingDigits(buf);
  return ESortGetWErr(e,buf);
}

char *EVariableNameToSortname(Encoder *e,char *varname)
{
  Sort *sort;
  if (NULL!=(sort=EVariableNameToSort(e,varname))) {
    return sort->name;
  } else {
    return "";
  }
}

/* returns freeable list */
List *EVariablesToSorts(Encoder *e,List *x)
{
  int len,i;
  List *r;
  Sort *sort;
  r=ListCreate();
  len=ListLen(x);
  for (i=0;i<len;i++) {
    if (NULL!=(sort=EVariableNameToSort(e, NthString(x,i)))) {
      ListAppend(r,C(A(sort->name)));
    }
  }
  return r;
}

void DictSetMany(Dict *d,List *symbols,List *values)
{
  int len,i;
  len=ListLen(values);
  for (i=0;i<len;i++) {
    DictSet(d,ListNthStringWErr(symbols,i),Nth(values,i));
  }
}

/* returns copy */
List *LogicMakeImpliesExpanded(List *a, List *b)
{
  return L(A("$Or"),
           L(A("$Not"),C(a),E),
           C(b),
           E);
}

/* returns freeable list */
List *LogicFunctionApply(List *x)
{
  char *fn;
  int arg1,arg2;
  fn=ListNthStringWErr(x,0);
  if (STREQ(fn,"$Neg")) {
    if (ListLen(x)!=2) {
      Log("ERROR: monadic function application wrong length");
      return C(IntToAtom(0));
    } else {
      arg1=IntParseWErr(NthString(x,1));
      if (arg1==INTNA) {
        Log("ERROR: trouble applying function %s", ListToString(x));
        return C(IntToAtom(0));
      }
      arg2=0;
    }
  } else {
    if (ListLen(x)!=3) {
      Log("ERROR: dyadic function application wrong length");
      return C(IntToAtom(0));
    } else {
      arg1=IntParseWErr(NthString(x,1));
      arg2=IntParseWErr(NthString(x,2));
      if (arg1==INTNA || arg2==INTNA) {
        Log("ERROR: trouble applying function %s", ListToString(x));
        return C(IntToAtom(0));
      }
    }
  }
  if (STREQ(fn,"$Neg")) {
    return C(IntToAtom(-arg1));
  } else if (STREQ(fn,"$Plus")) {
    return C(IntToAtom(arg1+arg2));
  } else if (STREQ(fn,"$Minus")) {
    return C(IntToAtom(arg1-arg2));
  } else if (STREQ(fn,"$Times")) {
    return C(IntToAtom(arg1*arg2));
  } else if (STREQ(fn,"$Divide")) {
    return C(IntToAtom(arg1/arg2));
  } else if (STREQ(fn,"$Remainder")) {
    return C(IntToAtom(arg1%arg2));
  }
  Log("ERROR: unhandled function <%s>",fn);
  return C(IntToAtom(0));
}

Bool LogicMatch(List *f1, List *f2, /* OUTPUT */ Dict **bdp)
{
  int len,i;
  Dict *bd;
  if (ListLen(f1)!=ListLen(f2)) return 0;
  bd = DictCreate(51L);
  len=ListLen(f1);
  for (i=0;i<len;i++) {
    if (IsVariable(AtomToString(Nth(f1,i)))) {
      DictSet(bd, AtomToString(Nth(f1,i)), Nth(f2,i));
    } else if (!ListEquals(Nth(f1,i),Nth(f2,i))) {
      DictFree(bd);
      return 0;
    }
  }
  *bdp = bd;
  return 1;
}

/* returns freeable list */
List *LogicInstan(Encoder *e, List *x,Dict *bd, int expandfns)
{
  int len,i;
  List *r,*r1,*args,*value;
  Constant *fn;
  if (IsVariable(AtomToString(x))) {
    if (NULL!=(r=DictGet(bd,AtomToString(x)))) return C(r);
    return C(x);
  }
  if (IsAtom(x)) return C(x);

  r=ListCreate();
  len=ListLen(x);
  for (i=0;i<len;i++) {
    ListAppend(r,LogicInstan(e,Nth(x,i),bd,expandfns));
  }

  if (IsFunction(NthString(r,0)) &&
      !IsVariable(NthString(r,1)) &&
      (ListLen(r)==2 ||
       !IsVariable(NthString(r,2)))) {
    r1=LogicFunctionApply(r);
    ListFree(r);
    return r1;
  }

  if (ListLen(r)>1) {
    if (expandfns) {
      fn=EConstantGet(e,NthString(r,0));
      if (fn && ConstantSubsort(e,"function",fn)) {
        args=ListCreate();
        len=ListLen(r);
        for (i=1;i<len;i++) {
          ListAppend(args,LogicInstan(e,Nth(r,i),bd,expandfns));
        }
        if (!ListContainsVariable(args)) {
          if (NULL==(value=ConstantValueGet(fn,args))) {
            Log("ERROR: instan: function <%s> missing value for %s",
                fn->name,ListToString(args));
            exit(1);
          }
          ListFree(args);
          ListFree(r);
          return C(value);
        } else {
          ListFree(args);
        }
      }
    }
  }

  return r;
}

Bool LogicIntegersInRange(Encoder *e,List *x)
{
  int i,len;
  List *argsorts;
  Constant *constant,*constant1;
  if (ListLen(x)>1) {
    constant=EConstantGet(e,NthString(x,0));
    if (constant!=NULL) {
      len=ListLen(x);
      argsorts=constant->argsorts;
      if ((len-1)!=ListLen(argsorts)) {
        Log("ERROR: (length of %s - 1) != length of %s",
            ListToString(x),
            ListToString(argsorts));
        exit(1);        
      }
      for (i=1;i<len;i++) {
        if (SortSubsortString(e,"integer",NthString(argsorts,i-1))) {
          constant1=EConstantGet(e,NthString(x,i));
          if (constant1==NULL ||
              !ConstantSubsort(e,NthString(argsorts,i-1),constant1)) {
            return 0;
          }
        }
      }
    }
    len=ListLen(x);
    for (i=1;i<len;i++) {
      if (!LogicIntegersInRange(e,Nth(x,i))) return 0;
    }
    return 1;
  }
  return 1;
}

Bool LogicArgumentsValid(Encoder *e,List *x)
{
  int i,len;
  List *argsorts;
  Constant *constant,*constant1;
  if (ListLen(x)>1) {
    constant=EConstantGet(e,NthString(x,0));
    if (constant!=NULL) {
      len=ListLen(x);
      argsorts=constant->argsorts;
      for (i=1;i<len;i++) {
        if (!IsAtom(Nth(x,i))) continue;
        constant1=EConstantGet(e,NthString(x,i));
        if (constant1==NULL) {
          Log("ERROR: unknown constant %s",NthString(x,i));
          continue;
        }
        if (!ConstantSubsort(e,NthString(argsorts,i-1),constant1)) {
          return 0;
        }
      }
    }
    len=ListLen(x);
    for (i=1;i<len;i++) {
      if (!LogicArgumentsValid(e,Nth(x,i))) return 0;
    }
    return 1;
  }
  return 1;
}

Bool LogicHappensInRange(Encoder *e,List *x)
{
  int i,len,t;
  if (PredIs("Happens",x)) {
    t=atoi(NthString(x,2));
    if (t<e->mintime || t>=e->maxtime) return 0;
  }
  len=ListLen(x);
  for (i=1;i<len;i++) {
    if (!LogicHappensInRange(e,Nth(x,i))) return 0;
  }
  return 1;
}

List *LogicGround(Encoder *e,List *x);

/* returns copy */
List *LogicGroundQuant(Encoder *e,List *x)
{
  char *s;
  Dict *varbd;
  List *constants,*varnames,*elem,*varsorts,*r,*r1,*t,*t1;
  CrossProductIterator *cpi;
  varnames=ListDrop(1,Nth(x,1));
  varsorts=EVariablesToSorts(e,varnames);
  constants=ESortConstants(e,varsorts);
  s=ListToString(x);
  cpi=CrossProductIteratorCreate(s,constants);
  r=ListCreate();
  while (CrossProductIteratorHasMoreElements(cpi)) {
    elem=CrossProductIteratorNext(cpi);
    varbd=DictCreate(51L);
    DictSetMany(varbd,varnames,elem);
    t1=LogicInstan(e,Nth(x,2),varbd,1);
    t=LogicGround(e,t1);
    if (LogicIntegersInRange(e,t) &&
        LogicArgumentsValid(e,t) &&
        LogicHappensInRange(e,t)) {
      ListAppendCopy(r,t);
    }
    ListFree(t);
    ListFree(t1);
    DictFree(varbd);
    ListFree(elem);
  }
  if (ListLen(r)==0) {
    ListFree(r);
    if (e->debug) Log("zero length quantification: %s",ListToString(x));
    if (PredIs("$ForAll",x)) {
      r1=C(A("$True"));
      goto done;
    } else {
      r1=C(A("$False"));
      goto done;
    }
  } else if (ListLen(r)==1) {
    r1=C(Nth(r,0));
    ListFree(r);
    goto done;
  }
  if (PredIs("$ForAll",x)) {
    r1=L(A("$And"),E);
    ListAppendListCopy(r1,r);
    ListFree(r);
    goto done;
  } else {
    r1=L(A("$Or"),E);
    ListAppendListCopy(r1,r);
    ListFree(r);
    goto done;
  }
done:
  ListFree(varnames);
  ListFree(varsorts);
  CrossProductIteratorFree(cpi);
  ListFree(constants);
  Free(s);
  return r1;
}

List *toTrueFalse(Bool b)
{
  if (b) return A("$True");
  return A("$False");
}

Bool LogicCompareInt(char *comp,int arg1,int arg2)
{
  if (STREQ(comp,"$NE")) {
    return arg1!=arg2;
  } else if (STREQ(comp,"$EQ")) {
    return arg1==arg2;
  } else if (STREQ(comp,"$LT")) {
    return arg1<arg2;
  } else if (STREQ(comp,"$LE")) {
    return arg1<=arg2;
  } else if (STREQ(comp,"$GE")) {
    return arg1>=arg2;
  } else if (STREQ(comp,"$GT")) {
    return arg1>arg2;
  }
  Log("ERROR: unhandled integer comparison <%s>",comp);
  return 0;
}

Bool LogicCompareList(char *comp,List *l1,List *l2)
{
  if (STREQ(comp,"$NE")) {
    return !ListEquals(l1,l2);
  } else if (STREQ(comp,"$EQ")) {
    return ListEquals(l1,l2);
  }
  Log("ERROR: unhandled integer comparison <%s>",comp);
  return 0;
}

Bool LogicCompare(List *x)
{
  char *comp;
  int arg1,arg2;
  comp=ListNthStringWErr(x,0);
  if (ListLen(x)!=3) {
    Log("ERROR: comparison wrong length");
    return 0;
  }
  arg1=IntParse(NthString(x,1));
  arg2=IntParse(NthString(x,2));
  if (arg1==INTNA || arg2==INTNA) {
    return LogicCompareList(comp,Nth(x,1),Nth(x,2));
  } else {
    return LogicCompareInt(comp,arg1,arg2);
  }
}

/*
Bool LogicIsGroundFormula(List *x)
{
  int len,i;
  if (IsAtom(x)) {
    return IsConstant(AtomToString(x));
  }
  if (IsQuantifier(NthString(x,0))) return 0;
  len=ListLen(x);
  for (i=0;i<len;i++) {
    if (!LogicIsGroundFormula(Nth(x,i))) return 0;
  }
  return 1;
}
*/

/* returns copy */
List *LogicGround(Encoder *e,List *x)
{
  int len,i;
  List *r,*args,*value,*c,*t;
  Constant *fn, *constant;
  if (IsAtom(x) && IsConstant(AtomToString(x))) return C(x);
  if (IsList(x)) {
    if (IsConnective(NthString(x,0))) {
      r=L(C(Nth(x,0)),E);
      len=ListLen(x);
      for (i=1;i<len;i++) {
        t=LogicGround(e,Nth(x,i));
        /* BEGIN optimization: incorporate some simplification
         * into grounding
         */
        if (PredIs("$And",x)) {
          if (AtomEquals(A("$False"), t)) {
            ListFree(r);
            ListFree(t);
            return A("$False");
          }
        } else if (PredIs("$Or",x)) {
          if (AtomEquals(A("$True"), t)) {
            ListFree(r);
            ListFree(t);
            return A("$True");
          }
        }        
        /* END optimization */
        ListAppend(r,t);
      }
      return r;
    } else if (IsFunction(NthString(x,0))) {
      c=L(C(Nth(x,0)),E);
      len=ListLen(x);
      for (i=1;i<len;i++) {
        ListAppend(c,LogicGround(e,Nth(x,i)));
      }
      r=LogicFunctionApply(c);
      ListFree(c);
      return r;
    } else if (ListLen(x)==2 && strncmp(NthString(x,0),"$Subsort-",9)==0) {
      constant=EConstantGet(e, NthString(x,1));
      if (constant==NULL) {
        Log("ERROR: $Subsort unknown constant %s", NthString(x,1));
        exit(1);
      }
      return toTrueFalse(ConstantSubsort(e,NthString(x,0)+9,constant));
    }
  }
  if (ListLen(x)==3) {
    if (IsQuantifier(NthString(x,0))) {
      return LogicGroundQuant(e,x);
    } else if (IsComparative(NthString(x,0))) {
      c=L(C(Nth(x,0)),
          LogicGround(e,Nth(x,1)),
          LogicGround(e,Nth(x,2)),
          E);
      r=toTrueFalse(LogicCompare(c));
      ListFree(c);
      return r;
    }
  }
  if (ListLen(x)>1) {
    fn=EConstantGet(e,NthString(x,0));
    if (fn && ConstantSubsort(e,"function",fn)) {
      args=ListCreate();
      len=ListLen(x);
      for (i=1;i<len;i++) {
        ListAppend(args,LogicGround(e,Nth(x,i)));
      }
      if (NULL==(value=ConstantValueGet(fn,args))) {
        Log("ERROR: ground: function <%s> missing value for %s",
            fn->name,ListToString(args));
        exit(1);
      }
      ListFree(args);
      return C(value);
    }
  }
  if (IsList(x)) {
    r=L(C(Nth(x,0)),E);
    len=ListLen(x);
    for (i=1;i<len;i++) {
      ListAppend(r,LogicGround(e,Nth(x,i)));
    }
    return r;
  }
/*
  if (LogicIsGroundFormula(x)) {
    return C(x);
  }
*/
  /* used for ecsem only: */
  if (AtomEquals(A("$False"), x)) return x;
  if (AtomEquals(A("$True"), x)) return x;

  Log("ERROR: unable to ground %s", ListToString(x));
  exit(1);
}

Bool IsLiteral(List *x)
{
  if (IsAtom(x)) return 1;
  if (PredIs("$Not",x)) {
    return IsAtom(Nth(x,1));
  }
  return 0;
}

void LogicClauseAppend(List *clause, List *x)
{
  if (PredIs("$Not",x)) {
    ListAppend(Nth(clause,1),Nth(x,1));
  } else {
    ListAppend(Nth(clause,0),x);
  }
}

void LogicClauseNotAppend(List *clause, List *x)
{
  if (PredIs("$Not",x)) {
    ListAppend(Nth(clause,0),Nth(x,1));
  } else {
    ListAppend(Nth(clause,1),x);
  }
}

Bool IsDisjunctionOfLiterals(List *x)
{
  int len,i;
  List *e;
  if (!IsList(x)) return 0;
  if (!PredIs("$Or",x)) return 0;
  len=ListLen(x);
  for (i=1;i<len;i++) {
    e=Nth(x,i);
    if (!IsLiteral(e) && !IsDisjunctionOfLiterals(e)) return 0;
  }
  return 1;
}

Bool IsConjunctiveNormalForm(List *x)
{
  int len,i;
  List *e;
  if (!IsList(x)) return 0;
  if (!PredIs("$And",x)) return 0;
  len=ListLen(x);
  for (i=1;i<len;i++) {
    e=Nth(x,i);
    if (!IsDisjunctionOfLiterals(e) &&
        !IsConjunctiveNormalForm(e)) {
      return 0;
    }
  }
  return 1;
}

int LogicUnorLength(List *x)
{
  int r,len,i;
  if (!IsList(x) ||
      !PredIs("$Or",x)) {
    return 1;
  }
  r=0;
  len=ListLen(x);
  for(i=1;i<len;i++) {
    r+=LogicUnorLength(Nth(x,i));
  } 
  return r;
}

int LogicUnandLength(List *x)
{
  int r,len,i;
  if (!IsList(x) ||
      !PredIs("$And",x)) {
    return 1;
  }
  r=0;
  len=ListLen(x);
  for(i=1;i<len;i++) {
    r+=LogicUnandLength(Nth(x,i));
  } 
  return r;
}

/* returns freeable list */
List *LogicUnand(List *x)
{
  int len,i;
  List *r,*t;
  if (!IsList(x) ||
      !PredIs("$And",x)) {
    return L(C(x),E);
  }
  len=ListLen(x);
  r=ListCreate();
  for(i=1;i<len;i++) {
    t=LogicUnand(Nth(x,i));
    ListAppendListCopy(r,t);
    ListFree(t);
  }
  return r;
}

/* returns freeable list */
List *LogicUnor(List *x)
{
  int len,i;
  List *r,*t;
  if (!IsList(x) ||
      !PredIs("$Or",x)) {
    return L(C(x),E);
  }
  len=ListLen(x);
  r=ListCreate();
  for(i=1;i<len;i++) {
    t=LogicUnor(Nth(x,i));
    ListAppendListCopy(r,t);
    ListFree(t);
  } 
  return r;
}

/* returns freeable list */
List *LogicUnAndOr(List *x)
{
  if (PredIs("$Or",x)) {
    return LogicUnor(x);
  } else {
    return LogicUnand(x);
  }
}

double LogicCNFRenamingLength2(List *x)
{
  int r;
  if (IsList(x)) {
    if (PredIs("$Or",x)) {
      return 1.0+(double)LogicUnorLength(x);
    } else if (PredIs("$And",x)) {
      return 1.0+(double)LogicUnandLength(x);
      return r;
    } else if (PredIs("$Equiv",x)) {
      return 4.0;
    }
  }
  Log("ERROR: unable to calculate cnf renaming length 2: %s",
      ListToString(x));
  exit(1);
}

double LogicCNFRenamingLength1(List *x)
{
  int len,i;
  double r;
  List *p;
  if (IsLiteral(x)) return 0.0;
  if (IsList(x)) {
    if (PredIs("$Or",x) || PredIs("$And",x)) {
      r=0.0;
      p=LogicUnAndOr(x);
      len=ListLen(p);
      for (i=0;i<len;i++) {
        r+=LogicCNFRenamingLength1(Nth(p,i));
      }
      ListFree(p);
      r+=LogicCNFRenamingLength2(x);
      return r;
    } else if (PredIs("$Equiv",x)) {
      r=0.0;
      r+=LogicCNFRenamingLength1(Nth(x,1));
      r+=LogicCNFRenamingLength1(Nth(x,2));
      r+=LogicCNFRenamingLength2(x);
      return r;
    }
  }
  Log("ERROR: unable to calculate cnf renaming length 1: %s",
      ListToString(x));
  exit(1);
}

double LogicCNFRenamingLength(List *x)
{
  return 1.0+LogicCNFRenamingLength1(x);
}

double LogicCNFClassicalLength(List *x)
{
  int len,i;
  double r;
  if (IsLiteral(x)) {
    return 1.0;
  } else if (PredIs("$And",x)) {
    r=0.0;
    len=ListLen(x);
    for (i=1;i<len;i++) {
      r+=LogicCNFClassicalLength(Nth(x,i));
    }
    return r;
  } else if (PredIs("$Or",x)) {
    r=1.0;
    len=ListLen(x);
    for (i=1;i<len;i++) {
      r*=LogicCNFClassicalLength(Nth(x,i));
    }
    return r;
  }
  Log("ERROR: unable to calculate cnf classical length: %s",ListToString(x));
  exit(1);
}

/* returns copy */
List *LogicMakeAnd(List *x)
{
  List *r;
  if (ListLen(x)==0) {
    Log("ERROR: LogicMakeAnd length 0");
    exit(1);
  }
  if (ListLen(x)==1) return C(Nth(x,0));
  r=L(A("$And"),E);
  ListAppendListCopy(r,x);
  return r;
}

/* returns copy */
List *LogicMakeOr(List *x)
{
  List *r;
  if (ListLen(x)==0) {
    Log("ERROR: LogicMakeOr length 0");
    exit(1);
  }
  if (ListLen(x)==1) return C(Nth(x,0));
  r=L(A("$Or"),E);
  ListAppendListCopy(r,x);
  return r;
}

/* returns copy
 * REALLY: for ListLen(x)==1 this returns [$Or x[0]]; this format
 * is needed by EOptimizeQuantifier.
 */
List *LogicMakeOrFalseOr(List *x)
{
  List *r;
  if (ListLen(x)==0) return C(A("$False"));
  r=L(A("$Or"),E);
  ListAppendListCopy(r,x);
  return r;
}

/* returns copy */
List *LogicMakeExists(List *vars, List *x)
{
  List *vars1;
  if (ListLen(vars)==0) return C(x);
  vars1=L(A("$List"),E);
  ListAppendListCopy(vars1,vars);
  return L(A("$Exists"),vars1,C(x),E);
}

/* returns copy */
List *LogicMakeForAll(List *vars, List *x)
{
  List *vars1;
  if (ListLen(vars)==0) return C(x);
  vars1=L(A("$List"),E);
  ListAppendListCopy(vars1,vars);
  return L(A("$ForAll"),vars1,C(x),E);
}

List *LogicSimp(List *x, int expandEquiv);

/* assumes PredIs("$Not",x) */
List *LogicDeMorgan(List *x, int expandEquiv)
{
  int len,i;
  List *t1, *r;
  /* De Morgan's law */
  if (IsList(Nth(x,1)) && PredIs("$And",Nth(x,1))) {
    t1=L(A("$Or"),E);
    len=ListLen(Nth(x,1));
    for (i=1;i<len;i++) {
      ListAppend(t1,L(A("$Not"),C(Nth(Nth(x,1),i)),E));
    }
    r=LogicSimp(t1,expandEquiv);
    ListFree(t1);
    return r;
  } else if (IsList(Nth(x,1)) && PredIs("$Or",Nth(x,1))) {
    t1=L(A("$And"),E);
    len=ListLen(Nth(x,1));
    for (i=1;i<len;i++) {
      ListAppend(t1,L(A("$Not"),C(Nth(Nth(x,1),i)),E));
    }
    r=LogicSimp(t1,expandEquiv);
    ListFree(t1);
    return r;
  }
  return NULL;
}

/* returns copy */
List *LogicSimp(List *x, int expandEquiv)
{
  int len,i;
  List *t1,*t2,*e1,*r;
  if (IsList(x)) {
    if (PredIs("$And",x)) {
      t1=ListCreate();
      len=ListLen(x);
      for (i=1;i<len;i++) {
        ListAppend(t1,LogicSimp(Nth(x,i),expandEquiv));
      }
      if (AtomIn(A("$False"),t1)) {
        ListFree(t1);
        return A("$False");
      }
      r=L(A("$And"),E);
      len=ListLen(t1);
      for (i=0;i<len;i++) {
        e1=Nth(t1,i);
        if (!AtomEquals(e1,A("$True")) && !ListIn(e1,r)) {
          ListAppendCopy(r,e1);
        }
      }
      ListFree(t1);
      if (ListLen(r)==1) {
        ListFree(r);
        return A("$True");
      } else if (ListLen(r)==2) {
        t1=C(Nth(r,1));
        ListFree(r);
        return t1;
      }
      return r;
    } else if (PredIs("$Or",x)) {
      t1=ListCreate();
      len=ListLen(x);
      for (i=1;i<len;i++) {
        ListAppend(t1,LogicSimp(Nth(x,i),expandEquiv));
      }
      if (AtomIn(A("$True"),t1)) {
        ListFree(t1);
        return A("$True");
      }
      r=L(A("$Or"),E);
      len=ListLen(t1);
      for (i=0;i<len;i++) {
        e1=Nth(t1,i);
        if (!AtomEquals(e1,A("$False")) && !ListIn(e1,r)) {
          ListAppendCopy(r,e1);
        }
      }
      ListFree(t1);
      if (ListLen(r)==1) {
        ListFree(r);
        return A("$False");
      } else if (ListLen(r)==2) {
        t1=C(Nth(r,1));
        ListFree(r);
        return t1;
      }
      return r;
    }
  }
  if (ListLen(x)==3) {
    if (PredIs("$Equiv",x)) {
      if (expandEquiv) {
        t1=L(A("$And"),
            LogicMakeImpliesExpanded(Nth(x,1),Nth(x,2)),
            LogicMakeImpliesExpanded(Nth(x,2),Nth(x,1)),
            E);
        r=LogicSimp(t1,expandEquiv);
        ListFree(t1);
        return r;
      } else {
        t1=LogicSimp(Nth(x,1),expandEquiv);
        t2=LogicSimp(Nth(x,2),expandEquiv);
        if (AtomEquals(t1,A("$True"))) {
          ListFree(t1);
          return t2;
        } else if (AtomEquals(t1,A("$False"))) {
          if (AtomEquals(t2,A("$False"))) {
            ListFree(t1); ListFree(t2);
            return A("$True");
          } else if (AtomEquals(t2,A("$True"))) {
            ListFree(t1); ListFree(t2);
            return A("$False");
          } else {
            ListFree(t1);
            return L(A("$Not"),t2,E);
          }
        } else if (AtomEquals(t2,A("$True"))) {
          ListFree(t2);
          return t1;
        } else if (AtomEquals(t2,A("$False"))) {
          ListFree(t2);
          return L(A("$Not"),t1,E);
        } else {
          return L(A("$Equiv"),t1,t2,E);
        }
      }
    } else if (PredIs("$Implies",x)) {
      t1=LogicMakeImpliesExpanded(Nth(x,1),Nth(x,2));
      r=LogicSimp(t1,expandEquiv);
      ListFree(t1);
      return r;
    }
  } else if (ListLen(x)==2) {
    if (PredIs("$Not",x)) {
      /* LogicDeMorgan added 20040108 */
      r=LogicDeMorgan(x,expandEquiv);
      if (r!=NULL) return r;
      if (ListLen(Nth(x,1))==2 && PredIs("$Not",Nth(x,1))) {
        return LogicSimp(Nth(Nth(x,1),1),expandEquiv);
      }
      t1=LogicSimp(Nth(x,1),expandEquiv);
      if (AtomEquals(t1,A("$True"))) {
        ListFree(t1);
        return A("$False");
      }
      if (AtomEquals(t1,A("$False"))) {
        ListFree(t1);
        return A("$True");
      }
      t2=L(A("$Not"),t1,E);
      r=LogicDeMorgan(t2, expandEquiv);
      if (r!=NULL) {
        ListFree(t2);
        return r;
      }
      return t2;
    }
  }
  if (ListLen(x)>0 && NthString(x,0)[0]=='$') {
    Log("ERROR: unknown connective %s", NthString(x,0));
  }
  return C(x);
}

/* returns freeable list */
List *LogicCNFClauseParse(List *x,List *sourcecode, List *weight)
{
  int len,i;
  List *positive,*negative,*t1,*term;
  if (IsList(x) && PredIs("$Or",x)) {
    positive=ListCreate();
    negative=ListCreate();
    t1=LogicUnor(x);
    len=ListLen(t1);
    for (i=0;i<len;i++) {
      term=Nth(t1,i);
      if (ListLen(term)==2 && PredIs("$Not",term)) {
        if (!ListIn(Nth(term,1),negative)) {
          ListAppendCopy(negative,Nth(term,1));
        }
      } else {
        if (!ListIn(term,positive)) {
          ListAppendCopy(positive,term);
        }
      }
    }
    ListFree(t1);
    return L(positive,negative,C(sourcecode),weight,E);
  }
  if (IsLiteral(x)) {
    if (ListLen(x)==2 && PredIs("$Not",x)) {
      return L(ListCreate(),L(C(Nth(x,1)),E),C(sourcecode),weight,E);
    } else {
      return L(L(C(x),E),ListCreate(),C(sourcecode),weight,E);
    }
  }
  Log("ERROR: unable to parse clause");
  exit(1);
}

/* returns freeable list */
List *LogicCNFParse(List *x,List *sourcecode,List *weight)
{
  int len,i;
  List *r,*t1,*clause;
  if (IsList(x)) {
    if (PredIs("$And",x)) {
      r=ListCreate();
      t1=LogicUnand(x);
      len=ListLen(t1);
      for(i=0;i<len;i++) {
        clause=LogicCNFClauseParse(Nth(t1,i),C(sourcecode),weight);
        ListAppend(r,clause);
      }
      ListFree(t1);
      return r;
    } else if (PredIs("$Or",x)) {
      clause=LogicCNFClauseParse(x,C(sourcecode),weight);
      return L(clause,E);
    }
  }
  if (IsLiteral(x)) {
    if (ListLen(x)==2 && PredIs("$Not",x)) {
      return L(L(ListCreate(),L(C(Nth(x,1)),E),C(sourcecode),weight,E),E);
    } else {
      return L(L(L(C(x),E),ListCreate(),C(sourcecode),weight,E),E);
    }
  }
  Log("ERROR: unable to parse cnf");
  exit(1);
}

/* returns freeable list */
List *LogicNewAtom(Encoder *e, List *x)
{
  List *r,*x1;
  x1=LogicSimp(x,1);
  if (IsLiteral(x1)) {
    return x1;
  } else {
    r=EFormulaToProposition(e,x1);
    ListFree(x1);
    return C(r);
  }
}

/* returns list of clauses
 * returns freeable list
 * (equiv)
 */
List *LogicRename(Encoder *e, List *x, List *sourcecode, List *weight)
{
  int len,i;
  List *clauses,*clause,*p,*b,*b1,*b2;
  if (IsList(x)) {
    if (PredIs("$Or",x)) {
      clauses=ListCreate();
      clause=L(ListCreate(),ListCreate(),sourcecode,weight,E);
      LogicClauseNotAppend(clause,LogicNewAtom(e,x));
      p=LogicUnor(x);
      len=ListLen(p);
      for (i=0;i<len;i++) {
        LogicClauseAppend(clause,LogicNewAtom(e,Nth(p,i)));
      }
      ListAppend(clauses,clause);
      for (i=0;i<len;i++) {
        clause=L(ListCreate(),ListCreate(),sourcecode,weight,E);
        b=LogicNewAtom(e,x);
        LogicClauseAppend(clause,b);
        LogicClauseNotAppend(clause,LogicNewAtom(e,Nth(p,i)));
        ListAppend(clauses,clause);
      }
      ListFree(p);
      return clauses;
    } else if (PredIs("$And",x)) {
      clauses=ListCreate();
      clause=L(ListCreate(),ListCreate(),sourcecode,weight,E);
      LogicClauseAppend(clause,LogicNewAtom(e,x));
      p=LogicUnand(x);
      len=ListLen(p);
      for (i=0;i<len;i++) {
        LogicClauseNotAppend(clause,LogicNewAtom(e,Nth(p,i)));
      }
      ListAppend(clauses,clause);
      for (i=0;i<len;i++) {
        clause=L(ListCreate(),ListCreate(),sourcecode,weight,E);
        b=LogicNewAtom(e,x);
        LogicClauseNotAppend(clause,b);
        LogicClauseAppend(clause,LogicNewAtom(e,Nth(p,i)));
        ListAppend(clauses,clause);
      }
      ListFree(p);
      return clauses;
    } else if (PredIs("$Equiv",x)) {
      clauses=ListCreate();
      b=LogicNewAtom(e,x);
      b1=LogicNewAtom(e,Nth(x,1));
      b2=LogicNewAtom(e,Nth(x,2));
      clause=L(ListCreate(),ListCreate(),sourcecode,weight,E);
      LogicClauseNotAppend(clause,C(b));
      LogicClauseAppend(clause,C(b1));
      LogicClauseNotAppend(clause,C(b2));
      ListAppend(clauses,clause);
      clause=L(ListCreate(),ListCreate(),sourcecode,weight,E);
      LogicClauseNotAppend(clause,C(b));
      LogicClauseNotAppend(clause,C(b1));
      LogicClauseAppend(clause,C(b2));
      ListAppend(clauses,clause);
      clause=L(ListCreate(),ListCreate(),sourcecode,weight,E);
      LogicClauseAppend(clause,C(b));
      LogicClauseAppend(clause,C(b1));
      LogicClauseAppend(clause,C(b2));
      ListAppend(clauses,clause);
      clause=L(ListCreate(),ListCreate(),sourcecode,weight,E);
      LogicClauseAppend(clause,C(b));
      LogicClauseNotAppend(clause,C(b1));
      LogicClauseNotAppend(clause,C(b2));
      ListAppend(clauses,clause);
      ListFree(b);
      ListFree(b1);
      ListFree(b2);
      return clauses;
    }
  }
  Log("ERROR: unable to rename: %s",ListToString(x));
  exit(1);
}

/* assumes x contains $And $Or $Equiv and
 * does not contain $Not (except for literals) $Implies
 * returns list of clauses
 * returns freeable list
 */
List *LogicCNFRenaming1(Encoder *e, List *x, List *sourcecode, List *weight)
{
  int len,i;
  List *p,*r,*t;
  if (IsLiteral(x)) {
    return ListCreate(); /* = True */
  }
  if (IsList(x)) {
    if (PredIs("$Or",x) || PredIs("$And",x)) {
      r=ListCreate();
      p=LogicUnAndOr(x);
      len=ListLen(p);
      for (i=0;i<len;i++) {
        t=LogicCNFRenaming1(e,Nth(p,i),sourcecode,weight);
        ListAppendListCopy(r,t);
        ListFree(t);
      }
      ListFree(p);
      t=LogicRename(e,x,sourcecode,weight);
      ListAppendListCopy(r,t);
      ListFree(t);
      return r;
    } else if (PredIs("$Equiv",x)) {
      r=ListCreate();
      t=LogicCNFRenaming1(e,Nth(x,1),sourcecode,weight);
      ListAppendListCopy(r,t);
      ListFree(t);
      t=LogicCNFRenaming1(e,Nth(x,2),sourcecode,weight);
      ListAppendListCopy(r,t);
      ListFree(t);
      t=LogicRename(e,x,sourcecode,weight);
      ListAppendListCopy(r,t);
      ListFree(t);
      return r;
    }
  }
  Log("ERROR: unable to convert to cnf with renaming: %s",ListToString(x));
  exit(1);
}

/* returns list of clauses
 * returns freeable list
 */
List *LogicCNFRenaming(Encoder *e, List *x, List *sourcecode, List *weight)
{
  List *clauses,*clause;
  clauses=LogicCNFRenaming1(e,x,sourcecode,weight);
  clause=L(ListCreate(),ListCreate(),sourcecode,weight,E);
  LogicClauseAppend(clause,LogicNewAtom(e,x));
  ListAppend(clauses,clause);
  return clauses;
}

/* assumes x contains $And $Or and
 * does not contain $Not (except for literals) $Implies $Equiv
 * returns freeable list
 */
List *LogicCNFClassical1(List *x)
{
  int len,i;
  List *r;
  List *theAnd,*others,*e,*t1,*c;

  if (IsLiteral(x)) return C(x);
  else if (IsDisjunctionOfLiterals(x)) return C(x);
  else if (IsConjunctiveNormalForm(x)) return C(x);
  if (IsList(x)) {
    /* Distributive law */
    if (PredIs("$Or",x)) {
      theAnd=NULL;
      others=ListCreate();
      len=ListLen(x);
      for (i=1;i<len;i++) {
        e=Nth(x,i);
        if (PredIs("$And",e) && theAnd==NULL) {
          theAnd=e;
        } else {
          ListAppendCopy(others,e);
        }
      }
      if (theAnd) {
        c=L(A("$And"),E);
        len=ListLen(theAnd);
        for (i=1;i<len;i++) {
          t1=L(A("$Or"),C(Nth(theAnd,i)),E);
          ListAppendListCopy(t1,others);
          ListAppendCopy(c,t1);
          ListFree(t1);
        }
        r=LogicCNFClassical1(c);
        ListFree(c);
        ListFree(others);
        return r;
      } else {
        ListFree(others);
      }
    }
    /* Recursion */
    if (PredIs("$And",x)) {
      r=L(A("$And"),E);
      len=ListLen(x);
      for (i=1;i<len;i++) {
        ListAppend(r,LogicCNFClassical1(Nth(x,i)));
      }
      return r;
    /* Recursion */
    } else if (PredIs("$Or",x)) {
      c=L(A("$Or"),E);
      len=ListLen(x);
      for (i=1;i<len;i++) {
        ListAppend(c,LogicCNFClassical1(Nth(x,i)));
      }
      r=LogicCNFClassical1(c);
      ListFree(c);
      return r;
    }
  }
  Log("ERROR: unable to convert to cnf classically: %s",ListToString(x));
  exit(1);
}

/* returns list of clauses
 * returns copy
 */
List *LogicCNFClassical(Encoder *e, List *x, List *sourcecode, List *weight)
{
  List *fCNF,*clauses;

  fCNF=LogicCNFClassical1(x);
  clauses=LogicCNFParse(fCNF,sourcecode,weight);
  ListFree(fCNF);
  return clauses;
}

/* returns list of clauses
 * returns copy
 */
List *LogicCNF(Encoder *e, List *x, List *origF, char *sourcecode,
               List *weight)
{
  double classicalLen, renamingLen;
  List *r,*x1;
  if (e->renaming) {
    x1=LogicSimp(x,1);
    classicalLen=LogicCNFClassicalLength(x1);
    renamingLen=LogicCNFRenamingLength(x);
    if (classicalLen<=renamingLen) {
      /*
      Log("CNF classical (%g clauses instead of %g)",
          classicalLen,renamingLen);
       */
      r=LogicCNFClassical(e,x1,A(sourcecode),weight);
      ListFree(x1);
      return r;
    } else {
      if (e->debug) {
        Log("CNF renaming (%g clauses instead of %g): %s",
            renamingLen,classicalLen,
            ListToString(origF));
      } else {
        Log("CNF renaming (%g clauses instead of %g)",
            renamingLen,classicalLen);
      }
      ListFree(x1);
      return LogicCNFRenaming(e,x,A(sourcecode),weight);
    }
  } else {
    return LogicCNFClassical(e,x,A(sourcecode),weight);
  }
}

List *LogicFreevars1(List *f, List *bound)
{
  int len1,i1,len2,i2;
  List *bound1,*varnames,*r,*e,*r1,*g;
  if (!IsList(f)) return ListCreate();
  if (IsQuantifier(NthString(f,0))) {
    bound1=ListCopy(bound);
    varnames=ListDrop(1,Nth(f,1));
    ListAppendListCopy(bound1,varnames);
    ListFree(varnames);
    r=LogicFreevars1(Nth(f,2),bound1);
    ListFree(bound1);
    return r;
  }
  r=ListCreate();
  len1=ListLen(f);
  for (i1=0;i1<len1;i1++) {
    e=Nth(f,i1);
    if (IsVariable(AtomToString(e))) {
      if (!ListIn(e,bound) && !ListIn(e,r) && !AtomEquals(A("na"),e)) {
        ListAppendCopy(r,e);
      }
    } else {
      r1=LogicFreevars1(e,bound);
      len2=ListLen(r1);
      for (i2=0;i2<len2;i2++) {
        g=Nth(r1,i2);
        if (!ListIn(g,r)) {
          ListAppendCopy(r,g);
        }
      }
      ListFree(r1);
    }
  }
  return r;
}

List *LogicFreevars(List *f)
{
  List *r, *bound;
  bound=ListCreate();
  r=LogicFreevars1(f,bound);
  ListFree(bound);
  return r;
}

List *EEncodeFormula1(Encoder *e,List *f,char *sourcecode,List *weight)
{
#ifdef CHECK
  int numlistsBefore;
#endif
  List *fGround,*fSimp,*fEncoded,*clauses;

#ifdef CHECK
  numlistsBefore=numlists;
#endif

  fGround=LogicGround(e,f);
  if (e->debug) Log("fGround %s",ListToString(fGround));

#ifdef CHECK
  ListLeakCheck("LogicGround",numlistsBefore,f,fGround);
  numlistsBefore=numlists;
#endif

  fSimp=LogicSimp(fGround,!e->renaming);
  if (e->debug) Log("fSimp %s",ListToString(fSimp));

#ifdef CHECK
  ListLeakCheck("LogicSimp",numlistsBefore,fGround,fSimp);
#endif

  if (AtomEquals(A("$True"),fSimp)) {
    if (e->debug) Log("formula always true: %s",ListToString(f));
    ListFree(fGround);
    ListFree(fSimp);
    return NULL;
  }

  if (AtomEquals(A("$False"),fSimp)) {
    Log("ERROR: formula always false: %s",ListToString(f));
    ListFree(fGround);
    ListFree(fSimp);
    return NULL;
  }

#ifdef CHECK
  numlistsBefore=numlists;
#endif

  fEncoded=EEncodePropositions(e,fSimp);
  if (e->debug) Log("fEncoded %s",ListToString(fEncoded));

#ifdef CHECK
  ListLeakCheck("EEncodePropositions",numlistsBefore,fSimp,fEncoded);
  numlistsBefore=numlists;
#endif

  clauses=LogicCNF(e,fEncoded,f,sourcecode,weight);
  if (ListLen(clauses)>1000) {
    Log("%d clauses for %s", ListLen(clauses), ListToString(f));
  }
/*
  if (e->debug) Log("clauses %s",ListToString(clauses));
 */

  ListFree(fGround);
  ListFree(fSimp);
  ListFree(fEncoded);

  return clauses;
}

void EEncodeFormula(Encoder *e,List *f,char *sourcecode, List *weight,
                    Bool isHardweight)
{
  time_t start, end;
#ifdef CHECK
  int numlistsBefore;
#endif
  List *clauses;

  if (sourcecode[0]==SOURCECODE_ORIGINAL_EFFECT_AXIOM ||
      sourcecode[0]==SOURCECODE_ORIGINAL_TRAJECTORY_AXIOM ||
      sourcecode[0]==SOURCECODE_EC_AXIOM) {
    return;
  }

  if (e->debug) {
    Log("encode formula %s", ListToString(f));
  }

#ifdef CHECK
  numlistsBefore=numlists;
#endif
  start=time(0);
  clauses=EEncodeFormula1(e,f,sourcecode,weight);
  end=time(0);
  if ((end-start)>120) {
    Log("encode: %d seconds: %s", end-start, ListToString(f));
  }
#ifdef CHECK
  ListLeakCheck("EEncodeFormula",numlistsBefore,f,clauses);
#endif

  if (clauses!=NULL) {
    EClauseAddMany(e,clauses,isHardweight);
    ListFree(clauses);
  }
}

void EEncodeCompletion(Encoder *e, List *hardweight)
{
  int len1,i1,len2,i2;
#ifdef CHECK
  int numlistsBefore;
#endif
  Bool pFound;
  Clause *c;
  char *label,*predicatename,*sourcecode;
  List *constants,*clausesToAdd,*p,*clause;
  List *positive,*negative,*t1,*t2,*t3,*elem;
  List *formula,*impliesP,*impliesP1,*clauses;
  Constant *constant;
  CrossProductIterator *cpi;
  PercentComplete *pc;
#ifdef CHECK
  numlistsBefore=numlists;
#endif
  Log("encode completion");
  clausesToAdd=ListCreate();
  len1=ListLen(e->predicatesToComplete);
  pc=PercentCompleteCreate("encode completion",len1);
  for (i1=0;i1<len1;i1++) {
    PercentCompleteNext(pc);
    label=NthString(Nth(e->predicatesToComplete,i1),0);
    predicatename=NthString(Nth(e->predicatesToComplete,i1),1);
    Log("encode completion %s %s",label,predicatename);
    constant=EConstantGet(e,predicatename);
    constants=ESortConstants(e,constant->argsorts);
    cpi=CrossProductIteratorCreate(predicatename,constants);
    while (CrossProductIteratorHasMoreElements(cpi)) {
      elem=CrossProductIteratorNext(cpi);
      formula=L(A(predicatename),E);
      ListAppendListCopy(formula,elem);
      ListFree(elem);
      p=EFormulaToProposition(e,formula);
      ListFree(formula);
      pFound=0;
      impliesP=ListCreate();
      for (c=e->clauses;c;c=c->next) {
        clause=c->clause;
        sourcecode=NthString(clause,CLAUSES_SOURCECODE_I);
        if (label[0]=='*') {
          if (sourcecode[0]>SOURCECODE_AXIOM &&
              sourcecode[0]<SOURCECODE_LABEL_BEGIN) {
            continue;
          }
        } else {
          if (label[0]!=sourcecode[0]) continue;
        }
        positive=Nth(clause,CLAUSES_POS_I);
        negative=Nth(clause,CLAUSES_NEG_I);
        if (AtomIn(p,positive)) {
          pFound=1;
          t1=ListCreate();
          len2=ListLen(positive);
          for (i2=0;i2<len2;i2++) {
            t3=Nth(positive,i2);
            if (AtomEquals(t3,p)) continue;
            ListAppend(t1,L(A("$Not"),C(t3),E));
          }
          ListAppendListCopy(t1,negative);
          if (ListLen(t1)>0) {
            ListAppend(impliesP,LogicMakeAnd(t1));
          }
          ListFree(t1);
        }
      }
      if (pFound) {
        if (ListLen(impliesP)>0) {
          impliesP1=LogicMakeOr(impliesP);
          t2=LogicMakeImpliesExpanded(p,impliesP1);
          t3=LogicSimp(t2,!e->renaming);
          ListFree(t2);
          clauses=LogicCNF(e,t3,t3,"0",hardweight);
          ListFree(t3);
          if (e->debug) {
            Log("EEncodeCompletion p %s",ListToString(p));
            Log("EEncodeCompletion impliesP %s",ListToString(impliesP));
            Log("EEncodeCompletion impliesP1 %s",ListToString(impliesP1));
            Log("EEncodeCompletion clauses %s",ListToString(clauses));
          }
          ListAppendListCopy(clausesToAdd,clauses);
          ListFree(impliesP1);
          ListFree(clauses);
        }
      } else {
        ListAppend(clausesToAdd,
                   L(ListCreate(),L(p,E),A("0"),C(hardweight),E));
      }
      ListFree(impliesP);
    }
    CrossProductIteratorFree(cpi);
    ListFree(constants);
  }
  PercentCompleteFree(pc);
#ifdef CHECK
  ListLeakCheck("EEncodeCompletion",numlistsBefore,NULL,clausesToAdd);
#endif
  EClauseAddMany(e,clausesToAdd,1);
  ListFree(clausesToAdd);
}

void varDAddQuantifierVarlist(Encoder *e, Dict *d, List *vars)
{
  int len, i, oldI, newI;
  char *sortname;
  len=ListLen(vars);
  for (i=1;i<len;i++) {
    sortname=EVariableNameToSortname(e,NthString(vars,i));
    newI=atoi(TrailingDigits(NthString(vars,i)));
    oldI=(int)DictGet(d,sortname);
    if (newI>oldI) {
      DictSet(d,sortname,(void *)newI);
    }
  }
}

List *SortnameToVarnameX(char *sortname,List *existing)
{
  int i;
  char buf[NAMELEN];
  List *var;
  for (i=1;;i++) {
    sprintf(buf,"%s%d",sortname,i);
    var=A(buf);
    if (!ListIn(var,existing)) return var;
  }
}

List *SortnameToVarname(char *sortname,Dict *d)
{
  int i;
  char buf[NAMELEN];
  i=(int)DictGet(d,sortname);
  DictSet(d,sortname,(void *)(i+1));
  sprintf(buf,"%s%d",sortname,i+1);
  return A(buf);
}

/* returns freeable list */
List *SortnamesToVarnames1(List *sorts, Dict *d)
{
  int len,i;
  List *r;
  r=ListCreate();
  len=ListLen(sorts);
  for (i=0;i<len;i++) {
    ListAppendCopy(r,SortnameToVarname(NthString(sorts,i),d));
  }
  return r;
}

/* returns freeable list */
List *SortnamesToVarnames(List *sorts)
{
  Dict *d;
  List *r;
  d=DictCreate(51L);
  r=SortnamesToVarnames1(sorts, d);
  DictFree(d);
  return r;
}

List *LogicGenNew(Encoder *e,List *v,List *existing)
{
  List *r;
  Sort *vSort;
  vSort=EVariableNameToSort(e,AtomToString(v));
  r=SortnameToVarnameX(vSort->name,existing);
  ListAppendCopy(existing,r);
  return r;
}

/* caller must free quantvars and context */
Bool EffectAxiomParse(List *f, char *effectAxiomPred1,
                      char *effectAxiomPred2, /* OUTPUT */
                      List **quantvarsp, List **contextp,
                      List **alphap, List **betap, List **tVarp)
{
  if (!PredIs("$ForAll",f)) return 0;
  if (PredIs("$Implies",Nth(f,2))) {
    if (STREQ(effectAxiomPred1,NthString(Nth(Nth(f,2),2),0)) ||
        ((effectAxiomPred2 != NULL) &&
         STREQ(effectAxiomPred2,NthString(Nth(Nth(f,2),2),0)))) {
      *quantvarsp=ListDrop(1,Nth(f,1));
      *contextp=LogicUnand(Nth(Nth(f,2),1));
      *alphap=Nth(Nth(Nth(f,2),2),1);
      *betap=Nth(Nth(Nth(f,2),2),2);
      *tVarp=Nth(Nth(Nth(f,2),2),3);
      return 1;
    }
  } else {
    if (STREQ(effectAxiomPred1,NthString(Nth(f,2),0)) ||
        ((effectAxiomPred2 != NULL) &&
         STREQ(effectAxiomPred2,NthString(Nth(f,2),0)))) {
      *quantvarsp=ListDrop(1,Nth(f,1));
      *contextp=NULL;
      *alphap=Nth(Nth(f,2),1);
      *betap=Nth(Nth(f,2),2);
      *tVarp=Nth(Nth(f,2),3);
      return 1;
    }
  }
  return 0;
}

/* caller must free quantvars and context */
Bool TrajectoryAxiomParse(List *f, char *trajAxiomPred, 
                          /* OUTPUT */
                          List **quantvarsp, List **contextp,
                          List **alphap, List **taup,
                          List **betap, List **deltap)
{
  if (!PredIs("$ForAll",f)) return 0;
  if (PredIs("$Implies",Nth(f,2))) {
    if (STREQ(trajAxiomPred,NthString(Nth(Nth(f,2),2),0))) {
      *quantvarsp=ListDrop(1,Nth(f,1));
      *contextp=LogicUnand(Nth(Nth(f,2),1));
      *alphap=Nth(Nth(Nth(f,2),2),1);
      *taup=Nth(Nth(Nth(f,2),2),2);
      *betap=Nth(Nth(Nth(f,2),2),3);
      *deltap=Nth(Nth(Nth(f,2),2),4);
      return 1;
    }
  } else {
    if (STREQ(trajAxiomPred,NthString(Nth(f,2),0))) {
      *quantvarsp=ListDrop(1,Nth(f,1));
      *contextp=NULL;
      *alphap=Nth(Nth(f,2),1);
      *taup=Nth(Nth(f,2),2);
      *betap=Nth(Nth(f,2),3);
      *deltap=Nth(Nth(f,2),4);
      return 1;
    }
  }
  return 0;
}

List *HTransform(Encoder *e,List *effectAxiom, List *context,List *alpha,
                 List *beta,List *tau,List *xVars)
{
  int len,i,j,n;
  char subsortpred[NAMELEN];
  List *epsilon, *vVars, *phi, *wVars;
  List *gamma, *gammaSubst, *uVars, *existing, *yVars;
  List *t1, *t2, *t3, *t, *v;
  List *rAnd, *aVars, *uVar, *vVar, *happens, *quantification, *r;
  List *newvar;
  Dict *replacedD, *gammaBD;
  Sort *xSort, *wSort;
  if (!ListIsDistinct(xVars)) {
    Log("ERROR: %s: xVars not distinct: %s",
        ListToString(effectAxiom),
        ListToString(xVars));
    exit(1);
  }
  epsilon=ListNth(alpha,0);
  if (epsilon == NULL) {
    Log("ERROR: epsilon==NULL, alpha=%s", ListToString(alpha));
    exit(1);
  }
  vVars=ListDrop(1,alpha);
  if (!IsVariableList(vVars)) {
    Log("ERROR: %s: vVars not variable list: %s",
        ListToString(effectAxiom),
        ListToString(vVars));
    exit(1);
  }
  phi=ListNth(beta,0);
  wVars=ListDrop(1,beta);
  if (!IsVariableList(wVars)) {
    Log("ERROR: %s: wVars not variable list: %s",
        ListToString(effectAxiom),
        ListToString(wVars));
    exit(1);
  }
  if (!ListIsDistinct(wVars)) {
    Log("ERROR: %s: wVars not distinct: %s",
        ListToString(effectAxiom),
        ListToString(wVars));
    exit(1);
  }
  if (context!=NULL) {
    gamma=LogicMakeAnd(context);
    uVars=LogicFreevars(gamma);
    existing=ListCopy(xVars);
    yVars=ListCreate();
    replacedD=DictCreate(51L);
    t1=ListCopy(uVars);
    ListAppendListCopy(t1,vVars);
    t2=ListCopy(wVars);
    ListAppendCopy(t2,tau);
    t3=ListMinus(t1,t2);
    t=ListUniq(t3);
    ListFree(t1);
    ListFree(t2);
    ListFree(t3);
    len=ListLen(t);
    for (i=0;i<len;i++) {
      v=Nth(t,i);
      newvar=LogicGenNew(e,v,existing);
      ListAppendCopy(yVars,newvar);
      DictSet(replacedD,AtomToString(v),newvar);
    }
    ListFree(existing);
    ListFree(t);
    gammaBD=DictCreate(51L);
    len=ListLen(uVars);
    for (i=0;i<len;i++) {
      uVar=Nth(uVars,i);
      j=ListDiota(wVars,uVar);
      if (AtomEquals(uVar,tau)) {
        DictSet(gammaBD,AtomToString(uVar),Nth(xVars,ListLen(xVars)-1));
      } else if (j<ListLen(wVars)) {
        DictSet(gammaBD,AtomToString(uVar),Nth(xVars,j));
      } else {
        DictSet(gammaBD,
                AtomToString(uVar),
                DictGet(replacedD,AtomToString(uVar)));
      }
    }
    gammaSubst=LogicInstan(e,gamma,gammaBD,0);
    DictFree(gammaBD);
    ListFree(gamma);
    ListFree(uVars);
  } else {
    existing=ListCopy(xVars);
    yVars=ListCreate();
    replacedD=DictCreate(51L);
    t2=ListCopy(wVars);
    ListAppendCopy(t2,tau);
    t3=ListMinus(vVars,t2);
    t=ListUniq(t3);
    ListFree(t2);
    ListFree(t3);
    len=ListLen(t);
    for (i=0;i<len;i++) {
      v=Nth(t,i);
      newvar=LogicGenNew(e,v,existing);
      ListAppendCopy(yVars,newvar);
      DictSet(replacedD,AtomToString(v),newvar);
    }
    ListFree(existing);
    ListFree(t);
    gammaSubst=ListCreate();
  }
  n=ListLen(xVars)-1;
  rAnd=ListCreate();
  for (i=0;i<n;i++) {
    xSort=EVariableNameToSort(e,NthString(xVars,i));
    wSort=EVariableNameToSort(e,NthString(wVars,i));
    if (xSort==wSort) {
    /* optimization not stated in paper */
      continue;
    }
    sprintf(subsortpred,"$Subsort-%s",wSort->name);
    ListAppend(rAnd,L(A(subsortpred),C(Nth(xVars,i)),E));
  }
  aVars=ListCreate();
  len=ListLen(vVars);
  for (i=0;i<len;i++) {
    vVar=Nth(vVars,i);
    j=ListDiota(wVars,vVar);
    if (j<ListLen(wVars)) {
      ListAppendCopy(aVars,Nth(xVars,j));
    } else {
      ListAppendCopy(aVars,DictGet(replacedD,AtomToString(vVar)));
    }
  }
  t1=ListCreate();
  ListAppendCopy(t1,epsilon);
  ListAppendListCopy(t1,aVars);
  happens=L(A("Happens"),t1,C(Nth(xVars,ListLen(xVars)-1)),E);
  if (ListLen(yVars)>0) {
    if (ListLen(gammaSubst)>0) {
      t2=LogicUnand(gammaSubst);
      ListAppend(t2,happens);
      t3=LogicMakeAnd(t2);
      quantification=LogicMakeExists(yVars,t3);
      ListFree(t2);
      ListFree(t3);
    } else {
      quantification=LogicMakeExists(yVars,happens);
      ListFree(happens);
    }
  } else {
    if (ListLen(gammaSubst)>0) {
      t2=LogicUnand(gammaSubst);
      ListAppend(t2,happens);
      quantification=LogicMakeAnd(t2);
      ListFree(t2);
    } else {
      quantification=happens;
    }
  }
  ListAppend(rAnd,quantification);
  r=LogicMakeAnd(rAnd);
  ListFree(rAnd);
  ListFree(gammaSubst);
  ListFree(vVars);
  ListFree(wVars);
  ListFree(yVars);
  DictFree(replacedD);
  return r;
}

List *HTransform3(Encoder *e,List *effectAxiom, List *context,List *alpha,
                  List *beta,List *tau,List *xVarsLessTau,
                  List *eventVar,List *fluentVar,List *timeVar)
{
  int len,i,j,n;
  char subsortpred[NAMELEN];
  List *epsilon, *vVars, *phi, *wVars;
  List *gamma, *gammaSubst, *uVars, *existing, *yVars;
  List *t1, *t2, *t3, *t, *v;
  List *aVars, *uVar, *vVar, *eventEquality, *fluentEquality;
  List *quantification;
  List *newvar, *sortRestrict;
  Dict *replacedD, *gammaBD;
  Sort *xSort, *wSort;
  if (!ListIsDistinct(xVarsLessTau)) {
    Log("ERROR: %s: xVarsLessTau not distinct: %s",
        ListToString(effectAxiom),
        ListToString(xVarsLessTau));
    exit(1);
  }
  epsilon=ListNth(alpha,0);
  if (epsilon == NULL) {
    Log("ERROR: epsilon==NULL, alpha=%s", ListToString(alpha));
    exit(1);
  }
  vVars=ListDrop(1,alpha);
  if (!IsVariableList(vVars)) {
    Log("ERROR: %s: vVars not variable list: %s",
        ListToString(effectAxiom),
        ListToString(vVars));
    exit(1);
  }
  phi=ListNth(beta,0);
  wVars=ListDrop(1,beta);
  if (!IsVariableList(wVars)) {
    Log("ERROR: %s: wVars not variable list: %s",
        ListToString(effectAxiom),
        ListToString(wVars));
    exit(1);
  }
  if (!ListIsDistinct(wVars)) {
    Log("ERROR: %s: wVars not distinct: %s",
        ListToString(effectAxiom),
        ListToString(wVars));
    exit(1);
  }
  if (context!=NULL) {
    gamma=LogicMakeAnd(context);
    uVars=LogicFreevars(gamma);
    existing=ListCopy(xVarsLessTau);
    yVars=ListCreate();
    ListAppendListCopy(yVars,xVarsLessTau);
    replacedD=DictCreate(51L);
    t1=ListCopy(uVars);
    ListAppendListCopy(t1,vVars);
    t2=ListCopy(wVars);
    ListAppendCopy(t2,tau);
    t3=ListMinus(t1,t2);
    t=ListUniq(t3);
    ListFree(t1);
    ListFree(t2);
    ListFree(t3);
    len=ListLen(t);
    for (i=0;i<len;i++) {
      v=Nth(t,i);
      newvar=LogicGenNew(e,v,existing);
      ListAppendCopy(yVars,newvar);
      DictSet(replacedD,AtomToString(v),newvar);
    }
    ListFree(existing);
    ListFree(t);
    gammaBD=DictCreate(51L);
    len=ListLen(uVars);
    for (i=0;i<len;i++) {
      uVar=Nth(uVars,i);
      j=ListDiota(wVars,uVar);
      if (AtomEquals(uVar,tau)) {
        DictSet(gammaBD,AtomToString(uVar),timeVar);
      } else if (j<ListLen(wVars)) {
        DictSet(gammaBD,AtomToString(uVar),Nth(xVarsLessTau,j));
      } else {
        DictSet(gammaBD,
                AtomToString(uVar),
                DictGet(replacedD,AtomToString(uVar)));
      }
    }
    gammaSubst=LogicInstan(e,gamma,gammaBD,0);
    DictFree(gammaBD);
    ListFree(gamma);
    ListFree(uVars);
  } else {
    existing=ListCopy(xVarsLessTau);
    yVars=ListCreate();
    ListAppendListCopy(yVars,xVarsLessTau);
    replacedD=DictCreate(51L);
    t2=ListCopy(wVars);
    ListAppendCopy(t2,tau);
    t3=ListMinus(vVars,t2);
    t=ListUniq(t3);
    ListFree(t2);
    ListFree(t3);
    len=ListLen(t);
    for (i=0;i<len;i++) {
      v=Nth(t,i);
      newvar=LogicGenNew(e,v,existing);
      ListAppendCopy(yVars,newvar);
      DictSet(replacedD,AtomToString(v),newvar);
    }
    ListFree(existing);
    ListFree(t);
    gammaSubst=ListCreate();
  }
  n=ListLen(xVarsLessTau);
  sortRestrict=ListCreate();
  for (i=0;i<n;i++) {
    xSort=EVariableNameToSort(e,NthString(xVarsLessTau,i));
    wSort=EVariableNameToSort(e,NthString(wVars,i));
    if (xSort==wSort) {
    /* optimization not stated in paper */
      continue;
    }
    sprintf(subsortpred,"$Subsort-%s",wSort->name);
    ListAppend(sortRestrict,L(A(subsortpred),C(Nth(xVarsLessTau,i)),E));
  }
  aVars=ListCreate();
  len=ListLen(vVars);
  for (i=0;i<len;i++) {
    vVar=Nth(vVars,i);
    j=ListDiota(wVars,vVar);
    if (j<ListLen(wVars)) {
      ListAppendCopy(aVars,Nth(xVarsLessTau,j));
    } else {
      ListAppendCopy(aVars,DictGet(replacedD,AtomToString(vVar)));
    }
  }
  t1=ListCreate();
  ListAppendCopy(t1,epsilon);
  ListAppendListCopy(t1,aVars);
  eventEquality=L(A("$EQ"),eventVar,t1,E);
  t2=ListCreate();
  ListAppendCopy(t2,phi);
  ListAppendListCopy(t2,xVarsLessTau);
  fluentEquality=L(A("$EQ"),fluentVar,t2,E);
  if (ListLen(yVars)>0) {
    if (ListLen(gammaSubst)>0) {
      t2=LogicUnand(gammaSubst);
      ListAppendListCopy(t2,sortRestrict);
      ListAppend(t2,eventEquality);
      ListAppend(t2,fluentEquality);
      t3=LogicMakeAnd(t2);
      quantification=LogicMakeExists(yVars,t3);
      ListFree(t2);
      ListFree(t3);
    } else {
      t2=L(A("$And"),E);
      ListAppendListCopy(t2,sortRestrict);
      ListAppend(t2,eventEquality);
      ListAppend(t2,fluentEquality);
      quantification=LogicMakeExists(yVars,t2);
      ListFree(t2);
    }
  } else {
    if (ListLen(gammaSubst)>0) {
      t2=LogicUnand(gammaSubst);
      ListAppendListCopy(t2,sortRestrict);
      ListAppend(t2,eventEquality);
      ListAppend(t2,fluentEquality);
      quantification=LogicMakeAnd(t2);
      ListFree(t2);
    } else {
      t2=L(A("$And"),E);
      ListAppendListCopy(t2,sortRestrict);
      ListAppend(t2,eventEquality);
      ListAppend(t2,fluentEquality);
      quantification=t2;
    }
  }
  ListFree(sortRestrict);
  ListFree(gammaSubst);
  ListFree(vVars);
  ListFree(wVars);
  ListFree(yVars);
  DictFree(replacedD);
  return quantification;
}

List *HTrajTransform3(Encoder *e,List *trajAxiom,List *context,List *alpha,
                      List *tau1,List *beta,List *tau2,List *xVarsLessTau,
                      List *fluentVar1,List *timeVar1,
                      List *fluentVar2,List *timeVar2)
{
  int len,i,j,n;
  char subsortpred[NAMELEN];
  List *epsilon, *vVars, *phi, *wVars;
  List *gamma, *gammaSubst, *uVars, *existing, *yVars;
  List *t1, *t2, *t3, *t, *v;
  List *rAnd, *aVars, *uVar, *vVar, *fluentEquality1, *fluentEquality2;
  List *quantification, *r;
  List *newvar;
  Dict *replacedD, *gammaBD;
  Sort *xSort, *wSort;
  if (!ListIsDistinct(xVarsLessTau)) {
    Log("ERROR: %s: xVarsLessTau not distinct: %s",
        ListToString(trajAxiom),
        ListToString(xVarsLessTau));
    exit(1);
  }
  epsilon=ListNth(alpha,0);
  vVars=ListDrop(1,alpha);
  if (!IsVariableList(vVars)) {
    Log("ERROR: %s: vVars not variable list: %s",
        ListToString(trajAxiom),
        ListToString(vVars));
    exit(1);
  }
  phi=ListNth(beta,0);
  wVars=ListDrop(1,beta);
  if (!IsVariableList(wVars)) {
    Log("ERROR: %s: wVars not variable list: %s",
        ListToString(trajAxiom),
        ListToString(wVars));
    exit(1);
  }
  if (!ListIsDistinct(wVars)) {
    Log("ERROR: %s: wVars not distinct: %s",
        ListToString(trajAxiom),
        ListToString(wVars));
    exit(1);
  }
  if (context!=NULL) {
    gamma=LogicMakeAnd(context);
    uVars=LogicFreevars(gamma);
    existing=ListCopy(xVarsLessTau);
    yVars=ListCreate();
    ListAppendListCopy(yVars,xVarsLessTau);
    replacedD=DictCreate(51L);
    t1=ListCopy(uVars);
    ListAppendListCopy(t1,vVars);
    t2=ListCopy(wVars);
    ListAppendCopy(t2,tau1);
    ListAppendCopy(t2,tau2);
    t3=ListMinus(t1,t2);
    t=ListUniq(t3);
    ListFree(t1);
    ListFree(t2);
    ListFree(t3);
    len=ListLen(t);
    for (i=0;i<len;i++) {
      v=Nth(t,i);
      newvar=LogicGenNew(e,v,existing);
      ListAppendCopy(yVars,newvar);
      DictSet(replacedD,AtomToString(v),newvar);
    }
    ListFree(existing);
    ListFree(t);
    gammaBD=DictCreate(51L);
    len=ListLen(uVars);
    for (i=0;i<len;i++) {
      uVar=Nth(uVars,i);
      j=ListDiota(wVars,uVar);
      if (AtomEquals(uVar,tau1)) {
        DictSet(gammaBD,AtomToString(uVar),timeVar1);
      } else if (AtomEquals(uVar,tau2)) {
        DictSet(gammaBD,AtomToString(uVar),timeVar2);
      } else if (j<ListLen(wVars)) {
        DictSet(gammaBD,AtomToString(uVar),Nth(xVarsLessTau,j));
      } else {
        DictSet(gammaBD,
                AtomToString(uVar),
                DictGet(replacedD,AtomToString(uVar)));
      }
    }
    gammaSubst=LogicInstan(e,gamma,gammaBD,0);
    DictFree(gammaBD);
    ListFree(gamma);
    ListFree(uVars);
  } else {
    existing=ListCopy(xVarsLessTau);
    yVars=ListCreate();
    ListAppendListCopy(yVars,xVarsLessTau);
    replacedD=DictCreate(51L);
    t2=ListCopy(wVars);
    ListAppendCopy(t2,tau1);
    ListAppendCopy(t2,tau2);
    t3=ListMinus(vVars,t2);
    t=ListUniq(t3);
    ListFree(t2);
    ListFree(t3);
    len=ListLen(t);
    for (i=0;i<len;i++) {
      v=Nth(t,i);
      newvar=LogicGenNew(e,v,existing);
      ListAppendCopy(yVars,newvar);
      DictSet(replacedD,AtomToString(v),newvar);
    }
    ListFree(existing);
    ListFree(t);
    gammaSubst=ListCreate();
  }
  n=ListLen(xVarsLessTau);
  rAnd=ListCreate();
  for (i=0;i<n;i++) {
    xSort=EVariableNameToSort(e,NthString(xVarsLessTau,i));
    wSort=EVariableNameToSort(e,NthString(wVars,i));
    if (xSort==wSort) {
    /* optimization not stated in paper */
      continue;
    }
    sprintf(subsortpred,"$Subsort-%s",wSort->name);
    ListAppend(rAnd,L(A(subsortpred),C(Nth(xVarsLessTau,i)),E));
  }
  aVars=ListCreate();
  len=ListLen(vVars);
  for (i=0;i<len;i++) {
    vVar=Nth(vVars,i);
    j=ListDiota(wVars,vVar);
    if (j<ListLen(wVars)) {
      ListAppendCopy(aVars,Nth(xVarsLessTau,j));
    } else {
      ListAppendCopy(aVars,DictGet(replacedD,AtomToString(vVar)));
    }
  }
  t1=ListCreate();
  ListAppendCopy(t1,epsilon);
  ListAppendListCopy(t1,aVars);
  fluentEquality1=L(A("$EQ"),fluentVar1,t1,E);
  t2=ListCreate();
  ListAppendCopy(t2,phi);
  ListAppendListCopy(t2,xVarsLessTau);
  fluentEquality2=L(A("$EQ"),fluentVar2,t2,E);
  if (ListLen(yVars)>0) {
    if (ListLen(gammaSubst)>0) {
      t2=LogicUnand(gammaSubst);
      ListAppend(t2,fluentEquality1);
      ListAppend(t2,fluentEquality2);
      t3=LogicMakeAnd(t2);
      quantification=LogicMakeExists(yVars,t3);
      ListFree(t2);
      ListFree(t3);
    } else {
      t2=L(A("$And"),fluentEquality1,fluentEquality2,E);
      quantification=LogicMakeExists(yVars,t2);
      ListFree(t2);
    }
  } else {
    if (ListLen(gammaSubst)>0) {
      t2=LogicUnand(gammaSubst);
      ListAppend(t2,fluentEquality1);
      ListAppend(t2,fluentEquality2);
      quantification=LogicMakeAnd(t2);
      ListFree(t2);
    } else {
      quantification=L(A("$And"),fluentEquality1,fluentEquality2,E);
    }
  }
  ListAppend(rAnd,quantification);
  r=LogicMakeAnd(rAnd);
  ListFree(rAnd);
  ListFree(gammaSubst);
  ListFree(vVars);
  ListFree(wVars);
  ListFree(yVars);
  DictFree(replacedD);
  return r;
}

List *MakeClipped(Encoder *e,List *tau,
                  List *phi,List *xVarsLessTau,
                  List *tauPlusDelta)
{
  int len,i;
  char *sourcecode;
  List *timeVar,*xVars,*theOr,*t,*f,*r;
  List *quantvars1,*context1,*alpha1,*beta1,*tau1;
  /* todo: need to generate unique variable name */
  timeVar=A("time1111");
  xVars=ListCopy(xVarsLessTau);
  ListAppendCopy(xVars,timeVar);
  theOr=ListCreate();
  len=ListLen(e->formulas);
  for (i=0;i<len;i++) {
    sourcecode=NthString(Nth(e->formulas,i),FORMULAS_SOURCECODE_I);
    if (sourcecode[0]!=SOURCECODE_ORIGINAL_EFFECT_AXIOM) continue;
    f=Nth(Nth(e->formulas,i),FORMULAS_FORMULA_I);
    if (!EffectAxiomParse(f,"Terminates",NULL,&quantvars1,&context1,
                          &alpha1,&beta1,&tau1)) {
      continue;
    }
    if (AtomEquals(phi,Nth(beta1,0))) {
      t=HTransform(e,f,context1,alpha1,beta1,tau1,xVars);
      ListAppend(theOr,t);
    }
    ListFree(quantvars1);
    if (context1!=NULL) ListFree(context1);
  }
  r=L(A("$Exists"),
      L(A("$List"),C(timeVar),NULL),
      L(A("$And"),L(A("$LT"),C(tau),C(timeVar),E),
                  L(A("$LT"),C(timeVar),C(tauPlusDelta),E),
                  LogicMakeOr(theOr),
                  E),
      E);
  ListFree(theOr);
  ListFree(timeVar);
  ListFree(xVars);
  return r;
}

/* todo: need to generate unique variable names */
List *ETransformTrajectoryAxiom(Encoder *e,List *quantvars,
                                List *context,
                                List *alpha,List *tau,
                                List *beta,List *delta)
{
  int len,i;
  char *sourcecode;
  List *phi,*xVarsLessTau,*xVars,*theOr;
  List *f, *quantvars1, *context1, *alpha1, *beta1, *tau1;
  List *t,*tauPlusDelta,*clipped,*r1,*r2,*r;
  phi=Nth(alpha,0);
  xVarsLessTau=ListDrop(1,alpha);
  xVars=ListDrop(1,alpha);
  ListAppendCopy(xVars,tau);
  theOr=ListCreate();
  len=ListLen(e->formulas);
  for (i=0;i<len;i++) {
    sourcecode=NthString(Nth(e->formulas,i),FORMULAS_SOURCECODE_I);
    if (sourcecode[0]!=SOURCECODE_ORIGINAL_EFFECT_AXIOM) continue;
    f=Nth(Nth(e->formulas,i),FORMULAS_FORMULA_I);
    if (!EffectAxiomParse(f,"Initiates",NULL,&quantvars1,&context1,
                          &alpha1,&beta1,&tau1)) {
      continue;
    }
    if (AtomEquals(phi,Nth(beta1,0))) {
      t=HTransform(e,f,context1,alpha1,beta1,tau1,xVars);
      ListAppend(theOr,t);
    }
    ListFree(quantvars1);
    if (context1!=NULL) ListFree(context1);
  }
  tauPlusDelta=L(A("$Plus"),C(tau),C(delta),E);
  clipped=MakeClipped(e,tau,phi,xVarsLessTau,tauPlusDelta);
  r1=L(A("$Implies"),
       L(A("$And"),L(A("$Not"),clipped,E),LogicMakeOr(theOr),E),
       L(A("HoldsAt"),C(beta),tauPlusDelta,E),
       E);
  ListFree(theOr);
  if (context) {
    r2=L(A("$Implies"),LogicMakeAnd(context),r1,E);
    r=LogicMakeForAll(quantvars,r2);
    ListFree(xVarsLessTau);
    ListFree(xVars);
    ListFree(r2);
  } else {
    r=LogicMakeForAll(quantvars,r1);
    ListFree(xVarsLessTau);
    ListFree(xVars);
    ListFree(r1);
  }
  if (e->debug) Log("trajectory axiom %s", ListToString(r));
  return r;
}

void EEncodeTrajectoryAxioms(Encoder *e, List *hardweight)
{
  int len,i;
  char *sourcecode;
  List *traj,*traj1;
  List *quantvars,*context,*alpha,*tau,*beta,*delta;
  len=ListLen(e->formulas);
  for (i=0;i<len;i++) {
    sourcecode=NthString(Nth(e->formulas,i),FORMULAS_SOURCECODE_I);
    if (sourcecode[0]!=SOURCECODE_ORIGINAL_TRAJECTORY_AXIOM) continue;
    traj=Nth(Nth(e->formulas,i),FORMULAS_FORMULA_I);
    if (!TrajectoryAxiomParse(traj,"Trajectory",
                              &quantvars,&context,&alpha,&tau,&beta,
                              &delta)) {
      Log("ERROR: trouble parsing trajectory axiom %s", ListToString(traj));
      continue;
    }
    traj1=ETransformTrajectoryAxiom(e,quantvars,context,alpha,tau,beta,delta);
/*
    Log("transformed trajectory axiom %s", ListToString(traj1));
 */
    EEncodeFormula(e,traj1,"0",hardweight,1);
    ListFree(traj1);
    ListFree(quantvars);
    if (context!=NULL) ListFree(context);
  }
}

void EEncodeFrameAxioms1(Encoder *e,char *resultPred,
                         char *effectAxiomPred1, char *effectAxiomPred2,
                         int transitionSign,
                         int disableIfReleased,
                         List *hardweight)
{
  int len1,i1,len2,i2;
#ifdef CHECKX
  int numlistsBefore;
#endif
  Bool effectAxiomsFound;
  char *fluentname;
  char *sourcecode;
  Constant *fluent;
  Sort *fluentsort;
  List *frameAxiom1,*frameAxiomOR;
  List *varsorts,*varnames,*tVar,*tPlus1;
  List *beta,*t1,*f;
  List *quantvars1, *context1, *alpha1, *beta1, *tVar1;
  List *t;
  List *fluentsortConstants;
  Dict *varNameToSort, *varD;
  PercentComplete *pc;
  if (NULL==(fluentsort=ESortGetWErr(e,"fluent"))) return;
  if (effectAxiomPred2) {
    Log("encode frame axioms %s%s %s %s",
        transitionSign>0 ? "+" : "-",
        resultPred, effectAxiomPred1, effectAxiomPred2);
  } else {
    Log("encode frame axioms %s%s %s",
        transitionSign>0 ? "+" : "-",
        resultPred, effectAxiomPred1);
  }
  fluentsortConstants=SortNonReifiedConstantsGet(fluentsort);
  len1=ListLen(fluentsortConstants);
  pc = PercentCompleteCreate("encode frame axioms",len1);
  for (i1=0;i1<len1;i1++) {
    PercentCompleteNext(pc);
    fluentname=NthString(fluentsortConstants,i1);
    if (NULL==(fluent=EConstantGetWErr(e,fluentname))) continue;
    if (fluent->noninertial) continue;
#ifdef CHECKX
    numlistsBefore=numlists;
#endif
    frameAxiomOR=ListCreate();
    ListAppend(frameAxiomOR,A("$Or"));
    varsorts=C(fluent->argsorts);
    ListAppend(varsorts,A("time"));
    varD=DictCreate(51L);
    varnames=SortnamesToVarnames1(varsorts,varD);
    varNameToSort=DictCreate(51L);
    len2=ListLen(varnames);
    for (i2=0;i2<(len2-1);i2++) {
      DictSet(varNameToSort,NthString(varnames,i2),NthString(varsorts,i2));
    }
    tVar=Nth(varnames,ListLen(varnames)-1);
    tPlus1=L(A("$Plus"),C(tVar),A("1"),E);
    beta=L(A(fluent->name),E);
    len2=ListLen(varnames);
    for (i2=0;i2<(len2-1);i2++) {
      ListAppend(beta,C(Nth(varnames,i2)));
    }
    if (transitionSign>0) {
      ListAppend(frameAxiomOR,L(A(resultPred),C(beta),C(tVar),E));
      ListAppend(frameAxiomOR,
                 L(A("$Not"),L(A(resultPred),C(beta),C(tPlus1),E),E));
    } else {
      ListAppend(frameAxiomOR,
                 L(A("$Not"),L(A(resultPred),C(beta),C(tVar),E),E));
      ListAppend(frameAxiomOR,L(A(resultPred),C(beta),C(tPlus1),E));
    }
    if (disableIfReleased) {
      ListAppend(frameAxiomOR,L(A("ReleasedAt"),C(beta),C(tPlus1),E));
    }
    effectAxiomsFound=0;
    len2=ListLen(e->formulas);
    for (i2=0;i2<len2;i2++) {
      sourcecode=NthString(Nth(e->formulas,i2),FORMULAS_SOURCECODE_I);
      if (sourcecode[0]!=SOURCECODE_ORIGINAL_EFFECT_AXIOM) continue;
      f=Nth(Nth(e->formulas,i2),FORMULAS_FORMULA_I);
      if (!EffectAxiomParse(f,effectAxiomPred1,effectAxiomPred2,
                            &quantvars1,&context1,&alpha1,&beta1,
                            &tVar1)) {
        continue;
      }
      if (STREQ(fluentname,NthString(beta1,0))) {
        effectAxiomsFound=1;
        t=HTransform(e,f,context1,alpha1,beta1,tVar1,varnames);
        ListAppendCopy(frameAxiomOR,t);
        ListFree(t);
      }
      ListFree(quantvars1);
      if (context1!=NULL) ListFree(context1);
    }
    DictFree(varNameToSort);
    DictFree(varD);
    if (!effectAxiomsFound) {
      if (e->debug) {
        Log("no %s axioms found for %s %s",
             effectAxiomPred1, effectAxiomPred2,
             fluent->name);
      }
    }
    frameAxiom1=L(A("$ForAll"),E);
    t1=L(A("$List"),E);
    ListAppendListCopy(t1,varnames);
    ListAppend(frameAxiom1,t1);
    ListAppend(frameAxiom1,frameAxiomOR);
    ListFree(beta);
    ListFree(tVar);
    ListFree(tPlus1);
    ListFree(varsorts);
    ListFree(varnames);

#ifdef CHECKX
    ListLeakCheck("EEncodeFrameAxioms1",numlistsBefore,NULL,
                  frameAxiom1);
#endif
    if (e->debug) Log("frame axiom %s", ListToString(frameAxiom1));
    EEncodeFormula(e,frameAxiom1,"0",hardweight,1);
    ListFree(frameAxiom1);
  }
  ListFree(fluentsortConstants);
  PercentCompleteFree(pc);
}

void EEncodeFrameAxioms(Encoder *e, List *hardweight)
{
  EEncodeFrameAxioms1(e,"HoldsAt","Initiates",NULL,1,1,hardweight);
  EEncodeFrameAxioms1(e,"HoldsAt","Terminates",NULL,-1,1,hardweight);
  EEncodeFrameAxioms1(e,"ReleasedAt","Releases",NULL,1,0,hardweight);
  EEncodeFrameAxioms1(e,"ReleasedAt","Initiates","Terminates",-1,0,hardweight);
}

List *EMakeDeClipped3(Encoder *e,char *effectAxiomPred, List *tau,
                      List *fluentVar, List *tauPlusDelta)
{
  int len1,i1,len2,i2;
  Bool effectAxiomsFound;
  char *sourcecode, *fluentname;
  List *timeVar,*eventVar,*theOr,*t,*f;
  List *quantvars1,*context1,*alpha1,*beta1,*tau1;
  List *resultOR;
  List *fluentsortConstants;
  List *varsorts,*varnames;
  List *r;
  Constant *fluent;
  Sort *fluentsort;
  Dict *varD;
  /* todo: need to generate unique variable name */
  timeVar=A("time1111");
  eventVar=A("event1111");
  resultOR=ListCreate();
  if (NULL==(fluentsort=ESortGetWErr(e,"fluent"))) return NULL;
  fluentsortConstants=SortNonReifiedConstantsGet(fluentsort);
  len1=ListLen(fluentsortConstants);
  for (i1=0;i1<len1;i1++) {
    fluentname=NthString(fluentsortConstants,i1);
    if (NULL==(fluent=EConstantGetWErr(e,fluentname))) continue;
    if (fluent->noninertial) continue;
    varsorts=C(fluent->argsorts);
    varD=DictCreate(51L);
    varnames=SortnamesToVarnames1(varsorts,varD);
    effectAxiomsFound=0;
    theOr=ListCreate();
    len2=ListLen(e->formulas);
    for (i2=0;i2<len2;i2++) {
      sourcecode=NthString(Nth(e->formulas,i2),FORMULAS_SOURCECODE_I);
      if (sourcecode[0]!=SOURCECODE_ORIGINAL_EFFECT_AXIOM) continue;
      f=Nth(Nth(e->formulas,i2),FORMULAS_FORMULA_I);
      if (!EffectAxiomParse(f,effectAxiomPred,NULL,&quantvars1,&context1,
                            &alpha1,&beta1,&tau1)) {
        continue;
      }
      if (STREQ(fluentname,NthString(beta1,0))) {
        effectAxiomsFound=1;
        t=HTransform3(e,f,context1,alpha1,beta1,tau1,varnames,
                      eventVar,fluentVar,timeVar);
        ListAppend(theOr,t);
      }
      ListFree(quantvars1);
      if (context1!=NULL) ListFree(context1);
    }
    DictFree(varD);
    if (effectAxiomsFound) {
      ListAppend(resultOR,
        L(A("$Exists"),
          L(A("$List"),C(timeVar),C(eventVar),NULL),
          L(A("$And"),L(A("Happens"),C(eventVar),C(timeVar),E),
                      L(A("$LE"),C(tau),C(timeVar),E),
                      L(A("$LT"),C(timeVar),C(tauPlusDelta),E),
                      LogicMakeOr(theOr),
                      E),
          E));
    }
    ListFree(theOr);
    ListFree(varsorts);
    ListFree(varnames);
  }
  ListFree(fluentsortConstants);
  r=LogicMakeOrFalseOr(resultOR);
  ListFree(resultOR);
  return r;
}

List *EMakeTraj3(Encoder *e, char *trajAxiomPred, List *fluentVar1,
                 List *timeVar1, List *fluentVar2, List *timeVar2)
{
  int len1,i1,len2,i2;
  Bool trajAxiomsFound;
  char *fluentname, *sourcecode;
  Constant *fluent;
  Sort *fluentsort;
  List *varsorts,*varnames;
  List *quantvars1, *context1, *alpha1, *beta1, *tVar1, *tVar2;
  List *fluentsortConstants, *t;
  List *resultOR, *f;
  List *eventVar;
  List *r;
  Dict *varD;
  eventVar=A("event");
  resultOR=ListCreate();
  if (NULL==(fluentsort=ESortGetWErr(e,"fluent"))) return NULL;
  fluentsortConstants=SortNonReifiedConstantsGet(fluentsort);
  len1=ListLen(fluentsortConstants);
  for (i1=0;i1<len1;i1++) {
    fluentname=NthString(fluentsortConstants,i1);
    if (NULL==(fluent=EConstantGetWErr(e,fluentname))) continue;
    varsorts=C(fluent->argsorts);
    varD=DictCreate(51L);
    varnames=SortnamesToVarnames1(varsorts,varD);
    trajAxiomsFound=0;
    len2=ListLen(e->formulas);
    for (i2=0;i2<len2;i2++) {
      sourcecode=NthString(Nth(e->formulas,i2),FORMULAS_SOURCECODE_I);
      if (sourcecode[0]!=SOURCECODE_ORIGINAL_TRAJECTORY_AXIOM) continue;
      f=Nth(Nth(e->formulas,i2),FORMULAS_FORMULA_I);
      if (!TrajectoryAxiomParse(f,trajAxiomPred,&quantvars1,&context1,&alpha1,
                                &tVar1,&beta1,&tVar2)) {
        continue;
      }
      if (STREQ(fluentname,NthString(beta1,0))) {
        trajAxiomsFound=1;
        t=HTrajTransform3(e,f,context1,alpha1,tVar1,beta1,tVar2,varnames,
                          fluentVar1,timeVar1,fluentVar2,timeVar2);
        ListAppendCopy(resultOR,t);
        ListFree(t);
      }
      ListFree(quantvars1);
      if (context1!=NULL) ListFree(context1);
    }
    DictFree(varD);
    ListFree(varsorts);
    ListFree(varnames);
  }
  ListFree(fluentsortConstants);
  r=LogicMakeOrFalseOr(resultOR);
  ListFree(resultOR);
  return r;
}

List *EMakeITR3(Encoder *e, char *effectAxiomPred, List *eventVar,
                List *fluentVar, List *timeVar)
{
  int len1,i1,len2,i2;
  Bool effectAxiomsFound;
  char *fluentname, *sourcecode;
  Constant *fluent;
  Sort *fluentsort;
  List *varsorts,*varnames;
  List *quantvars1, *context1, *alpha1, *beta1, *tVar1;
  List *fluentsortConstants, *t;
  List *resultOR, *f, *beta, *existsVars;
  List *r;
  Dict *varD;
  resultOR=ListCreate();
  if (NULL==(fluentsort=ESortGetWErr(e,"fluent"))) return NULL;
  fluentsortConstants=SortNonReifiedConstantsGet(fluentsort);
  len1=ListLen(fluentsortConstants);
  for (i1=0;i1<len1;i1++) {
    fluentname=NthString(fluentsortConstants,i1);
    if (NULL==(fluent=EConstantGetWErr(e,fluentname))) continue;
    if (fluent->noninertial) continue;
    varsorts=C(fluent->argsorts);
    varD=DictCreate(51L);
    varnames=SortnamesToVarnames1(varsorts,varD);
    effectAxiomsFound=0;
    len2=ListLen(e->formulas);
    for (i2=0;i2<len2;i2++) {
      sourcecode=NthString(Nth(e->formulas,i2),FORMULAS_SOURCECODE_I);
      if (sourcecode[0]!=SOURCECODE_ORIGINAL_EFFECT_AXIOM) continue;
      f=Nth(Nth(e->formulas,i2),FORMULAS_FORMULA_I);
      if (!EffectAxiomParse(f,effectAxiomPred,NULL,
                            &quantvars1,&context1,&alpha1,&beta1,
                            &tVar1)) {
        continue;
      }
      if (STREQ(fluentname,NthString(beta1,0))) {
        effectAxiomsFound=1;
        t=HTransform3(e,f,context1,alpha1,beta1,tVar1,varnames,
                      eventVar,fluentVar,timeVar);
        ListAppendCopy(resultOR,t);
        ListFree(t);
      }
      ListFree(quantvars1);
      if (context1!=NULL) ListFree(context1);
    }
    DictFree(varD);
    if (!effectAxiomsFound) {
      if (e->debug) {
        Log("no %s axioms found for %s", effectAxiomPred, fluent->name);
      }
      beta=ListCreate();
      ListAppendCopy(beta,C(A(fluentname)));
      ListAppendListCopy(beta,varnames);
      if (ListLen(varnames)>0) {
        existsVars=L(A("$List"),E);
        ListAppendListCopy(existsVars,varnames);
        ListAppendCopy(resultOR,
                       L(A("$Exists"),
                         existsVars,
                         L(A("$And"),L(A("$EQ"),C(eventVar),A("None"),E),
                                     L(A("$EQ"),C(fluentVar),beta,E),
                                     E),
                         E));
      } else {
        ListAppendCopy(resultOR,
                       L(A("$And"),L(A("$EQ"),C(eventVar),A("None"),E),
                                   L(A("$EQ"),C(fluentVar),beta,E),
                                   E));
      }
    }
    ListFree(varsorts);
    ListFree(varnames);
  }
  ListFree(fluentsortConstants);
  r=LogicMakeOrFalseOr(resultOR);
  ListFree(resultOR);
  return r;
}

/* returns freeable list */
List *EMakeInitiates3(Encoder *e, List *eventVar, List *fluentVar,
                      List *timeVar)
{
  if (AtomEquals(eventVar, A("event")) &&
      AtomEquals(fluentVar, A("fluent")) &&
      AtomEquals(timeVar, A("time"))) {
    if (e->initiates == NULL) {
      e->initiates=EMakeITR3(e, "Initiates", eventVar, fluentVar, timeVar);
    }
    return C(e->initiates);
  }
  Log("ERROR: nonstandard Initiates");
  return EMakeITR3(e, "Initiates", eventVar, fluentVar, timeVar);
}

/* returns freeable list */
List *EMakeTerminates3(Encoder *e, List *eventVar, List *fluentVar,
                      List *timeVar)
{
  if (AtomEquals(eventVar, A("event")) &&
      AtomEquals(fluentVar, A("fluent")) &&
      AtomEquals(timeVar, A("time"))) {
    if (e->terminates == NULL) {
      e->terminates=EMakeITR3(e, "Terminates", eventVar, fluentVar, timeVar);
    }
    return C(e->terminates);
  }
  Log("ERROR: nonstandard Terminates");
  return EMakeITR3(e, "Terminates", eventVar, fluentVar, timeVar);
}

/* returns freeable list */
List *EMakeReleases3(Encoder *e, List *eventVar, List *fluentVar,
                     List *timeVar)
{
  if (AtomEquals(eventVar, A("event")) &&
      AtomEquals(fluentVar, A("fluent")) &&
      AtomEquals(timeVar, A("time"))) {
    if (e->releases == NULL) {
      e->releases=EMakeITR3(e, "Releases", eventVar, fluentVar, timeVar);
    }
    return C(e->releases);
  }
  Log("ERROR: nonstandard Releases");
  return EMakeITR3(e, "Releases", eventVar, fluentVar, timeVar);
}

/* returns freeable list */
List *EMakeTrajectory3(Encoder *e, List *fluentVar1, List *timeVar1,
                       List *fluentVar2,List *timeVar2)
{
  if (AtomEquals(fluentVar1,A("fluent")) &&
      AtomEquals(timeVar1,A("time")) &&
      AtomEquals(fluentVar2,A("fluent2")) &&
      AtomEquals(timeVar2,A("offset"))) {
    if (e->trajectory == NULL) {
      e->trajectory=EMakeTraj3(e,"Trajectory",fluentVar1,timeVar1,
                               fluentVar2,timeVar2);
    }
    return C(e->trajectory);
  }
  Log("ERROR: nonstandard Trajectory");
  return EMakeTraj3(e,"Trajectory",fluentVar1,timeVar1,fluentVar2,timeVar2);
}

/* returns freeable list */
List *EMakeAntiTrajectory3(Encoder *e, List *fluentVar1, List *timeVar1,
                           List *fluentVar2,List *timeVar2)
{
  if (AtomEquals(fluentVar1,A("fluent")) &&
      AtomEquals(timeVar1,A("time")) &&
      AtomEquals(fluentVar2,A("fluent2")) &&
      AtomEquals(timeVar2,A("offset"))) {
    if (e->antitrajectory == NULL) {
      e->antitrajectory=EMakeTraj3(e,"AntiTrajectory",fluentVar1,timeVar1,
                                   fluentVar2,timeVar2);
    }
    return C(e->antitrajectory);
  }
  Log("ERROR: nonstandard AntiTrajectory");
  return EMakeTraj3(e,"AntiTrajectory",fluentVar1,timeVar1,
                    fluentVar2,timeVar2);
}

/* returns freeable list */
List *EMakeClipped3(Encoder *e, List *tau, List *fluentVar,
                    List *tauPlusDelta)
{
  if (AtomEquals(tau, A("time")) &&
      AtomEquals(fluentVar, A("fluent")) &&
      PredIs("$Plus",tauPlusDelta) &&
      AtomEquals(Nth(tauPlusDelta,1), A("time")) &&
      AtomEquals(Nth(tauPlusDelta,2), A("offset"))) {
    if (e->clipped == NULL) {
      e->clipped=EMakeDeClipped3(e,"Terminates",tau,fluentVar,tauPlusDelta);
    }
    return C(e->clipped);
  }
  Log("ERROR: nonstandard Clipped");
  return EMakeDeClipped3(e,"Terminates",tau,fluentVar,tauPlusDelta);
}

/* returns freeable list */
List *EMakeDeclipped3(Encoder *e, List *tau, List *fluentVar,
                      List *tauPlusDelta)
{
  if (AtomEquals(tau, A("time")) &&
      AtomEquals(fluentVar, A("fluent")) &&
      PredIs("$Plus",tauPlusDelta) &&
      AtomEquals(Nth(tauPlusDelta,1), A("time")) &&
      AtomEquals(Nth(tauPlusDelta,2), A("offset"))) {
    if (e->declipped == NULL) {
      e->declipped=EMakeDeClipped3(e,"Initiates",tau,fluentVar,tauPlusDelta);
    }
    return C(e->declipped);
  }
  Log("ERROR: nonstandard Declipped");
  return EMakeDeClipped3(e,"Initiates",tau,fluentVar,tauPlusDelta);
}

List *EPullOutEqualsCombine(List *vars, List *conjuncts)
{
  int len1,i1,len2,i2,len3,i3;
  char *key;
  Dict *d;
  List *addedvars, *foundvarsvalues, *keys;
  List *addedvars1, *r, *r1, *value;
  d=DictCreate(51L);
  len1=ListLen(conjuncts);
  for (i1=0;i1<len1;i1++) {
    foundvarsvalues=Nth(Nth(conjuncts,i1),1);
    key=ListToString(foundvarsvalues);
    DictAppend(d,key,Nth(conjuncts,i1));
    free(key);
  }
  r=ListCreate();
  keys=DictKeys(d);
  len1=ListLen(keys);
  foundvarsvalues=NULL;
  for (i1=0;i1<len1;i1++) {
    value=(List *)DictGet(d,NthString(keys,i1));
    addedvars1=ListCreate();
    r1=ListCreate();
    len2=ListLen(value);
    for (i2=0;i2<len2;i2++) {
      addedvars=Nth(Nth(value,i2),0);
      foundvarsvalues=Nth(Nth(value,i2),1);
      ListAppendCopy(r1,Nth(Nth(value,i2),2));
      len3=ListLen(addedvars);
      for (i3=0;i3<len3;i3++) {
        if (!ListIn(Nth(addedvars,i3),addedvars1)) {
          ListAppendCopy(addedvars1,Nth(addedvars,i3));
        }
      }
    }
    if (foundvarsvalues==NULL) {
      Log("ERROR: foundvarsvalues==NULL");
      exit(1);
    }
    ListAppend(r,L(addedvars1,C(foundvarsvalues),LogicMakeOr(r1),E));
    ListFree(r1);
  }
  DictFree(d);
  return r;
}

List *EPullOutEqualsDisjunct(Encoder *e, List *vars, List *f)
{
  int len1,i1,len2,i2,vi;
  List *t1, *conjuncts, *values, *r, *conjunct, *r1;
  List *existsVars, *toAdded, *newExistsVars, *f2a, *newAdded;
  List *added, *added1, *values1, *f21;
  if (PredIs("$Exists",f)) {
    t1=EPullOutEqualsDisjunct(e,vars,Nth(f,2));
    existsVars=ListDrop(1,Nth(f,1));
    toAdded=LogicFreevars(Nth(t1,1));
    newExistsVars=ListMinus(existsVars,toAdded);
    f2a=LogicMakeExists(newExistsVars,Nth(t1,2));
    newAdded=ListCreate();
    ListAppendListCopy(newAdded,Nth(t1,0));
    ListAppendListCopy(newAdded,toAdded);
    r=L(newAdded,C(Nth(t1,1)),f2a,E);
    ListFree(t1);
    ListFree(existsVars);
    ListFree(toAdded);
    ListFree(newExistsVars);
    return r;
  }
  conjuncts=LogicUnand(f);
  added=ListCreate();
  values=ListCreate();
  len1=ListLen(vars);
  for (i1=0;i1<len1;i1++) {
    ListAppendCopy(values,A("na"));
  }
  r=ListCreate();
  len1=ListLen(conjuncts);
  for (i1=0;i1<len1;i1++) {
    conjunct=Nth(conjuncts,i1);
    if (AtomEquals(A("$True"), conjunct) ||
        AtomEquals(A("$False"), conjunct)) {
      ListAppendCopy(r,conjunct);
    } else if (PredIs("$EQ",conjunct) && ListIn(Nth(conjunct,1),vars)) {
      vi=ListDiota(vars,Nth(conjunct,1));
      if (vi >= ListLen(vars)) {
        Log("ERROR: vi >= ListLen(vars)");
        exit(1);
      }
      if (!AtomEquals(A("na"),Nth(values,vi))) {
        Log("ERROR: duplicate value for conjunct");
      }
      ListNthSet(values,vi,C(Nth(conjunct,2))); /* */
    } else if (PredIs("$EQ",conjunct) && ListIn(Nth(conjunct,2),vars)) {
      vi=ListDiota(vars,Nth(conjunct,2));
      if (vi >= ListLen(vars)) {
        Log("ERROR: vi >= ListLen(vars)");
        exit(1);
      }
      if (!AtomEquals(A("na"),Nth(values,vi))) {
        Log("ERROR: duplicate value for conjunct");
      }
      ListNthSet(values,vi,C(Nth(conjunct,1)));
    } else if (IsQuantifier(NthString(conjunct,0))) {
      t1=EPullOutEqualsDisjunct(e,vars,conjunct);
      added1=Nth(t1,0);
      values1=Nth(t1,1);
      f21=Nth(t1,2);
      len2=ListLen(added1);
      for (i2=0;i2<len2;i2++) {
        if (!ListIn(Nth(added1,i2),added)) {
          ListAppendCopy(added,Nth(added1,i2));
        }
      }
      len2=ListLen(vars);
      for (i2=0;i2<len2;i2++) {
        if (!AtomEquals(A("na"),Nth(values,i2))) {
          Log("ERROR: duplicate value for conjunct 2");
        } else if (!AtomEquals(A("na"),Nth(values1,i2))) {
          ListNthSet(values,i2,C(Nth(values1,i2)));
        }
      }
      ListAppendCopy(r,f21);
      ListFree(t1);
    } else {
      ListAppendCopy(r,conjunct);
    }
  }
  ListFree(conjuncts);
  if (ListLen(r)>0) {
    r1=L(added,values,LogicMakeAnd(r),E);
    ListFree(r);
    return r1;
  } else {
    ListFree(r);
    return L(added,values,C(A("$True")),E);
  }
}

void EPullOutEquals(Encoder *e,List *vars,List *f,
                    /* OUTPUT */ Bool *notflagp, List **foundvarsp, List **rp)
{
  int len1,i1,len2,i2;
  Bool notflag;
  Dict *countD;
  List *t, *disjuncts, *added, *varsvalues, *formula, *var, *r;
  List *foundvarsvalues, *foundvars;
  if (PredIs("$Not",f)) {
    EPullOutEquals(e,vars,Nth(f,1),&notflag,foundvarsp,rp);
    *notflagp=!notflag;
    return;
  }
  t=ListCreate();
  disjuncts=LogicUnor(f);
  len1=ListLen(disjuncts);
  for (i1=0;i1<len1;i1++) {
    if (AtomEquals(A("$False"),Nth(disjuncts,i1))) continue;
    ListAppend(t,EPullOutEqualsDisjunct(e,vars,Nth(disjuncts,i1)));
  }
  countD=DictCreate(51L);
  len1=ListLen(t);
  for (i1=0;i1<len1;i1++) {
    added=Nth(Nth(t,i1),0);
    varsvalues=Nth(Nth(t,i1),1);
    formula=Nth(Nth(t,i1),2);
    len2=ListLen(vars);
    for (i2=0;i2<len2;i2++) {
      if (!AtomEquals(A("na"),Nth(varsvalues,i2))) {
        DictIncr(countD,NthString(vars,i2),1);
      }
    }
  }
  foundvars=ListCreate();
  len1=ListLen(vars);
  for (i1=0;i1<len1;i1++) {
    var=ListNth(vars,i1);
    if (DictGetInteger(countD,AtomToString(var),0)==ListLen(disjuncts)) {
      ListAppendCopy(foundvars,var);
    }
  }
  DictFree(countD);
  r=ListCreate();  
  len1=ListLen(t);
  for (i1=0;i1<len1;i1++) {
    added=Nth(Nth(t,i1),0);
    varsvalues=Nth(Nth(t,i1),1);
    formula=Nth(Nth(t,i1),2);
    foundvarsvalues=ListCreate();
    len2=ListLen(foundvars);
    for (i2=0;i2<len2;i2++) {
      var=ListNth(foundvars,i2);
      ListAppendCopy(foundvarsvalues,C(Nth(varsvalues,ListDiota(vars,var))));
    }
    ListAppend(r,L(C(added),foundvarsvalues,C(formula),E));
  }
  ListFree(disjuncts);
  ListFree(t);
  *notflagp = 0;
  *foundvarsp=foundvars;
  *rp=r;
}

List *EOptimizeQuantifier(Encoder *e, List *f)
{
  int len1,i1,len2,i2;
  Dict *bd;
  Bool foundnotflag, t0;
  List *vars, *body, *conjuncts, *newlhs;
  List *foundvars, *foundconjuncts, *conjunct1;
  List *t1, *t2, *t, *r, *r1;
  List *addedvars, *foundvarsvalues, *f1, *newlhs1;
  List *newbody, *newvars, *newvars1;
  if (PredIs("$Not",f)) {
    return L(A("$Not"),EOptimizeQuantifier(e, Nth(f,1)),E);
  }
  if (!IsList(f)) return C(f);
  if (!IsQuantifier(NthString(f,0))) return C(f);
  body=Nth(f,2);
  if (PredIs("$Implies",body)) {
    conjuncts=LogicUnand(Nth(body,1));
  } else if (PredIs("$And",body)) {
    conjuncts=LogicUnand(body);
  } else {
    return C(f);
  }
  vars=ListDrop(1,Nth(f,1));
  newlhs=ListCreate();
  foundnotflag=0;
  foundvars=NULL;
  foundconjuncts=NULL;
  len1=ListLen(conjuncts);
  for (i1=0;i1<len1;i1++) {
    conjunct1=EOptimizeQuantifier(e,Nth(conjuncts,i1));
    EPullOutEquals(e,vars,conjunct1,&t0,&t1,&t2);
    if (ListLen(t1)>0) {
      if (foundvars!=NULL) {
        Log("ERROR: double pullout");
        exit(1);
      }
      foundnotflag=t0;
      foundvars=t1;
      foundconjuncts=t2;
    } else {
      ListAppendCopy(newlhs,conjunct1);
    }
    ListFree(conjunct1);
  }
  if (foundvars==NULL) {
    ListFree(vars);
    ListFree(conjuncts);
    ListFree(newlhs);
    return C(f);
  }
  if (foundnotflag) {
    t=EPullOutEqualsCombine(foundvars,foundconjuncts);
    ListFree(foundconjuncts);
    foundconjuncts=t;
  }
  r=ListCreate();
  len1=ListLen(foundconjuncts);
  for (i1=0;i1<len1;i1++) {
    addedvars=Nth(Nth(foundconjuncts,i1),0);
    foundvarsvalues=Nth(Nth(foundconjuncts,i1),1);
    f1=Nth(Nth(foundconjuncts,i1),2);
    if (!AtomEquals(A("na"),f1)) {
      if (foundnotflag) {
        newlhs1=C(newlhs);
        ListAppend(newlhs1,L(A("$Not"),C(f1),E));
      } else {
        newlhs1=C(newlhs);
        ListAppendCopy(newlhs1,f1);
      }
    } else {
      newlhs1=C(newlhs);
    }
    if (PredIs("$Implies",body)) {
      newbody=L(A("$Implies"),LogicMakeAnd(newlhs1),C(Nth(body,2)),E);
    } else if (PredIs("$And",body)) {
      newbody=LogicMakeAnd(newlhs1);
    } else {
      Log("ERROR: neither $Implies nor $And");
      exit(1);
    }
    bd=DictCreate(51L);
    len2=ListLen(foundvars);
    for (i2=0;i2<len2;i2++) {
      DictSet(bd,NthString(foundvars,i2),Nth(foundvarsvalues,i2));
    }
    newvars=ListMinus(vars,foundvars);
    ListAppendListCopy(newvars,addedvars);
    if (ListLen(newvars)>0) {
      newvars1=L(A("$List"),E);
      ListAppendListCopy(newvars1,newvars);
      ListAppend(r,L(C(Nth(f,0)),newvars1,LogicInstan(e, newbody, bd, 0),E));
    } else {
      ListAppend(r,LogicInstan(e, newbody, bd, 0));
    }
    ListFree(newlhs1);
    DictFree(bd);
    ListFree(newvars);
    ListFree(newbody);
  }
  ListFree(vars);
  ListFree(conjuncts);
  ListFree(newlhs);
  ListFree(foundvars);
  ListFree(foundconjuncts);
  if (PredIs("$ForAll",f)) {
    r1=LogicMakeAnd(r);
    ListFree(r);
    return r1;
  } else {
    r1=LogicMakeOr(r);
    ListFree(r);
    return r1;
  }
}

/* returns freeable list
 * expand Initiates, Terminates, Releases,
 * Trajectory, AntiTrajectory, Clipped, Declipped
 */
List *ETransformECAxiom(Encoder *e, List *x)
{
  int len,i;
  List *r;
  if (IsAtom(x)) return C(x);
  if (!IsList(x)) return C(x);
  if (IsQuantifier(NthString(x,0))) {
    r=L(C(Nth(x,0)),C(Nth(x,1)),E);
    len=ListLen(x);
    for (i=2;i<len;i++) {
      ListAppend(r,ETransformECAxiom(e,Nth(x,i)));
    }
    return r;
  } else if (PredIs("Initiates",x)) {
    return EMakeInitiates3(e, Nth(x,1), Nth(x,2), Nth(x,3));
  } else if (PredIs("Terminates",x)) {
    return EMakeTerminates3(e, Nth(x,1), Nth(x,2), Nth(x,3));
  } else if (PredIs("Releases",x)) {
    return EMakeReleases3(e, Nth(x,1), Nth(x,2), Nth(x,3));
  } else if (PredIs("Trajectory",x)) {
    return EMakeTrajectory3(e, Nth(x,1), Nth(x,2), Nth(x,3), Nth(x,4));
  } else if (PredIs("AntiTrajectory",x)) {
    return EMakeAntiTrajectory3(e, Nth(x,1), Nth(x,2), Nth(x,3), Nth(x,4));
  } else if (PredIs("Clipped",x)) {
    return EMakeClipped3(e, Nth(x,1), Nth(x,2), Nth(x,3));
  } else if (PredIs("Declipped",x)) {
    return EMakeDeclipped3(e, Nth(x,1), Nth(x,2), Nth(x,3));
  } else {
    r=L(C(Nth(x,0)),E);
    len=ListLen(x);
    for (i=1;i<len;i++) {
      ListAppend(r,ETransformECAxiom(e,Nth(x,i)));
    }
    return r;
  }
  Log("ERROR: unable to transform EC axiom %s", ListToString(x));
  exit(1);
}

/* returns freeable list */
List *EElimNone(Encoder *e, List *x)
{
  int len,i;
  List *r;
  if (IsAtom(x)) return C(x);
  if (!IsList(x)) return C(x);
  if (PredIs("$Not",x) &&
      PredIs("Happens",Nth(x,1)) &&
      STREQ("None",NthString(Nth(x,1),1))) {
    return A("$True");
  }
  if (PredIs("Happens",x) &&
      STREQ("None",NthString(x,1))) {
    return A("$False");
  }
  if (IsQuantifier(NthString(x,0))) {
    r=L(C(Nth(x,0)),C(Nth(x,1)),E);
    len=ListLen(x);
    for (i=2;i<len;i++) {
      ListAppend(r,EElimNone(e,Nth(x,i)));
    }
    return r;
  } else {
    r=L(C(Nth(x,0)),E);
    len=ListLen(x);
    for (i=1;i<len;i++) {
      ListAppend(r,EElimNone(e,Nth(x,i)));
    }
    return r;
  }
  Log("ERROR: unable to eliminate None %s", ListToString(x));
  exit(1);
}

void EEncodeECAxiom(Encoder *e, List *ec, List *hardweight)
{
  List *ec1, *ec2, *ec3;
  ec1 = ETransformECAxiom(e, ec);
  if (ListDeepIn(A("Trajectory"),ec) ||
      ListDeepIn(A("AntiTrajectory"),ec)) {
/*
    Log("TRAJ %s", ListToString(ec1));
 */
    ec3 = EElimNone(e, ec1);
    EEncodeFormula(e,ec3,"0",hardweight,1);
    ListFree(ec1);
    ListFree(ec3);
  } else {
    ec2 = EOptimizeQuantifier(e, ec1);
    ec3 = EElimNone(e, ec2);
    EEncodeFormula(e,ec3,"0",hardweight,1);
    ListFree(ec1);
    ListFree(ec2);
    ListFree(ec3);
  }
}

void EEncodeECAxioms(Encoder *e, List *hardweight)
{
  int len,i;
  char *sourcecode;
  Log("encode EC axioms");
  len=ListLen(e->formulas);
  for (i=0;i<len;i++) {
    sourcecode=NthString(Nth(e->formulas,i),FORMULAS_SOURCECODE_I);
    if (sourcecode[0]!=SOURCECODE_EC_AXIOM) continue;
    EEncodeECAxiom(e, Nth(Nth(e->formulas,i),FORMULAS_FORMULA_I), hardweight);
  }
}

void EEncode(Encoder *e)
{
  int len,i,weightI,hardweightI;
  int numberOfClausesBefore;
  List *f,*weightL,*hardweightL;
  PercentComplete *pc;

#ifdef CHECK
  MemoryReport(e);
#endif

  Log("encode formulas");
  if (e->propositionFilename) {
    e->propositionStream=StreamOpen(e->propositionFilename,"w+");
  }

  len=ListLen(e->formulas);
  if (e->weighted) {
    hardweightI=0;
    pc=PercentCompleteCreate("encode formulas",len);
    for (i=0;i<len;i++) {
      PercentCompleteNext(pc);
      f=Nth(e->formulas,i);
      weightL=Nth(f,FORMULAS_WEIGHT_I);
      weightI=IntParseWErr(ListToString(weightL));
      if (weightI==-1) continue;
      numberOfClausesBefore=numberOfClauses;
      EEncodeFormula(e,
                     Nth(f,FORMULAS_FORMULA_I),
                     NthString(f,FORMULAS_SOURCECODE_I),
                     C(weightL),
                     0);
      if (weightI!=INTNA) {
        hardweightI+=weightI*(numberOfClauses-numberOfClausesBefore);
      }
    }
    if (hardweightI < 1) hardweightI=1;
    Log("hardweight = %d", hardweightI);
    PercentCompleteFree(pc);
    hardweightL=IntToAtom(hardweightI);
    pc=PercentCompleteCreate("encode formulas",len);
    for (i=0;i<len;i++) {
      PercentCompleteNext(pc);
      f=Nth(e->formulas,i);
      weightI=IntParseWErr(NthString(f,FORMULAS_WEIGHT_I));
      if (weightI==INTNA) weightI=-1;
      if (weightI!=-1) continue;
      EEncodeFormula(e,
                     Nth(f,FORMULAS_FORMULA_I),
                     NthString(f,FORMULAS_SOURCECODE_I),
                     hardweightL,
                     1);
    }
    PercentCompleteFree(pc);
  } else {
    hardweightL=A("-1");
    pc=PercentCompleteCreate("encode formulas",len);
    for (i=0;i<len;i++) {
      PercentCompleteNext(pc);
      f=Nth(e->formulas,i);
      EEncodeFormula(e,
                     Nth(f,FORMULAS_FORMULA_I),
                     NthString(f,FORMULAS_SOURCECODE_I),
                     hardweightL,
                     0);
    }
    PercentCompleteFree(pc);
  }

#ifdef CHECK
  MemoryReport(e);
#endif
  EEncodeCompletion(e, hardweightL);
#ifdef CHECK
  MemoryReport(e);
#endif

  if (e->encoding == 3) {
    EEncodeECAxioms(e,hardweightL);
  } else {
    EEncodeTrajectoryAxioms(e,hardweightL);
    EEncodeFrameAxioms(e,hardweightL);
  }

#ifdef CHECK
  MemoryReport(e);
#endif
  if (e->propositionStream) {
    StreamClose(e->propositionStream);
  }
}

void EWrite(Encoder *e)
{
  int len,i;
  Clause *c;
  List *clause,*positive,*negative;
  FILE *stream;
  if (e->outputFilename==NULL) return;
  Log("writing %s",e->outputFilename);
  stream=StreamOpen(e->outputFilename,"w+");
  for (c=e->clauses;c;c=c->next) {
    clause=c->clause;
    if (e->weighted) {
      fputs(ListNthStringWErr(clause,CLAUSES_WEIGHT_I),stream);
      fputc(' ',stream);
    }
    positive=Nth(clause,CLAUSES_POS_I);
    negative=Nth(clause,CLAUSES_NEG_I);
    len=ListLen(positive);
    for(i=0;i<len;i++) {
      fputs(NthString(positive,i),stream);
      fputc(' ',stream);
    }
    len=ListLen(negative);
    for(i=0;i<len;i++) {
      fputc('-',stream);
      fputs(NthString(negative,i),stream);
      fputc(' ',stream);
    }
    fputc('0',stream);
    fputc('\n',stream);
  }
  StreamClose(stream);
}

int main(int argc,char **argv)
{
  int c;
  extern char *optarg;
  extern int optind;
  Encoder *e;
  char *logFilename;

  LogInit(stdout);
  ListInit();
  logFilename=NULL;
  e=ECreate();
  numberOfClauses=0;

  while ((c=getopt(argc,argv,"de:i:l:o:p:rw"))!=EOF) {
    switch (c) {
      case 'd':
        e->debug=1;
        break;
      case 'e':
        e->encoding=atoi(optarg);
        break;
      case 'i':
        e->inputFilename=optarg;
        break;
      case 'l':
        logFilename=optarg;
        break;
      case 'o':
        e->outputFilename=optarg;
        break;
      case 'p':
        e->propositionFilename=optarg;
        break;
      case 'r':
        e->renaming=1;
        break;
      case 'w':
        e->weighted=1;
        break;
      default:
        fprintf(stderr,
  "Usage: decreasoner -d -e <encoding> -i <filename> -l <filename> -o <filename> -p <filename> -r>\n");
        exit(1);
    }
  }
  if (logFilename!=NULL) LogInit(StreamOpen(logFilename,"w+"));
  Log("ECReasonerEncoder");
  ELoad(e);
  EEncode(e);
  EWrite(e);
  if (e->weighted) {
    Log("minimum objective = %g", e->minobjective);
  }
  Log("done");
  exit(0);
}

/* Stream */

FILE *StreamOpen(char *filename,char *mode)
{
  FILE *stream;
  if (NULL==(stream=fopen(filename,mode))) {
    Log("trouble opening %s\n",filename);
    return NULL;
  }
  return stream;
}

void StreamClose(FILE *stream)
{
  fclose(stream);
}

char *ReadFile(char *filename)
{
  char *s;
  size_t cnt;
  FILE *stream;
  struct stat statrec;
  if (0 > stat(filename, &statrec)) {
    Log("trouble opening %s\n", filename);
    return NULL;
  }
  if (NULL == (stream = StreamOpen(filename, "r"))) return NULL;
  s = (char *)Malloc(statrec.st_size+1L);
  cnt = fread(s, 1L, statrec.st_size, stream);
  s[statrec.st_size] = '\0';
  fclose(stream);
  return s;
}

/* Malloc */

void *Malloc(size_t size)
{
  void  *r;
  if (NULL==(r=malloc(size))) {
    Log("malloc: out of memory");
    exit(1);
  }
  return r;
}

void *Realloc(void *ptr,size_t size)
{
  void *r;
  if (NULL==(r=realloc(ptr,size))) {
    Log("realloc: out of memory");
    exit(1);
  }
  return r;
}

void Free(void *ptr)
{
  free(ptr);
}

/* Int */

int IntParse(char *s)
{
  if (!IsValidInt(s)) return INTNA;
  return atoi(s);
}

int IntParseWErr(char *s)
{
  int i;
  i=IntParse(s);
  if (i==INTNA) {
    Log("ERROR: unable to parse integer <%s>",s);
  }
  return i;
}

Bool IsValidInt(char *s)
{
  if (s[0]=='\0') return 0;
  if (*s=='-') s++;
  while (*s) {
    if (!isdigit(*s)) return 0;
    s++;
  }
  return 1;
}

/* StringBuffer */

StringBuffer *StringBufferCreate()
{
  StringBuffer *sb;
  sb=CREATE(StringBuffer);
  sb->len=0L;
  sb->size=16L;
  sb->s=(char *)Malloc(sb->size);
  sb->s[0]='\0';
  return sb;
}

int StringBufferLength(StringBuffer *sb)
{
  return sb->len;
}

char *StringBufferToString(StringBuffer *sb)
{
  return sb->s;
}

void StringBufferFree(StringBuffer *sb)
{
  Free(sb->s);
  Free(sb);
}

void StringBufferAppend(StringBuffer *sb,char *s)
{
  size_t len;
  len=strlen(s);
  while ((sb->len+len+1)>sb->size) {
    sb->size=sb->size*2;
    sb->s=(char *)Realloc(sb->s,sb->size);
  }
  strncpy(sb->s+sb->len,s,len);
  sb->s[sb->len+len]='\0';
  sb->len += len;
}

void StringBufferAppendChar(StringBuffer *sb,int c)
{
  while ((sb->len+2)>sb->size) {
    sb->size=sb->size*2;
    sb->s=(char *)Realloc(sb->s,sb->size);
  }
  sb->s[sb->len]=c;
  sb->s[sb->len+1]='\0';
  sb->len++;
}

/* String */

List *StringSplit(char *s,int c)
{
  List *r;
  StringBuffer *sb;
  r=ListCreate();
  sb=StringBufferCreate();
  while (*s) {
    if (c==*s) {
      ListAppend(r,AtomCreate(StringBufferToString(sb)));
      StringBufferFree(sb);
      sb=StringBufferCreate();
    } else {
      StringBufferAppendChar(sb,*s);
    }
    s++;
  }
  if (StringBufferLength(sb)>0) {
    ListAppend(r,AtomCreate(StringBufferToString(sb)));
  }
  StringBufferFree(sb);
  return r;
}

List *StringSplitToNewline(char *s,int c,/* OUTPUT */ char **nextp)
{
  List *r;
  StringBuffer *sb;
  r=ListCreate();
  sb=StringBufferCreate();
  while (*s && *s!='\n') {
    if (c==*s) {
      ListAppend(r,AtomCreate(StringBufferToString(sb)));
      StringBufferFree(sb);
      sb=StringBufferCreate();
    } else {
      StringBufferAppendChar(sb,*s);
    }
    s++;
  }
  if (StringBufferLength(sb)>0) {
    ListAppend(r,AtomCreate(StringBufferToString(sb)));
  }
  StringBufferFree(sb);
  if (*s=='\n') s++;
  *nextp=s;
  return r;
}

Bool StringHeadEqualAdvance(char *s1,char *s2,/* OUTPUT */ char **nextp)
{
  int   len;
  if (s1[0]!=s2[0]) return 0;
  len=strlen(s1);
  if (strlen(s2)>=len) {
    if (0==strncmp(s1,s2,len)) {
      *nextp=s2+len;
      return 1;
    }
  }
  return 0;
}

Bool StringHeadEqual(char *s1,char *s2)
{
  int   len;
  if (s1[0]!=s2[0]) return 0;
  len=strlen(s1);
  if (strlen(s2)>=len) {
    if (0==strncmp(s1,s2,len)) {
      return 1;
    }
  }
  return 0;
}

char *StringReadTo(char *in,int sep,/* OUTPUT */ char *out,int maxlen)
{
  maxlen--;
  while (*in && *in!=sep) {
    if (maxlen<=0) {
      *out='\0';
      Log("increase NAMELEN");
      return in;
    }
    *out=*in;
    out++; 
    in++;
    maxlen--;
  }
  *out='\0';
  if (*in!='\0') in++;
  return in;
}

/* Dict */

int DictHash(Dict *d,char *symbol)
{
  unsigned char s[6];
  size_t len;

  len=(size_t)strlen(symbol);
  if (len>6) len=6L;
  memset(s,0,6);
  memcpy(s,symbol,(size_t)len);
  return (int)(((s[1]+s[5]+(s[0]+s[4])*(long)256) +
                (s[3]+s[2]*(long)256)*(long)481) % d->size);
}

Dict *DictCreate(size_t size)
{
  Dict *d;
  int i;

  d=(Dict *)Malloc(sizeof(size_t)+size*sizeof(DictEntry *));
  d->size=size;
  for (i=0; i<size; i++) d->dictentries[i]=NULL;
  return d;
}

void DictFree(Dict *d)
{
  int i;
  DictEntry     *de;

  for (i=0;i<d->size;i++) {
    for (de=d->dictentries[i];de;de=de->next) {
      Free(de->symbol);
      /* freeing values is up to caller */
    }
  }
  Free(d);
}

void *DictGet(Dict *d,char *symbol)
{
  DictEntry *de;

  for (de=d->dictentries[DictHash(d,symbol)]; de; de=de->next) {
    if (symbol[0]==de->symbol[0] && STREQ(symbol,de->symbol)) {
      return de->value;
    }
  }
  return NULL;
}

void DictSet(Dict *d,char *symbol,void *value)
{
  DictEntry *de;
  int   i;

  i=DictHash(d,symbol);
  for (de=d->dictentries[i]; de; de=de->next) {
    if (symbol[0]==de->symbol[0] && STREQ(symbol,de->symbol)) {
      de->value=value;
      return;
    }
  }
  de=CREATE(DictEntry);
  de->symbol=strdup(symbol);
  de->value=value;
  de->next=d->dictentries[i];
  d->dictentries[i]=de;
}

Bool DictHasKey(Dict *d, char *symbol)
{
  DictEntry *de;

  for (de=d->dictentries[DictHash(d,symbol)]; de; de=de->next) {
    if (symbol[0]==de->symbol[0] && STREQ(symbol,de->symbol)) {
      return 1;
    }
  }
  return 0;
}

/* returns freeable list */
List *DictKeys(Dict *d)
{
  int i;
  DictEntry *de;
  List *r;

  r=ListCreate();
  for (i=0;i<d->size;i++) {
    for (de=d->dictentries[i];de;de=de->next) {
      ListAppend(r,AtomCreate(de->symbol));
    }
  }
  return r;
}

/* caller free
 * assumes values are char *
 */
char *DictToString(Dict *d)
{
  int i;
  char *r1;
  DictEntry *de;
  StringBuffer *r;
  r=StringBufferCreate();
  for (i=0;i<d->size;i++) {
    for (de=d->dictentries[i];de;de=de->next) {
      StringBufferAppend(r,de->symbol);
      StringBufferAppend(r,": ");
      StringBufferAppend(r,(char *)de->value);
      StringBufferAppend(r,"\n");
    }
  }
  r1=strdup(StringBufferToString(r));
  StringBufferFree(r);
  return r1;
}

/* caller free
 * assumes values are atoms (List *)
 */
char *AtomDictToString(Dict *d)
{
  int i;
  char *r1;
  DictEntry *de;
  StringBuffer *r;
  r=StringBufferCreate();
  for (i=0;i<d->size;i++) {
    for (de=d->dictentries[i];de;de=de->next) {
      StringBufferAppend(r,de->symbol);
      StringBufferAppend(r,": ");
      StringBufferAppend(r,AtomToString((List *)de->value));
      StringBufferAppend(r,"\n");
    }
  }
  r1=strdup(StringBufferToString(r));
  StringBufferFree(r);
  return r1;
}

/* caller free
 * assumes values are List *
 */
char *ListDictToString(Dict *d)
{
  int i;
  char *r1, *s;
  DictEntry *de;
  StringBuffer *r;
  r=StringBufferCreate();
  for (i=0;i<d->size;i++) {
    for (de=d->dictentries[i];de;de=de->next) {
      StringBufferAppend(r,de->symbol);
      StringBufferAppend(r,": ");
      s=ListToString((List *)de->value);
      StringBufferAppend(r,s);
      Free(s);
      StringBufferAppend(r,"\n");
    }
  }
  r1=strdup(StringBufferToString(r));
  StringBufferFree(r);
  return r1;
}

Dict *DictCopy(Dict *d)
{
  int i;
  DictEntry *de;
  Dict *r;

  r=DictCreate(d->size);
  for (i=0;i<d->size;i++) {
    for (de=d->dictentries[i];de;de=de->next) {
      DictSet(r,de->symbol,de->value);
    }
  }
  return r;
}

void DictAppend(Dict *d, char *symbol, List *x)
{
  List *x1;
  x1 = (List *)DictGet(d, symbol);
  if (x1==NULL) {
    x1 = ListCreate();
    ListAppendCopy(x1, x);
    DictSet(d, symbol, (void *)x1);
  } else {
    ListAppendCopy(x1, x);
  }
}

int DictGetInteger(Dict *d, char *symbol, int defaultx)
{
  void *value;
  value = DictGet(d, symbol);
  if (value==NULL) return defaultx;
  return (int)value;
}

void DictIncr(Dict *d, char *symbol, int n)
{
  int m;
  m = DictGetInteger(d, symbol, 0);
  DictSet(d, symbol, (void *)m + n);
}

/* Log */

FILE *logStream;

void LogInit(FILE *stream)
{
  logStream=stream;
}

void Log(char *fmt,...)
{
  time_t now;
  struct tm *tms;
  va_list args;
  va_start(args,fmt);
  now=time(NULL);
  tms=localtime(&now);
  fprintf(logStream,"%.4d%.2d%.2dT%.2d%.2d%.2d",1900+tms->tm_year,
          tms->tm_mon+1,tms->tm_mday,tms->tm_hour,tms->tm_min,
          tms->tm_sec);
  fputs(": ",logStream);
  vfprintf(logStream,fmt,args);
  fputc('\n',logStream);
  fflush(logStream);
  va_end(args);
}

/* Random */

void RandomInit()
{
  RandomSeed(time(0));
}

void RandomSeed(long seed)
{
  if (seed == 0) seed = 1235;
  srandom(seed);
}

int Roll(int n)
{
  return((int)(RandomDouble0_1()*n));
}

/* (0, 1) */
double RandomDouble0_1()
{
  return(random()/2147483647.0);
}

double RandomDoubleFromTo(double from, double to)
{
  return(from + ((to-from)*RandomDouble0_1()));
}

int RandomIntFromTo(int from, int to)
{
  return((int)RandomDoubleFromTo((double)from, 1.0+((double)to)));
}

Bool WithProbability(double x)
{
  return(RandomDouble0_1() < x);
}

/* List */

#ifdef CHECKX
int numlists;
#endif

Dict *AtomDict;

Bool IsAtom(List *x)
{
  return x->type==LIST_ATOM;
}

Bool IsInteger(List *x)
{
  return x->type==LIST_INTEGER;
}

Bool IsList(List *x)
{
  return x->type==LIST_LIST;
}

void ListInit()
{
  AtomDict=DictCreate(5021L);
}

List *AtomCreate(char *s)
{
  List *l;
  if ((l=(List *)DictGet(AtomDict,s))) {
    return l;
  }
  l=CREATE(List);
  l->type=LIST_ATOM;
  l->u.atom=strdup(s);
  DictSet(AtomDict,s,l);
  return l;
}

List *IntegerCreate(int i)
{
  List *l;
  l=CREATE(List);
  l->type=LIST_INTEGER;
  l->u.integer=i;
  return l;
}

List *IntToAtom(int i)
{
  char buf[NAMELEN];
  sprintf(buf,"%d",i);
  return AtomCreate(buf);
}

List *ListCreate()
{
  List *l;
  l=CREATE(List);
#ifdef CHECKX
  numlists++;
#endif
  l->type=LIST_LIST;
  l->u.list=(ListList *)Malloc(sizeof(size_t));
  l->u.list->len=0;
  return l;
}

void ListAppend(List *l,List *e)
{
  if (l->type!=LIST_LIST) {
    Log("appending to nonlist");
    exit(1);
  }
  l->u.list=(ListList *)Realloc(l->u.list,
                                sizeof(size_t)+
                                (l->u.list->len+1)*sizeof(List *));
  l->u.list->elems[l->u.list->len]=e;
  l->u.list->len++;
}

void ListAppendCopy(List *l,List *e)
{
  ListAppend(l,ListCopy(e));
}

List *ListCopy(List *l)
{
  int i;
  List *r;
  if (l->type==LIST_ATOM) {
    return l;
  } else if (l->type==LIST_INTEGER) {
    return IntegerCreate(IntegerToInt(l));
  }
  r=CREATE(List);
#ifdef CHECKX
  numlists++;
#endif
  r->type=LIST_LIST;
  r->u.list=(ListList *)Malloc(sizeof(size_t)+l->u.list->len*sizeof(List *));
  r->u.list->len=l->u.list->len;
  for (i=0;i<r->u.list->len;i++) {
    r->u.list->elems[i]=ListCopy(l->u.list->elems[i]);
  }
  return r;
}

List *ListDefine(List *elem0,...)
{
  va_list ap;
  int i,len;
  List *elems[LISTDEFLEN],*elem,*l;
  if (elem0==NULL) {
    len=0;
  } else {
    va_start(ap,elem0);
    elems[0]=elem0;
    for (len=1; ; len++) {
      elem=(List *)va_arg(ap,List *);
      if (elem==NULL) break;
      if (len>=LISTDEFLEN) Log("increase LISTDEFLEN");
      else elems[len]=elem;
    }
    va_end(ap);
  }
  l=CREATE(List);
#ifdef CHECKX
  numlists++;
#endif
  l->type=LIST_LIST;
  l->u.list=(ListList *)Malloc(sizeof(size_t)+len*sizeof(List *));
  l->u.list->len=len;
  for (i=0;i<len;i++) {
    l->u.list->elems[i]=elems[i];
  }
  return l;
}

void ListDelete(List *l, int i)
{
  int j;
  if (l->type!=LIST_LIST) {
    Log("deleting element of nonlist");
    exit(1);
  }
  ListFree(ListNth(l,i));
  for (j=i+1;j<l->u.list->len;j++) {
    l->u.list->elems[j-1]=l->u.list->elems[j];
  }
  l->u.list->len--;
  l->u.list=(ListList *)Realloc(l->u.list,
                                sizeof(size_t)+
                                l->u.list->len*sizeof(List *));
}

void ListFree(List *l)
{
  int i;
  if (l->type==LIST_ATOM) {
    return; /* atoms are never freed */
  } else if (l->type==LIST_INTEGER) {
    Free(l);
    return;
  }
  for (i=0;i<l->u.list->len;i++) {
    ListFree(l->u.list->elems[i]);
  }
  Free(l->u.list);
  Free(l);
#ifdef CHECKX
  numlists--;
#endif
}

char *ListNthStringWErr(List *l,int n)
{
  char *s;
  s=ListNthString(l,n);
  if (s==NULL) {
    Log("trouble getting %dth string of %s",n,ListToString(l));
    return "";
  }
  return s;
}

void ListAppendList(List *l,List *l1)
{
  int len1,i1;
  len1=ListLen(l1);
  for (i1=0;i1<len1;i1++) {
    ListAppend(l,ListNth(l1,i1));
  }
}

void ListAppendListCopy(List *l,List *l1)
{
  int len1,i1;
  len1=ListLen(l1);
  for (i1=0;i1<len1;i1++) {
    ListAppendCopy(l,ListNth(l1,i1));
  }
}

/* returns copy */
List *ListDrop(int n,List *l)
{
  int len,i;
  List *r;
  r=ListCreate();
  len=ListLen(l);
  for (i=n;i<len;i++) {
    ListAppendCopy(r,ListNth(l,i));
  }
  return r;
}

List *ListRandomElement(List *l)
{
  return ListNth(l,Roll(ListLen(l)));
}

/* returns copy */
List *ListShuffle(List *l)
{
  int len, i;
  List *x, *r;
  x=ListCopy(l);
  r=ListCreate();
  len=ListLen(x);
  while (len>0) {
    i=RandomIntFromTo(0,len-1);
    ListAppendCopy(r,ListNth(x,i));
    ListDelete(x,i);
    len--;
  }
  ListFree(x);
  return r;
}

Bool ListEquals(List *l1,List *l2)
{
  int len,i;
  if (l1->type!=l2->type) return 0;
  if (l1->type==LIST_ATOM) return AtomEquals(l1,l2);
  if (ListLen(l1)!=ListLen(l2)) return 0;
  len=ListLen(l1);
  for (i=0;i<len;i++) {
    if (!ListEquals(ListNth(l1,i),ListNth(l2,i))) return 0;
  }
  return 1;
}

Bool AtomIn(List *a,List *l)
{
  int len,i;
  len=ListLen(l);
  for (i=0;i<len;i++) {
    if (AtomEquals(a,ListNth(l,i))) return 1;
  }
  return 0;
}

Bool ListIn(List *e,List *l)
{
  int len,i;
  len=ListLen(l);
  for (i=0;i<len;i++) {
    if (ListEquals(e,ListNth(l,i))) return 1;
  }
  return 0;
}

Bool ListDeepIn(List *e,List *l)
{
  int len,i;
  if (ListEquals(e,l)) return 1;
  len=ListLen(l);
  for (i=0;i<len;i++) {
    if (ListDeepIn(e,ListNth(l,i))) return 1;
  }
  return 0;
}

Bool ListIsDistinct(List *l)
{
  int len,i;
  List *seen;
  seen=ListCreate();
  len=ListLen(l);
  for (i=0;i<len;i++) {
    if (ListIn(ListNth(l,i),seen)) {
      ListFree(seen);
      return 0;
    }
    ListAppend(seen,ListNth(l,i));
  }
  ListFree(seen);
  return 1;
}

List *ListMinus(List *x0, List *x1)
{
  int len,i;
  List *r,*e;
  r=ListCreate();
  len=ListLen(x0);
  for (i=0;i<len;i++) {
    e=ListNth(x0,i);
    if (!ListIn(e,x1)) ListAppendCopy(r,e);
  }
  return r;
}

List *ListUniq(List *x)
{
  int len,i;
  List *r,*e;
  r=ListCreate();
  len=ListLen(x);
  for (i=0;i<len;i++) {
    e=ListNth(x,i);
    if (!ListIn(e,r)) ListAppendCopy(r,e);
  }
  return r;
}

int ListDiota(List *x,List *e)
{
  int len,i;
  len=ListLen(x);
  for (i=0;i<len;i++) {
    if (ListEquals(ListNth(x,i),e)) return i;
  }
  return i;
}

Bool ListLenNot(List *l,int len)
{
  if (ListLen(l)!=len) {
    Log("length of %s not %d",ListToString(l),len);
    return 1;
  }
  return 0;
}

List *ListRead(char *s)
{
  int i;
  List *r;
  ListRead1(s,0,&r,&i);
  return r;
}

void ListRead1(char *s,int i,/* OUTPUT */ List **rList,int *rI)
{
  int l;
  char tok[NAMELEN],*p;
  List *elems,*a;
  l=strlen(s);
  if (i<l && s[i]=='[') {
    i++;
    elems=ListCreate();
    while (i<l && s[i]!=']') {
      ListRead1(s,i,&a,&i);
      if (a==NULL) break;
      ListAppend(elems,a);
      if (i<l && s[i]==' ') i++;
    }
    *rList=elems;
    *rI=i+1;
  } else {
    p=tok;
    while (i<l) {
      if (s[i]==' ' || s[i]=='[' || s[i]==']') break;
      *p=s[i];
      i++;
      p++;
    }
    *p='\0';
    *rList=AtomCreate(tok);
    *rI=i;
  }
}

/* caller free */
char *ListToString(List *x)
{
  int cnt,len,i;
  char *r1,*s,buf[NAMELEN];
  StringBuffer *r;
  if (x==NULL) return strdup("NULL");
  if (x->type==LIST_ATOM) {
    return strdup(x->u.atom);
  } else if (x->type==LIST_INTEGER) {
    sprintf(buf,"%d",x->u.integer);
    return strdup(buf);
  }
  r=StringBufferCreate();
  StringBufferAppend(r,"[");
  cnt=0;
  len=ListLen(x);
  for (i=0;i<len;i++) {
    if (cnt!=0) StringBufferAppend(r," ");
    s=ListToString(ListNth(x,i));
    StringBufferAppend(r,s);
    Free(s);
    cnt++;
  }
  StringBufferAppend(r,"]");
  r1=strdup(StringBufferToString(r));
  StringBufferFree(r);
  return r1;
}

#ifdef CHECKX
int NumberOfListsIn(List *x)
{
  int r,len,i;
  if (IsAtom(x)) return 0;
  r=1;
  len=ListLen(x);
  for (i=0;i<len;i++) {
    r+=NumberOfListsIn(ListNth(x,i));
  }
  return r;
}

void ListLeakCheck(char *fn,int numlistsBefore,List *in,List *out)
{
  int numlistsOut;
  if (out) {
    numlistsOut=NumberOfListsIn(out);
  } else {
    numlistsOut=0;
  }
  if (numlistsBefore!=(numlists-numlistsOut)) {
    Log("%s: %d lists before,%d lists after",
        fn,numlistsBefore,numlists-numlistsOut);
  }
}
#endif

/* End of file. */
