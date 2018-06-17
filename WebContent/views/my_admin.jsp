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
									<h4><B>${name } 관리자님</B></h4><p><center>아이디 : ${id }<br><br>
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
									<h4><B>캐쉬 관리</B></h4><p><center>보유액 : ${balance }캐쉬<br><br>
									</center>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</thead>
		</table><br><br><br>
		<table width="1000">
			<tr>
				<td><h4><B>신고</B></h4></td>
			</tr>
			<tr>
				<td>
					<table class="table table-hover table-condensed">
						<colgroup>
							<col width="5%">
							<col width="25%">
							<col width="10%">
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
								<th colspan="2">확인</th>
							</tr>
						</thead>
						<tbody>
							<c:choose>
								<c:when test="${reports eq null || empty reports }">
									<tr>
										<td colspan="6" align="center">신고 내역이 없습니다.</td>
									</tr>
								</c:when>
								<c:otherwise>
									<c:forEach items="${reports }" var="report" varStatus="sts">
										   <tr>
								               <td>${sts.count }</td>
								               <td>
								               <c:choose>
									                <c:when test="${report.contents eq 'A' }">광고성 글입니다.</c:when>
													<c:when test="${report.contents eq 'B' }">관련없는 글입니다.</c:when>
													<c:when test="${report.contents eq 'C' }">욕설 및 비방글입니다.</c:when>
												</c:choose>
								               </td>
								               <td>${reporters[sts.index] }</td>
								               <td>${attackers[sts.index] }</td>
								               <td><a href="questionCount.do?questionId=${report.questionId }">${report.questionId }</a></td>
								               <td>${report.answerId }</td>
								               <td>${report.createDate }</td>
								               <td>
									               <c:choose>
										             <c:when test="${report.checked eq 0 }">X</c:when>
										             <c:otherwise>O</c:otherwise>
										           </c:choose>
								               </td> 
								               <td>
								               		<c:if test="${report.checked eq 0 }">
								               			<Button class="btn" name="check" type="button" onclick="location.href='#'" formtarget="_self">확인</Button>
								               		</c:if>
								               </td>
								           </tr>
									</c:forEach>
								</c:otherwise>
					        </c:choose>
						</tbody>
					</table>
				</td>
			</tr>
		</table>
		</center>	
	</body>
</html>