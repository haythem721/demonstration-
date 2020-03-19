<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap-4.4.1-dist/css/bootstrap.min.css">
<link rel="stylesheet" 	href="feuilles.css/">
</head>

<body>
<div class="col-6" style="margin-left:300px; margin-top:100px">
					<div class="card bg-light mb-6">
						<div class="card-header">Authentification</div>
						<div class="card-body">

							<p class="card-text">
							<form method=post action=controleur>
								<div class=form-group>

									<label for=idlogin>login:</label> <input type=text name=login
										id=idlogin class="form-control" required />
								</div>
								<div class=form-group>
									<label for="idmdp">Mot de passe:</label> <input type="password"
										name="prix" id="idmdp" class="form-control" required />
								</div>

								
                                <div style="margin:auto; text-align:center">
								<button type="submit" name=action value="ajout"
									class="btn btn-primary">s'authentifier</button>
								<button type="reset" class="btn btn-secondary">Annuler</button>
								</div>

							</form>


						</div>
					</div>
				</div>

<a style="" href=controleur>les produits</a>
<a style="" href=addCategorieControleur>Ajouter Categorie</a>
<a style="" href=controleur1>les produits</a>
</body>
</html>