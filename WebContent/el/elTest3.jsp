<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>el/elTest3.jsp</title>
</head>
<body>
	<h1>★★★★★중요★★★★★</h1>
	<h3>★ EL 내장객체 (Collection) ★</h3>
<% 
	// SCOPE	
	// 프로젝트에서 페이지간에 서로 공유할 수 있는 영역
	// pageContext, request, session, application
	pageContext.setAttribute("kor", 100);
	request.setAttribute("eng", 200);
	session.setAttribute("mat", 300);
	application.setAttribute("aver", 400);
%>	
	1) page 영역 <br>
	JSP : <%=pageContext.getAttribute("kor") %>
	EL  : ${pageScope.kor }
	<hr>
	
	2) request 영역 <br>
	JSP : <%=request.getAttribute("eng") %>
	EL  : ${requestScope.eng }
	<hr>
	
	3) session 영역 <br>
	JSP : <%=session.getAttribute("mat") %>
	EL  : ${sessionScope.mat }
	<hr>
	
	4) application 영역 <br>
	JSP : <%=application.getAttribute("aver") %>
	EL  : ${applicationScope.aver }
	<hr>
	
	<!-- EL에서는 Scope이름을 생략할 수 있다 -->
	<!-- page -> request -> session -> applicatioin 순으로 검색 -->
	kor : ${kor }<br>
	eng : ${eng }<br>
	mat : ${mat }<br>
	aver : ${aver }<br> 
	<hr>
	
	<!-- 
		※ EL에서는 Scope명을 생략할 수 있다 
		${sessionScope.id}를 {id}라고 접근가능
		scope명이 생략되면 자동으로 작은 영역순으로 
		page에서 id를 찾고, 없으면
		request에서 id를 찾고, 없으면
		session에서 id를 찾고, 없으면
		application 순으로 찾는다
	-->
<%
	pageContext.setAttribute("num", 500);
	request.setAttribute("num", 600);
	session.setAttribute("num", 700);
	application.setAttribute("num", 800);
%>
	num : ${num } <!-- 500 -->
	<hr>
	uname : ${uname } <!-- 해당변수가 없을때 빈값 -->
</body>
</html>