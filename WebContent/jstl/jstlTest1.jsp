<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>jstl/jstlTest1.jsp</title>
</head>
<body>
	<h3>★ JSTL (JSP 전용 태그) ★</h3>
	1) JSP 변수 선언 <br>
	<%int a=3; %>
	a : <%=a %>
	<hr>
	
	2) JSTL 변수 선언 <br>
	<c:set var="b" value="5"></c:set>
	<c:set var="c">7</c:set>
	b : ${b } <br>
	c : ${c } <br>
	b+c : ${b+c } <br>
	<hr>
	<c:out value="2"></c:out> <br>
	<c:out value="${b }"></c:out> <br>
	<c:out value="${c }"></c:out> <br>
	<c:out value="${b+c }"></c:out> <br>
	<hr>
	
	<c:set var="dt" value="<%=new Date() %>"></c:set>
	오늘날짜 : ${dt } <br>
	오늘날짜 : <c:out value="${dt }"></c:out>
	<hr>
	
	3) b,c 변수 제거 <br>
	<c:remove var="b"/>
	<c:remove var="c"/>
	b + c : ${b+c } <!-- 0 -->
</body>
</html>