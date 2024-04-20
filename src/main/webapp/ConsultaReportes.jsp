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
        Modelo.FuncionesSQLReportes conexion = new Modelo.FuncionesSQLReportes();
        int[] folio, telefono, numeroalumnos, id, cantidad;
            int cont, contM;
            String[] profesor,nombrepractica, nombrereactivo;        
 
            
            out.println("<form action='http://localhost:8080/NanoInventario/ConsultaReportes.jsp'>");
            out.println("<br><br>");
            out.println("<a Class='h3 text-white '>Ingrese el folio a buscar</a>");
            out.println("<input type='number' name='nombre' required=''>");
            out.println("<input class='btn btn-info' type='submit' value='Buscar'>");
            out.println("</form>");
            out.println("<form action='http://localhost:8080/NanoInventario/VistaAdmin.jsp'>");
            out.println("<input class='btn btn-info' type='submit' value='Volver'>");
            out.println("</form>");           
            
            if (request.getParameter("nombre")!=null){
                
                int nombreBuscar=Integer.parseInt(request.getParameter("nombre"));
                //Buscar datos del nombre ingresado
                conexion.MostrarFolio(nombreBuscar);
                cont = conexion.getNregistros();
                folio = conexion.getfolio();
                cont = conexion.getNregistros();
                
                telefono = conexion.gettelefono();
                numeroalumnos = conexion.getnumeroalumnos();
                profesor = conexion.getProfesor();
                nombrepractica = conexion.getnombrepractica();
                id = conexion.getId();
                cantidad = conexion.getCantidad();
                nombrereactivo = conexion.getNombre();
                out.println("<table border='1' class='table'>");
                out.println("<thead class='table-light text-dark' text-uppercase> ");
                out.println("<br>");
                out.println("<a Class='h3 text-white '>Datos de reporte encontrados:</a>");
                out.println("<tr>");
                    out.println("<td> Folio </td>");
                    out.println("<td> Telefono </td>");
                    out.println("<td> Profesor </td>");
                    out.println("<td> Nombre de práctica </td>");
                    out.println("<td> Número de alumnos </td>");
                out.println("</tr>");
                out.println("</thead>");
                out.println("<tbody class='text-white'>");


                for (int n=0;cont>n;n++){
                out.println("<tr>");
                    out.println("<td>"+folio[n]+"</td>");
                    out.println("<td>"+telefono[n]+"</td>");
                    out.println("<td>"+profesor[n]+"</td>");
                    out.println("<td>"+nombrepractica[n]+"</td>");
                    out.println("<td>"+numeroalumnos[n]+"</td>");
                out.println("</tr>");
            }
            out.println("</tbody>");
            out.println("</table>");
            out.println("<br>");
            out.println("<a Class='h3 text-white '>Merma realizada</a>");
            out.println("<table border='1' class='table'>");
            out.println("<thead class='table-light text-dark' text-uppercase> ");
            conexion.MostrarMermas(nombreBuscar);
            out.println("<tr>");
                    out.println("<td> Folio </td>");
                    out.println("<td> ID </td>");
                    out.println("<td> Nombre del reactivo </td>");
                    out.println("<td> Cantidad usada en gr/ml</td>");
                out.println("</tr>");
                out.println("</thead>");
                out.println("<tbody class='text-white'>");

                contM = conexion.getNregistrosM();
                for (int n=0;contM>n;n++){
                out.println("<tr>");
                    out.println("<td>"+folio[n]+"</td>");
                    out.println("<td>"+id[n]+"</td>");
                    out.println("<td>"+nombrereactivo[n]+"</td>");
                    out.println("<td>"+cantidad[n]+"</td>");
                out.println("</tr>");
            }
            
            
            if (cont==0){
            out.println("<tr>");
                out.println("<td>Error</td>");
                out.println("<td>No se encontró ningún folio con este número</td>");
            }
   
           
            }
            
            
            out.println("</tbody>");
            out.println("</table>");
        %>
    <script src="js/jquery-3.6.1.min"></script>
      <script src="js/bootstrap.min"></script>
    </body>
</html> 
