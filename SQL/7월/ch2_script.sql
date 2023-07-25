-- ����Ÿ���̽� ���α׷��� : sql 
/*
���̺� : �����͸� �����ϰ� �����ϴ� ��ü.
���̺� : �ο�� �÷����� ����

���̺� ��������
 CREATE TABLE [��Ű��.]���̺��(
        �÷�1 �÷�1_������Ÿ�� [NULL, NOT NULL],
        �÷�2 �÷�2_������Ÿ�� [NULL, NOT NULL],
        
        ��Ű�� : ��?�ͺ��̽� ��ü�� �����ϴ� �ǹ�.
        ���̺� ������ ��Ű���� �����ϸ�, ������ ������ �̸����� ���������.
        ���Ӱ��� : ora_user �����̸��� ���̸������� ���ȴ�.
        
? ���̺��, �÷����� �ִ� ũ��� 30����Ʈ��.

? ���̺��, �÷������� ������ ����� �� ����.

(�����(Ű����)�� ����Ŭ���� �̸� ������ �ܾ�� SELECT, UPDATE�� ���� ����, COUNT, ASC�� ���� SQL �Լ� ���� ������, ����� ����� V\$RESERVED_WORDS �ý��� �信�� ��ȸ�� �� �ִ�)

? ���̺��, �÷������� ����, ����, ��_��, ��\$��, ��#���� ����� �� ������, ù ���ڴ� ���ڸ� �� �� �ִ�.

? �� ���̺� ��� ������ �÷��� �ִ� 255��������.

?, ?, ?�� ������ ���̺�� �÷��Ӹ� �ƴ϶� ����Ŭ�� �ִ� ��� �����ͺ��̽� ��ü �̸��� ������ ���� ����ȴ�.

�� �÷��� �÷���� ������ Ÿ������ �����ϴµ� ����Ŭ���� �����ϴ� �⺻ ������ Ÿ���� ũ�� ����, ����, ��¥������ ���� �� �ִ�. 
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

-- select �� : ���̺��� �����͸� ��ȸ�ϴ� ��ɾ�.
select * from member; -- ���̺���� ��� �÷����� ��ȸ�϶�.

-- �Խ��� ���̺�
CREATE TABLE BOARD (
    B_IDX     NUMBER         PRIMARY KEY,
    B_SUBJECT VARCHAR2(100)  NOT NULL,
    B_CONTENT VARCHAR2(4000) NOT NULL,
    B_WRITER  VARCHAR2(50)   NOT NULL,
    B_REGDATE DATE DEFAULT SYSDATE
);
