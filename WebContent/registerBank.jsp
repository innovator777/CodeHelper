<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>계좌 등록</title>
</head>
<body>
	<div align="center"><h1>Code Helper</h1></div>
	
	<div align="center">
	<br>
	<form action="#" method="post">
		<table class="table">
			<tr>
				<th><div align="left">은행명</div></th>
				<td>
				<input id="bank"  name="bank" type="text" value="">
				</td>
			</tr>
			<tr>
				<th><div align="left">계좌번호</div></th>
				<td>
				<input id="bankNum"  name="bankNum" type="text" value="">
				</td>
			</tr>
			<tr>
				<th><div align="left">예금주</div></th>
				<td>
				<input id="name"  name="name" type="text" value="">
				</td>
			</tr>
		</table><br>
		<div align="center"><input type="reset" value="취소"> <input type="submit" value="등록"></div>
	</form>
	<br>
	</div>
</body>
</html>
