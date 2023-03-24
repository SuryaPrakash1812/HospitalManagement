<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
<%@include file="style/ext.css"%>
</style>
<title>PharmaLogin</title>
</head>
<body>
<%@include file="style/css.jsp" %>
<form class="text-center border border-light p-5" action="phver" method="post">
<br><br><br>
    <p class="h4 mb-4">PharmaLogin</p>
<label>Uname:</label>
    <input type="text" id="defaultLoginFormEmail" name="phname"class="form-control mb-4"  placeholder="username">
    <br>
    <br>
<label>Password:</label>
    <input type="password" id="defaultLoginFormPassword" name="phpassword" class="form-control mb-4" placeholder="Password">
   <bf>
    <br>
    <div class="d-flex justify-content-around">
        <div>
          <input type="submit" class="btn btn-success"value="login" >
        </div>
        </div>

</body>
</html>