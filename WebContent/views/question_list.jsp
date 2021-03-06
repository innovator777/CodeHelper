<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
	<p align="center"><a href="${ctx }"><font color=black size=100px>Code Helper</font></a></p>
	
	<div align="right">
		<%@ include file="header.jspf" %>
	</div>
	
	<br>
	<div align="center">
		<form action="${ctx }/questionSearch.do" method="post">
			<select name="searchType">
				<option value="0" selected>선택하세요</option>
				<option value="1">제목</option>
				<option value="2">내용</option>
			</select>&nbsp;&nbsp;
			<input type="search" size="90" name="searchEdit" placeholder="검색">&nbsp;&nbsp;
			<input type="submit" value="검색">
		</form>
	</div>
	<br>
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
			<c:choose>
				<c:when test="${questionList eq null || empty questionList}">
					<tr>
						<td colspan="5" align="center">질문 목록이 없습니다.</td>
					</tr>
				</c:when>
				
				<c:otherwise>
					<c:forEach items="${questionList }" var="question" varStatus="sts">
						<tr>
			            	<td>${sts.count }</td>
			                <td><a href="questionCount.do?questionId=${question.id }">${question.title }</a></td>
			                <td>${question.readCount }</td>
			                <td>${fn:length(question.answers) }</td>
			                <td>
			                	<c:choose>
			                		<c:when test="${question.isChoose eq 0 }">X</c:when>
			                		<c:otherwise>O</c:otherwise>
			                	</c:choose>
			                </td>
			            </tr>
		            </c:forEach>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
	<p align="right">
		<c:if test="${isLogged && isAdmin eq false}">
			<a class="btn btn-sm btn-success" href="${ctx }/views/question_register.jsp">질문작성</a>
		</c:if>
	</p>
</body>
</html>