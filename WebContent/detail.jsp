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
	<input id="lectureId" name="lectureId" type="hidden"
		value="${lecture.id}">
	<a href="${ctx }">강좌목록</a>
	<center><a href="#"><font color=black size=100px>Code Helper</font></a></center>
	<div align="right">
				<%@ include file="header.jspf" %>
				</div>
	<table class="table">
		<colgroup>
			<col width="150">
			<col width="*">
		</colgroup>
		<tr>
			<div align="right"><p><strong>작성자 : </strong>진권기 <strong>날짜 : </strong>2017-05-08</p></div>
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
	<table class="table">
		<colgroup>
			<col width="150">
			<col width="*">
		</colgroup>
		<tr>
			<th>내용</th>
			<td><textarea id="lectureIntroduce" name="lectureIntroduce"
					class="form-control" rows="20" readonly>${lecture.introduce }</textarea></td>
		</tr>
	</table>
	<br>

</body>
</html>
