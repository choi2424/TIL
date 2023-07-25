-- 데이타베이스 프로그래밍 : sql 
/*
테이블 : 데이터를 저장하고 관리하는 객체.
테이블 : 로우와 컬럼으로 구성

테이블 생성구문
 CREATE TABLE [스키마.]테이블명(
        컬럼1 컬럼1_데이터타입 [NULL, NOT NULL],
        컬럼2 컬럼2_데이터타입 [NULL, NOT NULL],
        
        스키마 : 데?터베이스 객체를 관리하는 의미.
        테이블 생성시 스키마를 생략하면, 접속한 계정의 이름으로 만들어진다.
        접속계정 : ora_user 계정이름에 스미마명으로 사용된다.
        
? 테이블명, 컬럼명의 최대 크기는 30바이트다.

? 테이블명, 컬럼명으로 예약어는 사용할 수 없다.

(예약어(키워드)란 오라클에서 미리 선점한 단어로 SELECT, UPDATE과 같은 구문, COUNT, ASC와 같은 SQL 함수 등이 있으며, 예약어 목록은 V\$RESERVED_WORDS 시스템 뷰에서 조회할 수 있다)

? 테이블명, 컬럼명으로 문자, 숫자, ‘_’, ‘\$’, ‘#’을 사용할 수 있지만, 첫 글자는 문자만 올 수 있다.

? 한 테이블에 사용 가능한 컬럼은 최대 255개까지다.

?, ?, ?번 내용은 테이블과 컬럼뿐만 아니라 오라클에 있는 모든 데이터베이스 객체 이름을 생성할 때도 적용된다.

각 컬럼은 컬럼명과 데이터 타입으로 구성하는데 오라클에서 제공하는 기본 데이터 타입은 크게 문자, 숫자, 날짜형으로 나눌 수 있다. 
*/

CREATE TABLE member (
    u_id     VARCHAR2(16)  not null primary key,
    u_name   varchar2(30)  not null,    
    u_pw     VARCHAR2(15)  not null,
    u_birth  CHAR(10)      not null,
    u_gender CHAR(6)       not null,
    u_email  VARCHAR2(50)  not null,
    u_tel1   VARCHAR2(20)  not null,
    u_tel2   VARCHAR2(20)      null,
    u_post   CHAR(5)       not null,
    u_addr1  VARCHAR2(50)  not null,
    u_addr2  VARCHAR2(50)  not null,
    u_email_chk  CHAR(1)   not null,
    u_sms_chk    CHAR(1)   not null    
);

-- select 문 : 테이블의 데이터를 조회하는 명령어.
select * from member; -- 테이블명의 모든 컬럼명을 조회하라.

-- 게시판 테이블
CREATE TABLE BOARD (
    B_IDX     NUMBER         PRIMARY KEY,
    B_SUBJECT VARCHAR2(100)  NOT NULL,
    B_CONTENT VARCHAR2(4000) NOT NULL,
    B_WRITER  VARCHAR2(50)   NOT NULL,
    B_REGDATE DATE DEFAULT SYSDATE
);
