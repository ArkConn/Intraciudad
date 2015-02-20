<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
       <%
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
           String dCifraA = ""; 
           String extremo = ""; 
           
           cifra = MD.C_MD5(texto);
           cifraD = MD.C_SHA(texto);
           cifraB = MD.Blow(texto);
           cifrade = MD.DeBlow(texto);
           cifraT = MD.C_MD5(MD.C_SHA(texto));
           cifraTodo = MD.Blow(MD.C_MD5(MD.C_SHA(texto)));
           CifraA = MD.AES(texto);
           dCifraA = MD.D_AES(CifraA);
           extremo = MD.Blow(MD.AES(MD.C_SHA(MD.C_MD5(texto))));
           
           out.println("Tu sensual texto :3   :" + texto + "\n" + "<br/><br/>");
           out.println("Esto es " + texto + " en MD5 :3   :" + cifra + "\n" + "<br/><br/>");
           out.println("Esto es " + texto + " en SHA1 :3   :" + cifraD + "\n" + "<br/><br/>");
           out.println("Esto es " + texto + " en Blowfish :3   :" + cifraB + "\n" + "<br/><br/>");
           out.println("Esto es desencriptado en Blowfish :3   :" + cifrade + "\n" + "<br/><br/>");
           out.println("Esto es " + texto + " en MD5 + SHA1 :" + cifraT + "\n" + "<br/><br/>");
           out.println("Esto es " + texto + " en AES :" + CifraA + "\n" + "<br/><br/>");
           out.println("Esto es desencriptado en AES :" + dCifraA + "\n" + "<br/><br/>");
           out.println("Esto es MD5 + SHA1 + AES + Blowfish xDDDDDDD :" + extremo + "\n" + "<br/><br/>");
           out.println("Esto es " + texto + " en MD5 + SHA1 + Blowfish xDDDDD :" + cifraTodo);
           
           
       %>
    
    </body>
</html>

    