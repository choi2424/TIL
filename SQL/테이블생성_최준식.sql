-- 상품관리 테이블
CREATE TABLE  Product(
    Product_Code    varchar2(10) not null,
    Product_name    varchar2(20) not null,
    Standard        varchar2(20),
    Unit            varchar2(10),
    Unit_Price      number(7)    not null,
    Left_Qty        number(5)    not null,
    Company         varchar2(20),
    ImageName       varchar2(20),
    Info            varchar2(50),
    Detail_Info     varchar2(255),
    CONSTRAINT Product_pk  primary key (Product_Code)
    );

-- 회원관리 테이블
CREATE TABLE CONTROL_MEMBER(
    UserID      varchar2(10)    not null,
    Passwd      varchar2(10)    not null,
    Name        varchar2(10)    not null,
    Regist_No   char(14)        not null UNIQUE,
    Email       varchar2(20),
    Telephone   varchar2(13)    not null,
    Address     varchar2(40),
    Buycash     number(9) DEFAULT(0),
    TimeStamp   DATE      DEFAULT SYSDATE,
    CONSTRAINT MEMBER_PK PRIMARY KEY (UserID)
);

-- 장바구니 
CREATE TABLE SHOPPING_BASKET(
    Order_No        varchar2(10) not null,
    Order_ID        varchar2(10) not null,
    Product_Code    varchar2(10) not null,
    Order_Qty       number(3)    not null,
    Order_Date      DATE    DEFAULT SYSDATE,
    CONSTRAINT BASKET_PK PRIMARY KEY (Order_No),
    CONSTRAINT BASKET_ID_FK FOREIGN KEY (Order_ID) REFERENCES CONTROL_MEMBER(UserID),
    CONSTRAINT BASKET_CODE_FK FOREIGN KEY (Product_Code) REFERENCES Product(Product_Code)
);

-- 주문처리
CREATE TABLE ORDER_PROCESSING(
    Order_No        varchar2(10)    not null,
    Order_ID        varchar2(10)    not null,
    Product_Code    varchar2(10)    not null,
    Order_Qty       number(3)       not null,
    Csel            varchar2(10),
    CMoney          number(9),
    Cdate           date,
    Mdate           date,
    Gubun           varchar2(10),
    CONSTRAINT ORDER_PROCESSING_PK PRIMARY KEY (Order_No)
);

--자유게시판
CREATE TABLE FREE_BOARD(
    B_ID        number(5)       not null,
    B_Name      varchar2(20)    not null,
    B_Pwd       varchar2(20)    not null,
    B_Email     varchar2(20)    not null,
    B_Title     varchar2(80)    not null,
    B_Content   varchar2(2000)  not null,
    B_Date      DATE    DEFAULT SYSDATE,
    B_Hit       number(5)   DEFAULT 0,
    B_Ip        varchar2(15),
    CONSTRAINT FREE_BOARD_PK PRIMARY KEY (B_ID)
);

commit;