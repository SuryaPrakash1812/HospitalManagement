<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
<%@include file="style/ext.css"%>
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient registration</title>
</head>
<body style="background-color:black">
<nav class="navbar navbar-expand-lg navbar-dark bg-info">
 
      <i style="font-size:24px"  class="fa">&#xf0fa;</i>
    <b>Healthcare</b>
  <form class="d-flex"  style="background-color:#afd8a9;width:70px"action="relogout">
        <button class="btn btn-failure" type="submit">Logout</button>
      </form>
  </div>
</nav>

<form action="reg" method="post">
<section class="h-100 bg-dark">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col">
        <div class="card card-registration my-4 bg-info">
          <div class="row g-0">
            
            <div class="col-xl-6">
              <div class="card-body p-md-5 text-black bg=primary">
                <h3 class="mb-5 text-uppercase">Patient registration form</h3>

                <div class="row">
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" id="form3Example1m" name="pname"class="form-control form-control-lg" />
                      <label class="form-label" for="form3Example1m">Name:</label>
                    </div>
                  </div>
                
                </div>

                <div class="row">
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" id="form3Example1m1" name="pbg" class="form-control form-control-lg" />
                      <label class="form-label" for="form3Example1m1">Blood group:</label>
                    </div>
                  </div>
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="number" id="form3Example1n1" name="pag" class="form-control form-control-lg" />
                      <label class="form-label" for="form3Example1n1">Age:</label>
                    </div>
                  </div>
                </div>

                <div class="form-outline mb-4">
                  <input type="text" id="form3Example8" name="paddress" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example8">Address:</label>
                </div>

                <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">

                  <h6 class="mb-0 me-4">Gender: </h6>

                  <div class="form-check form-check-inline mb-0 me-4">
                    <input class="form-check-input" name="pgender" type="radio" name="inlineRadioOptions" id="femaleGender"
                      value="female" />
                    <label class="form-check-label" for="femaleGender">Female</label>
                  </div>

                  <div class="form-check form-check-inline mb-0 me-4">
                    <input class="form-check-input"  name="pgender" type="radio" name="inlineRadioOptions" id="maleGender"
                      value="male" />
                    <label class="form-check-label" for="maleGender">Male</label>
                  </div>

                  <div class="form-check form-check-inline mb-0">
                    <input class="form-check-input" name="pgender" type="radio" name="inlineRadioOptions" id="otherGender"
                      value="others" />
                    <label class="form-check-label" for="otherGender">Other</label>
                  </div>

                </div>

 
                <div class="form-outline mb-4">
                  <input type="date" id="form3Example9" name="pdob"class="form-control form-control-lg" />
   
                  <label class="form-label" for="form3Example9">DOB:</label>
                </div>


                <div class="form-outline mb-4">
                  <input type="tel" id="form3Example97" name="pmobile" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example97">Mobile Number:</label>
                </div>

	<div class="d-flex justify-content-end pt-3">
<input type="submit" value="register" >
               </div>
                

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>


</form>
</body>
</html>