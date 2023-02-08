<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<h1>save details of bakery</h1>
<form action="sweet" method="post">
<pre>
Name <input type="text" name="name"/>
Owner <input type="text" name="ownerName"/>
OwnerWifeName <input type="text" name="ownerWifeName"/>
Owner Married: true<input type="radio" name="ownerMarried" value="true"/>
               false<input type="radio" name="ownerMarried" value="false"/>
Famous For <textarea name="famousFor"></textarea>
Since <input type="text" name="since"/>
<input type="submit" value="save"/>
</pre>               
</form>

</body>
</html>