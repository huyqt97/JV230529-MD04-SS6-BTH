<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <style type="text/css">
    .login {
      height:180px; width:230px;
      margin:0;
      padding:10px;
      border:1px #CCC solid;
    }
    .login input {
      padding:5px; margin:5px
    }
  </style>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="timeworld">TimeWorld</a>
<br>
<form method="post" action="login" >
  <div class="login">
    <h2>Login</h2>
    <input type="text" name="username" size="30"  placeholder="username" />
    <input type="password" name="password" size="30" placeholder="password" />
    <input type="submit" value="Sign in"/>
  </div>
</form>
<br>
<form method="post" action="changmoney" >
  <div class="login">
    <h2>Change</h2>
    <label>Từ VND sang USD</label>
    <input type="number" name="vnd" size="30"  placeholder="VND" />
    <label>Từ USD sang VND</label>
    <input type="number" name="usd" size="30" placeholder="USD" />
    <input type="submit" value="Change"/>
  </div>
</form>
<br>
<h2>Vietnamese Dictionary</h2>
<form method="post" action="translate">
  <input type="text" name="txtSearch" placeholder="Enter your word: "/>
  <input type = "submit" id = "submit" value = "Search"/>
</form>
</body>
</html>