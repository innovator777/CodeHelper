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
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<p align="center"><font color=black size=100px>Code Helper</font></p>
				
				<div align="right">
				<b>진강사 회원님 환영합니다.</b>     <a href="logout.do">로그아웃</a>     <a href="#">마이페이지</a>
				</div>
				<br>
				<div align="left"><input class="btn btn-success" type="submit" value="등록"></div>
				
				<table class="table table-hover table-condensed">
					<colgroup>
						<col width="10%">
						<col width="20%">
						<col width="50%">
						<col width="20%">
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
						<tr>
			            	<td>1</td>
			                <td>국민은행</td>
			                <td>01011111111</td>
			                <td>진권기</td>     
			                <td><input class="btn btn-success" type="submit" value="삭제"></td>       
			            </tr>
			            <tr>
			            	<td>2</td>
			                <td>기업은행</td>
			                <td>11298987789</td>
			                <td>진권기</td>
			                <td><input class="btn btn-success" type="submit" value="삭제"></td>            
			            </tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>