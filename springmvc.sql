DROP DATABASE springmvc

CREATE DATABASE springmvc;
USE springmvc;


inSERT into role values(1,"Admin");
inSERT into role values(2,"User");

insert into user values();

select * from movie;

select * from genre;
select * from user;
select * from userrole;
select * from role;

insert into user(username,password) values("user1","$2a$12$RdAMJ/Dc2OBTF6KXX1EN3uU1kYJ7YmWMGFQ9OeVyDBDZeclmm6ah.");
insert into user (username,password) values("admin1","$2a$12$RdAMJ/Dc2OBTF6KXX1EN3uU1kYJ7YmWMGFQ9OeVyDBDZeclmm6ah.");
insert into user(username,password) values("danghung","$2a$12$RdAMJ/Dc2OBTF6KXX1EN3uU1kYJ7YmWMGFQ9OeVyDBDZeclmm6ah.");
insert into user(username,password) values("hunghenry","$2a$12$RdAMJ/Dc2OBTF6KXX1EN3uU1kYJ7YmWMGFQ9OeVyDBDZeclmm6ah.");
insert into user(username,password) values("like.kent","$2a$12$RdAMJ/Dc2OBTF6KXX1EN3uU1kYJ7YmWMGFQ9OeVyDBDZeclmm6ah.");
insert into userrole values(3,1);
insert into userrole values(3,2);
insert into userrole values(4,1);
insert into userrole values(5,2);








select userId,ur.userId from user as u join userrole as ur on ur.userid = u.id where u.username= "admin1" and u.password ="$2a$12$RdAMJ/Dc2OBTF6KXX1EN3uU1kYJ7YmWMGFQ9OeVyDBDZeclmm6ah.";
select * from user as u join userrole as ur on ur.userid = u.id where u.username= "admin" and u.password ="$2a$12$RdAMJ/Dc2OBTF6KXX1EN3uU1kYJ7YmWMGFQ9OeVyDBDZeclmm6ah.";
