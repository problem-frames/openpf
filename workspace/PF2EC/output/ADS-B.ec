load foundations/Root.e
load foundations/EC.e	
fluent State1_CWP()
fluent State2_CWP()
event Pheonmena1_a()
;--CP--
[time]
        ->
.       
;--ADS-B--
[time]
        ->
.       
;--Display--
[time]
        ->
.       
;--Operator--
[time]
        ->
Happens(Pheonmena1_a(),time+1),
.       
;--GPS--
[time]
        ->
.       
;--Aircrafts--
[time]
        ->
.       
;--CWP--
[time]
Happens(Pheonmena1_a(),time),
        ->
.       
;--MSoD--
[time]
.       
;--Test--
[time]
.       
[time]
   !(
;--MSoD--
,
;--Test--
,
   ).
range time 0 3
range offset 1 2	

