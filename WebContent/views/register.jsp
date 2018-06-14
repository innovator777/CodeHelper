<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>회원가입</title>
	<link href="${ctx }/resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="${ctx }/resources/css/style.css" rel="stylesheet">
	<style type="text/css">
	body{
		margin: 30px 250px 30px 250px;
	}
	</style>
</head>
<body>
	<p align="center"><font color=black size=100px>Code Helper</font></p>
	<div align="center">
	<br><br>
	<form action="#" method="post">
		<table border="0" width="500" height="200">
			<colgroup>
				<col width="25%">
				<col width="70%">
				<col width="5%">
			</colgroup>
			<tr>
				<th align="right">아이디</th>
				<td>
					<input type="text" name="loginId"> @ 
					<select name="email">
						<option value="empty" selected>이메일 주소</option>
						<option value="google.com">google.com</option>
						<option value="namer.com">naver.com</option>
					</select>
				</td>
				<td><input class="btn" type="button" value="중복확인"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input id="password" name="password1" type="password" value=""></td>
				<td></td>
			</tr>
			<tr>
				<th>비밀번호 확인</th>
				<td><input id="password" name="password2" type="password" value=""></td>
				<td></td>
			</tr>
			<tr>
				<th>닉네임</th>
				<td>
					<input id="nickname" name="nickname" type="text" value=""> 
					<input class="btn" type="button" value="중복확인">
				</td>
				<td></td>
			</tr>
		</table>
		<br><br>
		<div align="center"><input class="btn" type="reset" value="취소"> <input class="btn btn-success" type="submit" value="회원가입"></div>
	</form>
	<br>
	</div>
</body>
</html>
