/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.FuncionaesSQL;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.console;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexg
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {
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
            String nombre, contra;
            nombre = request.getParameter("nombre");
            contra = request.getParameter("contra");
            System.out.println("nombre: "+nombre+" contra: "+contra);
            if ("nano".equals(nombre) && "1234".equals(contra)){
                
            response.sendRedirect("VistaAdmin.jsp");  
                
            } 
            else{
                
            out.println("<!DOCTYPE html>");
            out.println("<html lang='en'>");
            out.println("<head>");
            out.println("<meta charset='utf-8' />");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1' />");
            out.println("<link href='css/bootstrap.min.css' rel='stylesheet' type='text/css'/>");
            out.println("<title>Inventario de laboratorio_Microscopia</title>");
            out.println("<link rel='stylesheet' href='newcss.css' />");
            out.println("<script src='/script.js' defer></script>");
            out.println("</head>");
            out.println("<body class='cover text-white h4 mt-5'>");
            out.println("<div class='row justify-content-center'");
            out.println("<a> Datos incorrectos</a>");
            out.println("<form action= 'http://localhost:8080/NanoInventario/index.html'>");
            out.println("<br>");
            out.println("<br>");
            out.println("</div>");
            out.println("<div class='d-flex justify-content-center'>");
            out.println("<input type='submit' class='btn btn-danger' aria-current='page' value='Volver'>");   
            out.println("</div>");
            out.println("</form>");
            out.println("<script src='js/jquery-3.6.1.min'></script>");
            out.println("<script src='js/bootstrap.min'></script>");
            out.println("</body>");
            out.println("</html>");
    }}}
    

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
            //Conectar con modelo a actualizar
          
            out.println("Ingrese los datos");
            out.println("<form action= 'http://localhost:8080/NanoInventario/login' method='GET'>");
            out.println("Nombre <input type='text' name='nombre' ><br>");
            out.println("Contraseña <input type='password' name='contra' ><br>");
            out.println("<input type='submit' value='Ingresar'>");
            out.println("</form>");
            
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
