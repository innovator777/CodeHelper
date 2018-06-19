<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>회원탈퇴 비밀번호 확인</title>
	<link href="${ctx }/resources/css/bootstrap.min.css" rel="stylesheet">
	<style type="text/css">
		body{
			margin: 30px 250px 30px 250px;
		}
	</style>
</head>

<body>
	<p align="center"><a href="${ctx }"><font color=black size=100px>Code Helper</font></a></p>
	<br><br><br><br><br><br>
	<center>
	<table>
		<tr>
			<td width="100"><h4>비밀번호</h4></td>
			<td>
				<form action="${ctx }/memberRemove.do" method="post">
					<input type="password" id="password" name="password" value="">
					<input class="btn" type="submit" value="탈퇴">
				</form>
			</td>
		</tr>
	</table>
	</center>
</body>
</html>