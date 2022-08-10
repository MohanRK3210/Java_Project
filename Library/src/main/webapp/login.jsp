<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Abhaya+Libre">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Abril+Fatface">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Adamina">
    <link rel="stylesheet" href="assets/css/Footer-Basic.css">
    <link rel="stylesheet" href="assets/css/Footer-Clean.css">
    <link rel="stylesheet" href="assets/css/Footer-Dark.css">
    <link rel="stylesheet" href="assets/css/Login-Form-Dark.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <div class="login-dark">
        <form name="login" method="post" action="">
            <h2 class="sr-only">Login Form</h2>
            <div class="illustration"><i class="icon ion-ios-locked-outline"></i></div>
            <div class="form-group">
                <input class="form-control" type="text" name="userid" placeholder="UserName"/></div>
            <div class="form-group">
                <input class="form-control" type="password" name="password" placeholder="Password"/></div>
            <div class="form-group">
                <button class="btn btn-primary btn-block" onclick="check(this.form)" value="Login" type="submit">Log In</button></div><a href="forget.html" class="forgot">Forgot password?</a></form>
    </div>
    <script type="text/javascript">
        function check(form)
        {
            if(form.userid.value == "user" && form.password.value == "user")
            {
            	form.setAttribute("action","index.jsp");
            	form.submit();
                
            }
            else if(form.userid.value == "admin" && form.password.value == "admin")
            {
            	form.setAttribute("action","admin.jsp");
            	form.submit();
                
            }
            else
            {
                alert("Invalid UserName&Password")
            }
        }
    </script>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>