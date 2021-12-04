<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>Hello, world!</title>
</head>
<body>
	<div class="container">
		<h1 class="text-center mt-2">Todo App</h1>
         <c:if test="${Msg=='Todo successfully Added'}">
           <div class="alert alert-warning alert-dismissible fade show"
			role="alert">
			<strong> 
          
			<c:out value="${Msg}"></c:out>
			
			</strong>
			<button type="button" class="btn-close" data-bs-dismiss="alert"
				aria-label="Close"></button>
		</div>
           </c:if>
		

		<div class="row">
			<div class="col-3 mt-2 ">
				<div class="list-group list-group-flush">
					<a href="<c:url value='/home'></c:url>"
						class="list-group-item list-group-item-action text-center active"
						aria-current="true">Menu</a> <a
						href="<c:url value='/addTodo'></c:url>"
						class="list-group-item list-group-item-action">Add Todo</a> <a
						href="<c:url value='/home'></c:url>"
						class="list-group-item list-group-item-action"> View Todo</a>
				</div>

			</div>
			<div class="col-9 mt-1 ">
				<c:if test="${page=='home'}">
				<c:forEach items="${todos}" var="todo">	
				
				<div class="card shadow">
  <div class="card-body">
    <h5 class="card-title">	<c:out value="${todo.title}"></c:out></h5>
  
    <p class="card-text">	<c:out value="${todo.content}" ></c:out></p>
    <h6>	  <c:out value="${todo.createdDate}" ></c:out></h6>
  </div>
</div>
				
				
				
				
			
				
			
				    <br>
				</c:forEach>
				</c:if>
				<c:if test="${page=='addTodo'}">
					<form:form action="saveTodo" method="post" modelAttribute="todo"
						class="shadow">
						<div class="form-group">
							<form:label path="title" for="title">Title</form:label>
							<form:input path="title" cssClass="form-control "
								placeholder="name@example.com" id="title" />
						</div>
						<div class="form-group">
							<form:label path="content" for="content">Content</form:label>
							<form:textarea cssClass="form-control" id="content" rows="3"
								path="content" placeholder="Enter your content"></form:textarea>
						</div>
						<div class="form-group text-center">
							<input type="submit" class="btn btn-outline-success mt-2"
								value="AddTodo">
						</div>

					</form:form>

				</c:if>

			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous">
		
	</script>
</body>
</html>