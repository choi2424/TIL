<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>JDBC드라이버 테스트</h2>

<%
//	데이터베이스 연결기능으로 사용하는 인터페이스
	Connection conn = null;

	try{
//		데이터베이스 연결정보   SqlDeveloper 접속정보.
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "ora_user";
		String dbPw = "1234";
		
//		1)DriverManager객체가 메모리상에 생성		
		Class.forName("oracle.jdbc.OracleDriver");
//		2)Connection객체 생성(연결).		sqlDeveloper를 이용하여 오라클데이터베이스에 접속	
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
		out.println("데이터베이스 연결됨.");
	}catch(Exception ex){
		ex.printStackTrace(); // 예외관련 메세지 출력.
	}finally{
		conn.close(); // 연결닫기
	}

%>