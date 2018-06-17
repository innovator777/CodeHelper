<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>가상머니 내역조회</title>
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
		<div align="left"><p><strong><h4>보유액 : ${balance }캐쉬</h4></strong></p></div>
		<br>
		<table class="table table-hover table-condensed">
			<colgroup>
				<col width="10%">
				<col width="20%">
				<col width="20%">
				<col width="50%">
			</colgroup>
			<thead>
				<tr>
					<th>분류</th>
					<th>금액</th>
					<th>보유액</th>
					<th>질문 제목</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
				<c:when test="${coins eq null || empty coins }">
					<tr>
						<td colspan="6" align="center">등록된 내용이 없습니다.</td>
					</tr>
				</c:when>
					<c:otherwise>
						<c:forEach items="${coins }" var="coin" varStatus="sts">
							<tr>
				            	<td>${coin.type }</td>
				                <td>${coin.amount }</td>
				                <td>${coin.balance }</td>
				                <c:choose>
									<c:when test="${coin.questionId eq 0}">
				                		<td>-</td>   
				                	</c:when>
				                	<c:otherwise>
				                		<td>${questionTitles[sts.index] }</td>
				                	</c:otherwise>
				                </c:choose>
				            </tr>
						</c:forEach>
					</c:otherwise>
	        </c:choose>
			</tbody>
		</table>
	</body>
</html>