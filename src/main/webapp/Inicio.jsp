<%-- 
    Document   : newjsp
    Created on : 3/10/2022, 10:58:03 AM
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
    <body class="fondo2"> 
        <div class="container mt-5">
            <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card">
          <div class="card-body p-3 p-sm-5 bg-light">
        <form action="http://localhost:8080/NanoInventario/login" method="GET">
            
    
              <label class= "h3 text-info">Ingresar Datos        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-file-text-fill" viewBox="0 0 16 16">
  <path d="M12 0H4a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2zM5 4h6a.5.5 0 0 1 0 1H5a.5.5 0 0 1 0-1zm-.5 2.5A.5.5 0 0 1 5 6h6a.5.5 0 0 1 0 1H5a.5.5 0 0 1-.5-.5zM5 8h6a.5.5 0 0 1 0 1H5a.5.5 0 0 1 0-1zm0 2h3a.5.5 0 0 1 0 1H5a.5.5 0 0 1 0-1z"/>
</svg> </label>
              <i class="bi bi-award"></i><!--  --><br>
              
             
            <div class="mt-4 text-dark">  
                <label for="nombre">Nombre: </label>
                <input type="text" name="nombre" required="" class="form-control" id="nombre" >
            </div><br>
              
              <div class="text-dark">
                  <label for="contra">Contraseña: </label>
                <input type="password" name="contra" required="" class="form-control" id="contra">
              </div><br>

              <br>
                <div>
                      <button class="btn btn-danger" value="Ingresar" >
            Ingresar          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-check-square-fill" viewBox="0 0 16 16">
  <path d="M2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2zm10.03 4.97a.75.75 0 0 1 .011 1.05l-3.992 4.99a.75.75 0 0 1-1.08.02L4.324 8.384a.75.75 0 1 1 1.06-1.06l2.094 2.093 3.473-4.425a.75.75 0 0 1 1.08-.022z"/>
</svg>      
                      </button> <br><br>
              </div>
              
              </form>
        <form action="index.html">
        <input  class="btn btn-info " type="submit" value="Volver a la pagina principal">
                </form>  
              
          </div>
        </div>
      </div>
    </div>
           
            </div>
         
        <script src="js/jquery-3.6.1.min"></script>
      <script src="js/bootstrap.min"></script>
    </body>
</html>
