
/* Drop Tables */

DROP TABLE twentice_event CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE twentice_event
(
	event_id number NOT NULL,
	event_name varchar2(20) NOT NULL,
	content  clob NOT NULL,
	event_start date NOT NULL,
	event_end date NOT NULL,
	user_id number NOT NULL,
	event_authorize number NOT NULL,
	event_img varchar2(100) NOT NULL,
	PRIMARY KEY (event_id)
);

 


INSERT INTO twentice_event VALUES
(TWENTIETH_EVENT_SEQ.nextval, '테스트제목', '테스트내용', '2017-03-01','2017-03-02', 1, 1, '테스트이미지주소')
WHERE event_authorize = (SELECT uesr_authorize  FROM twentice_user WHERE uid= 1);


UPDATE twentice_event SET event_name ='테스트제목2' , content ='테스트내용2' , event_img='테스트이미지주소2'
WHERE event_id = ? AND event_authorize = (SELECT uesr_authorize  FROM twentice_user WHERE uid= 1);

DELETE FROM twentice_event WHERE event_id = ? AND event_authorize = (SELECT uesr_authorize  FROM twentice_user WHERE uid= 1);


-- 시퀀스 작성
CREATE SEQUENCE TWENTIETH_EVENT_SEQ;



SELECT * FROM twentice_event;
