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

agent Nathan

fluent Awake(agent)

event WakeUp(agent)
event FallAsleep(agent)

; Sigma

[agent,time] Initiates(WakeUp(agent),Awake(agent),time).
[agent,time] Terminates(FallAsleep(agent),Awake(agent),time).

; Delta

Happens(WakeUp(Nathan),1).

; entailed:
; HoldsAt(Awake(Nathan),3).

completion Happens

range time 0 3
range offset 1 1

; End of file.
