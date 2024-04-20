<%-- 
    Document   : MostrarInventario
    Created on : 15/11/2022, 03:36:28 PM
    Author     : alexg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
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
        
        <header class=" text-center mr-4 mt-4">
            
        <a Class="h1 text-info text-uppercase font-weight-bold font-italic ">Inventario</a>
        <%
        Modelo.FuncionaesSQL conexion = new Modelo.FuncionaesSQL();
        int[] id, cantidad, codigo;
            int cont;
            String[] nombre,ubicacion;        
            
            conexion.mostrar();
            cont = conexion.getNregistros();
            id = conexion.getId();
            nombre = conexion.getNombre();
            ubicacion = conexion.getUbicacion();
            cantidad = conexion.getCantidad();
            codigo = conexion.getCodigo();
            
            out.println("<form action='http://localhost:8080/NanoInventario/MostrarInventarioUs.jsp'>");
            out.println("<br><br>");
            out.println("<a Class='h3 text-white '>Ingrese el material a buscar</a>");
            out.println("<input type='text' name='nombre' required=''>");
            out.println("<input class='btn btn-info' type='submit' value='Buscar'>");
            out.println("</form>");
            out.println("<form action='http://localhost:8080/NanoInventario/index.html'>");
            out.println("<input class='btn btn-info' type='submit' value='Volver'>");
            out.println("</form>");
            out.println("<form action='http://localhost:8080/NanoInventario/MostrarInventarioUs.jsp'>");
            out.println("<input class='btn btn-info' type='submit' value='Ver todo'>");
            out.println("</form>");
            
            
            if (request.getParameter("nombre")!=null){
                
                String nombreBuscar=request.getParameter("nombre");
                //Buscar datos del nombre ingresado
                conexion.MostrarUnRegistro(" "+nombreBuscar);
                cont = conexion.getNregistros();
            }
            
            
            out.println("<table border='1' class='table'>");
            out.println("<thead class='table-light text-dark' text-uppercase> ");
            
            out.println("<tr>");
                out.println("<td> ID </td>");
                out.println("<td> Código </td>");
                out.println("<td> Nombre </td>");
                out.println("<td> Cantidad g/mL </td>");
                out.println("<td> Ubicación </td>");
            out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody class='text-white'>");
           

            for (int n=0;cont>n;n++){
            out.println("<tr>");
                out.println("<td>"+id[n]+"</td>");
                out.println("<td>"+codigo[n]+"</td>");
                out.println("<td>"+nombre[n]+"</td>");
                out.println("<td>"+cantidad[n]+"</td>");
                out.println("<td>"+ubicacion[n]+"</td>");
            out.println("</tr>");
            
           
            }
            if (cont==0){
            out.println("<tr>");
                out.println("<td>Error</td>");
                out.println("<td>No se encontró ningún reactivo con ese nombre</td>");
            }
            
            out.println("</tbody>");
            out.println("</table>");
        %>
    <script src="js/jquery-3.6.1.min"></script>
      <script src="js/bootstrap.min"></script>
    </body>
</html> 
