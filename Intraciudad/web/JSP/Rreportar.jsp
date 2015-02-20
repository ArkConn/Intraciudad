
<%-- 
    Document   : Rreportar
    Created on : 16/02/2015, 10:36:26 PM
    Author     : Carlos Elliot
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    </body>
</html>
<%
    request.setCharacterEncoding("UTF-8");
    Clases.Base conex = new Clases.Base();
    conex.conectar();    
    String titulo = request.getParameter("Titulo");
    String calle = request.getParameter("Calle");
    String colonia = request.getParameter("Colonia");
    String delegacion = request.getParameter("deleg");
    String numero = request.getParameter("numero");
    String descripcion = request.getParameter("Descripción");
    String Imagen= "";
    
                 Imagen = "F:/Materias/Quinto/Laboratorio III/Absolución A/Intraciudad 2.0/web/IMAG/";
                 /*conex.Reporte*/ out.println(titulo+calle+colonia+ delegacion+numero+ descripcion+ Imagen);       
               
                
                String mensaje= "<script language='javascript'> alert('REGISTRO EXITOSO DEL REPORTE'); document.location=('../HTML/Otros/Reportar.html'); </script>";
                out.println(mensaje); 

    //if(item.getContentType() == "image/jpg" || item.getContentType() == ".png" || item.getContentType() == ".jpeg" || item.getContentType() == ".gif")
    
    %>
