<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
	<div align="center"><h1>Code Helper</h1></div>
	
	<div align="center">
	<br>
	<form action="#" method="post">
		<table class="table">
			<tr>
				<th><div align="left">아이디</div></th>
				<td>
				<input id="loginId"  name="loginId" type="text" value="">@
				<select name="emailType">
				<option value="empty">이메일 주소</option>
				<option value="google.com">google.com</option>
				<option value="naver.com">naver.com</option>
				</select>
				<input class="btn btn-success" type="submit" value="중복확인">
				</td>
			</tr>
			<tr>
				<th><div align="left">비밀번호</div></th>
				<td><input id="password" name="password1" type="password" value=""></td>
			</tr>
			<tr>
				<th><div align="left">비밀번호확인</div></th>
				<td><input id="password" name="password2" type="password" value=""></td>
			</tr>
			<tr>
				<th><div align="left">닉네임</div></th>
				<td><input id="name" name="name" type="text" value=""><input class="btn btn-success" type="submit" value="중복확인"></td>
			</tr>
		</table><br>
		<div align="center"><input type="reset" value="취소"> <input type="submit" value="회원가입"></div>
	</form>
	<br>
	</div>
</body>
</html>
