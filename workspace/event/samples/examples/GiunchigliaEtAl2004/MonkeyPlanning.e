
;load examples/GiunchigliaEtAl2004/MonkeyBananas.e
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
; @article{Giunchiglia:2004,
;   author = "Enrico Giunchiglia and Joohyung Lee and Vladimir Lifschitz and Norman C. McCain and Hudson Turner",
;   year = "2004",
;   title = "Nonmonotonic causal theories",
;   journal = "Artificial Intelligence",
;   volume = "153",
;   pages = "49--104",
; }
;
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

sort object
sort location

object Monkey, Bananas, Box
location L1, L2, L3
location location1, location2

event event1, event2

fluent At(object,location)
fluent OnBox()
fluent HasBananas()

event Walk(location)
event PushBox(location)
event ClimbOn()
event ClimbOff()
event GraspBananas()

[object,location1,location2,time]
HoldsAt(At(object,location1),time) &
HoldsAt(At(object,location2),time) ->
location1=location2.

[object,location,time]
object=Monkey ->
Initiates(Walk(location),At(object,location),time).

[object,location1,location2,time]
object=Monkey &
HoldsAt(At(object,location1),time) ->
Terminates(Walk(location2),At(object,location1),time).

[location,time]
Happens(Walk(location),time) ->
!HoldsAt(At(Monkey,location),time) &
!HoldsAt(OnBox(),time).

[location,time]
HoldsAt(HasBananas(),time) &
HoldsAt(At(Monkey,location),time) ->
HoldsAt(At(Bananas,location),time).

[object,location,time]
object=Box | object=Monkey ->
Initiates(PushBox(location),At(object,location),time).

[object,location1,location2,time]
(object=Box | object=Monkey) &
HoldsAt(At(object,location1),time) ->
Terminates(PushBox(location2),At(object,location1),time).

[location,time]
Happens(PushBox(location),time) ->
({location1}
  HoldsAt(At(Box,location1),time) &
  HoldsAt(At(Monkey,location1),time)) &
!HoldsAt(At(Monkey,location),time) &
!HoldsAt(OnBox(),time).

[time] Initiates(ClimbOn(),OnBox(),time).

[time]
Happens(ClimbOn(),time) ->
!HoldsAt(OnBox(),time).

[time] Terminates(ClimbOff(),OnBox(),time).

[time]
Happens(ClimbOff(),time) ->
HoldsAt(OnBox(),time).

[time] Initiates(GraspBananas(),HasBananas(),time).

[object,location,time]
object=Bananas ->
Releases(GraspBananas(),At(object,location),time).

[time]
Happens(GraspBananas(),time) ->
({location1}
  HoldsAt(At(Bananas,location1),time) &
  HoldsAt(At(Monkey,location1),time)) &
HoldsAt(OnBox(),time).

[time]
HoldsAt(OnBox(),time) ->
{location1} HoldsAt(At(Box,location1),time) &
            HoldsAt(At(Monkey,location1),time).

; End of file.

HoldsAt(At(Monkey,L1),0).
HoldsAt(At(Bananas,L2),0).
HoldsAt(At(Box,L3),0).
HoldsAt(HasBananas(),4).

; PLAN Happens(Walk(L3),0).
; PLAN Happens(PushBox(L2),1).
; PLAN Happens(ClimbOn(),2).
; PLAN Happens(GraspBananas(),3).

; one event at a time
[event1,event2,time] Happens(event1,time) & Happens(event2,time) ->
event1=event2.

range time 0 4
range offset 0 0

; End of file.
