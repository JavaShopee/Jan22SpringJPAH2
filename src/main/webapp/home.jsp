<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Add Student</h3>
<form action="addStud">
      <input type="text" name="roll"><br>
      <input type="text" name="name"><br>
      <input type="text" name="tech"><br>
      <input type="submit"><br>

</form>


<h3>Find By Roll</h3>
<form action="showStud">
      <input type="text" name="roll"><br>
      <input type="submit"><br>
</form>



<h3>Find By Tech</h3>
<form action="showByTech">
      <input type="text" name="tech"><br>
      <input type="submit"><br>
</form>


</body>
</html>