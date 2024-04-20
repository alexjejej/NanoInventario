/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexg
 */
@WebServlet(name = "Inventario", urlPatterns = {"/Inventario"})
public class Inventario extends HttpServlet {
    
    Modelo.FuncionaesSQL conexion = new Modelo.FuncionaesSQL();

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
            out.println("<title>Servlet Inventario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Inventario at " + request.getContextPath() + "</h1>");
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
        try ( PrintWriter out = response.getWriter()) {
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
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Datos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='1'>");
            
            out.println("<tr>");
                out.println("<td> ID </td>");
                out.println("<td> Código </td>");
                out.println("<td> Nombre </td>");
                out.println("<td> Cantidad </td>");
                out.println("<td> Ubicacion </td>");
            out.println("</tr>");
            
            for (int n=0;cont>n;n++){
            out.println("<tr>");
                out.println("<td>"+id[n]+"</td>");
                out.println("<td>"+codigo[n]+"</td>");
                out.println("<td>"+nombre[n]+"</td>");
                out.println("<td>"+cantidad[n]+"</td>");
                out.println("<td>"+ubicacion[n]+"</td>");
            out.println("</tr>");
           
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            
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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Actualizar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action='http://localhost:8080/NanoInventario/Inventario' method='POST'>");
            out.println("Ingrese nombre a buscar: <input type='text' name='nombre'>");
            out.println("<input type='submit' value='Buscar'>");
            out.println("</form>");
            if (request.getParameter("nombre")!=null){
                int cont;
                String nombreBuscar=request.getParameter("nombre");
                //Buscar datos del nrc ingresado
                conexion.MostrarUnRegistro(nombreBuscar);
                    
                int[] id = conexion.getId();
                int[] cantidad = conexion.getCantidad(); 
                int[] codigo = conexion.getCodigo(); 
                String[] nombre = conexion.getNombre();
                String[] ubicacion = conexion.getUbicacion();
                cont = conexion.getNregistros();
                
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet Actualizar</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    
                    out.println("<table border='1'>");
            
                    out.println("<tr>");
                        out.println("<td> ID </td>");
                        out.println("<td> Código </td>");
                        out.println("<td> Nombre </td>");
                        out.println("<td> Cantidad </td>");
                        out.println("<td> Ubicacion </td>");
                    out.println("</tr>");
                    
                    for (int n=0;cont>n;n++){
                        out.println("<tr>");
                            out.println("<td>"+id[n]+"</td>");
                            out.println("<td>"+codigo[n]+"</td>");
                            out.println("<td>"+nombre[n]+"</td>");
                            out.println("<td>"+cantidad[n]+"</td>");
                            out.println("<td>"+ubicacion[n]+"</td>");
                        out.println("</tr>");

                        }                                
                    
                    out.println("</body>");
                    out.println("</html>");
                
            }
            out.println("</body>");
            out.println("</html>");
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
