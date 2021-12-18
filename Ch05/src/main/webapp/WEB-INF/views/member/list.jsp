
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록page</title>
</head>
<body>
	<h3> 회원목록 </h3>
	<a href="/member/register">회원등록 가기</a>

	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>휴대폰</th>
			<th>직급</th>
			<th>부서</th>
			<th>입사일</th>
			<th>기타</th>
		</tr>
		<c:forEach var="member" items="${members}">
			<tr>
				<td>${member.uid}</td>
				<td>${member.name}</td>
				<td>${member.hp}</td>
				<td>${member.pos}</td>
				<td>${member.dep}</td>
				<td>${member.rdate.substring(2,10)}</td>
				<td>
					<a href="/ch05/member/modify.do" > 수정 </a>
					<a href="/ch05/member/delete.do" > 삭제</a>
				</td>
			</tr>
		</c:forEach>
		
		
	</table>	
</body>
</html>