DROP TABLE t_book CASCADE CONSTRAINTS;

CREATE TABLE t_book (
    id number(10) primary key,
    title varchar2(300) not null,
    author varchar2(100),
    publication varchar2(100),
    year number(10)
);

commit;

INSERT INTO t_book (ID,title,author,publication,year)
VALUES(
(SELECT NVL(MAX(ID)+1,1) FROM T_BOOK),'자바 스프링','이용광','길벗',2020);

SELECT
    * FROM t_book;