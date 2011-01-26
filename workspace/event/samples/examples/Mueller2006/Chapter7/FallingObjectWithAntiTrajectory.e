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
; @book{Mueller:2006,
;   author = "Erik T. Mueller",
;   year = "2006",
;   title = "Commonsense Reasoning",
;   address = "San Francisco",
;   publisher = "Morgan Kaufmann/Elsevier",
; }
;

;option encoding 3
;option trajectory on
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

predicate Clipped(time,fluent,time)
predicate Declipped(time,fluent,time)

predicate Trajectory(fluent,time,fluent,offset)
predicate AntiTrajectory(fluent,time,fluent,offset)

fluent fluent2
[event,fluent,fluent2,offset,time]
Happens(event,time) &
Initiates(event,fluent,time) &
0 < offset &
Trajectory(fluent,time,fluent2,offset) &
!Clipped(time,fluent,time+offset) ->
HoldsAt(fluent2,time+offset).

[event,fluent,fluent2,offset,time]
Happens(event,time) &
Terminates(event,fluent,time) &
0 < offset &
AntiTrajectory(fluent,time,fluent2,offset) &
!Declipped(time,fluent,time+offset) ->
HoldsAt(fluent2,time+offset).
sort object
sort agent
sort height: integer

agent Nathan
object Apple

fluent Falling(object)
fluent Height(object,height)
noninertial Height

event Drop(agent,object)
event HitGround(object)

; Sigma

[agent,object,time]
Initiates(Drop(agent,object),Falling(object),time).

[object,time]
Terminates(HitGround(object),Falling(object),time).

height height1, height2
; Delta
;
;Delta: [object,time]
;HoldsAt(Falling(object),time) &
;HoldsAt(Height(object,0),time) ->
;Happens(HitGround(object),time).
;
;Delta: Happens(Drop(Nathan,Apple),0).

; Psi

[object,height1,height2,time]
HoldsAt(Height(object,height1),time) &
HoldsAt(Height(object,height2),time) ->
height1=height2.

; Pi

[object,height1,height2,offset,time]
HoldsAt(Height(object,height1),time) &
height2 = (height1 - offset) ->
Trajectory(Falling(object),time,Height(object,height2),offset).

[object,height,offset,time]
HoldsAt(Height(object,height),time) ->
AntiTrajectory(Falling(object),time,Height(object,height),offset).

; Gamma

!HoldsAt(Falling(Apple),0).
HoldsAt(Height(Apple,3),0).

;completion Delta Happens

range time 0 5
range height 0 3
range offset 1 3

; End of file.
