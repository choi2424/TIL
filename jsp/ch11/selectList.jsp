<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<style>
table, td, th {
  border: 1px solid;
}

table {
  width: 100%;
  border-collapse: collapse;
}
p {
  text-align: center;
}
</style>
<script>
	function fn_del(userid) {
		if (confirm(userid + "를 정말로 삭제하시겠습니까?")) {
			alert(userid + "가 삭제되었습니다");
        } 
		
		location.href = "deletePro.jsp?userid=" + userid;
		
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>    
	<table>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>주소</th>
			<th>비고</th>
		</tr>    

    
    
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	
//	sql구문이 select문을 사용할 경우에는
	ResultSet rs = null;
	
	try{
//		데이터베이스 연결정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "ora_user";
		String pw = "1234";
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw); // 객체생성 . DB연결
		
		String sql = "SELECT * FROM USERINFO order by userid ";
		pstmt = conn.prepareStatement(sql);
		
		rs = pstmt.executeQuery(); // select문
		
		while(rs.next()){
			String userid = rs.getString("USERID");
			String passwd = rs.getString("PASSWD");
			String addr = rs.getString("ADDR");
			
%>
		<tr>
			<td><%=userid %></td>
			<td><%=passwd %></td>
			<td><%=addr %></td>
			<td><p><input type="button" value="삭제" onclick="fn_del('<%= userid %>')"></p></td>
		</tr>    
<%			
		}
		
	}catch(Exception ex) {
		ex.printStackTrace();
	}finally{
		if(rs != null) {try{ rs.close(); }catch(Exception ex){}}
		if(pstmt != null) {try{ pstmt.close(); }catch(Exception ex){}}
		if(conn != null)  {try{ pstmt.close(); }catch(Exception ex){}}
	}

%>


	</table>
</body>
</html>