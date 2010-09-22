load foundations/Root.e
load foundations/EC.e

event ReceiveWeatherInfo_t()
event InputWeatherInfo_g()
;event SendWeatherInfo_f()

;fluent HasWeatherInfo_Aircraft()
fluent KnowsWeatherInfo_Operator()

;-------Operator------------
;As soon as the operator receives the weather info, s/he will input it to ATM system
[time] !(Happens(ReceiveWeatherInfo_t(),time) <-> Happens(InputWeatherInfo_g(),time+1)).

;----Operator Behavior----------
[time] Initiates(ReceiveWeatherInfo_t(),KnowsWeatherInfo_Operator(), time).
[time] !HoldsAt(KnowsWeatherInfo_Operator(),time) & HoldsAt(KnowsWeatherInfo_Operator(),time) -> Happens(KnowsWeatherInfo_Operator(),time).

;-------ATM System-----------------
;If ATM System receives the weather report from the operator, it sends the information to the aircraft
;[time] Happens(InputWeatherInfo_g(),time) -> Happens(SendWeatherInfo_f(), time+1).

;-------Aircraft--------------
;If the aircraft  receies the weather report, it will have the weather information
;[time] Initiates(SendWeatherInfo_f(), HasWeatherInfo_Aircraft(), time).
;completion Happens
;!HoldsAt(KnowsWeatherInfo_Operator(),0).

range time 0 3
range offset 1 2

; if the obligations stronger than the specification, then the domain cannot discharge its obligations
