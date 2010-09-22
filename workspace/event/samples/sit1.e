load foundations/Root.e
load foundations/EC.e

event ReceiveWeatherInfo_t()
event InputWeatherInfo_g()
event SendWeatherInfo_f()

fluent HasWeatherInfo_Aircraft()

;-------Operator------------
;As soon as the operator receives the weather info, s/he will input it to ATM system
[time] Happens(ReceiveWeatherInfo_t(),time) -> Happens(InputWeatherInfo_g(),time+1).

;-------ATM System-----------------
;If ATM System receives the weather report from the operator, it sends the information to the aircraft
[time] Happens(InputWeatherInfo_g(),time) -> Happens(SendWeatherInfo_f(), time+1).

;-------Aircraft--------------
;If the aircraft  receies the weather report, it will have the weather information
[time] Initiates(SendWeatherInfo_f(), HasWeatherInfo_Aircraft(), time).

range time 0 3
range offset 1 2
