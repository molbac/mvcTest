<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>el/elTest4.jsp</title>
</head>
<body>
	<h3>★ JSP와 EL의 값 공유 ★</h3>
	<!-- JSP와 EL변수는 서로 값을 공유할 수 없다 -->
	<%String uname = "솔데스크"; %>
	이름(JSP) : <%=uname %> <br>
	이름(EL)  : ${uname } <br>
	
	<!-- 동일한 페이지내에서 JSP와 EL이 서로 값을 공유하기 위해서는 pageContext Scope를 활용 -->
	<%pageContext.setAttribute("uid", "SOLDESK"); %>
	아이디(JSP) : <%=pageContext.getAttribute("uid") %> <br>
	아이디(EL)  : ${pageScope.uid } <br>
	아이디(EL)  : ${uid } <br>
</body>
</html>