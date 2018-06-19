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
	<p align="center"><a href="${ctx }"><font color=black size=100px>Code Helper</font></a></p>
	<div align="right">
		<%@include file="header.jspf" %>
	</div>
	<br>
	<div align="center">
		<b>보유액 : ${balance }캐쉬<p>
		<form action="${ctx}/exchange.do" method="get">
			환전할 캐쉬 : <input type="text" name="cash" placeholder="금액입력"> 캐쉬
			<br><br>지급될 금액은 수수료 10%가 차감 됩니다.<br><br></b>
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
					<c:choose>
						<c:when test="${banks eq null || empty banks }">
							<tr>
								<td colspan="6" align="center">등록된 계좌가 없습니다.</td>
							</tr>
					</c:when>
						<c:otherwise>
							<c:forEach items="${banks }" var="banks" varStatus="sts">
								<tr>
				            		<td>${banks.id }</td>
				              	  	<td>${banks.name }</td>
				            	    <td>${banks.accountNumber }</td>
				             	   <td>${banks.accountHolder }</td>     
				             	   <td><input class="btn btn-success" type="submit" value="환전"></td>       
				           	 </tr>
							</c:forEach>
						</c:otherwise>
	       			 </c:choose>
				</tbody>
			</table>
		</form>
	</div>	
</body>
</html>