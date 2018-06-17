<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
	<meta charset="UTF-8">
	<title>코인 충전</title>
	<link href="${ctx }/resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="${ctx }/resources/css/style.css" rel="stylesheet">
	<style type="text/css">
	body{
		margin: 30px 250px 30px 250px;
	}
	</style>
</head>
<body>
	<p align="center"><a href="${ctx }"><font color=black size=100px>Code Helper</font></a></p>
	<br><br><br><br><br><br>
	<div align="center">
		<form action="${ctx}/charge.do" method="get">
			<input type="text" id="coinAmount" name="coinAmount">
			<input class="btn btn-success" type="submit" value="충전">
		</form>
	</div>
</body>
</html>