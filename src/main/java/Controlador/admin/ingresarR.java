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
@WebServlet(name = "ingresarR", urlPatterns = {"/ingresarR"})
public class ingresarR extends HttpServlet {
    
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
            out.println("<title>Servlet ingresarR</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ingresarR at " + request.getContextPath() + "</h1>");
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
        PrintWriter out = response.getWriter(); 
        String profesor, practica;
        int alumnos, folio;
        int telefono;
        
        profesor = request.getParameter("profesor");
        practica = request.getParameter("practica");
        telefono = Integer.parseInt(request.getParameter("telefono"));
        alumnos = Integer.parseInt(request.getParameter("alumnos"));
        conexion.insertar(telefono, profesor, practica, alumnos);
        folio = conexion.getLastID();

            out.println("<!DOCTYPE html>");
            out.println("<html lang='en'>");
            out.println("<head>");
            out.println("<title>Reporte</title>"); 
            out.println("<meta charset='utf-8'/>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1' />");
            out.println("<link href='css/bootstrap.min.css' rel='stylesheet' type='text/css'/>");
            out.println("<title>Inventario de laboratorio_Microscop&iacute;a</title>");
            out.println("<link rel='stylesheet' href='newcss.css' />");
            out.println("<script src='/script.js' defer></script>");
            out.println("</head>");
            out.println("<body class='cover text-white text-center' >");
            out.println("<table class='table row justify-content-center' border='3'>" );
            out.println("<TD class='h2'> Se te ha asignado el folio "+folio+" para el siguiente reporte: </TD>");  
            out.println("<TR>");
                out.println("<TD> Folio:  "+folio+"</TD>");                 
            out.println("</TR>");
            out.println("<TR>");
                out.println("<TD> N&uacute;mero de telefono:  "+telefono+"</TD>");                 
            out.println("</TR>");
            out.println("<TR>");
                out.println("<TD> Nombre del profesor: "+profesor+"</TD>");                 
            out.println("</TR>");
            out.println("<TR>");
                out.println("<TD> Nombre de la pr&aacute;ctica: "+practica+"</TD>");                
            out.println("</TR>");
            out.println("<TR>");
                out.println("<TD> N&uacute;mero de alumnos: "+alumnos+"</TD>");                
            out.println("</TR>");
            
            out.println("</table>");
                

            out.println("Ahora, realiza las mermas correspondientes");
            out.println("<form action='http://localhost:8080/NanoInventario/mermasR.jsp' method='POST'>");
            out.println("<input class='btn btn-danger' type='submit' value='Empezar'>");
            out.println("</form>");
             
            out.println("<script src='js/jquery-3.6.1.min'></script>");
            out.println("<script src='js/bootstrap.min'></script>");
            out.println("</body>");
            out.println("</html>");
        
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


