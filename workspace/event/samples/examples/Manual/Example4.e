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

fluent Awake(agent)
event WakeUp(agent)

[agent,time] Initiates(WakeUp(agent),Awake(agent),time).
[agent,time] Happens(WakeUp(agent),time) -> !HoldsAt(Awake(agent),time).

agent James, Jessie
!HoldsAt(Awake(James),0).
!HoldsAt(Awake(Jessie),0).
HoldsAt(Awake(James),1).

range time 0 1
range offset 1 1
