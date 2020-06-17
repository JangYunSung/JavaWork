
/* Drop Tables */

DROP TABLE writeboard CASCADE CONSTRAINTS;

/* Create Tables */

CREATE TABLE writeboard
(
	wb_uid number NOT NULL,
	wb_subject varchar2(200) NOT NULL,
	wb_content clob,
	wb_name varchar2(40) NOT NULL,
	wb_viewcnt number DEFUALT 0,
	wb_regdate date DEFAULT SYSDATE,
	PRIMARY KEY (wb_uid)
);


-- 처음 열람용 데이터 
INSERT INTO TEST_WRITE VALUES
(TEST_WRITE_SEQ.nextval, '첫째글:방가요', '안녕하세요', '김희철', 0, '2017-03-02');

-- 시퀀스 작성
CREATE SEQUENCE WRITE_BOARD_SEQ;



SELECT * FROM TEST_WRITE;