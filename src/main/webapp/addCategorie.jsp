<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body>

<div class="container">
<div class=row >
<div class=col-md-6>
  <div class="panel panel-default"></div>
    <div class="panel-heading">
    
      <form class="form-inline" method=get action=addCategorieControleur>
			Nom Categorie:<input class="form-control mr-sm-2" type="text" name="nom">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit" name="action" value=add>Add Categorie</button>
		</form>
    
    </div>
    <div class="panel-body">
    
      <table class="table table-hover" >
							<thead>
								<tr>
									<th>id</th>
									<th>nom</th>
									
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${liste}" var="i">
									<tr>
										<td>${i.id}</td>
										<td>${i.nom}</td>
										
									</tr>
								</c:forEach>
							</tbody>
						</table>
    
    </div>
    <div class="panel-footer">
    
              End    
    </div>
 
</div>
</div>

</div>




</body>
</html>