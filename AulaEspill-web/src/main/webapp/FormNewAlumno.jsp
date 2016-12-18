<%-- 
    Document   : FormNewAlumno
    Created on : 18-dic-2016, 16:10:58
    Author     : Gerard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="well">
    <ul class="nav nav-tabs">
      <li class="active"><a href="#home" data-toggle="tab">Profile</a></li>
      <li><a href="#profile" data-toggle="tab">Password</a></li>
    </ul>
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
          <form id="tab" action="CrearAlumnoServlet" method="POST">
            <label>Username</label>
            <input type="text" value="jsmith" class="input-xlarge"><br>
            <label>First Name</label>
            <input type="text" value="John" class="input-xlarge"><br>
            <label>Last Name</label>
            <input type="text" value="Smith" class="input-xlarge"><br>
            <label>Email</label>
            <input type="text" value="jsmith@yourcompany.com" class="input-xlarge"><br>
            <label>Address</label>
            <textarea value="Smith" rows="3" class="input-xlarge">2817 S 49th
    Apt 314
    San Jose, CA 95101
            </textarea>
            
            
          	<div>
        	    <button class="btn btn-primary">Update</button>
        	</div>
        </form>
      </div>
      <div class="tab-pane fade" id="profile">
    	<form id="tab2">
        	<label>New Password</label>
        	<input type="password" class="input-xlarge">
        	<div>
        	    <button class="btn btn-primary">Update</button>
        	</div>
    	</form>
      </div>
  </div>
    </body>
</html>
