<%-- 
    Document   : newjsf
    Created on : 18 nov. 2022, 17:53:51
    Author     : Luis Ortega
--%>
<!DOCTYPE html>
<html>
      <head>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <title>Formulario para ingresar</title>

    <!-- import the webpage's stylesheet -->
    <link rel="stylesheet" href="newcss.css" />
   
    
    <!-- import the webpage's javascript file -->
    <script src="/script.js" defer></script>
      </head>
    <body class="fondo2">
        <%--
            Numero 
            Nombre del profesor
            Nombre de la práctica 
            Número de alumnos
            Material utilizado
        --%>
        <header>
            <div class="row justify-content-center mr-1 mt-5 text-white h3">
                Reporte de práctica
            </div><br> 
            
        </header>
        
        <div class="table row justify-content-center">
                    <div class="col-auto ml-5 mr-5">
        <form action="http://localhost:8080/NanoInventario/ingresarR" method="POST">
  
                        
           <table border="5"> 
               <tr>   
                <td class="text-white">Número de telefono (33) <input class="btn btn-light" type="text" name="telefono" required="" pattern="[0-9]+" minlength="1" maxlength="8" max="2147483647"><br></td>  
               </tr>
               <tr>
                   <td class="text-white">Nombre del profesor <input  class="btn btn-light text-justify" type="text" name="profesor" required="" pattern="[a-z A-Z]+"><br></td>
               </tr>
               <tr>
                   <td class="text-white">Nombre de la práctica <input  class="btn btn-light text-justify" type="text" name="practica" required="" pattern="[a-z A-Z]+"><br></td>
               </tr>
               <tr>
                   <td class="text-white" >Número de alumnos <input class="btn btn-light" type="number" name="alumnos" required="" pattern="[0-9]+" min="1" max="100" minlength="1" maxlength="2"><br></td>
               </tr>

               <tr>
                   <td><input class="btn btn-info" type="submit" value="Generar">   
                       <input class="btn btn-danger" type="reset" value="Borrar"><br></td>
               </tr>
           </table><br>
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