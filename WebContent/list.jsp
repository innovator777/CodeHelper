<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>강좌목록</title>
<link href="${ctx }/views/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctx }/views/resources/css/style.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<p align="center"><font color=black size=100px>Code Helper</font></p>
				
				<div align="right">
				<%@ include file="header.jspf" %>
				</div>
				
				<form action="#" method="post">
				<select name="searchType">
				<option value="empty">선택하세요</option>
				<option value="title">제목</option>
				<option value="content">내용</option>
				</select>
				<input type="search" size="180" name="serchName" placeholder="검색"><input type="submit" value="검색">
				</form>
				
				<input type="radio"name="newest">최신순
				<input type="radio"name="check">조회순
				<input type="radio"name="answer">답변순

				<table class="table table-hover table-condensed">
					<colgroup>
						<col width="5%">
						<col width="80%">
						<col width="5%">
						<col width="5%">
						<col width="5%">
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
				<a class="btn btn-sm btn-success" href="${ctx }/views/registerForm.jsp">질문작성</a>
			</div>
		</div>
	</div>
</body>
</html>