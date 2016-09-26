<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/custom.css">
	<link rel='stylesheet' href='http://codepen.io/assets/libs/fullpage/jquery-ui.css'>
    <link rel="stylesheet" href="css/style.css">

<title>LOGIN</title>
</head>
<body background="img/1-blur.png">
<div class="header">
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
          <a class="navbar-brand" ><img src="img/logo1.png" style="float:left; padding-top:0px;width:120px;height:30px;padding-bottom:6px;"></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar1">
      <ul class="nav navbar-nav">
        <li><a href="index.jsp">Acasa</a></li>
     
        <li><a href="#">Cursuri</a></li> 
        <li><a href="#">Despre Noi</a></li> 
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="Register.jsp"><span class="glyphicon glyphicon-user"></span>Sign Up</a></li>
        <li class="active"><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"> </span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
</div><!-- DIV HEADER-->


  <div class="form">
   <img src="img/login-icon.png" style="width:30px;height:30px;float:top;padding:0;">
    <h2>Login</h2>
    <form action="Login" method="post">
      <input type="text" name="username" placeholder="username"/>
      <input type="password" name="password" placeholder="password"/>
      <input type="submit" name="login" class="login login-submit" value="login">
    </form>
  </div>
 
 	
</body>
</html>
