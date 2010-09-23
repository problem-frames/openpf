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

event ReceiveWeatherInfo_t
event InputWeatherInfo_g()
event SendWeatherInfo_f()

fluent HasWeatherInfo_Aircraft()
fluent KnowsWeatherInfo_Operator()

;-------Operator------------
;As soon as the operator receives the weather info, s/he will input it to ATM system
[time] !(Happens(ReceiveWeatherInfo_t(),time) -> Happens(InputWeatherInfo_g(),time+1)).

;----Operator Behavior----------
[time] Initiates(ReceiveWeatherInfo_t(),KnowsWeatherInfo_Operator(), time).
[time] !HoldsAt(KnowsWeatherInfo_Operator(),time) & HoldsAt(KnowsWeatherInfo_Operator(),time) -> Happens(KnowsWeatherInfo_Operator(),time).

;-------ATM System-----------------
;If ATM System receives the weather report from the operator, it sends the information to the aircraft
[time] Happens(InputWeatherInfo_g(),time) -> Happens(SendWeatherInfo_f(), time+1).

;-------Aircraft--------------
;If the aircraft  receies the weather report, it will have the weather information
[time] Initiates(SendWeatherInfo_f(), HasWeatherInfo_Aircraft(), time).
completion Happens
!HoldsAt(KnowsWeatherInfo_Operator(),0).

range time 0 3
range offset 1 2

; is it possible that the operator receives the info but does not send it -- withholding information
