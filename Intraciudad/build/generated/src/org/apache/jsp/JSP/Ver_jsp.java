package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Ver_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Intraciudad | Reportes</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/jpg\" href=\"../Imagenes/favicon.ico\">\n");
      out.write("        <link rel=\"Stylesheet\" href=\"../CSS/CSS.css\">        \n");
      out.write("        <link rel=\"Stylesheet\"  media=\"(min-width: 995px)\" href=\"../CSS/Barra.css\">     \n");
      out.write("        <link rel=\"Stylesheet\"  media=\"(max-width: 995px)\" href=\"../HTML/Otros/CSS/BarraR.css\">   \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" charset=\"UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" src=\"CSS/Fondo.js\"></script>               \n");
      out.write("        <script type=\"text/javascript\" src=\"CSS/actions.js\"></script>    \n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>        \n");
      out.write("    </head>\n");
      out.write("    <body onload=\"adjust();\" onresize=\"adjust()\">       \n");
      out.write("    <header>\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"../index.html\" target=\"_self\">\n");
      out.write("                        <span class=\"primero\">\n");
      out.write("                            <i class=\"icon icon-casita\"></i>\n");
      out.write("                        </span>\n");
      out.write("                        Inicio\n");
      out.write("                    </a>\n");
      out.write("                </li>                \n");
      out.write("                <li>\n");
      out.write("                    <a>\n");
      out.write("                        <span class=\"segundo\">\n");
      out.write("                            <i class=\"icon icon-metro-logo\">                                \n");
      out.write("                            </i>\n");
      out.write("                        </span>Metro</a>\n");
      out.write("                  <ul>\n");
      out.write("                        <li><a href=\"../HTML/STC/Mapa.html\" target=\"_self\">Mapa</a></li>                       \n");
      out.write("                        <li><a href=\"../HTML/STC/Lineas.html\" target=\"_self\" >Líneas</a></li>                       \n");
      out.write("                        <li><a href=\"../HTML/STC/Otros.html\" target=\"_self\">Otros Servicios</a></li>\n");
      out.write("                        <li><a href=\"../HTML/STC/Info.html\" target=\"_self\">Información</a></li> \n");
      out.write("                        <li><a href=\"http://www.metro.df.gob.mx/\" target=\"_blank\">Sitio</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a><span class=\"tercero\"><i class=\"icon icon-Metrobus_Mexico\"></i></span>Metrobus</a>\n");
      out.write("                     <ul>\n");
      out.write("                        <li><a href=\"../HTML/MB/Mapa.html\" target=\"_self\">Mapa de la red</a></li>\n");
      out.write("                        <li><a href=\"../HTML/MB/Linea1.html\" target=\"_self\">Línea 1</a></li>\n");
      out.write("                        <li><a href=\"../HTML/MB/Linea2.html\" target=\"_self\">Línea 2</a></li>\n");
      out.write("                        <li><a href=\"../HTML/MB/Linea3.html\" target=\"_self\">Línea 3</a></li>\n");
      out.write("                        <li><a href=\"../HTML/MB/Linea4.html\" target=\"_self\">Línea 4</a></li>\n");
      out.write("                        <li><a href=\"../HTML/MB/Linea5.html\" target=\"_self\">Línea 5</a></li>\n");
      out.write("                        <li><a href=\"../HTML/MB/Info.html\" target=\"_self\">Información</a></li>\n");
      out.write("                        <li><a href=\"http://www.metrobus.df.gob.mx/\" target=\"_blank\">Sitio</a></li> \n");
      out.write("                     </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a ><span class=\"cuarto\"><i class=\"icon icon-STE_logo\"></i></span>Tren Ligero</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"../HTML/STE/Linea.html\" target=\"_self\">Línea 1</a></li>                       \n");
      out.write("                        <li><a href=\"../HTML/STE/Info.html\" target=\"_self\">Información</a></li>\n");
      out.write("                        <li><a href=\"http://www.ste.df.gob.mx/index.html?page=1&content=3\" target=\"_blank\">Sitio</a></li> \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a ><span class=\"quinto\"><i class=\"icon icon-logosuburbano\"></i></span>Tren Suburbano</a>\n");
      out.write("                    <ul>                        \n");
      out.write("                        <li><a href=\"../HTML/TS/Linea.html\" target=\"_self\">Línea 1</a></li>\n");
      out.write("                        <li><a href=\"../HTML/TS/Info.html\" target=\"_self\">Información</a></li>\n");
      out.write("                        <li><a href=\"http://www.fsuburbanos.com/\" target=\"_blank\">Sitio</a></li> \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a ><span class=\"sexto\"><i class=\"icon icon-cero_emisiones\"></i></span>Cero Emisiones</a>\n");
      out.write("                    <ul>                        \n");
      out.write("                        <li><a href=\"../HTML/Trole/Linea.html\" target=\"_self\">Líneas</a></li>\n");
      out.write("                        <li><a href=\"../HTML/Trole/Info.html\" target=\"_self\">Información</a></li>\n");
      out.write("                        <li><a href=\"http://www.ste.df.gob.mx/index.html?page=1&content=2\" target=\"_blank\">Sitio</a></li> \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a ><span class=\"siete\"><i class=\"icon icon-Where-Is-My-Car-logo-on-mevvy\"></i></span>Corredor</a>\n");
      out.write("                    <ul>                        \n");
      out.write("                        <li><a href=\"../HTML/Corr/Ruta1.html\" target=\"_self\">Ruta 1</a></li>\n");
      out.write("                        <li><a href=\"../HTML/Corr/Ruta2.html\" target=\"_self\">Ruta 2</a></li>\n");
      out.write("                        <li><a href=\"../HTML/Corr/Ruta3.html\" target=\"_self\">Ruta 3</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>   \n");
      out.write("                <li>\n");
      out.write("                    <a ><span class=\"ocho\"><i class=\"icon icon-edificio\"></i></span>CETRAM</a>\n");
      out.write("                    <ul>                        \n");
      out.write("                        <li><a href=\"../HTML/CET/Linea.html\" target=\"_self\">Mapa de CETRAM</a></li>\n");
      out.write("                        <li><a href=\"../HTML/CET/Info.html\" target=\"_self\">Información</a></li>\n");
      out.write("                        <li><a href=\"http://www.cetram.df.gob.mx/\" target=\"_blank\">Sitio</a></li> \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a ><span class=\"nueve\"><i class=\"icon icon-cog-cogwheel-gear-zahnrad-hi\"></i></span>Más servicios</a>\n");
      out.write("                    <ul>                        \n");
      out.write("                        <li><a href=\"../HTML/Eco/Linea.html\" target=\"_self\">Ecobici</a></li>\n");
      out.write("                        <li><a href=\"../HTML/Otros/Reporte.html\" target=\"_self\">Reporte de Tránsito</a></li>                        \n");
      out.write("                        <li><a href=\"../HTML/Otros/Lugares.html\" target=\"_self\">Lugares Concurridos</a></li>\n");
      out.write("                        <li><a href=\"../HTML/Otros/Manual.html\" target=\"_self\">Manual</a></li>\n");
      out.write("                        <li><a href=\"../HTML/Otros/Ask.html\" target=\"_self\">Preguntas Frecuentes</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </header>           \n");
      out.write("         <img src=\"../../Imagenes/logo.png\" id=\"fondo\" /><A NAME=\"Arriba\"></A>\n");
      out.write("         \n");
      out.write("         <div id=\"MenuBar\">\t\t\t\t\n");
      out.write("\t\t\t<a href=\"HTML/Opciones/Metro.html\" target=\"_self\"><div class=\"option\">\n");
      out.write("\t\t\t\tMetro\n");
      out.write("\t\t\t</div></a>\n");
      out.write("            <a href=\"HTML/Opciones/Metrobus.html\" target=\"_self\"><div class=\"option\">\n");
      out.write("\t\t\t\tMetrobus\n");
      out.write("\t\t\t</div></a>\n");
      out.write("            <a href=\"HTML/Opciones/TL.html\" target=\"_self\"><div class=\"option\">\n");
      out.write("\t\t\t\tTren Ligero\n");
      out.write("\t\t\t</div></a>\n");
      out.write("            <a href=\"HTML/Opciones/TS.html\" target=\"_self\"><div class=\"option\">\n");
      out.write("\t\t\t\tTren Suburbano\n");
      out.write("\t\t\t</div></a>\n");
      out.write("            <a href=\"HTML/Opciones/Cero.html\" target=\"_self\"><div class=\"option\">\n");
      out.write("\t\t\t\tCero Emisiones\n");
      out.write("\t\t\t</div></a>\n");
      out.write("            <a href=\"HTML/Opciones/Run.html\" target=\"_self\"><div class=\"option\">\n");
      out.write("\t\t\t\tCorredor\n");
      out.write("\t\t\t</div></a>\n");
      out.write("            <a href=\"HTML/Opciones/CET.html\" target=\"_self\"><div class=\"option\">\n");
      out.write("\t\t\t\tCETRAM\n");
      out.write("\t\t\t</div></a>\n");
      out.write("            <a href=\"HTML/Opciones/Mas.html\" target=\"_self\"><div class=\"option\">\n");
      out.write("\t\t\t\tMás\n");
      out.write("\t\t\t</div></a>                        \n");
      out.write("\t\t</div>\n");
      out.write(" \n");
      out.write("        \n");
      out.write("        <div id=\"lolR\">  \n");
      out.write("            \n");
      out.write("            <div id=\"NavigationBar\">\n");
      out.write("\t\t\t\t<div id=\"icon\">\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"j\" id=\"iconButton\" onclick=\"sMenu()\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"title\">\t\t\t\n");
      out.write("\t\t\t\t\t<h1>Reportes</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("            <div class=\"center\" id=\"wwR2\">\n");
      out.write("                ");

                    Clases.Base conex = new Clases.Base();
                    conex.conectar();
                    conex.VerRep();
                    ResultSet rs = null;
                    while (rs.next()){
                    out.println(" <div id='Rep' class='rep'><img src='"+rs.getString("Ruta_Img")+"' class='Imagen'>"
                            + "<p class='TitRep'>'"+rs.getString("Titulo")+"'</p><br/><p>'"+rs.getString("Descripcion")+"'</p>"+
                            "<br/></div>");
                    }
                 
                
      out.write("\n");
      out.write("                \n");
      out.write("            </div>                     \n");
      out.write("        <div id=\"wwRep\">\n");
      out.write("         <A HREF=\"#Arriba\">Subir</A>\n");
      out.write("     </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         <footer class=\"redOt\">\n");
      out.write("             <a href=\"#\"><img src=\"../Imagenes/fbbn.png\" id=\"fb\" class=\"red\" onmouseover=\"this.src='../Imagenes/fb.png'\" onmouseout=\"this.src='../Imagenes/fbbn.png'\"></a>\n");
      out.write("             <a href=\"#\"><img src=\"../Imagenes/twitb.png\"  class=\"red\" onmouseover=\"this.src='../Imagenes/twit.png'\" onmouseout=\"this.src='../Imagenes/twitb.png'\"></a>\n");
      out.write("             <a href=\"#\"><img src=\"../Imagenes/instb.png\"  class=\"red\" onmouseover=\"this.src='../Imagenes/inst.png'\" onmouseout=\"this.src='../Imagenes/instb.png'\"></a>\n");
      out.write("             <a href=\"#\"><img src=\"../Imagenes/ytb.png\" class=\"red\" onmouseover=\"this.src='../Imagenes/yt.png'\" onmouseout=\"this.src='../Imagenes/ytb.png'\"></a>\n");
      out.write("             \n");
      out.write("         </footer>\n");
      out.write("\t</body>\n");
      out.write("</html>   \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
