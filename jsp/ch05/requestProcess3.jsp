<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>request 예제</h2>
<%
// request객체 : 클라이언트에서 요청한 모든정보를 가지고 있는 객체.
// 클라이언트에서 method=post 방식으로 한글데이터 전송시 한글이 깨짐
request.setCharacterEncoding("UTF-8");

// 하나의 파라미터명으로 여러개의 값을 전송시

String[] hobby = request.getParameterValues("hobby");

String result = "";

for(int i = 0 ; hobby.length > i; i++){
	
	if (i == hobby.length -1){
		result += hobby[i];	
	}else{
		result += hobby[i] + ",";
	}
}

%>


취미 개수 : <%= hobby.length %><br>
취미 : <%= result %>
