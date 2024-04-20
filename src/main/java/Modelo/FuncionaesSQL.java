/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author alexg
 */
public class FuncionaesSQL {
    
    private static final String url = "jdbc:mariadb://localhost:3306/inventario";
    static final String JDBC_DRIVER = "org.mysql.jdbc.Driver";
    private static final String username = "root";
    private static final   String password = "root";
    private static Connection conn = null;
    private static Statement  stmt = null; 
    private int InsertarResult;
    private int cont=0;
    private int nrcAct=0;
    private int idlast=0;
    private int[] id = new int[100];
    private String[] nombre = new String[100];
    private String[] ubicacion = new String[100];
    private int [] codigo = new int[100];
    private int [] cantidad = new int[100];
    private boolean statusMostrar, statusInsertar;
    

    
    public static void open() {
    try {
        Class.forName("org.mariadb.jdbc.Driver");
        conn = DriverManager.getConnection(url,username,password);
        stmt = conn.createStatement();   
        if ( conn != null ){ 
            System.out.println("Conexión con éxito");
            }
        } catch (Exception ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }
    public static void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {  
        open();
        
    }
    
    public String[] getNombre() {  
    return nombre;  
}
    public int[] getCantidad() {  
    return cantidad;  
}
    public int[] getCodigo() {  
    return codigo;  
}
    public String[] getUbicacion() {  
    return ubicacion;  
}
    public int[] getId() {  
    return id;  
}
    public void setId(int id){
        nrcAct=id;
        idlast=id;
    }
    public int getLastID(){     
        return idlast;
    }
    public int getNrcAct(){
        return nrcAct;
    }

    public boolean getStatusMostrar() {  
    return statusMostrar;  
}
    public boolean getStatusInsertar() {  
    return statusInsertar;  
}
    public int getNregistros() {  
    return cont;  
}
    
    public void mostrar(){
        try {
            open();
            try {
              // Ejecutamos Query para mostrar
              ResultSet rs = stmt.executeQuery("SELECT * FROM inventario");
              
                      
              // Recorremos el resultado
              while (rs.next()){                
                id[cont] = rs.getInt(1);
                codigo[cont] = rs.getInt(2);
                nombre[cont] = rs.getString(3);               
                cantidad[cont] = rs.getInt(4);
                ubicacion[cont] = rs.getString(5);
                
                cont = cont+1;
              }
              statusMostrar = true;
              } catch (SQLException sqle) {                
                System.out.println("Error en la ejecución:" 
              + sqle.getErrorCode() + " " + sqle.getMessage());   
                statusMostrar = false;
              }
          } catch (Exception e) { 
            System.out.println("Error en la conexión:" + e.toString() );
            statusMostrar = false;
          } finally {
            try {
              // Cerramos posibles conexiones abiertas
              if (conn!=null) conn.close();    
            } catch (Exception e) {
              System.out.println("Error cerrando conexiones: "
                + e.toString());
            } 
          }
                  
    }
    
    public void insertar(int codigo, String nombre, int cantidad, String ubicacion){
        try {
            obtenerID();
            int id;            
            id = getLastID();
            open();
            stmt = conn.createStatement();       
            stmt.executeUpdate("INSERT INTO inventario VALUES (' "+id+" ', ' "+codigo+" ',' "+nombre+" ',"
                    + "' " +cantidad+ " ', '" +ubicacion+"')"); 
            
            System.out.println("Los valores han sido agregados a la base de datos "); 
            statusInsertar = true;
          } catch (Exception e) { 
            System.out.println("Error:" + e.toString() );
            statusInsertar = false;
            
          } finally {
            try {
              // Cerramos posibles conexiones abiertas
              if (conn!=null) 
               conn.close();
              System.out.println("Conexión cerrada");
            } catch (Exception e) {
              System.out.println("Error cerrando conexiones: "
                + e.toString());
            } 
          }
                  
    }
    
    public void MostrarUnRegistro(String nombreBuscar){
        try {
            open();
            stmt = conn.createStatement();       
            ResultSet rs = stmt.executeQuery("SELECT * FROM inventario WHERE nombre LIKE'%"+nombreBuscar+"%'");
            System.out.println(nombreBuscar);
            cont = 0;
            while (rs.next()){
                    
                id[cont] = rs.getInt(1);
                codigo[cont] = rs.getInt(2);
                nombre[cont] = rs.getString(3);               
                cantidad[cont] = rs.getInt(4);
                ubicacion[cont] = rs.getString(5);                
               System.out.println("Datos encontrados: "+id[cont]+codigo[cont]+nombre[cont]+cantidad[cont]+ubicacion[cont]);
               cont = cont+1;
              }
            
          } catch (Exception e) { 
            System.out.println("Error:" + e.toString() );
            statusInsertar = false;
            
          } finally {
            try {
              // Cerramos posibles conexiones abiertas
              if (conn!=null) 
               conn.close();
              System.out.println("Conexión cerrada");
            } catch (Exception e) {
              System.out.println("Error cerrando conexiones: "
                + e.toString());
            } 
          }
    }
    public void Actualizar (int id, int cantidad) {
        try {
            open();
            stmt = conn.createStatement();       
          
            stmt.executeQuery("UPDATE inventario SET cantidad='"+cantidad+"' WHERE ID='"+id+"'");
            statusInsertar = true;    
            
          } catch (Exception e) { 
            System.out.println("Error:" + e.toString() );
            statusInsertar = false;
            
          } finally {
            try {
              // Cerramos posibles conexiones abiertas
              if (conn!=null) 
               conn.close();
              System.out.println("Conexión cerrada");
            } catch (Exception e) {
              System.out.println("Error cerrando conexiones: "
                + e.toString());
            } 
          }
    }
    public void Borrar(int nrc) {
        try {
            open();
            stmt = conn.createStatement();       
          
            stmt.executeQuery("DELETE FROM alumnos WHERE NRC='"+nrc+"'");
                      
            
          } catch (Exception e) { 
            System.out.println("Error:" + e.toString() );
            statusInsertar = false;
            
          } finally {
            try {
              // Cerramos posibles conexiones abiertas
              if (conn!=null) 
               conn.close();
              System.out.println("Conexión cerrada");
            } catch (Exception e) {
              System.out.println("Error cerrando conexiones: "
                + e.toString());
            } 
          }
    }

    private void obtenerID() {
       try {
           int id = 0;
            open();
            stmt = conn.createStatement();       
          
            ResultSet rs = stmt.executeQuery("SELECT ID FROM inventario ORDER by ID DESC LIMIT 1");
            
            while (rs.next()){
                id = rs.getInt(1);
                System.out.println(id);
              }
            id = id + 1;
            setId(id);
       }            
           catch (Exception e) { 
            System.out.println("Error:" + e.toString() );
            
          } finally {
            try {
              // Cerramos posibles conexiones abiertas
              if (conn!=null) 
               conn.close();
              System.out.println("Conexión cerrada");
            } catch (Exception e) {
              System.out.println("Error cerrando conexiones: "
                + e.toString());
            } 
          }
    }
    

    }
    

