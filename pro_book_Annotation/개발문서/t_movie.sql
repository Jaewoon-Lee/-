DROP TABLE t_movie CASCADE CONSTRAINTS;

CREATE TABLE t_movie (
    id NUMBER(10) PRIMARY KEY,
    title VARCHAR2(300) NOT NULL,
    actor VARCHAR2(100),
    year number(10)
);

commit;