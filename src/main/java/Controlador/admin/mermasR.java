/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador.admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexg
 */
@WebServlet(name = "mermasR", urlPatterns = {"/mermasR"})
public class mermasR extends HttpServlet {
    
        Modelo.FuncionesSQLReportes conexion = new Modelo.FuncionesSQLReportes();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet mermas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet mermas at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idmermar"));
        int cantidadmermar = Integer.parseInt(request.getParameter("cantidadmermar"));
        int cantidadoriginal = Integer.parseInt(request.getParameter("cantidadoriginal"));
        int folio = Integer.parseInt(request.getParameter("folio"));
        String nombre = request.getParameter("nombre");
        
        int cantidadnueva = cantidadoriginal - cantidadmermar;
        conexion.Actualizar(id, cantidadnueva);
        conexion.insertarMerma(folio, id, nombre, cantidadmermar);
        if (conexion.getStatusInsertar()==true){
            response.sendRedirect("ingresarExitoR.jsp");
        }else{
            response.sendRedirect("ingresarError.jsp");
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreR = request.getParameter("nombreR");
        
        
        try ( PrintWriter out = response.getWriter()) {
            int[] id, cantidad, codigo;
            int cont=0;
            String[] nombre,ubicacion;
            String[] valoresradio;
            
            conexion.MostrarUnRegistro(nombreR);
            id = conexion.getId();
            nombre = conexion.getNombre();
            ubicacion = conexion.getUbicacion();
            cantidad = conexion.getCantidad();
            codigo = conexion.getCodigo();
            String opcion = request.getParameter("mermaO");    
            cont = conexion.getNregistros();
            
            if (opcion!=null){
                cont = Integer.parseInt(opcion);;
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Datos encontrados</title>");   
                out.println("<meta charset='utf-8'/>");
                out.println(" <meta name='viewport' content='width=device-width, initial-scale=1' />");
                out.println("<link href='css/bootstrap.min.css' rel='stylesheet' type='text/css'/>");
                out.println("<title>Inventario de laboratorio_Microscopia</title>");
                out.println("<link rel='stylesheet' href='newcss.css' />");
                out.println("<script src='/script.js' defer></script>");
                out.println("</head>");
                out.println("<body class='cover text-white text-center'>");
                int folio;
                conexion.obtenerfolio();
                folio = conexion.getLastID();
                out.println("<h2 class='text-white'>Nota: Est&aacute;s mermando con el folio "+folio+"</h2>");
                out.println("<h3>MATERIAL SELECCIONADO</h3>");
                out.println("<br>");
                out.println("<table class='table row justify-content-center' border='2'>");
                out.println("<tr>");
                    out.println("<td> ID </td>");
                    out.println("<td> C&oacute;digo </td>");
                    out.println("<td> Nombre </td>");
                    out.println("<td> Cantidad </td>");
                    out.println("<td> Ubicaci&oacute;n </td>");
                out.println("</tr>");

                out.println("<tr>");               
                    out.println("<td>"+id[cont]+"</td>");
                    out.println("<td>"+codigo[cont]+"</td>");
                    out.println("<td>"+nombre[cont]+"</td>");
                    out.println("<td>"+cantidad[cont]+"</td>");
                    out.println("<td>"+ubicacion[cont]+"</td>");
                out.println("</tr>");
                out.println("</table>");
                out.println("<form action='http://localhost:8080/NanoInventario/mermasR' method='GET'>");
                out.println("<input type='hidden' name='idmermar' value='"+id[cont]+"'><br>");
                out.println("<input type='hidden' name='cantidadoriginal' value='"+cantidad[cont]+"'><br>");
                out.println("<input type='hidden' name='nombre' value='"+nombre[cont]+"'><br>");
                out.println("<input type='hidden' name='folio' value='"+folio+"'><br>");
                out.println("<h4>Ingrese cantidad a mermar </h4>");
                out.println("<br>");
                
                out.println("Cantidad <input class='btn' type='number' name='cantidadmermar' min='0' max='"+cantidad[cont]+"' required=''><br>");
                out.println("<br>");
                out.println("<input class='btn btn-danger'type='submit' value='Mermar'>");
                
                out.println("</form>");
                 out.println("<script src='js/jquery-3.6.1.min'></script>");
                  out.println("<script src='js/bootstrap.min'></script>");
                out.println("</body>");
                out.println("</html>");
                
            }else{
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Datos encontrados</title>");            
               out.println("<meta charset='utf-8'/>");
                out.println(" <meta name='viewport' content='width=device-width, initial-scale=1' />");
                out.println("<link href='css/bootstrap.min.css' rel='stylesheet' type='text/css'/>");
                out.println("<title>Inventario de laboratorio_Microscopia</title>");
                out.println("<link rel='stylesheet' href='newcss.css' />");
                out.println("<script src='/script.js' defer></script>");
                out.println("</head>");
                out.println("<body class='cover text-white text-center'>");
                int folio;
                conexion.obtenerfolio();
                folio = conexion.getLastID();
                out.println("<h2 class='text-white'>Nota: Est&aacute;s mermando con el folio "+folio+"</h2>");
                out.println("<h3>Seleccione el material a mermar</h3>");
                out.println("<br>");
                out.println("<form action='http://localhost:8080/NanoInventario/mermasR' method='POST'>");
                out.println("<table class='table row justify-content-center' border='2'>");
                out.println("<tr>");
                    out.println("<td> Opci&ocute;n </td>");
                    out.println("<td> ID </td>");
                    out.println("<td> C&oacute;digo </td>");
                    out.println("<td> Nombre </td>");
                    out.println("<td> Cantidad </td>");
                    out.println("<td> Ubicaci&oacute;n </td>");
                out.println("</tr>");

                for (int n=0;cont>n;n++){
                out.println("<tr>");
                    out.println("<td>");
                        out.println("<input type='radio' name='mermaO' value='"+n+"'>"); 
                    out.println("</td>");
                    out.println("<td>"+id[n]+"</td>");
                    out.println("<td>"+codigo[n]+"</td>");
                    out.println("<td>"+nombre[n]+"</td>");
                    out.println("<td>"+cantidad[n]+"</td>");
                    out.println("<td>"+ubicacion[n]+"</td>");
                out.println("</tr>");

                }
                out.println("</table>");
                out.println("<input class='btn btn-info' type='submit' value='Seleccionar'>");
                out.println("</form>");
                 out.println("<script src='js/jquery-3.6.1.min'></script>");
                  out.println("<script src='js/bootstrap.min'></script>");
                out.println("</body>");
                out.println("</html>");
            }
        }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
