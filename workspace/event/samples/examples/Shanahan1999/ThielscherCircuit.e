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
; @article{Thielscher:1997,
;   author = "Michael Thielscher",
;   year = "1997",
;   title = "Ramification and causality",
;   journal = "Artificial Intelligence",
;   volume = "89",
;   pages = "317--364",
; }
;
; @incollection{Shanahan:1999,
;   author = "Shanahan, Murray",
;   year = "1999",
;   title = "The Event Calculus explained",
;   editor = "Michael J. Wooldridge and Manuela M. Veloso",
;   booktitle = "Artificial Intelligence Today: Recent Trends and Developments",
;   series = "Lecture Notes in Computer Science",
;   volume = "1600",
;   pages = "409--430",
;   address = "Berlin",
;   publisher = "Springer",
; }
;
; deduction
;
; modifications from Shanahan's formulation:
; timestamps
;

;load foundations/Root.e
;load foundations/EC.e
;load foundations/ECCausal.e
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

predicate Started(fluent,time)
predicate Stopped(fluent,time)

[fluent,time]
Started(fluent,time) <->
(HoldsAt(fluent,time) |
 ({event} Happens(event,time) & Initiates(event,fluent,time))).

[fluent,time]
Stopped(fluent,time) <->
(!HoldsAt(fluent,time) |
 ({event} Happens(event,time) & Terminates(event,fluent,time))).

predicate Initiated(fluent,time)
predicate Terminated(fluent,time)

[fluent,time]
Initiated(fluent,time) <->
(Started(fluent,time) &
 !({event} Happens(event,time) & Terminates(event,fluent,time))).

[fluent,time]
Terminated(fluent,time) <->
(Stopped(fluent,time) &
 !({event} Happens(event,time) & Initiates(event,fluent,time))).

event LightOn()
event Close1()
event Open2()
event CloseRelay()

fluent Light()
fluent Switch1()
fluent Switch2()
fluent Switch3()
fluent Relay()

[time]
Stopped(Light(),time) &
Initiated(Switch1(),time) &
Initiated(Switch2(),time) ->
Happens(LightOn(),time).

[time]
Started(Switch2(),time) &
Initiated(Relay(),time) ->
Happens(Open2(),time).

[time]
Stopped(Relay(),time) &
Initiated(Switch1(),time) &
Initiated(Switch3(),time) ->
Happens(CloseRelay(),time).

[time] Initiates(LightOn(),Light(),time).

[time] Terminates(Open2(),Switch2(),time).

[time] Initiates(CloseRelay(),Relay(),time).

[time] Initiates(Close1(),Switch1(),time).

!HoldsAt(Switch1(),0).
HoldsAt(Switch2(),0).
HoldsAt(Switch3(),0).
!HoldsAt(Relay(),0).
!HoldsAt(Light(),0).

Happens(Close1(),0).

completion Happens

range time 0 1
range offset 1 1

; End of file.
