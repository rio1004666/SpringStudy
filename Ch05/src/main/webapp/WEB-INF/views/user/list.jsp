<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- jstl 라이브러리 코어(중요) 변수 명령어 선언   -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
			<h1>User 목록</h1>
			<table border="1">
			
		<tr>
			<td>아이디</td>
			<th>이름</th>
			<th>휴대폰</th>
			<th>나이</th>
			<th>관리</th>
		</tr>
		
		<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.uid}</td> 
				<th>${user.name}</th>
				<th>${user.hp}</th>
				<th>${user.age}</th> <!-- 메서드 사용하지않고 직접참조가능  -->
				<td>
					<a href="/ch05/user/modify?uid=${user.uid}"> 수정 </a> 
					<a href="/ch05/user/delete?uid=${user.uid}"> 삭제 </a>
				</td> <!-- get방식으로 주소에다가 데이터를 실어보낸다~~~확인은 검사로~~~~ -->
			</tr>
		</c:forEach>
		
		
	</table>
</body>
</html>