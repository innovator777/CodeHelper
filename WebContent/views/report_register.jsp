<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
	<meta charset="UTF-8">
	<title>신고</title>
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
	<br><br><br><br><br><br>
	<div align="center">
		<form action="#" method="post">
			<select name="report">
				<option value="0" selected>선택하세요</option>
				<option value="1">광고성 글입니다.</option>
				<option value="2">관련없는 글입니다.</option>
				<option value="3">욕설 및 비방글입니다.</option>
			</select>
			<input class="btn btn-success" type="submit" value="신고">
		</form>
	</div>
</body>
</html>