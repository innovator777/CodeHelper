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
				<th>아이디</th>
				<td>
				<input id="loginId"  name="loginId" class="form-control" type="text" value="">@
				<select name="emailType">
				<option value="empty">이메일 주소</option>
				<option value="google.com">google.com</option>
				<option value="naver.com">naver.com</option>
				</select>
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input id="password" name="password1" class="form-control" type="password" value=""></td>
			</tr>
			<tr>
				<th>비밀번호확인</th>
				<td><input id="password" name="password2" class="form-control" type="password" value=""></td>
			</tr>
			<tr>
				<th>닉네임</th>
				<td><input id="name" name="name" class="form-control" type="text" value=""></td>
			</tr>
		</table><br>
		<div align="center"><input class="btn" type="reset" value="취소"> <input class="btn btn-success" type="submit" value="회원가입"></div>
	</form>
	<br>
	</div>
</body>
</html>
