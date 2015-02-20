<%-- 
    Document   : Linea
    Created on : 18/02/2015, 01:36:23 PM
    Author     : Alumno
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String linea = request.getParameter("linea");
    Clases.Base Moy = new Clases.Base();
    Moy.conectar();    
    
    if(linea == "A" || linea == "B" || linea == "TL" || linea == "TS") {
        out.println("Es la sensual linea " + linea);
        ResultSet rs = Moy.Linea_todo(linea);
        while(rs.next()){
            out.println(" " + rs.getString("Ruta_Img") + "<br/>");
            out.println(" " + rs.getString("Nombre") + "<br/>");
            out.println(" " + rs.getString("Calle") + "<br/>");
            out.println(" " + rs.getString("Colonia") + "<br/>");
            out.println(" " + rs.getString("Delegacion") + "<br/>");
            out.println(" " + rs.getString("No_Ext") + "<br/>" + "<br/>" + "<br/>");
      
        }
    }
    else{    
    int line;         
    int entero = Integer.parseInt(linea);
    line = entero - 1; 
    String lineS = Integer.toString(line);
    out.println("Es la sensual linea " + linea +" <br/> Y a la base irá : " + lineS);
    
    ResultSet rs = Moy.Linea_todo(lineS);
        while(rs.next()){
            out.println(" " + rs.getString("Ruta_Img") + "<br/>");
            out.println(" " + rs.getString("Nombre") + "<br/>");
            out.println(" " + rs.getString("Calle") + "<br/>");
            out.println(" " + rs.getString("Colonia") + "<br/>");
            out.println(" " + rs.getString("Delegacion") + "<br/>");
            out.println(" " + rs.getString("No_Ext") + "<br/>" + "<br/>" + "<br/>");     
            
        }
    }
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
