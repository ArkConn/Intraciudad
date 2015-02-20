
<%-- 
    Document   : Reportar
    Created on : 16/02/2015, 10:36:26 PM
    Author     : Carlos Elliot
--%>


<%@page import="java.io.IOException"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="org.apache.commons.io.FileUtils"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="com.oreilly.servlet.MultipartRequest" %>

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
    
         /*FileItemFactory es una interfaz para crear FileItem*/
        FileItemFactory file_factory = new DiskFileItemFactory();
 
        /*ServletFileUpload esta clase convierte los input file a FileItem*/
        ServletFileUpload servlet_up = new ServletFileUpload(file_factory);
        /*sacando los FileItem del ServletFileUpload en una lista */
        List items = servlet_up.parseRequest(request);
 
        for(int i=0;i<items.size();i++){
            /*FileItem representa un archivo en memoria que puede ser pasado al disco duro*/
            FileItem item = (FileItem) items.get(i);
            /*item.isFormField() false=input file; true=text field*/
            if (! item.isFormField()){
                /*cual sera la ruta al archivo en el servidor*/
                File archivo_server = new File("D:/Materias/Quinto/Laboratorio III/Absolución A/Intraciudad 2.0/web/IMAG/"+item.getName());                
                /*y lo escribimos en el servidor*/
                item.write(archivo_server);
                out.print("Nombre --> " + item.getName() );
                out.print("<br> Tipo --> " + item.getContentType());
                out.print("<br> tamaño --> " + (item.getSize()/1240)+ "KB");
                out.print("<br>");
                 Imagen = "../IMAG/"+item.getName();
                 /*conex.Reporte*/ 
        }}
               out.println(titulo+calle+colonia+ delegacion+numero+ descripcion+ Imagen);
                
                String mensaje= "<script language='javascript'> alert('REGISTRO EXITOSO DEL REPORTE'); document.location=('../HTML/Otros/Reportar.html'); </script>";
                out.println(mensaje); 

    //if(item.getContentType() == "image/jpg" || item.getContentType() == ".png" || item.getContentType() == ".jpeg" || item.getContentType() == ".gif")
    
    %>