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
;
;option modeldiff on
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
sort dealer
sort wheel
sort value: integer

wheel Wheel1
dealer Dealer1

fluent WheelNumberDeterminer(wheel,value)
fluent WheelNumber(wheel,value)
noninertial WheelNumberDeterminer

event Spin(dealer,wheel)
event Reset(dealer,wheel)

[wheel,time]
{value}
HoldsAt(WheelNumberDeterminer(wheel,value),time).
value value1, value2
[wheel,value1,value2,time]
HoldsAt(WheelNumberDeterminer(wheel,value1),time) &
HoldsAt(WheelNumberDeterminer(wheel,value2),time) ->
value1=value2.

[dealer,wheel,value,time]
HoldsAt(WheelNumberDeterminer(wheel,value),time) ->
Initiates(Spin(dealer,wheel),WheelNumber(wheel,value),time).

[dealer,wheel,value1,value2,time]
HoldsAt(WheelNumber(wheel,value1),time) &
HoldsAt(WheelNumberDeterminer(wheel,value2),time) &
value1!=value2 ->
Terminates(Spin(dealer,wheel),WheelNumber(wheel,value1),time).

[dealer,wheel,value,time]
Terminates(Reset(dealer,wheel),WheelNumber(wheel,value),time).

[wheel,value1,value2,time]
HoldsAt(WheelNumber(wheel,value1),time) &
HoldsAt(WheelNumber(wheel,value2),time) ->
value1=value2.

[value] !HoldsAt(WheelNumber(Wheel1,value),0).

Happens(Spin(Dealer1,Wheel1),0).
;Happens(Reset(Dealer1,Wheel1),1).

; added to prune models
HoldsAt(WheelNumberDeterminer(Wheel1, 1),1).

completion Happens

range value 1 3
range time 0 1
range offset 1 1

; End of file.
