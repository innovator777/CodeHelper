<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>회원 정보 변경</title>
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
	<br><br><br><br>
	<div align="center">
	<br>
	<form action="#" method="post">
		<table border="0" width="500" height="150">
			<colgroup>
				<col width="20%">
				<col width="60%">
				<col width="20%">
			</colgroup>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="password1" class="form-control"></td>
				<td></td>
			</tr>
			<tr>
				<th>비밀번호 확인</th>
				<td><input type="password" name="password2" class="form-control"></td>
				<td></td>
			</tr>
			<tr>
				<th>닉네임</th>
				<td><input type="text" name="nickname" class="form-control"></td>
				<td><center><input type="button" class="btn" value="중복확인"></center></td>
			</tr>
		</table>
		<br>
		<div align="center"><input class="btn btn-success" type="submit" value="확인"></div>
	</form>
	<br>
	</div>
</body>
</html>