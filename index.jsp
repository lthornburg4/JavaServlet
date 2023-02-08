
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Convert Dollars to Euros</title>
</head>
<body>
	<h1>Program to convert US Dollars to Euro</h1>
	<form action = "getConversionServlet" method="post">
	Enter the number of dollars that you want converted to Euros in whole dollars:
	<input type="text" name="inputDollars" size="10">
	<input type="submit" value="Calculate Conversion" />
	</form>

</body>
</html>