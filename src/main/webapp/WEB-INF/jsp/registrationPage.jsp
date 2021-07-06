<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"/>
<title>Insert title here</title>
</head>
<body>
	<form action="addRegistration" method="post">
			
			<div class="row">
				<div class="col-md-12">
			
					<input type="text" class="form-control" name="username"/>
				
				</div>
				
				<div class="col-md-12">
			
					<input type="email" class="form-control" name="email"/>
				
				</div>
				
				<div class="col-md-12">
			
					<input type="password" class="form-control" name="password"/>
				
				</div>
				
				
				<div class="col-md-12">
			
					<input type="submit" class="btn btn-primary" value="Submit"/>
				
				</div>
				
				
				
			</div>
	</form>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</body>
</html>