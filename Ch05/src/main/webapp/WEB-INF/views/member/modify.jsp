<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>직원수정</h3>
	<form action="/ch07/member/modify.do" method="post">
	<table border="1">
		<tr>
			<td>아이디</td>
			<td><input type="text" readonly name="uid" value=""></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" value=""></td> <!-- 키와 값을 전달한다 여기서!!!!!! post방식으로 바디에 실어서보내기때문에 보안이 뛰어나다  -->

		</tr>
	
		<tr>
			<td>휴대폰</td>
			<td><input type="text" name="hp" value=""></td>

		</tr>
		
		<tr>
			<td>직급</td>
			<td>
			<select name="pos">
			
				<option value="사원">사원</option>
				<option value="대리">대리</option>
				<option value="과장">과장</option>
				<option value="차장">차장</option>
				<option value="부장">부장</option>
			
			</select></td>

		</tr>
		<tr>
			<td>부서</td>
			<td><select name="dep">
				<option value="101">영업1부</option>
				<option value="102">영업2부</option>
				<option value="103">영업3부</option>
				<option value="104">영업지원부</option>
				<option value="105">인사부</option>
			</select></td>

		</tr>
		
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="등록하기"> <!-- 등록하기를 보내면 내가 요청한 url로 즉 서버측으로 데이터를 보낸다  -->
			</td>

		</tr>
	</table>
	</form>
</body>
</html>