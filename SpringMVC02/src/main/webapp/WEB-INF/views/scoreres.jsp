<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>SCORE</h1>
		<table>
			<tr>
				<th>name</th>
				<th>kor</th>
				<th>eng</th>
				<th>math</th>
				<th>sum</th>
				<th>avg</th>
			</tr>
			<tr>
				<td>${dto.name }</td>
				<td>${dto.kor }</td>
				<td>${dto.eng }</td>
				<td>${dto.math }</td>
				<td>${sum }</td>
				<td>${avg }</td>
			</tr>
		</table>
</body>
</html>