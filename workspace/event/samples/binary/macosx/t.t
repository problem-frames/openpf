Copyright (c) 2005 IBM Corporation and others.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Common Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/cpl-v10.html

Contributors:
IBM - Initial implementation

Discrete Event Calculus Reasoner 1.0
loading decreasoner.py
ERROR: undefined sort import: <import os>
ERROR: undefined sort import: <import string>
ERROR: undefined sort import: <import sys>
ERROR: undefined sort import: <import time>
ERROR: undefined sort def: <def test():>
ERROR: undefined sort def: <def copyright(prefix):>
ERROR: undefined sort if: <if prefix:>
ERROR: undefined sort return: <return string.join(map(lambda x:prefix+x,['\n']+t+['\n']),'')>
ERROR: undefined sort return: <return open('COPYRIGHT').read()>
ERROR: undefined sort def: <def runexamples():>
ERROR: undefined sort def: <def runexamples1(infn,outfn):>
ERROR: undefined sort for: <for line0 in open(infn).readlines():>
ERROR: undefined sort if: <if not line:>
ERROR: undefined sort if: <if len(models)==nummodels:>
ERROR: undefined sort def: <def run(inputfilename):>
ERROR: undefined sort class: <class Rep:>
ERROR: undefined sort def: <def __init__(self,name,formulas,generatedFormulas,constants):>
ERROR: undefined sort def: <def stats(self,ec):>
ERROR: undefined sort for: <for const in self.constants:>
ERROR: undefined sort if: <if ec.constantSubsort(const,'fluent'): fluents=fluents+1>
ERROR: undefined sort elif: <elif ec.constantSubsort(const,'event'): events=events+1>
ERROR: undefined sort elif: <elif ec.constantSubsort(const,'predicate'): predicates=predicates+1>
ERROR: undefined sort elif: <elif ec.constantSubsort(const,'function'): functions=functions+1>
ERROR: undefined sort return: <return [predicates,functions,fluents,events,>
ERROR: undefined sort def: <def anyPredicateIn(self,predicates):>
ERROR: undefined sort for: <for predicate in predicates:>
ERROR: undefined sort if: <if self.predicateIn(predicate): return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def predicateIn(self,predicate):>
ERROR: undefined sort for: <for const in self.constants:>
ERROR: undefined sort if: <if const.name==predicate: return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort class: <class decreasoner:>
ERROR: undefined sort def: <def __init__(self):>
ERROR: undefined sort def: <def run(self,inputfilename,outputfilename):>
ERROR: undefined sort if: <if outputfilename:>
ERROR: undefined sort if: <if self.options['debug']: dictDbg(self.options,[])>
ERROR: undefined sort if: <if len(models)>0 and self.options.get('finalstatefile')!=None:>
ERROR: undefined sort if: <if self.options['tmpfilerm']:>
ERROR: undefined sort if: <if unsatisfied>0: models=[]>
ERROR: undefined sort for: <for rep in self.reps:>
ERROR: undefined sort return: <return (encodeSeconds,satSeconds,totalSeconds,numprops,numclauses,models)>
ERROR: undefined sort def: <def tmpfileRm(self):>
ERROR: undefined sort def: <def load(self,filename,sourcecode):>
ERROR: undefined sort if: <if self.options['encoding']=='3' and filename=='foundations/EC.e':>
ERROR: undefined sort if: <if filename in ['foundations/DEC.e','foundations/ECCausal.e']:>
ERROR: undefined sort global: <global LOADING>
ERROR: undefined sort while: <while 1:>
ERROR: undefined sort if: <if not s: break>
ERROR: undefined sort if: <if not s: pass>
ERROR: undefined sort elif: <elif self.loadOption(s): pass>
ERROR: undefined sort elif: <elif self.loadRange(s): pass>
ERROR: undefined sort elif: <elif self.loadSort(s): pass>
ERROR: undefined sort elif: <elif self.loadReifiedSort(s): pass>
ERROR: undefined sort elif: <elif self.loadXorMutex(s,formulas,generatedFormulas): pass>
ERROR: undefined sort elif: <elif self.loadNoninertial(s): pass>
ERROR: undefined sort elif: <elif self.loadManualRelease(s): pass>
ERROR: undefined sort elif: <elif self.loadIgnore(s): pass>
ERROR: undefined sort elif: <elif self.loadCompletion(s): pass>
ERROR: undefined sort elif: <elif self.loadLoad(s,sourcecode): pass>
ERROR: undefined sort elif: <elif self.loadConstant(s,constants): pass>
ERROR: undefined sort if: <if filename=='foundations/DEC.e' and self.options['trajectory']:>
ERROR: undefined sort def: <def parseFormulaLines(self,lines,filename):>
ERROR: undefined sort if: <if len(lines)>0:>
ERROR: undefined sort if: <if formulas1==None or len(formulas1)==0:>
ERROR: undefined sort return: <return formulas1>
ERROR: undefined sort return: <return []>
ERROR: undefined sort def: <def loadDone(self):>
ERROR: undefined sort global: <global LOADING>
ERROR: undefined sort for: <for (filename,name,lines,formulas,parsedFormulas,generatedFormulas,>
ERROR: undefined sort def: <def formulasForTime(self,formulas,t):>
ERROR: undefined sort for: <for f in formulas:>
ERROR: undefined sort if: <if f[-1]==t: r.append(f)>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def formulasToString(self,shorten,predicate,formulas,prefix):>
ERROR: undefined sort for: <for f in formulas:>
ERROR: undefined sort if: <if predicate==None or self.predicateMatch(f[0],predicate):>
ERROR: undefined sort if: <if shorten and f[0]=='HoldsAt': f=f[1]>
ERROR: undefined sort if: <if s: r.append(prefix+s)>
ERROR: undefined sort return: <return string.join(r,'\n')>
ERROR: undefined sort def: <def formulasDiff(self,formulasP,formulasN,prevFormulasP,prevFormulasN):>
ERROR: undefined sort for: <for e in prevFormulasP:>
ERROR: undefined sort if: <if notime(e) not in map(notime,formulasP): trueToFalse.append(e)>
ERROR: undefined sort for: <for e in prevFormulasN:>
ERROR: undefined sort if: <if notime(e) in map(notime,formulasP): falseToTrue.append(e)>
ERROR: undefined sort return: <return (trueToFalse,falseToTrue)>
ERROR: undefined sort def: <def holdsAtFormulas(self,x):>
ERROR: undefined sort for: <for e in x:>
ERROR: undefined sort if: <if self.options['debug']:>
ERROR: undefined sort if: <if e[0] in ['HoldsAt','ReleasedAt']:>
ERROR: undefined sort if: <if e[0]=='HoldsAt':>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def happensFormulas(self,x):>
ERROR: undefined sort for: <for e in x:>
ERROR: undefined sort if: <if e[0]=='Happens':>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def notHappensFormulas(self,x):>
ERROR: undefined sort for: <for e in x:>
ERROR: undefined sort if: <if e[0]!='Happens':>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def sortsToVarnames(self,sorts,alwaysUseNumbers):>
ERROR: undefined sort if: <if not alwaysUseNumbers:>
ERROR: undefined sort for: <for sort in sorts:>
ERROR: undefined sort for: <for sort in sorts:>
ERROR: undefined sort if: <if (not alwaysUseNumbers) and cntD[sort.name]==1:>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def releasesAdd(self):>
ERROR: undefined sort if: <if fluentsort==None:>
ERROR: undefined sort for: <for fluent in fluentsort.nonReifiedConstantsGet():>
ERROR: undefined sort if: <if fluent.name in self.noninertial:>
ERROR: undefined sort elif: <elif ((fluent.name not in self.manualrelease) and>
ERROR: undefined sort def: <def loadFormulas(self,formulas,sourcecode):>
ERROR: undefined sort for: <for f in formulas:>
ERROR: undefined sort if: <if self.isIgnored(f): continue>
ERROR: undefined sort if: <if self.loadFunctionValue(f): continue>
ERROR: undefined sort def: <def isIgnored(self,f):>
ERROR: undefined sort if: <if deepInAny(self.ignore,f):>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def generateIntegerConstants(self,sort,minint,maxint,line):>
ERROR: undefined sort for: <for tInt in range(minint,maxint+1):>
ERROR: undefined sort if: <if constant==None:>
ERROR: undefined sort def: <def headParse(self,line,hd):>
ERROR: undefined sort if: <if not headIs(line,hd): return (0,line)>
ERROR: undefined sort return: <return (1,elimHead(line,hd))>
ERROR: undefined sort def: <def headParse2(self,line,hd1,hd2):>
ERROR: undefined sort if: <if headIs(line,hd1):>
ERROR: undefined sort return: <return (1,hd1,elimHead(line,hd1))>
ERROR: undefined sort if: <if headIs(line,hd2):>
ERROR: undefined sort return: <return (1,hd2,elimHead(line,hd2))>
ERROR: undefined sort return: <return (0,'',line)>
ERROR: undefined sort def: <def loadOption(self,line):>
ERROR: undefined sort if: <if not retcode: return 0>
ERROR: undefined sort if: <if len(t)!=2:>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort if: <if optionname in OPTION_BOOLEAN:>
ERROR: undefined sort if: <if optionvalue=='on': optionvalue=1>
ERROR: undefined sort elif: <elif optionvalue=='off': optionvalue=0>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort elif: <elif optionname not in OPTION_STRING:>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort if: <if optionname=='debug': DEBUG=optionvalue>
ERROR: undefined sort if: <if self.options['debug']:>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort def: <def loadRange(self,line):>
ERROR: undefined sort if: <if not retcode: return 0>
ERROR: undefined sort if: <if len(t)!=3:>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort if: <if sort==None:>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort if: <if minint==None:>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort if: <if maxint==None:>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort def: <def loadSort(self,line):>
ERROR: undefined sort if: <if not retcode: return 0>
ERROR: undefined sort return: <return self.loadSort1(line,s,0)>
ERROR: undefined sort def: <def loadReifiedSort(self,line):>
ERROR: undefined sort if: <if not retcode: return 0>
ERROR: undefined sort return: <return self.loadSort1(line,s,1)>
ERROR: undefined sort def: <def loadSort1(self,line,s,reified):>
ERROR: undefined sort if: <if reified: keyword='reified sort'>
ERROR: undefined sort for: <for e in string.split(string.replace(s,' ',''),','):>
ERROR: undefined sort if: <if len(t)==1:>
ERROR: undefined sort elif: <elif len(t)==2:>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort def: <def loadXorMutex(self,line,outputFormulas,generatedFormulas):>
ERROR: undefined sort if: <if not retcode: return 0>
ERROR: undefined sort for: <for name in names:>
ERROR: undefined sort if: <if name in self.ignore: continue>
ERROR: undefined sort if: <if ((constant==None) or>
ERROR: undefined sort not: <not self.constantSubsortAny(>
ERROR: undefined sort if: <if len(constants)==0: return 1>
ERROR: undefined sort if: <if hd=='xor':>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort def: <def loadMutex(self,constants,outputFormulas):>
ERROR: undefined sort for: <for (constant1,constant2) in crossProduct([constants,constants]):>
ERROR: undefined sort if: <if constant1==constant2: continue>
ERROR: undefined sort for: <for e in self.sortsToVarnames(constant1.argSorts,1):>
ERROR: undefined sort if: <if e not in varnames: varnames.append(e)>
ERROR: undefined sort for: <for e in self.sortsToVarnames(constant2.argSorts,1):>
ERROR: undefined sort if: <if e not in varnames: varnames.append(e)>
ERROR: undefined sort if: <if t1[0] in ['HoldsAt','Happens'] or t2[0] in ['HoldsAt','Happens']:>
ERROR: undefined sort def: <def loadXor(self,constants,outputFormulas):>
ERROR: undefined sort def: <def constructXor(self,constants,predicate):>
ERROR: undefined sort for: <for constant in constants:>
ERROR: undefined sort for: <for e in varnames1:>
ERROR: undefined sort if: <if e not in varnames: varnames.append(e)>
ERROR: undefined sort if: <if t[0] in ['HoldsAt','Happens']: reified=1>
ERROR: undefined sort if: <if reified: varlist=['$List']+varnames+['time']>
ERROR: undefined sort return: <return ['$ForAll',varlist,fOR]>
ERROR: undefined sort def: <def hha(self,constant,args,tVar):>
ERROR: undefined sort if: <if self.constantSubsort(constant,'fluent'):>
ERROR: undefined sort return: <return ['HoldsAt',[constant.name]+args,tVar]>
ERROR: undefined sort elif: <elif self.constantSubsort(constant,'event'):>
ERROR: undefined sort return: <return ['Happens',[constant.name]+args,tVar]>
ERROR: undefined sort elif: <elif self.constantSubsort(constant,'predicate'):>
ERROR: undefined sort return: <return [constant.name]+args>
ERROR: undefined sort return: <return []>
ERROR: undefined sort def: <def ignoredElim(self,x):>
ERROR: undefined sort for: <for e in x:>
ERROR: undefined sort if: <if e in self.ignore: continue>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def loadNoninertial(self,line):>
ERROR: undefined sort if: <if not retcode: return 0>
ERROR: undefined sort for: <for name in t:>
ERROR: undefined sort if: <if ((constant==None) or>
ERROR: undefined sort not: <not self.constantSubsortAny(constant,['event','fluent'])):>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort def: <def loadManualRelease(self,line):>
ERROR: undefined sort if: <if not retcode: return 0>
ERROR: undefined sort for: <for name in t:>
ERROR: undefined sort if: <if ((constant==None) or>
ERROR: undefined sort not: <not self.constantSubsortAny(constant,['event','fluent'])):>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort def: <def loadIgnore(self,line):>
ERROR: undefined sort if: <if not retcode: return 0>
ERROR: undefined sort for: <for name in commaListParse(s):>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort def: <def loadCompletion(self,line):>
ERROR: undefined sort if: <if not retcode: return 0>
ERROR: undefined sort if: <if len(t)==2:>
ERROR: undefined sort elif: <elif len(t)==1:>
ERROR: undefined sort if: <if constant==None or not self.constantSubsort(constant,'predicate'):>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort def: <def loadLoad(self,line,sourcecode):>
ERROR: undefined sort if: <if not retcode: return 0>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort def: <def loadConstant(self,line,constants):>
ERROR: undefined sort if: <if not sortname: return 0>
ERROR: undefined sort if: <if sortname[-1]=='!':>
ERROR: undefined sort if: <if not isSort(sortname): return 0>
ERROR: undefined sort if: <if sort==None:>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort if: <if sort.reified:>
ERROR: undefined sort return: <return self.loadReified(line,sort,defn,redefineOK,constants)>
ERROR: undefined sort return: <return self.loadNonreified(line,sort,defn,redefineOK,constants)>
ERROR: undefined sort def: <def loadReified(self,line,sort,defn,redefineOK,constants):>
ERROR: undefined sort if: <if len(t)==1:>
ERROR: undefined sort elif: <elif len(t)==2:>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort if: <if len(t)==2:>
ERROR: undefined sort if: <if len(t1)==0: argSortNames=[]>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort if: <if name in self.ignore:>
ERROR: undefined sort if: <if self.options['debug']:>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort for: <for argSortName in argSortNames:>
ERROR: undefined sort if: <if t==None:>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort if: <if resultSortName:>
ERROR: undefined sort if: <if resultSort==None:>
ERROR: undefined sort if: <if resultSort:>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort def: <def loadNonreified(self,line,sort,defn,redefineOK,constants):>
ERROR: undefined sort for: <for name in commaListParse(defn):>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort def: <def constantCreate(self,name,sort,argSorts,resultSort,line,redefineOK):>
ERROR: undefined sort if: <if r:>
ERROR: undefined sort if: <if not redefineOK:>
ERROR: undefined sort return: <return r>
ERROR: undefined sort if: <if not existing:>
ERROR: undefined sort if: <if argSorts: r.argSortsSet(argSorts)>
ERROR: undefined sort if: <if resultSort: r.resultSortSet(resultSort)>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def constantGet(self,constantname):>
ERROR: undefined sort if: <if self.constantD.has_key(constantname):>
ERROR: undefined sort return: <return self.constantD[constantname]>
ERROR: undefined sort return: <return None>
ERROR: undefined sort def: <def loadFunctionValue(self,f):>
ERROR: undefined sort if: <if (islist(f) and>
ERROR: undefined sort not: <not islist(f[2])):>
ERROR: undefined sort if: <if not function: return 0>
ERROR: undefined sort if: <if not self.constantSubsort(function,'function'): return 0>
ERROR: undefined sort if: <if not allIsConst(arguments): return 0>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def functionsValidate(self):>
ERROR: undefined sort for: <for constantname in self.constantD.keys():>
ERROR: undefined sort if: <if not self.constantSubsort(function,'function'): continue>
ERROR: undefined sort while: <while iter.hasMoreElements():>
ERROR: undefined sort if: <if value==None:>
ERROR: undefined sort def: <def sortsValidate(self):>
ERROR: undefined sort for: <for sort in self.sortD.values():>
ERROR: undefined sort if: <if sort.name=='integer': continue>
ERROR: undefined sort if: <if sort.subsort(self.sortGet('integer')):>
ERROR: undefined sort if: <if sort.minint==0 and sort.maxint==-1:>
ERROR: undefined sort def: <def loadFormula(self,f,sourcecode):>
ERROR: undefined sort if: <if self.options['encoding']=='3' and sourcecode==SOURCECODE_EC_AXIOM:>
ERROR: undefined sort elif: <elif isTrajectoryAxiom(f):>
ERROR: undefined sort elif: <elif isEffectAxiom(f):>
ERROR: undefined sort if: <if self.options['encoding']=='3':>
ERROR: undefined sort def: <def labelToSourcecode(self,label):>
ERROR: undefined sort if: <if label=='*': return '*'>
ERROR: undefined sort return: <return chr(ord('0')+self.labelToInt(label))>
ERROR: undefined sort def: <def labelToInt(self,label):>
ERROR: undefined sort if: <if self.labelD.has_key(label):>
ERROR: undefined sort return: <return self.labelD[label]>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def formulaWrite(self,f,sourcecode):>
ERROR: undefined sort if: <if f[0]=='$Weight':>
ERROR: undefined sort if: <if not self.options['weighted']:>
ERROR: undefined sort elif: <elif f[0]=='$Label':>
ERROR: undefined sort def: <def subsort(self,ancname,desname):>
ERROR: undefined sort if: <if des==None:>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort if: <if anc==None:>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort return: <return des.subsort(anc)>
ERROR: undefined sort def: <def anySubsort(self,ancname,desnames):>
ERROR: undefined sort for: <for desname in desnames:>
ERROR: undefined sort if: <if self.subsort(ancname,desname): return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def constantSubsort(self,constant,sortname):>
ERROR: undefined sort if: <if not sort: return 0>
ERROR: undefined sort return: <return constant.constantSubsort(sort)>
ERROR: undefined sort def: <def constantSubsortAny(self,constant,sortnames):>
ERROR: undefined sort for: <for sortname in sortnames:>
ERROR: undefined sort if: <if self.constantSubsort(constant,sortname): return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def sortGet(self,sortname):>
ERROR: undefined sort if: <if self.sortD.has_key(sortname): return self.sortD[sortname]>
ERROR: undefined sort return: <return None>
ERROR: undefined sort def: <def sortCreate(self,name,reified,parentname,line):>
ERROR: undefined sort if: <if r:>
ERROR: undefined sort if: <if parentname:>
ERROR: undefined sort if: <if parent==None:>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def sortValidate(self,f):>
ERROR: undefined sort return: <return self.sortProcess(f,1)>
ERROR: undefined sort def: <def sortProcess(self,f,validate):>
ERROR: undefined sort if: <if isVar(f):>
ERROR: undefined sort if: <if sort: return [sort]>
ERROR: undefined sort return: <return []>
ERROR: undefined sort if: <if typ([])==typ(f):>
ERROR: undefined sort if: <if f[0] in ['$Weight','$Label']:>
ERROR: undefined sort return: <return self.sortProcess(f[2],validate)>
ERROR: undefined sort elif: <elif f[0] in CONNECTIVES:>
ERROR: undefined sort for: <for e in f[1:]:>
ERROR: undefined sort if: <if (validate and>
ERROR: undefined sort not: <not self.anySubsort('boolean',sorts)):>
ERROR: undefined sort return: <return ['boolean']>
ERROR: undefined sort elif: <elif isQuantification(f):>
ERROR: undefined sort if: <if validate and len(sorts)!=0 and not self.anySubsort('boolean',sorts):>
ERROR: undefined sort return: <return ['boolean']>
ERROR: undefined sort elif: <elif isVar(f[0]):>
ERROR: undefined sort return: <return []>
ERROR: undefined sort if: <if constant!=None:>
ERROR: undefined sort if: <if len(argSorts)!=len(args):>
ERROR: undefined sort if: <if validate:>
ERROR: undefined sort while: <while i<len(args):>
ERROR: undefined sort if: <if (validate and len(sorts)!=0 and>
ERROR: undefined sort not: <not self.anySubsort(argsort,sorts)):>
ERROR: undefined sort if: <if constant.resultSort==None:>
ERROR: undefined sort return: <return []>
ERROR: undefined sort return: <return [constant.resultSort.name]>
ERROR: undefined sort elif: <elif validate and f[0][0]!='$':>
ERROR: undefined sort elif: <elif typ('')==typ(f) and isConst(f):>
ERROR: undefined sort if: <if constant!=None:>
ERROR: undefined sort return: <return map(lambda x:x.name,constant.sorts)>
ERROR: undefined sort return: <return []>
ERROR: undefined sort def: <def solve(self):>
ERROR: undefined sort if: <if retcode:>
ERROR: undefined sort return: <return (encodeSeconds,satSeconds,numprops,numclauses,unsatisfied,models)>
ERROR: undefined sort def: <def encode(self):>
ERROR: undefined sort if: <if not executableExists('./decreasoner'):>
ERROR: undefined sort return: <return (0,0,0,0)>
ERROR: undefined sort if: <if self.options['debug']: cmd=cmd+' -d'>
ERROR: undefined sort if: <if self.options['encoding']: cmd=cmd+' -e '+self.options['encoding']>
ERROR: undefined sort if: <if self.options['renaming']: cmd=cmd+' -r'>
ERROR: undefined sort if: <if self.options['weighted']: cmd=cmd+' -w'>
ERROR: undefined sort if: <if len(errors)>0:>
ERROR: undefined sort for: <for error in errors:>
ERROR: undefined sort if: <if self.options['debug']:>
ERROR: undefined sort if: <if r: return (0,encodeSeconds,0,0)>
ERROR: undefined sort if: <if self.options['debug']:>
ERROR: undefined sort if: <if self.options['weighted']:>
ERROR: undefined sort if: <if self.options['debug']:>
ERROR: undefined sort return: <return (1,encodeSeconds,numprops,numclauses)>
ERROR: undefined sort def: <def solve1(self):>
ERROR: undefined sort while: <while unsatisfied<3:>
ERROR: undefined sort if: <if len(models)>0:>
ERROR: undefined sort return: <return (1,satSeconds,unsatisfied,models)>
ERROR: undefined sort return: <return (0,0,0,[])>
ERROR: undefined sort def: <def clausesSort(self,inputFilename,outputFilename):>
ERROR: undefined sort if: <if self.options['debug']: dbg('sorting clauses')>
ERROR: undefined sort while: <while 1:>
ERROR: undefined sort if: <if not s: break>
ERROR: undefined sort def: <def clauseToLine(self,weight,positive,negative):>
ERROR: undefined sort if: <if self.options['weighted']:>
ERROR: undefined sort for: <for e in positive: r.append(str(e))>
ERROR: undefined sort for: <for e in negative: r.append('-'+str(e))>
ERROR: undefined sort return: <return string.join(r)>
ERROR: undefined sort def: <def clauseReadline(self,s):>
ERROR: undefined sort if: <if self.options['weighted']:>
ERROR: undefined sort for: <for e in t[:-1]:>
ERROR: undefined sort if: <if e>0: positive.append(e)>
ERROR: undefined sort return: <return (weight,positive,negative)>
ERROR: undefined sort def: <def problemToString(self,propositions):>
ERROR: undefined sort while: <while 1:>
ERROR: undefined sort if: <if not s: break>
ERROR: undefined sort if: <if propositions!=None:>
ERROR: undefined sort if: <if not anyIn(positive+negative,propositions):>
ERROR: undefined sort return: <return string.join(r,'\n')>
ERROR: undefined sort def: <def propositionsParse(self):>
ERROR: undefined sort if: <if self.options['debug']: dbg('parsing propositions')>
ERROR: undefined sort while: <while 1:>
ERROR: undefined sort if: <if not s: break>
ERROR: undefined sort if: <if self.options['debug']:>
ERROR: undefined sort def: <def predsumm(self,f):>
ERROR: undefined sort if: <if type(f[1])==type([]): return f[0]+'+'+f[1][0]>
ERROR: undefined sort if: <if type(f)==type(''): return f>
ERROR: undefined sort if: <if type(f)==type([]):>
ERROR: undefined sort return: <return f[0]>
ERROR: undefined sort return: <return '???'>
ERROR: undefined sort def: <def solveRun(self,unsatisfied):>
ERROR: undefined sort if: <if self.options['solver']=='relsat':>
ERROR: undefined sort if: <if not executableExists('solvers/relsat'):>
ERROR: undefined sort return: <return (0,'')>
ERROR: undefined sort elif: <elif self.options['solver']=='walksat':>
ERROR: undefined sort if: <if not executableExists('solvers/walksat'):>
ERROR: undefined sort return: <return (0,'')>
ERROR: undefined sort if: <if unsatisfied>0:>
ERROR: undefined sort elif: <elif self.options['solver']=='minisat':>
ERROR: undefined sort if: <if not executableExists('solvers/minisat_static'):>
ERROR: undefined sort return: <return (0,'')>
ERROR: undefined sort elif: <elif self.options['solver']=='maxwalksat':>
ERROR: undefined sort elif: <elif self.options['solver']=='wmaxsat':>
ERROR: undefined sort return: <return (0,'')>
ERROR: undefined sort if: <if self.options['solver']!='relsat' and self.options['debug']:>
ERROR: undefined sort if: <if len(s)>25000: s='(big)'>
ERROR: undefined sort return: <return (satSeconds,open(self.solverOutputFilename,'r').read())>
ERROR: undefined sort def: <def modelsPrint(self,unsatisfied,models):>
ERROR: undefined sort if: <if len(models)>0:>
ERROR: undefined sort for: <for (positive,negative) in models:>
ERROR: undefined sort if: <if len(negative)==0:>
ERROR: undefined sort if: <if unsatisfied==0:>
ERROR: undefined sort if: <if unsatisfied==0:>
ERROR: undefined sort if: <if prev!=None and self.options['modeldiff']:>
ERROR: undefined sort def: <def solveParse(self,s):>
ERROR: undefined sort if: <if self.options['solver'] in ['relsat','maxwalksat','wmaxsat']:>
ERROR: undefined sort return: <return self.solveParseRelsat(s)>
ERROR: undefined sort elif: <elif self.options['solver']=='walksat':>
ERROR: undefined sort return: <return self.solveParseWalksat(s)>
ERROR: undefined sort elif: <elif self.options['solver']=='minisat':>
ERROR: undefined sort return: <return self.solveParseMinisat(s)>
ERROR: undefined sort return: <return []>
ERROR: undefined sort def: <def solveParseRelsat(self,s):>
ERROR: undefined sort for: <for s1 in string.split(s,'\n'):>
ERROR: undefined sort if: <if headIs(s1,'c '): continue>
ERROR: undefined sort if: <if i==-1: continue>
ERROR: undefined sort if: <if i==-1: continue>
ERROR: undefined sort for: <for e in string.split(s1[i+1:]):>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def solveParseWalksat(self,s):>
ERROR: undefined sort for: <for e in string.split(s):>
ERROR: undefined sort if: <if i>0: positive.append(i)>
ERROR: undefined sort if: <if len(positive)>0 or len(negative)>0:>
ERROR: undefined sort return: <return [(positive,negative)]>
ERROR: undefined sort return: <return []>
ERROR: undefined sort def: <def solveParseMinisat(self,s):>
ERROR: undefined sort for: <for e in string.split(s):>
ERROR: undefined sort if: <if e=='UNSAT': return []>
ERROR: undefined sort if: <if e=='SAT': continue>
ERROR: undefined sort if: <if i>0: positive.append(i)>
ERROR: undefined sort if: <if len(positive)>0 or len(negative)>0:>
ERROR: undefined sort return: <return [(positive,negative)]>
ERROR: undefined sort return: <return []>
ERROR: undefined sort def: <def effectAxiomTransformer(self,f):>
ERROR: undefined sort if: <if typ([])!=typ(f): return None>
ERROR: undefined sort if: <if f[0]=='Initiates':>
ERROR: undefined sort return: <return ['$Implies',>
ERROR: undefined sort if: <if f[0]=='Terminates':>
ERROR: undefined sort return: <return ['$Implies',>
ERROR: undefined sort if: <if f[0]=='Releases':>
ERROR: undefined sort return: <return ['$Implies',>
ERROR: undefined sort return: <return None>
ERROR: undefined sort def: <def modelToString(self,positive,negative):>
ERROR: undefined sort for: <for tInt in range(self.mintime(),self.maxtime()+1):>
ERROR: undefined sort if: <if self.options['timediff']:>
ERROR: undefined sort if: <if prevFormulasP==None:>
ERROR: undefined sort if: <if self.options['debug']:>
ERROR: undefined sort if: <if s: r.append(s)>
ERROR: undefined sort if: <if s: r.append(s)>
ERROR: undefined sort if: <if s: r.append(s)>
ERROR: undefined sort if: <if s: r.append(s)>
ERROR: undefined sort if: <if s: r.append(s)>
ERROR: undefined sort if: <if s: r.append(s)>
ERROR: undefined sort if: <if s: r.append(s)>
ERROR: undefined sort if: <if s: r.append(s)>
ERROR: undefined sort if: <if self.options['showpred']:>
ERROR: undefined sort for: <for f in allFormulasP:>
ERROR: undefined sort if: <if f not in doneP:>
ERROR: undefined sort if: <if '$' in f[0]: continue>
ERROR: undefined sort if: <if s: t.append(s)>
ERROR: undefined sort for: <for e in t: r.append(e)>
ERROR: undefined sort for: <for f in allFormulasN:>
ERROR: undefined sort if: <if f not in doneN:>
ERROR: undefined sort if: <if '$' in f[0]: continue>
ERROR: undefined sort if: <if s: t.append('!'+s)>
ERROR: undefined sort for: <for e in t: r.append(e)>
ERROR: undefined sort return: <return string.join(r,'\n')>
ERROR: undefined sort def: <def finalstateString(self,positive,negative):>
ERROR: undefined sort if: <if len(negative)==0:>
ERROR: undefined sort for: <for predicate in ['HoldsAt','ReleasedAt']:>
ERROR: undefined sort return: <return string.join(filter(None,r),'\n')>
ERROR: undefined sort def: <def reconstituteNegative(self,positive):>
ERROR: undefined sort for: <for i in range(1,len(self.propositions)+1):>
ERROR: undefined sort if: <if i not in positive: negative.append(i)>
ERROR: undefined sort return: <return negative>
ERROR: undefined sort def: <def nearMissToString(self,positive,negative):>
ERROR: undefined sort return: <return (self.modelToString(positive,negative)+'\n'+>
ERROR: undefined sort def: <def modelToUnsatisfiedString(self,positiveS,negativeS):>
ERROR: undefined sort while: <while 1:>
ERROR: undefined sort if: <if not s: break>
ERROR: undefined sort if: <if not self.clauseEval(positiveC,negativeC,positiveS,negativeS):>
ERROR: undefined sort return: <return str(len(r))+' unsatisfied clauses:\n'+string.join(r,'\n')>
ERROR: undefined sort def: <def clauseEval(self,positiveC,negativeC,positiveS,negativeS):>
ERROR: undefined sort for: <for e in positiveC:>
ERROR: undefined sort if: <if e in positiveS: return 1>
ERROR: undefined sort for: <for e in negativeC:>
ERROR: undefined sort if: <if e in negativeS: return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def propositionToFormula(self,proposition):>
ERROR: undefined sort return: <return self.propositions[proposition-1]>
ERROR: undefined sort def: <def propositionsToFormulas(self,propositions):>
ERROR: undefined sort for: <for e in propositions:>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def finalstatePropositionsToString(self,predicate,propositions,t,isNegative):>
ERROR: undefined sort for: <for e in propositions:>
ERROR: undefined sort if: <if (t==None or f[-1]==t) and self.predicateMatch(f[0],predicate):>
ERROR: undefined sort for: <for f in formulas:>
ERROR: undefined sort if: <if isNegative: r.append(pr(['$Not',f]))>
ERROR: undefined sort return: <return string.join(filter(None,r),'\n')>
ERROR: undefined sort def: <def predicateMatch(self,predicate,pattern):>
ERROR: undefined sort if: <if typ([])==typ(pattern) and pattern[0]=='NOT':>
ERROR: undefined sort return: <return predicate not in pattern[1:]>
ERROR: undefined sort return: <return predicate==pattern>
ERROR: undefined sort def: <def clauseToString(self,i,positive,negative):>
ERROR: undefined sort for: <for e in positive:>
ERROR: undefined sort for: <for e in negative:>
ERROR: undefined sort if: <if self.options['debug']:>
ERROR: undefined sort return: <return str(i)+'. '+t>
ERROR: undefined sort return: <return t>
ERROR: undefined sort def: <def sortConstants(self,sorts):>
ERROR: undefined sort for: <for sort in sorts:>
ERROR: undefined sort if: <if len(constants)==0:>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def system(self,cmd):>
ERROR: undefined sort if: <if self.options['debug']: dbg('$ '+cmd)>
ERROR: undefined sort if: <if self.options['debug']: dbg(str(tim))>
ERROR: undefined sort if: <if r and not headIs(cmd,'solvers/minisat_static'):>
ERROR: undefined sort return: <return (tim.secondsGet(),r)>
ERROR: undefined sort def: <def mintime(self):>
ERROR: undefined sort return: <return self.sortGet('time').minint>
ERROR: undefined sort def: <def maxtime(self):>
ERROR: undefined sort return: <return self.sortGet('time').maxint>
ERROR: undefined sort def: <def __repr__(self):>
ERROR: undefined sort return: <return '<decreasoner>'>
ERROR: undefined sort class: <class Sort:>
ERROR: undefined sort def: <def __init__(self,name,reified):>
ERROR: undefined sort def: <def subsort(self,sort):>
ERROR: undefined sort if: <if self==sort: return 1>
ERROR: undefined sort for: <for parent in self.parents:>
ERROR: undefined sort if: <if parent.subsort(sort): return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def parentAdd(self,sort,line):>
ERROR: undefined sort if: <if sort not in self.parents:>
ERROR: undefined sort if: <if self not in sort.children:>
ERROR: undefined sort def: <def constantAdd(self,constant,line):>
ERROR: undefined sort if: <if constant not in self.constantsGet():>
ERROR: undefined sort def: <def nonReifiedConstantsGet(self):>
ERROR: undefined sort for: <for child in self.children:>
ERROR: undefined sort for: <for constant in child.nonReifiedConstantsGet():>
ERROR: undefined sort for: <for constant in self.constants:>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def constantsGet(self):>
ERROR: undefined sort for: <for child in self.children:>
ERROR: undefined sort for: <for constant in child.constantsGet():>
ERROR: undefined sort for: <for constant in self.constantsGet1():>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def constantsGet1(self):>
ERROR: undefined sort if: <if self.reified:>
ERROR: undefined sort if: <if LOADING:>
ERROR: undefined sort return: <return self.constantsGet2()>
ERROR: undefined sort if: <if not self.rconstants:>
ERROR: undefined sort return: <return self.rconstants>
ERROR: undefined sort return: <return self.constants>
ERROR: undefined sort def: <def constantsGet2(self):>
ERROR: undefined sort for: <for e1 in self.constants:>
ERROR: undefined sort if: <if len(e1.argSorts)==0:>
ERROR: undefined sort for: <for e2 in crossProduct(map(lambda x:x.constantsGet(),e1.argSorts)):>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def minMaxIntUpdate(self,minint,maxint):>
ERROR: undefined sort if: <if minint<self.minint: self.minint=minint>
ERROR: undefined sort if: <if maxint>self.maxint: self.maxint=maxint>
ERROR: undefined sort def: <def __repr__(self):>
ERROR: undefined sort return: <return '<Sort '+self.name+'>'>
ERROR: undefined sort class: <class Constant:>
ERROR: undefined sort def: <def __init__(self,name):>
ERROR: undefined sort def: <def valueSet(self,arguments,value):>
ERROR: undefined sort if: <if self.valueD==None: self.valueD={}>
ERROR: undefined sort def: <def valueGet(self,arguments):>
ERROR: undefined sort if: <if self.valueD==None: return None>
ERROR: undefined sort if: <if self.valueD.has_key(key):>
ERROR: undefined sort return: <return self.valueD[key]>
ERROR: undefined sort return: <return None>
ERROR: undefined sort def: <def constantSubsort(self,sort0):>
ERROR: undefined sort for: <for sort1 in self.sorts:>
ERROR: undefined sort if: <if sort1.subsort(sort0): return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def sortAdd(self,sort,line):>
ERROR: undefined sort if: <if sort not in self.sorts:>
ERROR: undefined sort def: <def argSortsSet(self,argSorts):>
ERROR: undefined sort def: <def resultSortSet(self,resultSort):>
ERROR: undefined sort def: <def __repr__(self):>
ERROR: undefined sort return: <return ('<Constant '+self.name+': '+>
ERROR: undefined sort def: <def freevarNames(formula):>
ERROR: undefined sort return: <return map(varName,freevars(formula))>
ERROR: undefined sort def: <def freevars(formula):>
ERROR: undefined sort return: <return freevars1(formula,[])>
ERROR: undefined sort def: <def freevars1(formula,bound):>
ERROR: undefined sort if: <if typ(formula)!=typ([]): return []>
ERROR: undefined sort if: <if formula[0] in ['$Weight','$Label']: return freevars1(formula[2],bound)>
ERROR: undefined sort if: <if isQuantification(formula):>
ERROR: undefined sort return: <return freevars1(formula[2],bound+varListToVars(formula[1]))>
ERROR: undefined sort for: <for e in formula:>
ERROR: undefined sort if: <if isVar(e):>
ERROR: undefined sort if: <if name not in map(varName,bound):>
ERROR: undefined sort if: <if name not in map(varName,r):>
ERROR: undefined sort for: <for f in freevars1(e,bound):>
ERROR: undefined sort if: <if name not in map(varName,r):>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def makeforall(varnames,x):>
ERROR: undefined sort if: <if len(varnames)==0: return x>
ERROR: undefined sort return: <return ['$ForAll',['$List']+varnames,x]>
ERROR: undefined sort def: <def typ(x):>
ERROR: undefined sort if: <if type(x)==type(()): return type([])>
ERROR: undefined sort return: <return type(x)>
ERROR: undefined sort def: <def isConst(x):>
ERROR: undefined sort return: <return typ(x)==typ('') and len(x)>0 and x[0]!='$' and not isVar(x)>
ERROR: undefined sort def: <def allIsConst(x):>
ERROR: undefined sort for: <for e in x:>
ERROR: undefined sort if: <if not isConst(e): return 0>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort def: <def isVar(x):>
ERROR: undefined sort if: <if typ(x)==typ(''):>
ERROR: undefined sort return: <return (len(x)>0) and (x[0] in string.lowercase) and ('#' not in x)>
ERROR: undefined sort elif: <elif typ(x)==typ([]):>
ERROR: undefined sort return: <return len(x)==3 and x[0]=='$SortedVar' and isVar(x[1]) and isSort(x[2])>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def varCreate(name,sort):>
ERROR: undefined sort if: <if sort:>
ERROR: undefined sort return: <return ['$SortedVar',name,sort]>
ERROR: undefined sort return: <return name>
ERROR: undefined sort def: <def varName(x):>
ERROR: undefined sort if: <if typ(x)==typ(''): return x>
ERROR: undefined sort elif: <elif typ(x)==typ([]) and len(x)==3 and x[0]=='$SortedVar': return x[1]>
ERROR: undefined sort def: <def varSort(x):>
ERROR: undefined sort if: <if typ(x)==typ([]) and len(x)==3 and x[0]=='$SortedVar': return x[2]>
ERROR: undefined sort return: <return ''>
ERROR: undefined sort def: <def varListToVars(x):>
ERROR: undefined sort if: <if typ(x)==typ([]) and len(x)>0 and x[0]=='$List':>
ERROR: undefined sort return: <return x[1:]>
ERROR: undefined sort return: <return []>
ERROR: undefined sort def: <def varListToSortDict(x):>
ERROR: undefined sort if: <if typ(x)==typ([]) and len(x)>0 and x[0]=='$List':>
ERROR: undefined sort for: <for t in x[1:]:>
ERROR: undefined sort if: <if typ(t)==typ([]) and len(t)==3 and t[0]=='$SortedVar':>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def isSort(x):>
ERROR: undefined sort if: <if typ(x)!=typ(''): return 0>
ERROR: undefined sort if: <if len(x)==0: return 0>
ERROR: undefined sort for: <for c in x:>
ERROR: undefined sort if: <if c not in string.lowercase: return 0>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort def: <def isQuantification(f):>
ERROR: undefined sort return: <return typ(f)==typ([]) and len(f)==3 and f[0] in QUANTIFIERS>
ERROR: undefined sort def: <def predicates(f):>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def predicates1(f,r):>
ERROR: undefined sort if: <if typ([])==typ(f):>
ERROR: undefined sort if: <if f[0] in CONNECTIVES+COMPARATIVES+FUNCTIONS:>
ERROR: undefined sort for: <for e in f[1:]: predicates1(e,r)>
ERROR: undefined sort elif: <elif isQuantification(f):>
ERROR: undefined sort if: <if f[0] not in r: r.append(f[0])>
ERROR: undefined sort for: <for e in f[1:]: predicates1(e,r)>
ERROR: undefined sort def: <def t_newline(t):>
ERROR: undefined sort def: <def t_error(t):>
ERROR: undefined sort import: <import lex>
ERROR: undefined sort def: <def p_topformulas1(p):>
ERROR: undefined sort def: <def p_topformulas2(p):>
ERROR: undefined sort def: <def p_topformula1(p):>
ERROR: undefined sort def: <def p_topformula2(p):>
ERROR: undefined sort def: <def p_topformula3(p):>
ERROR: undefined sort def: <def p_formula1(p):>
ERROR: undefined sort def: <def p_formula2(p):>
ERROR: undefined sort def: <def p_formula3(p):>
ERROR: undefined sort def: <def p_formula4(p):>
ERROR: undefined sort def: <def p_formula5(p):>
ERROR: undefined sort def: <def p_formula6(p):>
ERROR: undefined sort def: <def p_formula7(p):>
ERROR: undefined sort def: <def p_formula8(p):>
ERROR: undefined sort def: <def p_formula9(p):>
ERROR: undefined sort def: <def p_formula10(p):>
ERROR: undefined sort def: <def p_formula11(p):>
ERROR: undefined sort def: <def p_formula12(p):>
ERROR: undefined sort def: <def p_formula13(p):>
ERROR: undefined sort def: <def p_formula14(p):>
ERROR: undefined sort def: <def p_formula15(p):>
ERROR: undefined sort def: <def p_formula16(p):>
ERROR: undefined sort def: <def p_formula17(p):>
ERROR: undefined sort def: <def p_formula18(p):>
ERROR: undefined sort def: <def p_formula19(p):>
ERROR: undefined sort def: <def p_formula20(p):>
ERROR: undefined sort def: <def p_formula21(p):>
ERROR: undefined sort def: <def p_formula22(p):>
ERROR: undefined sort def: <def p_formula23(p):>
ERROR: undefined sort def: <def p_formula24(p):>
ERROR: undefined sort def: <def p_formula25(p):>
ERROR: undefined sort def: <def p_formula26(p):>
ERROR: undefined sort def: <def p_names1(p):>
ERROR: undefined sort def: <def p_names2(p):>
ERROR: undefined sort def: <def p_arguments1(p):>
ERROR: undefined sort def: <def p_arguments2(p):>
ERROR: undefined sort def: <def p_error(p):>
ERROR: undefined sort if: <if p: dbg("ERROR: formula syntax error at '"+p.value+"'")>
ERROR: undefined sort import: <import yacc>
ERROR: undefined sort def: <def parseMany(s):>
ERROR: undefined sort if: <if r==None: return None>
ERROR: undefined sort for: <for e in r: validate(e,['qq'])>
ERROR: undefined sort return: <return map(canon,r)>
ERROR: undefined sort def: <def canon(f):>
ERROR: undefined sort return: <return canon1(f,{})>
ERROR: undefined sort def: <def canon1(f,bd):>
ERROR: undefined sort if: <if typ([])==typ(f):>
ERROR: undefined sort if: <if isQuantification(f):>
ERROR: undefined sort return: <return [f[0],>
ERROR: undefined sort for: <for e in f:>
ERROR: undefined sort return: <return r>
ERROR: undefined sort elif: <elif bd.has_key(f):>
ERROR: undefined sort return: <return varCreate(f,bd[f])>
ERROR: undefined sort return: <return f>
ERROR: undefined sort def: <def validate(f,freeOK):>
ERROR: undefined sort if: <if len(fv)>0:>
ERROR: undefined sort return: <return r1 and r2>
ERROR: undefined sort def: <def validate1(f):>
ERROR: undefined sort if: <if typ([])==typ(f):>
ERROR: undefined sort if: <if f[0] in ['$Weight','$Label']:>
ERROR: undefined sort return: <return validate1(f[2])>
ERROR: undefined sort if: <if f[0] in CONNECTIVES:>
ERROR: undefined sort for: <for e in f[1:]:>
ERROR: undefined sort if: <if not validate1(e): return 0>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort elif: <elif f[0] in QUANTIFIERS:>
ERROR: undefined sort for: <for var in f[1][1:]:>
ERROR: undefined sort if: <if not deepIn(var, f[2]):>
ERROR: undefined sort return: <return varListValidate(f[1]) and validate1(f[2])>
ERROR: undefined sort if: <if atomValidate(f): return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def atomValidate(a):>
ERROR: undefined sort if: <if typ([])==typ(a):>
ERROR: undefined sort if: <if a[0] in COMPARATIVES:>
ERROR: undefined sort for: <for e in a[1:]:>
ERROR: undefined sort if: <if not termValidate(e): return 0>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort elif: <elif a[0]=='HoldsAt': # special treatment>
ERROR: undefined sort if: <if len(a)!=3: return 0>
ERROR: undefined sort if: <if not atomValidate(a[1]): return 0>
ERROR: undefined sort if: <if not termValidate(a[2]): return 0>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort elif: <elif a[0]=='Trajectory': # special treatment>
ERROR: undefined sort if: <if len(a)!=5: return 0>
ERROR: undefined sort if: <if not atomValidate(a[1]): return 0>
ERROR: undefined sort if: <if not termValidate(a[2]): return 0>
ERROR: undefined sort if: <if not atomValidate(a[3]): return 0>
ERROR: undefined sort if: <if not termValidate(a[4]): return 0>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort elif: <elif a[0][0]!='$':>
ERROR: undefined sort for: <for e in a[1:]:>
ERROR: undefined sort if: <if not termValidate(e): return 0>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort elif: <elif typ('')==typ(a):>
ERROR: undefined sort if: <if a[0]!='$': return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def termValidate(t):>
ERROR: undefined sort if: <if isVar(t):>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort elif: <elif isConst(t):>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort elif: <elif typ([])==typ(t):>
ERROR: undefined sort if: <if t[0] in FUNCTIONS:>
ERROR: undefined sort for: <for e in t[1:]:>
ERROR: undefined sort if: <if not termValidate(e): return 0>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort elif: <elif t[0][0]!='$':>
ERROR: undefined sort for: <for e in t[1:]:>
ERROR: undefined sort if: <if not termValidate(e): return 0>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def varListValidate(x):>
ERROR: undefined sort if: <if typ([])==typ(x):>
ERROR: undefined sort if: <if x[0]=='$List':>
ERROR: undefined sort for: <for e in x[1:]:>
ERROR: undefined sort if: <if not isVar(e):>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def anyC(x):>
ERROR: undefined sort for: <for e in x:>
ERROR: undefined sort if: <if isC(e): return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def isC(e):>
ERROR: undefined sort return: <return typ([])==typ(e) and C.has_key(e[0])>
ERROR: undefined sort def: <def pr(f):>
ERROR: undefined sort return: <return formulaToString(f,0,0)+'.'>
ERROR: undefined sort def: <def formulaToString(f,indent,pp):>
ERROR: undefined sort if: <if typ('')==typ(f):>
ERROR: undefined sort return: <return f>
ERROR: undefined sort elif: <elif typ(1)==typ(f):>
ERROR: undefined sort return: <return str(f)>
ERROR: undefined sort elif: <elif typ(1.0)==typ(f):>
ERROR: undefined sort return: <return str(f)>
ERROR: undefined sort elif: <elif isVar(f):>
ERROR: undefined sort return: <return varName(f)>
ERROR: undefined sort elif: <elif typ([])==typ(f):>
ERROR: undefined sort if: <if pp and depth(f)<2: return formulaToString(f,indent,0)>
ERROR: undefined sort if: <if f[0] in ['$Weight','$Label']:>
ERROR: undefined sort return: <return f[1]+': '+formulaToString(f[2],indent,pp)>
ERROR: undefined sort if: <if typ('')==typ(f[0]) and C.has_key(f[0]):>
ERROR: undefined sort if: <if arity==1: return c+formulaToString(f[1],indent,pp)>
ERROR: undefined sort if: <if f[0] not in ['$Implies','$Equiv'] and anyC(f[1:]):>
ERROR: undefined sort if: <if pp and f[0] not in COMPARATIVES:>
ERROR: undefined sort for: <for e in f[1:]:>
ERROR: undefined sort if: <if t[0]!='\n':>
ERROR: undefined sort if: <if i==0:>
ERROR: undefined sort if: <if i!=len(f[1:])-1:>
ERROR: undefined sort return: <return r+right>
ERROR: undefined sort for: <for e in f[1:]:>
ERROR: undefined sort if: <if i!=0:>
ERROR: undefined sort return: <return r+right>
ERROR: undefined sort if: <if typ('')==typ(f[0]) and Q.has_key(f[0]):>
ERROR: undefined sort return: <return l+varListToString(f[1])+r+' '+formulaToString(f[2],indent,pp)>
ERROR: undefined sort for: <for e in f[1:]:>
ERROR: undefined sort if: <if i!=0:>
ERROR: undefined sort if: <if isVar(f[0]):>
ERROR: undefined sort return: <return varName(f[0])+'('+r+')'>
ERROR: undefined sort return: <return f[0]+'('+r+')'>
ERROR: undefined sort elif: <elif f==None:>
ERROR: undefined sort return: <return 'None'>
ERROR: undefined sort return: <return '??'>
ERROR: undefined sort def: <def varListToString(x):>
ERROR: undefined sort if: <if typ(x)==typ([]) and len(x)>0 and x[0]=='$List':>
ERROR: undefined sort return: <return string.join(map(varToString,x[1:]),', ')>
ERROR: undefined sort return: <return '??'>
ERROR: undefined sort def: <def varToString(x):>
ERROR: undefined sort if: <if sort:>
ERROR: undefined sort return: <return name+':'+sort>
ERROR: undefined sort return: <return name>
ERROR: undefined sort def: <def ind(n):>
ERROR: undefined sort return: <return ' '*n>
ERROR: undefined sort def: <def executableExists(fn):>
ERROR: undefined sort return: <return exists(fn) or exists(fn+'.exe')>
ERROR: undefined sort def: <def exists(fn):>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def tmpfile(s):>
ERROR: undefined sort global: <global FILENUM>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def diff(s1,s2):>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def fileWrite(fn,s):>
ERROR: undefined sort return: <return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def linecount(fn):>
ERROR: undefined sort for: <for c in open(fn).read():>
ERROR: undefined sort if: <if c=='\n': n=n+1>
ERROR: undefined sort return: <return n>
ERROR: undefined sort def: <def stringFind(s,ptn):>
ERROR: undefined sort if: <if i==-1: return (None,None,None)>
ERROR: undefined sort return: <return (s[:i],s[i:],s[i+len(ptn):])>
ERROR: undefined sort def: <def commentElim(line,c):>
ERROR: undefined sort if: <if i!=-1: line=line[:i]>
ERROR: undefined sort return: <return string.strip(line)>
ERROR: undefined sort def: <def headIs(s,hd):>
ERROR: undefined sort return: <return s[:len(hd)]==hd>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def commaListParse(x):>
ERROR: undefined sort return: <return string.split(string.replace(x,' ',''),',')>
ERROR: undefined sort def: <def elimHead(s,hd):>
ERROR: undefined sort if: <if type('')!=type(s): return s>
ERROR: undefined sort if: <if s[:len(hd)]==hd:>
ERROR: undefined sort return: <return s[len(hd):]>
ERROR: undefined sort return: <return s>
ERROR: undefined sort def: <def grep(ptn,s):>
ERROR: undefined sort for: <for line in string.split(s,'\n'):>
ERROR: undefined sort if: <if -1!=string.find(line,ptn):>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def plural(x):>
ERROR: undefined sort if: <if x==1: return ''>
ERROR: undefined sort return: <return 's'>
ERROR: undefined sort def: <def tbl(spec,rows):>
ERROR: undefined sort for: <for (head,length,just) in spec:>
ERROR: undefined sort for: <for (head,length,just) in spec:>
ERROR: undefined sort for: <for row in rows:>
ERROR: undefined sort while: <while i<len(row):>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def ljust(s,l):>
ERROR: undefined sort if: <if len(s)>l: return s>
ERROR: undefined sort return: <return (s+(' '*l))[0:l]>
ERROR: undefined sort def: <def rjust(s,l):>
ERROR: undefined sort if: <if len(s)>l: return s>
ERROR: undefined sort return: <return ((' '*l)+s)[-l:]>
ERROR: undefined sort def: <def xjust(s,len,j):>
ERROR: undefined sort if: <if j=='l': return ljust(s,len)>
ERROR: undefined sort elif: <elif j=='r': return rjust(s,len)>
ERROR: undefined sort def: <def anyIn(x,y):>
ERROR: undefined sort for: <for e in x:>
ERROR: undefined sort if: <if e in y: return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def deepIn(e,x):>
ERROR: undefined sort if: <if type([])!=type(x) and type(())!=type(x): return 0>
ERROR: undefined sort for: <for e1 in x:>
ERROR: undefined sort if: <if e==e1: return 1>
ERROR: undefined sort if: <if deepIn(e,e1): return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def deepInAny(ex,x):>
ERROR: undefined sort for: <for e in ex:>
ERROR: undefined sort if: <if deepIn(e,x): return 1>
ERROR: undefined sort return: <return 0>
ERROR: undefined sort def: <def depth(x):>
ERROR: undefined sort if: <if type([])!=type(x): return 0>
ERROR: undefined sort for: <for e in x:>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def listMinus(x0,x1):>
ERROR: undefined sort for: <for e in x0:>
ERROR: undefined sort if: <if e not in x1: r.append(e)>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def crossProduct(x):>
ERROR: undefined sort if: <if 0==len(x): return [[]]>
ERROR: undefined sort for: <for e in x[0]:>
ERROR: undefined sort for: <for f in y:>
ERROR: undefined sort for: <for f1 in f: r1.append(f1)>
ERROR: undefined sort return: <return r>
ERROR: undefined sort class: <class CrossProductIterator:>
ERROR: undefined sort def: <def __init__(self, x, name):>
ERROR: undefined sort def: <def nextElement(self):>
ERROR: undefined sort while: <while 1:>
ERROR: undefined sort if: <if i==self.len:>
ERROR: undefined sort if: <if self.indices[i]!=self.lens[i]: break>
ERROR: undefined sort while: <while j>=0:>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def hasMoreElements(self):>
ERROR: undefined sort return: <return self.n>0 and self.indices!=None>
ERROR: undefined sort def: <def assertionParse(s):>
ERROR: undefined sort return: <return assertionParse1(s,0)[0]>
ERROR: undefined sort def: <def assertionParse1(s,i):>
ERROR: undefined sort if: <if i<l and s[i]=='[':>
ERROR: undefined sort while: <while i<l and s[i]!=']':>
ERROR: undefined sort if: <if a==None: break>
ERROR: undefined sort if: <if i<l and s[i]==' ': i=i+1>
ERROR: undefined sort return: <return (elems,i+1)>
ERROR: undefined sort while: <while i<l:>
ERROR: undefined sort if: <if inqt:>
ERROR: undefined sort if: <if s[i]=='"': inqt=0>
ERROR: undefined sort if: <if s[i] in ' []': break>
ERROR: undefined sort if: <if s[i]=='"': inqt=1>
ERROR: undefined sort return: <return (tok,i)>
ERROR: undefined sort def: <def assertionToString(x):>
ERROR: undefined sort if: <if x==None: return ''>
ERROR: undefined sort if: <if type(x)!=type([]) and type(x)!=type(()):>
ERROR: undefined sort return: <return str(x)>
ERROR: undefined sort for: <for e in x:>
ERROR: undefined sort if: <if cnt!=0: r=r+' '>
ERROR: undefined sort return: <return r+']'>
ERROR: undefined sort class: <class Timing:>
ERROR: undefined sort def: <def __init__(self,name):>
ERROR: undefined sort def: <def reset(self):>
ERROR: undefined sort def: <def start(self):>
ERROR: undefined sort def: <def stop(self):>
ERROR: undefined sort def: <def secondsGet(self):>
ERROR: undefined sort if: <if self.trials==0:>
ERROR: undefined sort return: <return 0.0>
ERROR: undefined sort return: <return self.sum/self.trials>
ERROR: undefined sort def: <def __repr__(self):>
ERROR: undefined sort if: <if self.trials==1:>
ERROR: undefined sort return: <return self.name+' took '+r>
ERROR: undefined sort class: <class PercentCompleteReporter:>
ERROR: undefined sort def: <def __init__(self, name, n):>
ERROR: undefined sort def: <def next(self):>
ERROR: undefined sort if: <if (time.time()-self.last)>15:>
ERROR: undefined sort def: <def pc(x):>
ERROR: undefined sort return: <return str(percent(x))+'%'>
ERROR: undefined sort def: <def secFmt(secs):>
ERROR: undefined sort if: <if secs<60:>
ERROR: undefined sort return: <return fmt(secs)+'s'>
ERROR: undefined sort elif: <elif secs<3600:>
ERROR: undefined sort return: <return fmt(secs)+'s/'+fmt(secs/60.0)+'m'>
ERROR: undefined sort return: <return fmt(secs)+'s/'+fmt(secs/60.0)+'m/'+fmt(secs/3600.0)+'h'>
ERROR: undefined sort def: <def fmt(x):>
ERROR: undefined sort return: <return str(0.1*int(0.5+x*10))>
ERROR: undefined sort def: <def dbgInit(fn):>
ERROR: undefined sort global: <global STREAM>
ERROR: undefined sort def: <def dbg(s):>
ERROR: undefined sort global: <global STREAM>
ERROR: undefined sort global: <global DEBUG>
ERROR: undefined sort if: <if DEBUG:>
ERROR: undefined sort def: <def dictIncr(d,key,n):>
ERROR: undefined sort if: <if d.has_key(key):>
ERROR: undefined sort def: <def dictDbg(d,ignore):>
ERROR: undefined sort for: <for key in keys:>
ERROR: undefined sort if: <if key in ignore: continue>
ERROR: undefined sort def: <def dictToList(d):>
ERROR: undefined sort for: <for key in d.keys():>
ERROR: undefined sort return: <return r>
ERROR: undefined sort def: <def dictMerge(d1,d2):>
ERROR: undefined sort for: <for key in d2.keys():>
ERROR: undefined sort return: <return d>
ERROR: undefined sort def: <def intParse(s,default):>
ERROR: undefined sort return: <return int(s)>
ERROR: undefined sort return: <return default>
ERROR: undefined sort def: <def isTrajectoryAxiom(f):>
ERROR: undefined sort return: <return deepIn('Trajectory',f) or deepIn('AntiTrajectory',f)>
ERROR: undefined sort def: <def isEffectAxiom(f):>
ERROR: undefined sort return: <return deepInAny(EFFECT_AXIOM_PREDICATES,f)>
ERROR: undefined sort def: <def transform(f,transformer):>
ERROR: undefined sort if: <if t!=None: return t>
ERROR: undefined sort if: <if typ([])==typ(f):>
ERROR: undefined sort if: <if f[0] in QUANTIFIERS:>
ERROR: undefined sort return: <return [f[0],f[1],transform(f[2],transformer)]>
ERROR: undefined sort for: <for e in f[1:]: r.append(transform(e,transformer))>
ERROR: undefined sort return: <return r>
ERROR: undefined sort return: <return f>
ERROR: undefined sort def: <def nameget(x):>
ERROR: undefined sort if: <if islist(x): return x>
ERROR: undefined sort def: <def islist(x):>
ERROR: undefined sort return: <return typ(x)==typ([])>
ERROR: undefined sort def: <def filenameToName(filename):>
ERROR: undefined sort return: <return filename[i+1:j]>
ERROR: undefined sort def: <def filenameToTextFilename(filename):>
ERROR: undefined sort return: <return filename[:j]+'.txt'>
ERROR: undefined sort def: <def notime(x):>
ERROR: undefined sort return: <return x[:-1]>
ERROR: undefined sort print: <print copyright('')>
ERROR: undefined sort import: <import sys>
ERROR: undefined sort for: <for arg in sys.argv:>
ERROR: illegal character '#'
Traceback (most recent call last):
  File "decreasoner.py", line 2462, in <module>
    run(arg)
  File "decreasoner.py", line 91, in run
    ecreasoner.run(inputfilename,None)
  File "decreasoner.py", line 180, in run
    self.loadDone()
  File "decreasoner.py", line 273, in loadDone
    formulas1=self.parseFormulaLines(lines,filename)
  File "decreasoner.py", line 261, in parseFormulaLines
    formulas1=parseMany(s)
  File "decreasoner.py", line 1821, in parseMany
    r=yacc.parse(s)
  File "yacc.py", line 265, in parse
    return self.parseopt_notrack(input,lexer,debug,tracking,tokenfunc)
  File "yacc.py", line 921, in parseopt_notrack
    lookahead = get_token()     # Get the next token
  File "lex.py", line 384, in token
    newtok = self.lexerrorf(tok)
  File "decreasoner.py", line 1652, in t_error
    t.skip(1)
AttributeError: 'LexToken' object has no attribute 'skip'
