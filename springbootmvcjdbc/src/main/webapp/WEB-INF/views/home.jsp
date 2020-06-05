<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}
</style>
</head>
<body>

	<h2>Users Details</h2>
	<center>
		<body>

			<a href="./newUser">Add New User</a>
			<table border="2">
				<tr>
					<th>Phno</th>
					<th>Email</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Address</th>
				</tr>
				<c:forEach items="${urs}" var="user">
					<tr>
						<th>${user.phno}</th>
						<td>${user.email}</td>
						<td>${user.firstName}</td>
						<td>${user.lastName}</td>
						<td>${user.address}</td>
					</tr>
				</c:forEach>
			</table>
		</body>
	</center>
</html>