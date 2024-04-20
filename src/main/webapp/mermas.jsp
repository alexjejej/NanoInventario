<%-- 
    Document   : mermas
    Created on : 10/11/2022, 07:16:08 PM
    Author     : alexg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <title>Inventario de laboratorio_Microscopia</title>

 
    <link rel="stylesheet" href="newcss.css" />
   
    
    <!-- import the webpage's javascript file -->
    <script src="/script.js" defer></script>
  </head>
        <body class="fondo2 text-center mt-5">
            <form action='http://localhost:8080/NanoInventario/mermas' method='POST'>
                <h3 class="text-white">Ingrese nombre del reactivo a mermar:</h3> <input class="btn text-justify" type='text' name='nombreR'><br><br><!--  -->
            <input class="btn btn-danger"type='submit' value='Buscar'>
        </form>
            <br><br>
            </form>
        <form action="VistaAdmin.jsp">
        <input  class="btn btn-info " type="submit" value="Volver">
                </form>
        
        <script src="js/jquery-3.6.1.min"></script>
      <script src="js/bootstrap.min"></script>
        </body>
    </html>
