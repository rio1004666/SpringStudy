<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify</title>
</head>
<body>
	<h1>User 수정</h1>
	<form action="/ch05/user/modify" method="post">
	<table border="1">
		<tr>
			<td>아이디</td>
			<td><input type="text" name="uid" readonly value="${userVo.uid}"></td>
			
			<!-- 아이디는 수정을 못하게하는것 속성은 readonly -->
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" value="${userVo.name}"></td>

		</tr>
		<tr>
			<td>휴대폰</td>
			<td><input type="text" name="hp" value="${userVo.hp}"></td>

		</tr>
		<tr>
			<td>나이</td>
			<td><input type="text" name="age" value="${userVo.age}"></td>

		</tr>
		<tr>
			<td colspan="2" align="right">
			<input type="submit" value="수정하기">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>