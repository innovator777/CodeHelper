<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>가상머니 환전</title>
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
		<%@include file="header.jspf" %>
	</div>
	<br>
	<div align="center">
		<b>보유액 : 1000캐쉬<p>
		<form action="#" method="get">
			환전할 캐쉬 : <input type="text" name="cash" placeholder="금액입력"> 캐쉬
			<br><br>지급될 금액 : 900원(수수료 10%)<br><br></b>
			<table class="table table-hover table-condensed">
				<colgroup>
					<col width="10%">
					<col width="20%">
					<col width="40%">
					<col width="20%">
					<col width="10%">
				</colgroup>
				<thead>
					<tr>
						<th>번호</th>
						<th>은행명</th>
						<th>계좌번호</th>
						<th>예금주</th>
						<th>계좌선택</th>
					</tr>
				</thead>
				<tbody>
					<tr>
		                <td>1</td>
		                <td>국민은행</td>
		                <td>01011111111</td>
		                <td>진권기</td>
		                <td><input type="radio"name="check1" checked></td>            
		            </tr>
		            <tr>
		                <td>2</td>
		                <td>기업은행</td>
		                <td>112999999999</td>
		                <td>진권기</td>
		                <td><input type="radio"name="check2"></td>
		            </tr>
				</tbody>
			</table>
			<input class="btn btn-success" type="submit" value="환전">
		</form>
	</div>	
</body>
</html>