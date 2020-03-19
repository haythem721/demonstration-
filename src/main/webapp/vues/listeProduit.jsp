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
	<nav class="navbar navbar-dark bg-dark">
		<form class="form-inline" method=get action=controleur>
			<input class="form-control mr-sm-2" type="text"
				placeholder="Search" aria-label="Search" name="mc">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit" name="action" value=rechercher>Search</button>
		</form>
	</nav>
	<div class="container">
		<div class=row>
			<div class="col-6">




				<div class="card bg-light mb-6">
					<div class="card-header">Header</div>
					<div class="card-body">
						<h5 class="card-title">Secondary card title</h5>
						
						<table class="table table-hover table-sm" >
							<thead>
								<tr>
									<th>id</th>
									<th>nom</th>
									<th>quantite</th>
									<th>prix</th>
									<th>categorie</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${liste}" var="i">
									<tr>
										<td>${i.id}</td>
										<td>${i.nom}</td>
										<td>${i.quantite}</td>
										<td>${i.prix}</td>
										<td>${i.categorie.nom}</td>
										
									</tr>
								</c:forEach>
							</tbody>
						</table>

						
					</div>
				</div></div>
				<div class="col-6">
					<div class="card bg-light mb-6">
						<div class="card-header">Ajouter un produit</div>
						<div class="card-body">

							<p class="card-text">
							<form method=post action=controleur>
								<div class=form-group>

									<label for=idnom>Nom:</label> <input type=text name=nom
										id=idnom class="form-control" required />
								</div>
								<div class=form-group>
									<label for="idprix">prix:</label> <input type="number"
										name="prix" id="idprix" class="form-control" required />
								</div>

								<div class=form-group>
									<label for="idqt">quantite:</label> <input type=number name=qt
										id=idqt class="form-control" required />
								</div>
								<div class=form-group>
									<label for="idqt">categorie:</label>
									<select name=c>
									<c:forEach var="x" items="${categories}">
									  <option  value="${x.id}">${x.nom}</option>
									  </c:forEach>
									
									</select>
								</div>

								<button type="submit" name=action value="ajout"
									class="btn btn-primary">ajouter produit</button>
								<button type="reset" class="btn btn-secondary">Annuler</button>

							</form>


						</div>
					</div>
				</div>







			</div>
		</div>
</body>
</html>