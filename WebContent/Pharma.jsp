<%@page import="java.util.ArrayList" %>
<%@page import=" com.model.Pmod" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
<%@include file="style/ext.css"%>
</style>
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-info">
 
      <i style="font-size:24px"  class="fa">&#xf0fa;</i>
    <b>Healthcare</b>
  
  </div>
</nav>


<form action="refreshp">
<input type="submit" value="refresh" >
</form>
 
<table border="1" class="table table-striped " style="border:solid;background-color:lightblue;color:black" >
<tr>
<th>id</th>
<th>name</th>
<th>Prescribed</th>
</tr>
<%ArrayList<Pmod> phal=(ArrayList<Pmod>)request.getAttribute("phdisplay");
for(Pmod p:phal)
{
%>	
	<form action="save?id=<%=p.getPid()%>" method="post">
<tr>
<td><%=p.getPid()%></td>
<td><%=p.getPname()%></td>
<td><b><%=p.getPresc()%></b></td>
</tr>
</form>
<% 
}
%> 
</table> 
<%phal.clear();%>
<marquee><h2>Please click refresh</h2> </marquee>
<form class="d-flex"  style="background-color:aqua;width:70px"action="phlogout">
        <button class="btn btn-failure" type="submit">Logout</button>
      </form>

</body>
</html>