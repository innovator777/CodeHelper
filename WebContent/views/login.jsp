<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>로그인</title>
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="resources/css/style.css" rel="stylesheet">
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
		<table border="0" width="500" height="100">
			<colgroup>
				<col width="20%">
				<col width="60%">
				<col width="20%">
			</colgroup>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="loginId" class="form-control"></td>
				<td rowspan="2">
					<p align="center"><input class="btn btn-success" type="submit" value="로그인"></p>
				</td>
			</tr>
			<tr>
				<th>패스워드</th>
				<td><input type="password" name="password" class="form-control"></td>
			</tr>
		</table>
	</form>
	<br>
	</div>
	<div align="center"><a href="#">회원가입</a></div>
</body>
</html>