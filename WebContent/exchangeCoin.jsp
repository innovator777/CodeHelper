<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctx">${pageContext.request.contextPath }</c:set>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>가상머니 환전</title>
<link href="${ctx }/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctx }/resources/css/style.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<p align="center"><font color=black size=100px>Code Helper</font></p>
				
				<div align="right">
				<b>아무개 회원님 환영합니다.</b>     <a href="logout.do">로그아웃</a>     <a href="#">마이페이지</a>
				</div>
				<br>
				<p align="center"><strong>보유액 : 1000캐쉬</strong></p>
				<div align="center"><b><strong>환전할 캐쉬 : </strong></b><input id="cash"  name="cash"type="text" value="금액입력"><b><strong>캐쉬</strong></b></div>
				<p align="center"><strong>지급될 금액 : 900원(수수료10%)</strong></p>
				
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
							<th>계좌선택</th>
						</tr>
					</thead>
					<tbody>
						<tr>
			                <td>1</td>
			                <td>국민은행</td>
			                <td>01011111111</td>
			                <td>진권기</td>
			                <td><input type="radio"name="check"></td>            
			            </tr>
			            <tr>
			                <td>2</td>
			                <td>기업은행</td>
			                <td>112999999999</td>
			                <td>진권기</td>
			                <td><input type="radio"name="check"></td>
			            </tr>
					</tbody>
				</table>
				<div align="center"><input class="btn btn-success" type="submit" value="환전"></div>
			</div>
		</div>
	</div>
</body>
</html>