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
predicate Trajectory(fluent,time,fluent,offset)

sort agent
sort clock

fluent Beeping(clock)
fluent AlarmTime(clock,time)
fluent AlarmOn(clock)

event SetAlarmTime(agent,clock,time)
event StartBeeping(clock)
event TurnOnAlarm(agent,clock)
event TurnOffAlarm(agent,clock)

predicate Ab1(clock,time)

agent Nathan
clock Clock

; Sigma
time time1, time2
[agent,clock,time1,time2,time]
HoldsAt(AlarmTime(clock,time1),time) &
time1!=time2 ->
Initiates(SetAlarmTime(agent,clock,time2),AlarmTime(clock,time2),time).

[agent,clock,time1,time2,time]
HoldsAt(AlarmTime(clock,time1),time) &
time1!=time2 ->
Terminates(SetAlarmTime(agent,clock,time2),AlarmTime(clock,time1),time).

[agent,clock,time]
Initiates(TurnOnAlarm(agent,clock),AlarmOn(clock),time).

[agent,clock,time]
Terminates(TurnOffAlarm(agent,clock),AlarmOn(clock),time).

[clock,time]
Initiates(StartBeeping(clock),Beeping(clock),time).

[agent,clock,time]
Terminates(TurnOffAlarm(agent,clock),Beeping(clock),time).

; Delta

[clock,time]
HoldsAt(AlarmTime(clock,time),time) &
HoldsAt(AlarmOn(clock),time) &
!Ab1(clock,time) ->
Happens(StartBeeping(clock),time).

Happens(SetAlarmTime(Nathan,Clock,2),0).
Happens(TurnOnAlarm(Nathan,Clock),1).

; Psi

[clock,time1,time2,time]
HoldsAt(AlarmTime(clock,time1),time) &
HoldsAt(AlarmTime(clock,time2),time) ->
time1=time2.

; Gamma

!HoldsAt(AlarmOn(Clock),0).
!HoldsAt(Beeping(Clock),0).
HoldsAt(AlarmTime(Clock,3),0).

completion Happens
;completion Theta Ab1

range time 0 3
range offset 1 1

; End of file.
