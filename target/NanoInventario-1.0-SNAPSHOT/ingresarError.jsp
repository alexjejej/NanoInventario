<%-- 
    Document   : ingresarError
    Created on : 15/11/2022, 03:12:28 PM
    Author     : alexg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <title>Inventario de laboratorio_Microscopia</title>

    <!-- import the webpage's stylesheet -->
    <link rel="stylesheet" href="newcss.css" />
   
    
    <!-- import the webpage's javascript file -->
    <script src="/script.js" defer></script>
  </head>
    <body class="cover text-white h3 mt-5 text-center">
        
       <form action="http://localhost:8080/NanoInventario/VistaAdmin.jsp">
        <h3>Error al ingresar datos!</h3><br><br>
        <input class="btn btn-danger" type="submit" value="Volver al inicio">
           
        </form>
        <script src="js/jquery-3.6.1.min"></script>
      <script src="js/bootstrap.min"></script>
    </body>
</html>
