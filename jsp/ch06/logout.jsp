<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.invalidate(); // 세션강제소멸

	response.sendRedirect("/main.jsp");
%>
