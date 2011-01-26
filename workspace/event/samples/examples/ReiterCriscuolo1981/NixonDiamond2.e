;
; Copyright (c) 2005 IBM Corporation and others.
; All rights reserved. This program and the accompanying materials
; are made available under the terms of the Common Public License v1.0
; which accompanies this distribution, and is available at
; http://www.eclipse.org/legal/cpl-v10.html
;
; Contributors:
; IBM - Initial implementation
;
; conflicting defaults: method (D)
; \fullciteA[p. 274]{ReiterCriscuolo:1981}
; \fullciteA[pp. 98--99]{McCarthy:1986}
; \fullciteA[p. 18]{BrewkaDixKonolige:1997}
;
; @inproceedings{ReiterCriscuolo:1981,
;   author = "Raymond Reiter and Giovanni Criscuolo",
;   year = "1981",
;   title = "On interacting defaults",
;   booktitle = "\uppercase{P}roceedings of the \uppercase{S}eventh \uppercase{I}nternational \uppercase{J}oint \uppercase{C}onference on \uppercase{A}rtificial \uppercase{I}ntelligence",
;   volume = "1",
;   pages = "270--276",
;   address = "Los Altos, CA",
;   publisher = "William Kaufmann",
; }
;
; @article{McCarthy:1986,
;   author = "John McCarthy",
;   year = "1986",
;   title = "Applications of circumscription to formalizing common-sense knowledge",
;   journal = "Artificial Intelligence",
;   volume = "28",
;   pages = "89--116".
; }
;
; @book{BrewkaDixKonolige:1997,
;   author = "Gerhard Brewka and J{\"{u}}rgen Dix and Kurt Konolige",
;   year = "1997",
;   title = "Nonmonotonic Reasoning: An Overview",
;   address = "Stanford, CA",
;   publisher = "CSLI",
; }
;

;load foundations/Root.e
;load foundations/EC.e
sort boolean
sort integer
reified sort predicate
reified sort function

sort time: integer
sort offset: integer

reified sort fluent
reified sort event

predicate Happens(event,time)
predicate HoldsAt(fluent,time)
predicate ReleasedAt(fluent,time)
predicate Initiates(event,fluent,time)
predicate Terminates(event,fluent,time)
predicate Releases(event,fluent,time)
predicate Trajectory(fluent,time,fluent,offset)

sort x

predicate Republican(x)
predicate Quaker(x)
predicate Pacifist(x)
predicate Ab1(x)
predicate Ab2(x)

x John

Republican(John).
Quaker(John).

[x] Republican(x) & !Ab1(x) -> !Pacifist(x).
[x] Quaker(x) & !Ab2(x) -> Pacifist(x).
;Theta: [x] Republican(x) -> Ab2(x).

range time 0 0
range offset 1 1

;completion Theta Ab1
;completion Theta Ab2

; End of file.
