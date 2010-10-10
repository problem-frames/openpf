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
sort device

agent Nathan
device Device1

predicate Ab1(device,time)

fluent On(device)
fluent PluggedIn(device)
fluent BrokenSwitch(device)

event TurnOn(agent,device)

; Sigma

[agent,device,time]
!Ab1(device,time) ->
Initiates(TurnOn(agent,device),On(device),time).

; Delta

Happens(TurnOn(Nathan,Device1),0).

; Theta

;Theta: [device,time] HoldsAt(BrokenSwitch(device),time) -> Ab1(device,time).
;Theta: [device,time] !HoldsAt(PluggedIn(device),time) -> Ab1(device,time).

; Gamma

!HoldsAt(On(Device1),0).
HoldsAt(BrokenSwitch(Device1),0).

; added:
HoldsAt(PluggedIn(Device1),0).

; entailed:
; !HoldsAt(On(Device1),1).

;completion Theta Ab1
completion Happens

range time 0 1
range offset 1 1

; End of file.
