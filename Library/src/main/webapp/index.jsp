<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Library Managemt System</title>
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/fonts/ionicons.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Abhaya+Libre">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Abril+Fatface">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Adamina">
<link rel="stylesheet" href="assets/css/Footer-Basic.css">
<link rel="stylesheet" href="assets/css/Footer-Clean.css">
<link rel="stylesheet" href="assets/css/Footer-Dark.css">
<link rel="stylesheet" href="assets/css/Login-Form-Dark.css">
<link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
	<nav
		class="navbar navbar-dark navbar-expand-md fixed-top bg-dark justify-content-center"
		id="navbar" style="padding: 0px; height: 60px;">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				style="font-family: Times New Roman; font-size: 25px; padding: -100px;">Library
				Management System</a>
			<button class="navbar-toggler" data-toggle="collapse"
				data-target="#navcol-1">
				<span class="sr-only">Toggle navigation</span><span
					class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navcol-1">
				<ul class="nav navbar-nav justify-content-between ml-auto">
					<li class="nav-item" role="presentation"><a class="nav-link"
						href="#"
						style="font-family: Times New Roman; color: #ffffff; font-size: 20px; padding: 15px; margin: 2px;">Member
							Ship</a></li>
				</ul>
				<a class="btn btn-primary active" role="button" href="join.jsp"
					style="background-color: #0014cc; font-family: 'Abril Fatface', cursive;">Join
					Us !</a><a class="btn btn-primary" role="button" href="login.jsp"
					style="background-color: rgb(255, 15, 0);">Log Out</a>
			</div>
		</div>
	</nav>
	<div id="library">
		<div class="jumbotron">
			<h1 style="font-family: 'Abril Fatface', cursive;">Library
				Management System</h1>
			<p style="font-family: Arial; font-size: 25px;">The Library
				Management Systm Website will be more then categeory inside.They
				have more then Book to imporve your Knownloadge and Learn in future
				World.</p>
			<a class="btn btn-primary" role="button" href="main.jsp"
				target="iframe" style="font-family: 'Abril Fatface', cursive;">Book
				Collection</a>
		</div>
	</div>
	<div>
		<div class="container">
			<div class="row">
				<div class="col-4" style="font-size: 20px;">
					<h1>Authors</h1>
					<a href="danielle.jsp" target="iframe" style="font-size: 20px;">Danielle
						Steel</a>
					<hr>
					<a href="nora.jsp" target="iframe" style="font-size: 20px;">Nora
						Roberts</a>
					<hr>
					<a href="lisa.jsp" target="iframe" style="font-size: 20px;">Lisa</a>
					<hr>
					<a href="cardyn.jsp" target="iframe" style="font-size: 20px;">Cardyn
						Brown</a>
					<hr>
					<a href="robyn.jsp" target="iframe" style="font-size: 20px;">Robyn</a>
					<hr>
					<h1 style="font-family: Adamina, serif;">Category</h1>
					<hr>
					<a href="romance.jsp" target="iframe" style="font-size: 20px;">Romatic
						Novels</a>
					<hr>
					<a href="horror.jsp" target="iframe" style="font-size: 20px;">Horror
						Novels</a>
					<hr>
					<a href="comedy.jsp" target="iframe" style="font-size: 20px;">Comedy
						Novels</a>
					<hr>
					<a href="education.jsp" target="iframe" style="font-size: 20px;">Education
						Novels</a>
					<hr>
					<a href="financial.jsp" target="iframe" style="font-size: 20px;">Financial
						Novels</a>
					<hr>
				</div>
				<div class="col">
					<iframe name="iframe" height="800px" width="790px"></iframe>
				</div>
			</div>
		</div>
	</div>
	<div class="footer-basic">
		<footer>
			<div class="social">
				<a href="#"><i class="icon ion-social-instagram"></i></a><a href="#"><i
					class="icon ion-social-snapchat"></i></a><a href="#"><i
					class="icon ion-social-twitter"></i></a><a href="#"><i
					class="icon ion-social-facebook"></i></a>
			</div>
			<ul class="list-inline">
				<li class="list-inline-item"><a href="index.html">Home</a></li>
				<li class="list-inline-item"><a href="#">Services</a></li>
				<li class="list-inline-item"><a href="#">About</a></li>
				<li class="list-inline-item"><a href="#">Terms</a></li>
				<li class="list-inline-item"><a href="#">Privacy Policy</a></li>
			</ul>
			<p class="copyright">LibraryManagement© 2022</p>
		</footer>
	</div>
	<script>
        function myFunction() {
            var input, filter, ul, li, a, i, txtValue;
            input = document.getElementById("myInput");
            filter = input.value.toUpperCase();
            ul = document.getElementById("myUL");
            li = ul.getElementsByTagName("li");

            for(i=0;i<li.length;i++)
            {
                a=li[i].getElementsByTagName("a")[0];
                txtValue = a.textContent || a.innerText;
                if(txtValue.toUpperCase().indexOf(filter)>-1)
                {
                    li[i].style.display="";
                }
                else{
                    li[i].style.display="none";
                }
            }
        }
    </script>
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>