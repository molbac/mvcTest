<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>jstl/jstlTest2.jsp</title>
</head>
<body>
	<h3>★ JSTL 제어문 연습 ★</h3>
	<!-- 1) JSP
	<form action="jstlTest2ok.jsp"> -->
	<!-- 2) EL+JSTL -->
	<form action="jstlTest2yes.jsp">
	이름 : <input type="text" name="name"> <br>
	나이 : <input type="text" name="age"> <br>
	<input type="submit" value="확인">
	</form>
</body>
</html>