<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>질문 목록</title>
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
	
	<br>
	<div align="center">
		<form action="#" method="post">
			<select name="searchType">
				<option value="empty" selected>선택하세요</option>
				<option value="title">제목</option>
				<option value="content">내용</option>
			</select>&nbsp;&nbsp;
			<input type="search" size="90" name="serchName" placeholder="검색">&nbsp;&nbsp;
			<input type="submit" value="검색">
		</form>
	</div>
	<br>
	<form>
		<input type="radio"name="newest" checked>최신순
		<input type="radio"name="check">조회순
		<input type="radio"name="answer">답변순
	</form>
	
	<table class="table table-hover table-condensed">
		<colgroup>
			<col width="5%">
			<col width="65%">
			<col width="10%">
			<col width="10%">
			<col width="10%">
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>조회수</th>
				<th>답변수</th>
				<th>채택</th>
			</tr>
		</thead>
		<tbody>
			<tr>
            	<td>1</td>
                <td><a href="#">자바소스코드 오류좀봐주세요</a></td>
                <td>90</td>
                <td>2</td>
                <td>X</td>                
            </tr>
		</tbody>
	</table>
	<p align="right"><a class="btn btn-sm btn-success" href="${ctx }/views/registerForm.jsp">질문작성</a></p>
</body>
</html>