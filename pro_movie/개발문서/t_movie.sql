DROP TABLE t_movie CASCADE CONSTRAINTS;

CREATE TABLE t_movie (
    id number(10) primary key,
    title varchar2(300) not null,
    actor varchar2(100),
    year number(10)
);

commit;
