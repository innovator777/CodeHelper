<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>관리자 마이페이지</title>
		<link href="${ctx }/resources/css/bootstrap.min.css" rel="stylesheet">
		<link href="${ctx }/resources/css/style.css" rel="stylesheet">
		<style type="text/css">
		.header {
			margin-right: 200px;
		}
		</style>
	</head>
	<body>
		<br><br>
		<p align="center"><font color=black size=100px>Code Helper</font></p>
		<div class="header" align="right">
		<%@ include file="header.jspf" %>
		</div>
		<br>
		<center>
		<table width="950">
			<colgroup>
				<col width="48%">
				<col width="4%">
				<col width="48%">
			</colgroup>
			<thead>
				<tr>
					<td>
						<table class="table table-hover table-condensed">
							<tr>
								<td>
									<h4><B>양종찬 관리자님</B></h4><p><center>아이디 : yang@gmail.com<br><br>
									<Button name="modifyAInfo" type="button" onclick="location.href='#'" formtarget="_self">회원정보 변경</Button>
									</center>
								</td>
							</tr>
						</table>
					</td>
					<td></td>
					<td>
						<table class="table table-hover table-condensed">
							<tr>
								<td>
									<h4><B>캐쉬 관리</B></h4><p><center>보유액 : 99999999캐쉬<br><br>
									<Button name="changeMInfo" type="button" onclick="location.href='#'" formtarget="_self">조회</Button>
									</center>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</thead>
		</table><br><br><br>
		<table width="950">
			<tr>
				<td><h4><B>신고</B></h4></td>
			</tr>
			<tr>
				<td>
					<table class="table table-hover table-condensed">
						<colgroup>
							<col width="5%">
							<col width="35%">
							<col width="10%">
							<col width="10%">
							<col width="10%">
							<col width="10%">
							<col width="10%">
							<col width="10%">
						</colgroup>
						<thead>
							<tr>
								<th>번호</th>
								<th>신고사유</th>
								<th>신고자</th>
								<th>가해자</th>
								<th>질문번호</th>
								<th>답변번호</th>
								<th>날짜</th>
								<th>확인</th>
							</tr>
						</thead>
						<tbody>
							<tr>
				            	<td>1</td>
				                <td>광고성 글입니다.</td>
				                <td>고용석</td>
				                <td>조혜인</td>
				                <td>238</td>
				                <td>3</td>
				                <td>2018-01-01</td>
				                <td>○</td>
				            </tr>
						</tbody>
					</table>
				</td>
			</tr>
		</table>
		</center>	
	</body>
</html>