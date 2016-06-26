<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<div class="homepage-navigation">
    	<h2>Cadastre-se</h2>
    	<form action="#">
    		<p><input type="text" value="Nome"></p>
    		<p><input type="text" value="Seu e-mail"></p>
    		<p><input type="text" value="Re-escreva seu e-mail"></p>
    		<p><label for="niver">Data de Aniversario</label></p>
    		<p><input type="date" name="niver" id="niver"></p>
    		<p><input type="radio" name="sexo" value="M"> Masculino <input type="radio" name="sexo" value="F"> Feminino </p>
    		<input type="submit" class="buttonWrap button button-green contactSubmitButton" id="contactSubmitButton" value="Cadastra-se" data-formId="contactForm"/>
    	</form>
    </div>    
</body>
</html>