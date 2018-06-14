<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>계좌 등록</title>
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
		<table border="0" width="250">
			<colgroup>
				<col width="30%">
				<col width="70%">
			</colgroup>
			<tr>
				<th>은행명</th>
				<td>
					<input id="bankName"  name="bankName" type="text" value=""><p>
				</td>
			</tr>
			<tr>
				<th>계좌번호</th>
				<td>
					<input id="bankNum"  name="bankNum" type="text" value=""><p>
				</td>
			</tr>
			<tr>
				<th>예금주</th>
				<td>
					<input id="name"  name="name" type="text" value=""><p>
				</td>
			</tr>
		</table><br>
		<input class="btn" type="reset" value="취소"> <input class="btn btn-success" type="submit" value="등록">
	</form>
	<br>
	</div>
</body>
</html>
