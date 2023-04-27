<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판 글쓰기</title>
</head>
<body>
	<%
		String sessionId = (String)session.getAttribute("sessionId");
		// null 값이면 toString()메소드 사용시 에러발생
		// null 값일 가능성일때 (String) 강제형변환 사용해야함
	
		if(sessionId == null) {
	%>	
		<script type="text/javascript">
			alert('로그인 한 회원만 글쓰기가 가능합니다');
			window.location.href='login';
		</script>	
	<%
		}	
	%>
</body>
</html>