<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>질문등록</title>
<link href="${ctx }/views/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctx }/views/resources/css/style.css" rel="stylesheet">
</head>
<body>
	<input id="lectureId" name="lectureId" type="hidden" value="">
	<center><a href="#"><font color=black size=100px>Code Helper</font></a></center>
	
	<br>
	<form action="#" method="post" onsubmit="return beforeSubmit();">
		<table class="table">
            <colgroup>
                <col width="150">
                <col width="*">
            </colgroup>
			<tr>
				<th>제목</th>
				<td><input id="lectureName"  name="lectureName" class="form-control" type="text" value=""></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea id="lectureIntroduce" name="lectureIntroduce" class="form-control" rows="20"></textarea>
			</tr>
		</table>
        <br>
		<div align="center"><input class="btn" type="reset" value="취소"> <input class="btn btn-success" type="submit" value="저장"></div>
	</form>
	<br>
</body>
</html>
