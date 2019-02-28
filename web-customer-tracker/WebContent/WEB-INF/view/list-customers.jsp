<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM- Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">

			<input type="button" value="Add Customer"
				onclick="window.location.href='showFormForAdd';return false;" /> <br>
			<br>

			<table>

				<tr>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Email</th>
					<th>Action</th>
				</tr>

				<c:forEach var="tempcustomers" items="${customer}">

					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempcustomers.id}" />
					</c:url>


					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerId" value="${tempcustomers.id}" />
					</c:url>

					<tr>

						<td>${tempcustomers.fname}</td>

						<td>${tempcustomers.lname}</td>

						<td>${tempcustomers.email}</td>

						<td>
						<a href="${updateLink}">Update</a>
						|
					    <a href="${deleteLink}"
					    onclick="if(!(confirm('Are you sure you want to delete the customer?'))) return false">Delete</a>
					    </td>
						
						
					</tr>

				</c:forEach>
			</table>
		</div>
	</div>


</body>
</html>