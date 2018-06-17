<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>질문 상세조회</title>
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
		<div align="right"><b>작성자 : 진권기 / 날짜 : 2017-05-08</b></div>
		<table class="table">
			<colgroup>
				<col width="150">
				<col width="*">
			</colgroup>
			<tr>
				<th>제목</th>
				<td><input id="lectureName" name="lectureName"
					class="form-control" type="text" value="${lecture.lectureName }"
					readonly></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea id="lectureIntroduce" name="lectureIntroduce"
						class="form-control" rows="10" readonly>${lecture.introduce }</textarea><br>
					<p align="right">
						<c:if test="${isLogged }">
							<c:choose>
							
								<c:when test="${loginId == question.memberId }">
									<Button class="btn" name="modifyQuestion" type="button" onclick="location.href='#'" formtarget="_self">수정</Button>
									<Button class="btn" name="deleteQuestion" type="button" onclick="location.href='#'" formtarget="_self">삭제</Button>
								</c:when>
								
								<c:when test="${loginId == isAdmin }"> <!-- 관리자일 때 확인하기 -->
									<Button class="btn" name="deleteQuestion" type="button" onclick="location.href='#'" formtarget="_self">삭제</Button>
								</c:when>
								
								<c:otherwise>
									<Button class="btn" name="reportQuestion" type="button" onclick="location.href='#'" formtarget="_self">신고</Button>
								</c:otherwise>
											
							</c:choose>
						</c:if>
					</p>
				</td>
			</tr>
		</table>
		<b>조회수 : 5</b>
		<br><br>
		<h4>답변 1개</h4>
		<form action="#" method="post">
		<table class="table">
			<colgroup>
				<col width="150">
				<col width="*">
			</colgroup>
			<tr>
				<td colspan="2" align="right"><b>작성자 : 고용석 / 날짜 : 2017-05-09</b></td>
			</tr>
			<tr>
				<td></td>
				<td><textarea id="lectureIntroduce" name="lectureIntroduce"
						class="form-control" rows="10" readonly>${lecture.introduce }</textarea><br>
					<p align="right">
						<c:if test="${isLogged }">
							<c:choose>
								<c:when test="${loginId == question.memberId }">
									<Button class="btn" name="choose" type="button" onclick="location.href='#'" formtarget="_self">채택</Button>
									<Button class="btn" name="reportAnswer" type="button" onclick="location.href='#'" formtarget="_self">신고</Button>
								</c:when>
								
								<c:when test="${isLogged }"> <!-- 조건문 : 답변작성자일 때로 수정해야함!! -->
									<Button class="btn" name="modifyAnswer" type="button" onclick="location.href='#'" formtarget="_self">수정</Button>
								</c:when>
								
								<c:when test="${loginId == isAdmin }">
									<Button class="btn" name="deleteAnswer" type="button" onclick="location.href='#'" formtarget="_self">삭제</Button>
								</c:when>
								
								<c:otherwise>
									<Button class="btn" name="reportAnswer" type="button" onclick="location.href='#'" formtarget="_self">신고</Button>
								</c:otherwise>
							</c:choose>
						</c:if>
					</p>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<textarea id="answerContents" name="answerContents" class="form-control" rows="10"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input class="btn btn-success" type="submit" value="작성">
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>
