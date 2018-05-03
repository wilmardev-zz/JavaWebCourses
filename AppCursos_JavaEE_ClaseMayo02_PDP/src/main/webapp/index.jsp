<%-- 
    Document   : index
    Created on : 2/05/2018
    Author     : wilmar.duque
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">



    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="WilmarDuque" content="">
        <link rel="icon" href="../../favicon.ico">

        <title>Login</title>

        <!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/signin.css" rel="stylesheet">

    </head>

    <body>

        <div class="container">

            <form class="form-signin" action="${pageContext.servletContext.contextPath}/ServletLogin" method="POST">
                <h2 class="form-signin-heading">Sign in</h2>
                <label for="inputEmail" class="sr-only">Email address</label>
                <input type="text" id="txtUserName" class="form-control" placeholder="User Name" name="txtUserName" required autofocus>
                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" id="txtPassword" class="form-control" placeholder="Password" name="txtPassword" required>
                <button class="btn btn-lg btn-default" type="submit">Sign in</button>
                <p class="form-signin-heading"><%
                    String msg = (String)session.getAttribute("messageError");
                    if(msg != null){
                        out.println(msg);
                    }
                    session.removeAttribute("messageError");
                %></p>
            </form>

        </div> <!-- /container -->
    </body>
</html>