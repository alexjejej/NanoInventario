<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
        <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <title>Formulario para ingresar</title>

    <!-- import the webpage's stylesheet -->
    <link rel="stylesheet" href="newcss.css" />
   
    
    <!-- import the webpage's javascript file -->
    <script src="/script.js" defer></script>
  </head>
    
    <body class="fondo2 mt-5 text-white">
        
        <header>
            <div class="row justify-content-center mr-1 mt-5 text-white h3 ">
                Ingrese los datos del material
            </div> <br><!--  -->
            
        </header>
        <form action="http://localhost:8080/NanoInventario/ingresar" method="post">
           <div class="table row justify-content-center">
                    <div class="col-auto ml-5 mr-5">
            <table border="7"> 
               <tr>
                   <td>Codigo <input class="btn btn-light" type="number" name="codigo" required="" pattern="[0-9]+" min="1"><br></td>
               </tr>
               <tr>
                   <td>Nombre <input class="btn btn-light text-justify" type="text" name="nombre" required="" pattern="[a-z A-Z]+"><br></td>
               </tr>
               <tr>
                   <td>Cantidad (mL/g)<input class="btn btn-light" type="number" name="cantidad" required="" pattern="[0-9]+" min="1" max="10000" minlength="1" maxlength="5"><br></td>
               </tr>
               <tr>
                            <td>Ubicación <select class="btn btn-light" name="ubi" id="ubi">
                                    <option value="Gabeta 1">Gabeta 1 </option>
                                    <option value="Gabeta 2">Gabeta 2 </option>
                                    <option value="Gabeta 3">Gabeta 3 </option>
                                    <option value="Gabeta 4">Gabeta 4 </option>
                                    <option value="Gabeta 5">Gabeta 5 </option>
                                    <option value="Gabeta 6">Gabeta 6 </option>
                                    <option value="Vitrina 1">Vitrina 1 </option>
                                    <option value="Vitrina 2">Vitrina 2 </option>
                                    <option value="Vitrina 3">Vitrina 3 </option>
                                    <option value="Vitrina 4">Vitrina 4 </option>
                                </select><br><br></td>
               </tr>
               </form>
               <tr>
                   <td><input class="btn btn-danger" type="submit" value="Ingresar">
                       <form action='VistaAdmin.jsp'><br>
                       <input class='btn btn-info' type='submit' value='Volver'>
                       </form>
                    <br></td>
           </tr>
            </table>
           </div>
           </div>
        <script src="js/jquery-3.6.1.min"></script>
      <script src="js/bootstrap.min"></script>
    </body>
</html>