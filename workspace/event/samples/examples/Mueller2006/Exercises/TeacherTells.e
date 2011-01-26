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
sort room
sort fact

agent Teacher, Student
room Kitchen, Classroom
fact Fact1, Fact2

fluent InRoom(agent,room)
fluent ListeningTo(agent,agent)
fluent Know(agent,fact)

event Tell(agent,agent,fact)

; Sigma
agent agent1, agent2
[agent1,agent2,fact,time]
({room} HoldsAt(InRoom(agent1,room),time) &
        HoldsAt(InRoom(agent2,room),time)) &
HoldsAt(ListeningTo(agent2,agent1),time) ->
Initiates(Tell(agent1,agent2,fact),Know(agent2,fact),time).

; Delta

Happens(Tell(Teacher,Student,Fact1),0).

; Psi
room room1, room2
[agent,room1,room2,time]
HoldsAt(InRoom(agent,room1),time) &
HoldsAt(InRoom(agent,room2),time) ->
room1 = room2.

; Gamma

[agent,fact] !HoldsAt(Know(agent,fact),0).
[agent1,agent2] HoldsAt(ListeningTo(agent1,agent2),0).
[agent] HoldsAt(InRoom(agent,Classroom),0).

completion Happens

range time 0 1
range offset 1 1

; End of file.
