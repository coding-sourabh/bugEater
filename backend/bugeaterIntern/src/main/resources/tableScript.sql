drop database bugeater;
create database bugeater;
use bugeater;

create table mentor (
mentor_id int auto_increment primary key,
mentor_name varchar(200),
mentor_email varchar(200),
mentor_pass varchar(200),
mentor_img varchar(2000),
mentor_mobile varchar(200),
mentor_org varchar(200),
mentor_exp double,
mentor_desc varchar(500)
);

create table user (
user_id int auto_increment primary key,
user_name varchar(200),
user_email varchar(200),
user_pass varchar(200),
user_img varchar(2000),
user_mobile varchar(20),
user_exp double,
user_desc varchar(500),
user_resume varchar(2000)
);

create table project (
project_id int auto_increment primary key,
project_name varchar(200),
project_desc varchar(1000),
project_duration int,
project_stipend double,
project_vacancy int,
project_start_date date,
project_location varchar(200),
project_org varchar(200),
mentor_id int,
foreign key (mentor_id) references mentor(mentor_id)
);

create table tech (
tech_id int auto_increment primary key,
tech_name varchar(200)
);

create table project_tech_map (
project_tech_map_id int auto_increment primary key,
project_id int,
tech_id int,
foreign key (project_id) references project(project_id),
foreign key (tech_id) references tech(tech_id)
);

create table user_tech_map (
user_tech_map_id int auto_increment primary key,
user_id int,
tech_id int,
foreign key (user_id) references user(user_id),
foreign key (tech_id) references tech(tech_id)
);
