use student;

CREATE TABLE students (
    id INTEGER PRIMARY KEY,
    name VARCHAR(10) NOT NULL
);

insert into students value(1,'Mamatha S');

truncate students;

select * from students;

DESC students;

