<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>질문수정</title>
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
	<br><br>
	<form action="${ctx }/questionModify.do" method="post">
		<input id="questionId" name="questionId" type="hidden" value="${question.id }">
		<div align="center">
		<table border="0" width="700">
            <colgroup>
                <col width="10%">
                <col width="*">
            </colgroup>
			<tr>
				<th height="50">제목</th>
				<td><input id="qTitle"  name="qTitle" class="form-control" type="text" value="${question.title }"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea id="qContents" name="qContents" class="form-control" rows="20">${question.contents }</textarea>
			</tr>
		</table>
		</div>
        <br>
		<div align="center"><input class="btn" type="reset" value="취소"> <input class="btn btn-success" type="submit" value="작성"></div>
	</form>
	<br>
</body>
</html>
