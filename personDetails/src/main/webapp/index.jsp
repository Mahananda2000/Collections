<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Send details of fav person</h1>

<form action="pers" method="post">
<pre>
FirstName<input type="text" name="fName"/>
LastName<input type="text" name="lName"/>
Gender   male<input type="radio" name="gender" value="male"/>
         female<input type="radio" name="gender" value="female"/>
         others<input type="radio" name="gender" value="others"/>
Reason <input type="textarea" name="reason"/>
Address <input type="textarea" name="address"/>

<input type="submit" value="send">


</pre>
</form>

</body>
</html>