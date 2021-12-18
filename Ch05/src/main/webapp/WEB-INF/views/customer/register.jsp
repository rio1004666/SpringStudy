<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
</head>
<body>
	<h3>고객등록</h3>
	<form action="/Ch07/customer/register.do" method="post">
	<table border="1">
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"></td> <!-- 키와 값을 전달한다 여기서!!!!!! post방식으로 바디에 실어서보내기때문에 보안이 뛰어나다  -->

		</tr>
		<tr>
			<td>주소</td>
			<td><input type="text" name="address"></td>
		</tr>
		<tr>
			<td>휴대폰</td>
			<td><input type="text" name="phone"></td>

		</tr>
		<tr>

			<td colspan="2" align="right">
			<input type="submit" value="등록하기"> <!-- 등록하기를 보내면 내가 요청한 url로 즉 서버측으로 데이터를 보낸다  -->
			</td>
		</tr>
	</table>
	</form>
	
	
	
</body>
</html>