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
		<div align="left"><p><strong><h4>보유액 : 1000캐쉬</h4></strong></p></div>
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
					<th>질문제목</th>
				</tr>
			</thead>
			<tbody>
				<tr>
	            	<td>질문</td>
	                <td>-1000</td>
	                <td>1000</td>
	                <td><a href="#">java소스코드 질문</a></td>            
	            </tr>
	            <tr>
	            	<td>환전</td>
	                <td>-10000</td>
	                <td>2000</td>
	                <td><div align="center">-</div></td>            
	            </tr>
	            <tr>
	            	<td>충전</td>
	                <td>10000</td>
	                <td>12000</td>
	                <td><div align="center">-</div></td>            
	            </tr>
	            <tr>
	            	<td>답변</td>
	                <td>1000</td>
	                <td>2000</td>
	                <td><a href="#">c++ 좀 도와주세요</a></td>            
	            </tr>
			</tbody>
		</table>
	</body>
</html>