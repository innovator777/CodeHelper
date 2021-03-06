<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
		<p align="center"><a href="${ctx }"><font color=black size=100px>Code Helper</font></a></p>
		<div align="right">
			<%@ include file="header.jspf" %>
		</div>
		<br>
		<div align="right"><b>작성자 : ${question.memberId } / 날짜 : ${question.createdDate }</b></div>
		<table class="table">
			<colgroup>
				<col width="150">
				<col width="*">
			</colgroup>
			<tr>
				<th>제목</th>
				<td><input id="questionTitle" name="questionTitle"
					class="form-control" type="text" value="${question.title }"
					readonly></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea id="questionContents" name="questionContents"
						class="form-control" rows="10" readonly>${question.contents }</textarea><br>
					<p align="right">
						<c:choose>
							<c:when test="${isLogged && question.isChoose eq 0 }">
								<c:choose>
								
									<c:when test="${loginId == question.memberId }">
										<Button class="btn" name="modifyQuestion" type="button" onclick="location.href='${ctx}/questionModify.do?questionId=${question.id }'" formtarget="_self">수정</Button>
									</c:when>
									
									<c:when test="${isAdmin eq false }">
										<Button class="btn" name="reportQuestion" type="button" onclick="location.href='${ctx}/reportSendInfo.do?questionId=${question.id }&attacker=${question.memberId }'" formtarget="_self">신고</Button>
									</c:when>
												
								</c:choose>
							</c:when>
							
							<c:when test="${isLogged && question.isChoose ne 0}">
								<B>채택완료</B>
								<c:if test="${loginId == question.memberId}">
									<Button class="btn" name="deleteQuestion" type="button" onclick="location.href='${ctx}/questionRemove.do?questionId=${question.id }'" formtarget="_self">삭제</Button>
								</c:if>
							</c:when>
							<c:otherwise></c:otherwise>
						</c:choose>
						<c:if test="${isLogged && isAdmin }">
							<Button class="btn" name="deleteQuestion" type="button" onclick="location.href='${ctx}/questionRemove.do?questionId=${question.id }'" formtarget="_self">삭제</Button>
						</c:if>
					</p>
				</td>
			</tr>
		</table>
		<b>조회수 : ${question.readCount }</b>
		<br><br>
		<h4>답변 ${fn:length(question.answers) }개</h4>
		<form action="${ctx }/answerAdd.do" method="post">
		<input id="questionId" name="questionId" type="hidden" value="${question.id }">
		<table class="table">
			<colgroup>
				<col width="150">
				<col width="*">
			</colgroup>
			<c:forEach items="${question.answers }" var="answer">
			<tr>
				<td colspan="2" align="right"><b>작성자 : ${answer.memberId } / 날짜 : ${answer.createdDate }</b></td>
			</tr>
			<tr>
				<td></td>
				<td><textarea id="answerContents" name="answerContents"
						class="form-control" rows="10" readonly>${answer.contents }</textarea><br>
					<p align="right">
						<c:choose>
							<c:when test="${isLogged && question.isChoose eq 0 }">
								<c:choose>
									<c:when test="${loginId == question.memberId}">
										<Button class="btn" name="choose" type="button" onclick="location.href='${ctx}/choose.do?questionId=${question.id }&answerId=${answer.id }'" formtarget="_self">채택</Button>
										<Button class="btn" name="reportAnswer" type="button" onclick="location.href='${ctx}/reportSendInfo.do?questionId=${question.id }&answerId=${answer.id }&attacker=${question.memberId }'" formtarget="_self">신고</Button>
									</c:when>
									
									<c:when test="${loginId == answer.memberId }">
										<Button class="btn" name="modifyAnswer" type="button" onclick="location.href='${ctx}/answerModify.do?questionId=${question.id }&answerId=${answer.id }'" formtarget="_self">수정</Button>
										<Button class="btn" name="deleteAnswer" type="button" onclick="location.href='${ctx}/answerRemove.do?questionId=${question.id }&answerId=${answer.id }'" formtarget="_self">삭제</Button>
									</c:when>

									<c:when test="${isAdmin eq false }">
										<Button class="btn" name="reportAnswer" type="button" onclick="location.href='${ctx}/reportSendInfo.do?questionId=${question.id }&answerId=${answer.id }&attacker=${question.memberId }'" formtarget="_self">신고</Button>
									</c:when>
								</c:choose>
							</c:when>
							
							<c:when test="${isLogged && answer.isChoose ne 0 }">
								<B>채택됨</B>
								<c:if test="${loginId == answer.memberId}">
									<Button class="btn" name="deleteQuestion" type="button" onclick="location.href='${ctx}/questionRemove.do?questionId=${question.id }'" formtarget="_self">삭제</Button>
								</c:if>
							</c:when>

							<c:otherwise></c:otherwise>
						</c:choose>

						<c:if test="${isLogged && isAdmin }">
							<Button class="btn" name="deleteAnswer" type="button" onclick="location.href='${ctx}/answerRemove.do?questionId=${question.id }&answerId=${answer.id }'" formtarget="_self">삭제</Button>
						</c:if>
						
						<Button class="btn" name="likedAnswer" type="button" onclick="location.href='${ctx}/liked.do?questionId=${question.id }&answerId=${answer.id }'" formtarget="_self">♡ : ${answer.likeCount }</Button>
					</p>
				</td>
			</tr>
			</c:forEach>
			<c:if test="${isLogged && isAdmin eq false && loginId ne question.memberId}">
			<tr>
				<td></td>
				<td>
					<textarea id="contents" name="contents" class="form-control" rows="10"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input class="btn btn-success" type="submit" value="작성">
				</td>
			</tr>
			</c:if>
		</table>
		</form>
	</body>
</html>
