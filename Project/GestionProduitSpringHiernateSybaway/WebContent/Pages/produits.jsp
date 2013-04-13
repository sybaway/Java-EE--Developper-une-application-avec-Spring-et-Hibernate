<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sw" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>www.sybaway.com</h1>
	recherche : 
	<form action="searchProduct.aspx" method="post"  >
		ID : <input type="text" name="idProduit" value="${idProduit}" /> 
		<input type="submit" value="Afficher" />
	</form>
	<hr />
	Ajouter :
	<form action="addProduct.aspx" method="post">
		<table border="1" width="30%">
			<tr>
				<td>Nom</td>
				<td><input type="text" name="nom" /></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><input type="text" name="description" /></td>
			</tr>
			<tr>
				<td>Prix</td>
				<td><input type="text" name="prix" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="ajotuer"/> 
				</td>
			</tr>
		</table>
	</form>
	<hr />
	<br />
	<table border="1" width="50%">
		<tr>
			<th>ID</th>
			<th>NOM</th>
			<th>DESCRIPTION</h>
			<th>PRIX</th>
			<th>Option</th>
		</tr>
		
		<!--  listeProduit  -->
		<sw:forEach items="${listeProduit}" var="o" >
			<tr>
				<td>${o.idProduit }</td>
				<td>${o.nom }</td>
				<td>${o.description }</td>
				<td>${o.prix }</td>
				<td><a href="deleteProduit.aspx?id=${o.idProduit }">supprimer</a></td>
			</tr>
		</sw:forEach>
	</table>
</body>
</html>