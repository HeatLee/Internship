create table role
(
    id   serial      not null
        constraint role_pk
            primary key,
    role varchar(10) not null
);

alter table role
    owner to postgres;

create table user_entity
(
    id       serial               not null
        constraint user_pk
            primary key,
    login    varchar(30)          not null,
    password varchar(60)          not null,
    is_alive boolean default true not null,
    role_id  integer              not null
        constraint user_role_id_fk
            references role
);

alter table user_entity
    owner to postgres;

create table user_info
(
    id           serial      not null
        constraint user_info_pk
            primary key,
    user_id      integer     not null
        constraint user_info_user_id_fk
            references user_entity,
    first_name   varchar(35) not null,
    last_name    varchar(35) not null,
    middle_name  varchar(35) not null,
    course       integer     not null,
    hotel_number integer     not null,
    room         integer     not null,
    student_id   varchar(10) not null
);

alter table user_info
    owner to postgres;

create table act
(
    id          serial not null
        constraint act_pk
            primary key,
    violation   text   not null,
    date        date   not null,
    composed_by text   not null
);

alter table act
    owner to postgres;

create table violators
(
    id      serial  not null
        constraint violators_pk
            primary key,
    act_id  integer not null
        constraint violators_act_id_fk
            references act,
    user_id integer not null
        constraint violators_user_id_fk
            references user_entity
);

alter table violators
    owner to postgres;

create table working_off
(
    id      serial  not null
        constraint working_off_pk
            primary key,
    user_id integer not null
        constraint working_off_user_id_fk
            references user_entity,
    amount  integer not null
);

alter table working_off
    owner to postgres;

create table privilege_name
(
    id   serial not null
        constraint privilege_name_pk
            primary key,
    name text   not null
);

alter table privilege_name
    owner to postgres;

create table request
(
    id           serial                not null
        constraint request_pk
            primary key,
    user_id      integer               not null
        constraint request_user_id_fk
            references user_entity,
    year         integer               not null,
    is_confirmed boolean default false not null
);

alter table request
    owner to postgres;

create table privileges
(
    id         serial  not null
        constraint privileges_pk
            primary key,
    request_id integer not null
        constraint privileges_request_id_fk
            references request,
    name_id    integer not null
        constraint privileges_privilege_name_id_fk
            references privilege_name
);

alter table privileges
    owner to postgres;

