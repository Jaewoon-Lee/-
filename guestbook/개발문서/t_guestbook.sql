DROP TABLE t_gestbook CASCADE CONSTRAINTS;

CREATE TABLE t_guestbook (
    id number(10) primary key,
    name varchar2(30) not null,
    pwd varchar2(20) not null,
    content varchar2(1000) not null,
    writedate date default sysdate not null
);

commit;
