<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>회원 마이페이지</title>
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
		<table width="1000">
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
									<h4><B>진강사 회원님</B></h4><p><center>아이디 : jin@gmail.com<br><br>
									<Button type="button" onclick="location.href='#'" formtarget="_self">회원정보 변경</Button>&nbsp&nbsp
									<Button type="button" onclick="location.href='#'" formtarget="_self">내 계좌</Button>&nbsp&nbsp
									<Button type="button" onclick="location.href='#'" formtarget="_self">회원탈퇴</Button>
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
									<h4><B>캐쉬 관리</B></h4><p><center>보유액 : 1000캐쉬<br><br>
									<Button type="button" onclick="location.href='#'" formtarget="_self">충전</Button>&nbsp&nbsp
									<Button type="button" onclick="location.href='#'" formtarget="_self">환전</Button>&nbsp&nbsp
									<Button type="button" onclick="location.href='#'" formtarget="_self">조회</Button>
									</center>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</thead>
		</table>
		</center><br><br><br>
		<center>
		<table width="1000">
			<tr>
				<td width="48%"><h4><B>질문</B></h4></td>
				<td width="4%"/>
				<td width="48%"><h4><B>답변</B></h4></td>
			</tr>
			<tr>
				<td>
					<table class="table table-hover table-condensed">
						<colgroup>
							<col width="10%">
							<col width="50%">
							<col width="20%">
							<col width="20%">
						</colgroup>
						<thead>
							<tr>
								<th>번호</th>
								<th>질문 제목</th>
								<th>답변수</th>
								<th>채택여부</th>
							</tr>
						</thead>
						<tbody>
							<tr>
				            	<td>1</td>
				                <td><a href="#">Java 소스코드 질문입니다.</a></td>
				                <td>9</td>
				                <td>완료</td>
				            </tr>
						</tbody>
					</table>
				</td>
				<td></td>
				<td>
					<table class="table table-hover table-condensed">
						<colgroup>
							<col width="10%">
							<col width="50%">
							<col width="20%">
							<col width="20%">
						</colgroup>
						<thead>
							<tr>
								<th>번호</th>
								<th>답변 제목</th>
								<th>추천수</th>
								<th>채택여부</th>
							</tr>
						</thead>
						<tbody>
							<tr>
				            	<td>1</td>
				                <td><a href="#">C언어 소스코드 질문입니다.</a></td>
				                <td>10</td>
				                <td>채택</td>
				            </tr>
						</tbody>
					</table>
				</td>
			</tr>
		</table>
		</center>
	</body>
</html>