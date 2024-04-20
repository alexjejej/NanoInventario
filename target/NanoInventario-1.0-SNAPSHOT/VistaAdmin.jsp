<%-- 
    Document   : VistaAdmin
    Created on : 7/11/2022, 11:09:24 AM
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

 
    <link rel="stylesheet" href="newcss.css" />
   
    
    <!-- import the webpage's javascript file -->
    <script src="/script.js" defer></script>
  </head>
    <body class="cover">
        <br><!-- comment -->
       <header >
        <div class="container text-center text-white mt-5">
  <div class="row">
    <div class="col">
    
        <a class="h1 text-light text-uppercase font-weight-bold font-italic">¿Que deseas hacer?</a>
       
        </div>
  </div>
        </div>
    </header>
        
        
    <section>  
        <br><br><br>
           <div class="container mt-2 mb-4">
        <div class="row justify-content-center">
          
          <div class="col-6 col-md-3 col-sm-6 mt-3">
        <div class="card bg-light" >
  <img src="https://cdn.glitch.global/6b829e37-c1f1-4fa0-a49f-dd599bcf97ed/alexandre-boucey-FuhXMEU8LNw-unsplash.jpg?v=1668704309781" class="card-img-top" alt="...">
  <div class="card-body">
      <label class="card-title h5 ">Realiza una busqueda rapida</label> 
     <form action="MostrarInventario.jsp">         
            <input class=" btn btn-info" type="submit" value="Buscar en el inventario">  
        </form>
  </div>
</div>
              </div>
            
            
        <div class="col-6 col-md-3 col-sm-6 mt-3">
        <div class="card bg-light">
  <img src="https://cdn.glitch.global/6b829e37-c1f1-4fa0-a49f-dd599bcf97ed/hans-reniers-lQGJCMY5qcM-unsplash.jpg?v=1668704467727" class="card-img-top" alt="...">
  <div class="card-body">
   <label class="card-title h5 ">Registra material nuevo en el laboratorio</label> 
     <form action="ingresar.jsp">         
            <input class=" btn btn-info" type="submit" value="Ingresar material">  
        </form>
  </div>
        </div><!-- comment -->
        </div>
        
        
        <div class="col-6 col-md-3 col-sm-6 mt-3">
        <div class="card bg-light" >
  <img src="https://cdn.glitch.global/6b829e37-c1f1-4fa0-a49f-dd599bcf97ed/WhatsApp%20Image%202022-11-17%20at%2011.05.19.jpeg?v=1668704782882" class="card-img-top" alt="...">
  <div class="card-body">
    <label class="card-title h5 ">Da de baja material extraviado o dañado</label> 
     <form action="mermas.jsp" method="POST">         
            <input class=" btn btn-info" type="submit" value="Registrar merma">  
        </form>
  </div>
        </div><!-- comment -->
        </div>
        
            
             <div class="col-6 col-md-3 col-sm-6 mt-3">
        <div class="card bg-light" >
  <img src="https://cdn.glitch.global/6b829e37-c1f1-4fa0-a49f-dd599bcf97ed/dfe52d79-49b1-4515-967e-21c8e6956009.jfif?v=1668704576151" class="card-img-top" alt="...">
  <div class="card-body">
    <label class="card-title h5 ">Organiza las visitas de practicas en el laboratorio</label> 
     <form action="Reportes.jsp" method="POST">         
            <input class=" btn btn-info" type="submit" value="Realizar reportes">  
        </form>
  </div>
        </div><!-- comment -->
        
        </div>
            <div class="col-6 col-md-3 col-sm-6 mt-3">
        <div class="card bg-light" >
  <img src="https://cdn.glitch.global/6b829e37-c1f1-4fa0-a49f-dd599bcf97ed/scott-graham-5fNmWej4tAA-unsplash.jpg?v=1669270619283" class="card-img-top" alt="...">
  <div class="card-body">
    <label class="card-title h5 ">Consulta de reportes</label> 
     <form action="ConsultaReportes.jsp" method="POST">         
            <input class=" btn btn-info" type="submit" value="Consulta reportes">  
     </form><br>
  </div>
        </div>
                
        </div>
        </div>
           
        
        
        </div>
        <form action="index.html">
        <input  class=" btn btn-danger mb-5 ml-5" type="submit" value="Volver a la pagina principal">
                </form>
        
        
    </section>
        
       
        <script src="js/jquery-3.6.1.min"></script>
      <script src="js/bootstrap.min"></script>
    </body>
</html>