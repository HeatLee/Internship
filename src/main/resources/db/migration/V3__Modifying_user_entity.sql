alter table user_entity add first_name varchar(35) not null;
alter table user_entity add last_name varchar not null;
alter table user_entity add middle_name varchar(35) not null;
alter table user_entity add course int not null;
alter table user_entity add hostel_number int not null;
alter table user_entity add room int not null;
alter table user_entity add student_id int not null;
drop table user_info;