<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
         pageEncoding="ISO-8859-2"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Webtown Shop | Összegzés</title>
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
<h1>Vásárlás összegzése:</h1>
<form>
    <label for="toothpaste">Fogkrém:</label><br>
    <input disabled type="number" min="0" value="${toothpaste}" id="toothpaste" name="toothpaste" size="3">
    <br><br>
    <label for="pomelo">Pomelo:</label><br>
    <input disabled type="number" min="0" value="${pomelo}" id="pomelo" name="pomelo" size="3">
    <br><br>
    <label for="salmon">Lazacfilé:</label><br>
    <input disabled type="number" min="0" value="${salmon}" id="salmon" name="salmon" size="3">
    <br><br>
    <label for="cheese">Gomolya sajt:</label><br>
    <input disabled type="number" min="0" value="${cheese}" id="cheese" name="cheese" size="3">
    <br><br>
    <label for="napkin">Papírtörlõ</label><br>
    <input disabled type="number" min="0" value="${napkin}" id="napkin" name="napkin" size="3">
    <br><br>
    <label for="giftpack">Mikulás-csomag:</label><br>
    <input disabled type="number" min="0" value="${giftpack}" id="giftpack" name="giftpack" size="3">
    <br><br>
    <label for="milk">Tej:</label><br>
    <input disabled type="number" min="0" value="${milk}" id="milk" name="milk" size="3">
    <br><br>
    <label for="joghurt">Joghurt:</label><br>
    <input disabled type="number" min="0" value="${joghurt}" id="joghurt" name="joghurt" size="3">
    <br><br>
    <label for="pasta">Száraztészta:</label><br>
    <input disabled type="number" min="0" value="${pasta}" id="pasta" name="pasta" size="3">

    <p>Teljes ár: ${fullPrice} Forint</p>
    <p>Kedvezményes ár: ${discountedPrice} Forint</p>
    <p>Kedvezmény típusa: ${discountType}</p>


</form>
</body>
</html>