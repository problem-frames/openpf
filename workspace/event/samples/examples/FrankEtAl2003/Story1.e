
;load examples/FrankEtAl2003/FrankEtAl.e
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
; @article{FrankEtAl:2003,
;   author = "Stefan L. Frank and Mathieu Koppen and Leo G. M. Noordman and Wietske Vonk",
;   year = "2003",
;   title = "Modeling knowledge-based inferences in story comprehension",
;   journal = "Cognitive Science",
;   volume = "27",
;   pages = "875--910",
; }
;

;option modeldiff on

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
; @phdthesis{Cassimatis:2002,
;   author = "Nicholas L. Cassimatis",
;   year = "2002",
;   title = "Polyscheme: A Cognitive Architecture for Integrating Multiple Representation and Inference Schemes",
;   address = "Cambridge, MA",
;   school = "Program in Media Arts and Sciences, School of Architecture and Planning, Massachusetts Institute of Technology",
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


; sorts
sort object
sort object1
sort object2
sort xcoord: integer
sort xcoord1: integer
sort xcoord2: integer
sort ycoord: integer
sort ycoord1: integer
sort ycoord2: integer
sort grid
sort shape
sort shape1
sort shape2
sort color
sort color1
sort color2

; constants
shape Round,Square
color Red,Green

; predicates, fluents, and events
predicate Equal(object,object)
predicate Shape(object,shape)
predicate Color(object,color)
fluent Location(grid,object,xcoord,ycoord)
event Move(grid,object,xcoord,ycoord,xcoord,ycoord)

; axioms

[object1,object2] Equal(object1,object2) -> Equal(object2,object1).

; objects have unique shape
[object,shape1,shape2]
Shape(object,shape1) & Shape(object,shape2) ->
shape1=shape2.

; objects have unique color
[object,color1,color2]
Color(object,color1) & Color(object,color2) ->
color1=color2.

; if objects are the same, they have the same shape
[object1,object2]
Equal(object1,object2) ->
({shape} Shape(object1,shape) & Shape(object2,shape)).

; if objects are the same, they have the same color
[object1,object2]
Equal(object1,object2) ->
({color} Color(object1,color) & Color(object2,color)).

; if objects are the same, they have the same location
[grid,object1,object2,xcoord1,ycoord1,xcoord2,ycoord2,time]
Equal(object1,object2) ->
(HoldsAt(Location(grid,object1,xcoord1,ycoord1),time) &
 HoldsAt(Location(grid,object2,xcoord2,ycoord2),time) ->
 xcoord1=xcoord2 & ycoord1=ycoord2).

; object in one location at a time
[grid,object,xcoord1,ycoord1,xcoord2,ycoord2,time]
HoldsAt(Location(grid,object,xcoord1,ycoord1),time) &
HoldsAt(Location(grid,object,xcoord2,ycoord2),time) ->
xcoord1=xcoord2 & ycoord1=ycoord2.

; objects have locations
[grid,object,time]
({xcoord,ycoord} HoldsAt(Location(grid,object,xcoord,ycoord),time)).

; different objects are not at same location
[grid,object1,object2,xcoord1,ycoord1,time]
HoldsAt(Location(grid,object1,xcoord1,ycoord1),time) &
HoldsAt(Location(grid,object2,xcoord1,ycoord1),time) ->
Equal(object1,object2).

; moving to a location causes an object to be at that location
[grid,object,xcoord1,ycoord1,xcoord2,ycoord2,time]
Initiates(Move(grid,object,xcoord1,ycoord1,xcoord2,ycoord2),
          Location(grid,object,xcoord2,ycoord2),
          time).

; moving to a location causes the object no longer to be at its previous
; location
[grid,object,xcoord1,ycoord1,xcoord2,ycoord2,time]
Terminates(Move(grid,object,xcoord1,ycoord1,xcoord2,ycoord2),
           Location(grid,object,xcoord1,ycoord1),
           time).

;; allow diagonal movements
;[grid,object,xcoord1,ycoord1,xcoord2,ycoord2,time]
;Happens(Move(grid,object,xcoord1,ycoord1,xcoord2,ycoord2),time) ->
;HoldsAt(Location(grid,object,xcoord1,ycoord1),time) &
;(xcoord1=xcoord2 |
; xcoord1=xcoord2+1 |
; xcoord1=xcoord2-1) &
;(ycoord1=ycoord2 |
; ycoord1=ycoord2+1 |
; ycoord1=ycoord2-1).

; only allow right angle movements
[grid,object,xcoord1,ycoord1,xcoord2,ycoord2,time]
Happens(Move(grid,object,xcoord1,ycoord1,xcoord2,ycoord2),time) ->
HoldsAt(Location(grid,object,xcoord1,ycoord1),time) &
((xcoord1=xcoord2 & (ycoord1=ycoord2+1 | ycoord1=ycoord2-1)) |
 (ycoord1=ycoord2 & (xcoord1=xcoord2+1 | xcoord1=xcoord2-1))).

; End of file.

sort agent

fluent SunShining()
fluent Raining()
fluent Outside(agent)
fluent PlaySoccer(agent)
fluent PlayHideAndSeek(agent)
fluent PlayComputerGame(agent)
fluent PlayWithDog(agent)
fluent Win(agent)

;noninertial Outside, PlaySoccer, PlayHideAndSeek, PlayComputerGame
;noninertial PlayWithDog, Win

;xor PlaySoccer, PlayHideAndSeek, PlayComputerGame, PlayWithDog

[agent,time]
HoldsAt(PlaySoccer(agent),time) ->
HoldsAt(Outside(agent),time).
agent agent1, agent2
[agent,time]
HoldsAt(PlaySoccer(agent),time) ->
({agent1} agent1!=agent & HoldsAt(PlaySoccer(agent1),time)).

[agent,time]
HoldsAt(PlayHideAndSeek(agent),time) ->
({agent1} agent1!=agent & HoldsAt(PlayHideAndSeek(agent1),time)).

[agent,time]
HoldsAt(PlayComputerGame(agent),time) ->
!HoldsAt(Outside(agent),time).

[agent,time]
HoldsAt(Win(agent),time) ->
(HoldsAt(PlaySoccer(agent),time) |
 HoldsAt(PlayHideAndSeek(agent),time) |
 (HoldsAt(PlayComputerGame(agent),time) &
  ({agent1} agent1!=agent & HoldsAt(PlayComputerGame(agent1),time)))).

[agent,time]
HoldsAt(PlaySoccer(agent),time) &
HoldsAt(Win(agent),time) ->
!HoldsAt(PlaySoccer(agent),time+1).

[agent,time]
HoldsAt(PlayHideAndSeek(agent),time) &
HoldsAt(Win(agent),time) ->
!HoldsAt(PlayHideAndSeek(agent),time+1).

[agent,time]
HoldsAt(PlayComputerGame(agent),time) &
HoldsAt(Win(agent),time) ->
!HoldsAt(PlayComputerGame(agent),time+1).

[agent,time]
HoldsAt(Win(agent),time) ->
HoldsAt(PlaySoccer(agent),time-1) |
HoldsAt(PlayHideAndSeek(agent),time-1) |
HoldsAt(PlayComputerGame(agent),time-1).

[agent,time]
HoldsAt(PlaySoccer(agent),time) ->
!HoldsAt(Raining(),time).

[agent,time]
HoldsAt(Win(agent),time) ->
!({agent1} agent1!=agent & HoldsAt(Win(agent1),time)).

[agent1,agent2,time]
HoldsAt(PlayHideAndSeek(agent1),time) &
HoldsAt(PlayHideAndSeek(agent2),time) ->
((HoldsAt(Outside(agent1),time) & HoldsAt(Outside(agent2),time)) |
 (!HoldsAt(Outside(agent1),time) & !HoldsAt(Outside(agent2),time))).

; End of file.

agent Bob, Jilly

!HoldsAt(Raining(),0).
!HoldsAt(SunShining(),0).

(HoldsAt(PlaySoccer(Bob),1) & HoldsAt(PlaySoccer(Jilly),1)) |
(HoldsAt(PlayHideAndSeek(Bob),1) & HoldsAt(PlayHideAndSeek(Jilly),1)) |
(HoldsAt(PlayComputerGame(Bob),1) & HoldsAt(PlayComputerGame(Jilly),1)).

HoldsAt(Win(Bob),1) | HoldsAt(Win(Jilly),1).

range time 0 1
range offset 0 0

; End of file.
