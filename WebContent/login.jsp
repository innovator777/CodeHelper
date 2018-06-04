<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<style type="text/css">
body {
	padding : 10% 10%;
}
</style>
</head>
<body>
	<div align="center"><h1>Code Helper</h1></div>
	
	<div align="center">
	<br>
	<form action="#" method="post">
		<table class="table">
			<tr>
				<th><div align="left">아이디</div></th>
				<td><input id="loginId"  name="loginId" class="form-control" type="text" value=""></td>
			</tr>
			<tr>
				<th><div align="left">패스워드</div></th>
				<td><input id="password" name="password" class="form-control" type="password" value=""></td>
			</tr>
		</table><br>
	</form>
	<br>
	</div>
	<div align="center"><input class="btn" type="reset" value="취소"> <input class="btn btn-success" type="submit" value="로그인"></div>
	<div align="center"><a href="#">회원가입</a></div>
</body>
</html>
