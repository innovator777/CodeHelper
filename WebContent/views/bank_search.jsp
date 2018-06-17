<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>계좌 조회</title>
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
	<br><br>
	<div align="left">
		<Button type="button" onclick="location.href='${ctx}/views/bank_register.jsp?memberId=${member.id }'" formtarget="_self">등록</Button>
	</div><br>
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
				<th>삭제</th>
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
				               <td><Button type="button" onclick="location.href='${ctx}/bankRemove.do?bankId=${banks.id }'" formtarget="_self">삭제</Button></td>       
				           </tr>
					</c:forEach>
				</c:otherwise>
	        </c:choose>
		</tbody>
	</table>
</body>
</html>