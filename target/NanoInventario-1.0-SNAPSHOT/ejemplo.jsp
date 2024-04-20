<%-- 
    Document   : newjsf
    Created on : 17 nov. 2022, 11:48:56
    Author     : Luis Ortega
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 <html>
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
        <header class=" text-center mr-4 mt-4">
            
            <a Class="h1 text-white text-uppercase font-weight-bold font-italic ">Inventario</a>   
            
        </header> <br><br>
       
           <table border="10" class="table">
            <thead class="table-light text-dark">
            <tr>
                <td> ID     </td>
               <td> Código     </td>
                <td> Nombre    </td>
               <td> Cantidad    </td>
                <td> Ubicacion    </td>
           </tr>
            </thead>
            <tbody class="text-white">
           <tr>
                <td>"    "</td>
               <td>"     "</td>
               <td>"    "</td>
               <td>"     "</td>
                <td>"       "</td>
            </tr>
            </tbody>
           </table>
       <script src="js/jquery-3.6.1.min"></script>
      <script src="js/bootstrap.min"></script>
    </body>
</html>