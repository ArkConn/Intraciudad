package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class a_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("       ");

           Clases.Cifrado MD = new Clases.Cifrado();
           request.setCharacterEncoding("UTF-8");
           String texto = request.getParameter("textito");
           String cifra = "";
           String cifraD = "";
           String cifraT = "";
           String cifraB = "";
           String cifrade = "";
           String cifraTodo = "";
           String CifraA = ""; 
           
           cifra = MD.C_MD5(texto);
           cifraD = MD.C_SHA(texto);
           cifraB = MD.Blow(texto);
           cifrade = MD.DeBlow(texto);
           cifraT = MD.C_MD5(MD.C_SHA(texto));
           cifraTodo = MD.Blow(MD.C_MD5(MD.C_SHA(texto)));
           CifraA = MD.AES(texto);
           
           
           out.println("Tu sensual texto :3   :" + texto + "\n" + "<br/><br/>");
           out.println("Esto es " + texto + " en MD5 :3   :" + cifra + "\n" + "<br/><br/>");
           out.println("Esto es " + texto + " en SHA1 :3   :" + cifraD + "\n" + "<br/><br/>");
           out.println("Esto es " + texto + " en Blowfish :3   :" + cifraB + "\n" + "<br/><br/>");
           out.println("Esto es desencriptado en Blowfish :3   :" + cifrade + "\n" + "<br/><br/>");
           out.println("Esto es " + texto + " en MD5 + SHA1 :" + cifraT + "\n" + "<br/><br/>");
           out.println("Esto es " + texto + " en AES :" + CifraA + "\n" + "<br/><br/>");
           out.println("Esto es " + texto + " en MD5 + SHA1 + Blowfish xDDDDD :" + cifraTodo);
           
           
       
      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    ");
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
