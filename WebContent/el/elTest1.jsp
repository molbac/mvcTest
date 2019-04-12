<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>el/elTest1.jsp</title>
</head>
<body>
	<h3>★ EL (Expression Language) 표현언어 ★</h3>
	123+456<hr>
	표현식 : <%=123 %><hr>
	표현식 : <%=123+456 %><hr>
	표현언어 : ${123 }<hr>
	표현언어 : ${123+456 }<hr>
	
	<h3>★ EL에서 사용되는 연산자 ★</h3>
	더하기 : ${123+456 }<hr>
	빼기 : ${123-456 }<hr>
	곱하기 : ${123*456 }<hr>
	나누기 : ${123/456 }<hr>
	<%-- 나누기 : ${5 div 6 }<hr>
	나머지 : ${6 mod 5 }<hr> --%>
	나머지 : ${6 % 5 }<hr>
	
	2가 3보다 작다 : ${2 < 3 }<hr>
	2가 3보다 크다 : ${2 > 3 }<hr>
	2가 3보다 작다 : ${2 lt 3 }<hr>
	2가 3보다 크다 : ${2 gt 3 }<hr> 
	
	삼항연산자 : ${(5>3) ? "맞아" : "틀려" }<hr>
	HOST : ${header["host"] }<hr>
	<%=request.getContextPath() %>
</body>
</html>