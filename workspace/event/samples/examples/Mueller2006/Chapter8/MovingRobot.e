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
; @inproceedings{Shanahan:1996,
;   author = "Murray Shanahan",
;   year = "1996",
;   title = "Robotics and the common sense informatic situation",
;   editor = "Wolfgang Wahlster",
;   booktitle = "\uppercase{P}roceedings of the \uppercase{T}welfth \uppercase{E}uropean \uppercase{C}onference on \uppercase{A}rtificial \uppercase{I}ntelligence",
;   pages = "684--688",
;   address = "Chichester, UK",
;   publisher = "John Wiley",
; }
;
; @book{Mueller:2006,
;   author = "Erik T. Mueller",
;   year = "2006",
;   title = "Commonsense Reasoning",
;   address = "San Francisco",
;   publisher = "Morgan Kaufmann/Elsevier",
; }
;

;option renaming off
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

sort coord: integer

sort direction: integer
; 0 -> 0, 1 -> 90, 2 -> 180, 3 -> 370

sort robot

robot Robot1

function Sin(direction): coord
function Cos(direction): coord

Sin(0)=0.
Sin(1)=1.
Sin(2)=2.
Sin(3)=3.

Cos(0)=1.
Cos(1)=2.
Cos(2)=3.
Cos(3)=4.

fluent Direction(robot,direction)
fluent Location(robot,coord,coord)

event MoveLeftWheel(robot)
event MoveRightWheel(robot)

; Sigma
direction direction1, direction2
[robot,direction1,direction2,time]
!Happens(MoveRightWheel(robot),time) &
HoldsAt(Direction(robot,direction1),time) &
direction2 = (direction1-1)->
Initiates(MoveLeftWheel(robot),Direction(robot,direction2),time).

[robot,direction,time]
!Happens(MoveRightWheel(robot),time) &
HoldsAt(Direction(robot,direction),time) ->
Terminates(MoveLeftWheel(robot),Direction(robot,direction),time).

[robot,direction1,direction2,time]
!Happens(MoveLeftWheel(robot),time) &
HoldsAt(Direction(robot,direction1),time) &
direction2 = (direction1+1)->
Initiates(MoveRightWheel(robot),Direction(robot,direction2),time).

[robot,direction,time]
!Happens(MoveLeftWheel(robot),time) &
HoldsAt(Direction(robot,direction),time) ->
Terminates(MoveRightWheel(robot),Direction(robot,direction),time).

coord coord1, coord2, coord3, coord4
[robot,direction,coord1,coord2,coord3,coord4,time]
Happens(MoveLeftWheel(robot),time) &
HoldsAt(Location(robot,coord1,coord2),time) &
HoldsAt(Direction(robot,direction),time) &
coord3 = coord1+Cos(direction) &
coord4 = coord2+Sin(direction) ->
Initiates(MoveRightWheel(robot),
          Location(robot,coord3,coord4),
          time).

[robot,coord1,coord2,time]
Happens(MoveLeftWheel(robot),time) &
HoldsAt(Location(robot,coord1,coord2),time) ->
; FIX: Direction not needed!!
; HoldsAt(Direction(robot,direction),time) ->
Terminates(MoveRightWheel(robot),Location(robot,coord1,coord2),time).

; Delta

Happens(MoveRightWheel(Robot1),0).
Happens(MoveLeftWheel(Robot1),1).
Happens(MoveRightWheel(Robot1),1).

; Psi


[robot,coord1,coord2,coord3,coord4,time]
HoldsAt(Location(robot,coord1,coord2),time) &
HoldsAt(Location(robot,coord3,coord4),time) ->
coord1=coord3 &
coord2=coord4.

[robot,direction1,direction2,time]
HoldsAt(Direction(robot,direction1),time) &
HoldsAt(Direction(robot,direction2),time) ->
direction1=direction2.

; Gamma

HoldsAt(Location(Robot1,0,0),0).
HoldsAt(Direction(Robot1,0),0).

completion Happens

range time 0 3
range coord 0 3
range direction 0 3
range offset 1 1

; End of file.
