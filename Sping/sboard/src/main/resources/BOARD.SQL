-- 신규 프로젝트
CREATE TABLE SBOARD (
    IDX      NUMBER,                        -- 글번호
    SUBJECT  VARCHAR2(100)  NOT NULL,       -- 제목
    CONTENT  VARCHAR2(1000) NOT NULL,       -- 내용
    AUTHOR   VARCHAR2(100)  NOT NULL,       -- 작성자
    CREATEDATE  DATE     DEFAULT SYSDATE,   -- 등록일
    EDITDATE    DATE     DEFAULT SYSDATE,   -- 수정일
    READCOUNT   NUMBER   DEFAULT 0,         -- 조회수
    CONSTRAINT PK_SBOARD PRIMARY KEY(IDX)
);


-- 시퀀스 생성
CREATE SEQUENCE SEQ_SBOARD;

-- 시퀀스 명령어
/*
    - SEQ_BOARD.NEXTVAL : 시퀀스에서 다음 순번 값을 자동으로 가져온다
    - SEQ_BOARD.CURRVAL : 시퀀스의 현재 값을 알수있다.
*/