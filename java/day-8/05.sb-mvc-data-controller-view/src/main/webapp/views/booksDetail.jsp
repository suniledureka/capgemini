<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>capgemini :: library</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="bg-info">
	<table
		class="table w-50 mt-5 m-auto table-striped table-bordered table-hover">
		<thead class="text-center bg-info">
			<tr>
				<th>Book ID</th>
				<th>TITLE</th>
				<th>PRICE</th>
				<th>ACTIONS</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${books}" var="book">
				<tr>
					<td>${book.bookId }</td>
					<td>${book.bookTitle }</td>
					<td>${book.bookPrice }</td>
					<td>
					<i class="fa fa-eye text-success"></i>					
					&nbsp; &nbsp; 
					<i class="fa fa-edit text-info"></i>
					&nbsp; &nbsp; 
					
					<a href="/library?isbn=${book.bookId}" onclick="return confirm('do you want to delete this book?')">
					<i class="fa fa-trash text-danger"></i>
					</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
</body>
</html>