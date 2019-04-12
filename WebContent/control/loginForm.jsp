<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>loginForm.jsp</title>
</head>
<body>
	<h3>★ 회원 로그인 ★</h3>
	<form method = "post" action="loginproc.do">
	아이디 : <input type = "text" name = "uid"> <br>
	비밀번호 : <input type = "password" name = "upw"> <br>
	<input type = "submit" value = "확인">
	</form>
</body>
</html>