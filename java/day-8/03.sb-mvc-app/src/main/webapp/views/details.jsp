<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>admin details</title>
</head>
<body>
 <div class="container mt-5">
 <table class="table table-striped table-dark w-50 table-hover h4 mx-auto">
  <tr>
    <th>Name</th> 
    <td>${admin_name}</td>
  </tr> 
  
  <tr>
    <th>Age</th> 
    <th>${admin_age}</th>
  </tr>
  
  <tr>
    <th>Address</th> 
    <td>${admin_addr}</td>
  </tr>  
 </table>
</div>
</body>
</html>