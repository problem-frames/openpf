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

fluent FileExists_PF()
event ClickFrameButton_a()
event CreateFolder_b()
event CreateFile_b()
event ClickFrameButton_c()
User: true -> false.

({time} Happens(ClickFrameButton_a(), time)) &
([time] HoldsAt(FileExists_PF(), time) -> ! Happens(CreateFolder_b(), time)) &
;--PF--
([time] Initiates(CreateFolder_b(), FileExists_PF(), time)) &
;--ExampleCreator--
! (!([time] HoldsAt(FileExists_PF(), time) -> ! Happens(CreateFolder_b(), time)) & 
   ([time] !HoldsAt(FileExists_PF(), time) -> (Happens(ClickFrameButton_a(), time) -> Happens(CreateFolder_b(), time))) &
   ;--Req--
   ([time] Happens(ClickFrameButton_a(), time) -> HoldsAt(FileExists_PF(), time+1))).

range time 0 2
range offset 1 2	

