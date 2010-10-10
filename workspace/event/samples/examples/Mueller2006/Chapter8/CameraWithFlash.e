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
sort camera

camera Camera1

fluent ProperlyExposedPicture(camera)
fluent ImproperlyExposedPicture(camera)

event ReleaseShutter(camera)
event TriggerFlash(camera)

; Sigma

[camera,time]
Happens(TriggerFlash(camera),time) ->
Initiates(ReleaseShutter(camera),ProperlyExposedPicture(camera),time).

[camera,time]
!Happens(TriggerFlash(camera),time) ->
Initiates(ReleaseShutter(camera),ImproperlyExposedPicture(camera),time).

; Delta

;Delta: Happens(ReleaseShutter(Camera1),0).
;Delta: Happens(TriggerFlash(Camera1),1).
;Delta: Happens(ReleaseShutter(Camera1),1).

; added:
[camera] !HoldsAt(ImproperlyExposedPicture(camera),0).
[camera] !HoldsAt(ProperlyExposedPicture(camera),0).

;completion Delta Happens

range time 0 2
range offset 1 1

; End of file.
