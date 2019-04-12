<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>jstl/jstlTest3.jsp</title>
</head>
<body>
	<h3>★ JSTL 함수 ★</h3>
	<c:set var="txt" value="white space"></c:set>
	글자갯수 : ${f:length(txt) } <br>
	
	<c:set var="txt" value="${f:trim(txt) }"></c:set>
	글자갯수 : ${f:length(txt) }
	<hr>
	
	<c:set var="txt" value="Hi My name is waldo"></c:set>
	${f:substring(txt, 3, 9) }
	<hr>
	${f:substringAfter(txt, "Hi") }
	<hr>
	${f:substringBefore(txt, "waldo") }
	<hr>
	
	${f:startsWith("hello world!", "Id!")} <br>
	${f:endsWith("hello world!", "Id!")} <br>
	${f:indexOf("abcdefg", "f")} <br>
	${f:replace("hi hello", "hello", "hi")} <br>
	<hr>
	
	<!-- 엔터를 <br> 바꾸기 -->
<%
	// 1) JSP 
	String content = "";
	content.replace("\n", "<br>");
	
	// 2) EL + JSTL
	pageContext.setAttribute("cn", "\n");
%>
	<c:set var="content" value="Hi 
	My 
	name is waldo"></c:set>
	${f:replace(content, cn, "<br>") }
	<hr>
	
	<!-- String에서 XML, HTML의 < > & ' " 문자들을 각각 &lt; &gt; &amp; &#039; &#034;로 바꿔준 뒤 문자열을 리턴 -->
	<c:out value="${f:escapeXml('<>&')}"/>
</body>
</html>