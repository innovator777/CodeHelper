<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
	<meta charset="UTF-8">
	<title>답변 수정</title>
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
	<div align="right">
			<%@ include file="header.jspf" %>
	</div>
	<br><br><br><br>
	<div align="center">
		<form action="#" method="post">
			<input id="answerId" name="answerId" type="hidden" value="">
			<table border="0">
				<colgroup>
					<col width="10%">
					<col width="*">
				</colgroup>
				<tr height="100">
					<th>내용</th>
					<td>
						<textarea id="contents" name="contents" class="form-control" rows="18" cols="80"></textarea>
					</td>
				</tr>
				<tr height="50">
					<td colspan="2" align="right">
						<input class="btn btn-success" type="submit" value="작성">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>