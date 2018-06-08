<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>질문상세조회</title>
<link href="${ctx }/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctx }/resources/css/style.css" rel="stylesheet">
</head>
<body>
	<center><a href="#"><font color=black size=100px>Code Helper</font></a></center>
	<div align="right">
				<%@ include file="header.jspf" %>
				</div>
	<table class="table">
		<colgroup>
			<col width="150">
			<col width="*">
		</colgroup>
		<div align="right"><b>작성자 : 진권기 날짜 : 2017-05-08</b></div>
		<tr>
			<th>제목</th>
			<td><input id="lectureName" name="lectureName"
				class="form-control" type="text" value="${lecture.lectureName }"
				readonly></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea id="lectureIntroduce" name="lectureIntroduce"
					class="form-control" rows="10" readonly>${lecture.introduce }</textarea></td>
		</tr>
	</table>
	<b>조회수 : 5</b>
	<table class="table">
		<colgroup>
			<col width="150">
			<col width="*">
		</colgroup>
		<div align="right"><b>작성자 : 고용석 날짜 : 2017-05-09</b></div>
		<tr>
			<th>내용</th>
			<td><textarea id="lectureIntroduce" name="lectureIntroduce"
					class="form-control" rows="20" readonly>${lecture.introduce }</textarea></td>
		</tr>
	</table>
	<b>♡ : 3</b>
	<br>
</body>
</html>
