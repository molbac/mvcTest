<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>jstl/jstlTest2.jsp</title>
</head>
<body>
	<h3>★ 결과 페이지(JSP) ★</h3>
<%
	// 1) 이름,나이를 변수에 대입 후 출력
	
	// 2) 나이가 10미만 "어린이"
	//		   20미만 "청소년"
	//		    나머지 "성인" 출력
	
	// 3) 1 ~ 나이까지 홀수는 빨강, 짝수는 파랑
%>
	이름 : <%=request.getParameter("name") %><br>
	나이 : <%=request.getParameter("age") %>
	<%int age = Integer.parseInt(request.getParameter("age"));%>
	<%
	if(Integer.parseInt(request.getParameter("age"))%2==0) {
	%>
	나이 :<font color = "blue" size="10"><%=request.getParameter("age") %></font><br>
	<% 	
	} else {
	%>
	나이 :<font color = "red" size="10"><%=request.getParameter("age") %></font><br>
	<% 
	}
	%>
	<% 
	if(Integer.parseInt(request.getParameter("age"))<10) {
		out.println("어린이");
	} else if(Integer.parseInt(request.getParameter("age"))<20) {
		out.println("청소년");
	} else {
		out.println("성인");
	}
	%>
	<% 
	for(int a=1; a<=age; a++) {
		if(a%2==1) {
		out.println("<span style='color:red'>"+a+"</span>");
		} else {
		out.println("<span style='color:blue'>"+a+"</span>");
		}
	}
	%>
</body>
</html>