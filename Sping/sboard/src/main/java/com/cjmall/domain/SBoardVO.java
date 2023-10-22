package com.cjmall.domain;

import java.util.Date;

import lombok.Data;

@Data
public class SBoardVO {
	/*
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
	 */
	
	private Long idx;
	private String subject;
	private String content;
	private String author;
	private int constraint;
	
	private Date createdate;
	private Date editdate;
	
	
	
}
