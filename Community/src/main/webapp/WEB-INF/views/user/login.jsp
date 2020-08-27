<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<form action="/login" method="post">
		<div><input type="text" name="cid" placeholder="ID"></div>
		<div><input type="password" name="cpw" placeholder="PASSWORD"></div>
		<div><input type="submit" value="로그인"></div>
	</form>
	<div>
		<a href="/join">회원가입</a>
	</div>
	<div>
		<a href="/kakao/login">카카오톡 로그인</a>
	</div>
</body>
</html>