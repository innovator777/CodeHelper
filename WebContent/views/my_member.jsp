<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>회원 마이페이지</title>
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
									<h4><B>${name } 회원님</B></h4><p><center>아이디 : ${id }<br><br>
									<Button type="button" onclick="location.href='${ctx}/memberModify.do?id=${id }'" formtarget="_self">회원정보 변경</Button>&nbsp&nbsp
									<Button type="button" onclick="location.href='${ctx}/bankList.do?id=${id }'" formtarget="_self">내 계좌</Button>&nbsp&nbsp
									<Button type="button" onclick="location.href='${ctx}/views/member_drop_password.jsp'" formtarget="_self">회원탈퇴</Button>
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
									<Button type="button" onclick="location.href='${ctx}/views/coin_charge.jsp'" formtarget="_self">충전</Button>&nbsp&nbsp
									<Button type="button" onclick="location.href='${ctx}/exchangeList.do'" formtarget="_self">환전</Button>&nbsp&nbsp
									<Button type="button" onclick="location.href='${ctx}/coinList.do?id=${id }'" formtarget="_self">조회</Button>
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
							<c:choose>
								<c:when test="${questions eq null || empty questions }">
									<tr>
										<td colspan="6" align="center">작성한 질문이 없습니다.</td>
									</tr>
								</c:when>
								<c:otherwise>
									<c:forEach items="${questions }" var="question" varStatus="sts">
										   <tr>
								               <td>${sts.count }</td>
								               <td><a href="questionCount.do?questionId=${question.id }">${question.title }</a></td>
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
								<th>질문제목</th>
								<th>추천수</th>
								<th>채택여부</th>
							</tr>
						</thead>
						<tbody>
							<c:choose>
								<c:when test="${answers eq null || empty answers }">
									<tr>
										<td colspan="6" align="center">작성한 답글이 없습니다.</td>
									</tr>
								</c:when>
								<c:otherwise>
									<c:forEach items="${answers }" var="answer" varStatus="sts">
										   <tr>
								               <td>${sts.count }</td>
								               <td><a href="questionCount.do?questionId=${answer.questionId }">${questionTitles[sts.index] }</a></td>
								               <td>${answer.likeCount }</td>
								               <td>
									               <c:choose>
											           <c:when test="${answer.isChoose eq 0 }">X</c:when>
											           <c:otherwise>O</c:otherwise>
										           </c:choose>
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