<%@ page language="java" contentType="text/html;  Charset=iso-8859-2"
    pageEncoding="ISO-8859-2"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Webtown Shop | F�oldal</title>
    <style type="text/css">
        body {
            text-align: center;
        }
        input[type=number] {
            width: 50px;
        }
    </style>
</head>
<body>
	<h1>�dv�z�lj�k a Webtown Shop-ban!</h1>
	<form action="shop" method="post">
        <label for="toothpaste">Fogkr�m:</label><br>
        <input required type="number" min="0" value="0" id="toothpaste" name="toothpaste" size="3">
        <br><br>
        <label for="pomelo">Pomelo:</label><br>
        <input required type="number" min="0" value="0" id="pomelo" name="pomelo" size="3">
        <br><br>
        <label for="salmon">Lazacfil�:</label><br>
        <input required type="number" min="0" value="0" id="salmon" name="salmon" size="3">
        <br><br>
        <label for="cheese">Gomolya sajt:</label><br>
        <input required type="number" min="0" value="0" id="cheese" name="cheese" size="3">
        <br><br>
        <label for="napkin">Pap�rt�rl�</label><br>
        <input required type="number" min="0" value="0" id="napkin" name="napkin" size="3">
        <br><br>
        <label for="giftpack">Mikul�s-csomag:</label><br>
        <input required type="number" min="0" value="0" id="giftpack" name="giftpack" size="3">
        <br><br>
        <label for="milk">Tej:</label><br>
        <input required type="number" min="0" value="0" id="milk" name="milk" size="3">
        <br><br>
        <label for="joghurt">Joghurt:</label><br>
        <input required type="number" min="0" value="0" id="joghurt" name="joghurt" size="3">
        <br><br>
        <label for="pasta">Sz�razt�szta:</label><br>
        <input required type="number" min="0" value="0" id="pasta" name="pasta" size="3">
        <br><br>

		<input type="submit" value="V�s�rl�s" />
	</form>
</body>
</html>