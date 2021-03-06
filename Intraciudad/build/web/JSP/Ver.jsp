<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Intraciudad | Reportes</title>
        <link rel="icon" type="image/jpg" href="../Imagenes/favicon.ico">
        <link rel="Stylesheet" href="../CSS/CSS.css">        
        <link rel="Stylesheet"  media="(min-width: 995px)" href="../CSS/Barra.css">     
        <link rel="Stylesheet"  media="(max-width: 995px)" href="../HTML/Otros/CSS/BarraR.css">   
        <meta name="viewport" content="width=device-width, initial-scale=1" charset="UTF-8">
        <script type="text/javascript" src="../HTML/Otros/CSS/Fondo.js"></script>               
        <script type="text/javascript" src="../HTML/Otros/CSS/actions.js"></script>    
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>    
        
    </head>
    <body onload="adjust();" onresize="adjust()">       
    <header>
        <nav>
            <ul>
                <li>
                    <a href="../index.html" target="_self">
                        <span class="primero">
                            <i class="icon icon-casita"></i>
                        </span>
                        Inicio
                    </a>
                </li>                
                <li>
                    <a>
                        <span class="segundo">
                            <i class="icon icon-metro-logo">                                
                            </i>
                        </span>Metro</a>
                  <ul>
                        <li><a href="../HTML/STC/Mapa.html" target="_self">Mapa</a></li>                       
                        <li><a href="../HTML/STC/Lineas.html" target="_self" >L�neas</a></li>                       
                        <li><a href="../HTML/STC/Otros.html" target="_self">Otros Servicios</a></li>
                        <li><a href="../HTML/STC/Info.html" target="_self">Informaci�n</a></li> 
                        <li><a href="http://www.metro.df.gob.mx/" target="_blank">Sitio</a></li>
                    </ul>
                </li>
                <li><a><span class="tercero"><i class="icon icon-Metrobus_Mexico"></i></span>Metrobus</a>
                     <ul>
                        <li><a href="../HTML/MB/Mapa.html" target="_self">Mapa de la red</a></li>
                        <li><a href="../HTML/MB/Linea1.html" target="_self">L�nea 1</a></li>
                        <li><a href="../HTML/MB/Linea2.html" target="_self">L�nea 2</a></li>
                        <li><a href="../HTML/MB/Linea3.html" target="_self">L�nea 3</a></li>
                        <li><a href="../HTML/MB/Linea4.html" target="_self">L�nea 4</a></li>
                        <li><a href="../HTML/MB/Linea5.html" target="_self">L�nea 5</a></li>
                        <li><a href="../HTML/MB/Info.html" target="_self">Informaci�n</a></li>
                        <li><a href="http://www.metrobus.df.gob.mx/" target="_blank">Sitio</a></li> 
                     </ul>
                </li>
                <li><a ><span class="cuarto"><i class="icon icon-STE_logo"></i></span>Tren Ligero</a>
                    <ul>
                        <li><a href="../HTML/STE/Linea.html" target="_self">L�nea 1</a></li>                       
                        <li><a href="../HTML/STE/Info.html" target="_self">Informaci�n</a></li>
                        <li><a href="http://www.ste.df.gob.mx/index.html?page=1&content=3" target="_blank">Sitio</a></li> 
                    </ul>
                </li>
                <li>
                    <a ><span class="quinto"><i class="icon icon-logosuburbano"></i></span>Tren Suburbano</a>
                    <ul>                        
                        <li><a href="../HTML/TS/Linea.html" target="_self">L�nea 1</a></li>
                        <li><a href="../HTML/TS/Info.html" target="_self">Informaci�n</a></li>
                        <li><a href="http://www.fsuburbanos.com/" target="_blank">Sitio</a></li> 
                    </ul>
                </li>
                <li>
                    <a ><span class="sexto"><i class="icon icon-cero_emisiones"></i></span>Cero Emisiones</a>
                    <ul>                        
                        <li><a href="../HTML/Trole/Linea.html" target="_self">L�neas</a></li>
                        <li><a href="../HTML/Trole/Info.html" target="_self">Informaci�n</a></li>
                        <li><a href="http://www.ste.df.gob.mx/index.html?page=1&content=2" target="_blank">Sitio</a></li> 
                    </ul>
                </li>
                <li>
                    <a ><span class="siete"><i class="icon icon-Where-Is-My-Car-logo-on-mevvy"></i></span>Corredor</a>
                    <ul>                        
                        <li><a href="../HTML/Corr/Ruta1.html" target="_self">Ruta 1</a></li>
                        <li><a href="../HTML/Corr/Ruta2.html" target="_self">Ruta 2</a></li>
                        <li><a href="../HTML/Corr/Ruta3.html" target="_self">Ruta 3</a></li>
                    </ul>
                </li>   
                <li>
                    <a ><span class="ocho"><i class="icon icon-edificio"></i></span>CETRAM</a>
                    <ul>                        
                        <li><a href="../HTML/CET/Linea.html" target="_self">Mapa de CETRAM</a></li>
                        <li><a href="../HTML/CET/Info.html" target="_self">Informaci�n</a></li>
                        <li><a href="http://www.cetram.df.gob.mx/" target="_blank">Sitio</a></li> 
                    </ul>
                </li>
                <li>
                    <a ><span class="nueve"><i class="icon icon-cog-cogwheel-gear-zahnrad-hi"></i></span>M�s servicios</a>
                    <ul>                        
                        <li><a href="../HTML/Eco/Linea.html" target="_self">Ecobici</a></li>
                        <li><a href="../HTML/Otros/Reporte.html" target="_self">Reporte de Tr�nsito</a></li>                        
                        <li><a href="../HTML/Otros/Lugares.html" target="_self">Lugares Concurridos</a></li>
                        <li><a href="../HTML/Otros/Manual.html" target="_self">Manual</a></li>
                        <li><a href="../HTML/Otros/Ask.html" target="_self">Preguntas Frecuentes</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
    </header>           
         <!--<img src="../Imagenes/logo.png" id="fondo" /><A NAME="Arriba"></A>-->
         
         <div id="MenuBar">				
			<a href="HTML/Opciones/Metro.html" target="_self"><div class="option">
				Metro
			</div></a>
            <a href="HTML/Opciones/Metrobus.html" target="_self"><div class="option">
				Metrobus
			</div></a>
            <a href="HTML/Opciones/TL.html" target="_self"><div class="option">
				Tren Ligero
			</div></a>
            <a href="HTML/Opciones/TS.html" target="_self"><div class="option">
				Tren Suburbano
			</div></a>
            <a href="HTML/Opciones/Cero.html" target="_self"><div class="option">
				Cero Emisiones
			</div></a>
            <a href="HTML/Opciones/Run.html" target="_self"><div class="option">
				Corredor
			</div></a>
            <a href="HTML/Opciones/CET.html" target="_self"><div class="option">
				CETRAM
			</div></a>
            <a href="HTML/Opciones/Mas.html" target="_self"><div class="option">
				M�s
			</div></a>                        
		</div>
 
        
        <div id="lolR">  
            
            <div id="NavigationBar">
				<div id="icon">
					<input type="button" value="j" id="iconButton" onclick="sMenu()">
				</div>
				<div id="title">			
					<h1>Reportes</h1>
				</div>
			</div>
            <div class="center" id="wwR2">
                <%
                    Clases.Base conex = new Clases.Base();
                    conex.conectar();
                    
                    ResultSet rs = conex.VerRep();
                    while (rs.next()){
                    out.println("<a href='RepInd.jsp?tit="+rs.getString("Titulo")+"&idd="+rs.getString("ID_Reporte")+"'  class='zeldaRep'><p class='noneID'>'"+rs.getString("ID_Reporte")+"'</p><div id='Rep' class='rep'><img src='"+rs.getString("Ruta_Img")+"' class='Imagen'>"
                            + "<p class='TitRep'>"+rs.getString("Titulo")+"</p><br/><p>"+ "Fecha: " +rs.getString("Hora_Fecha")+" <br/><br/> "+rs.getString("Descripcion")+"</p>"+
                            "<br/></div><a/>");
                    }
                 
                %>
                
            </div>                 <br/>    
        <div id="wwRep"><br/>
         <A HREF="#Arriba"><button>Subir</button></A><br/><br/>
         <a href="../HTML/Otros/Reporte.html" class="link"><button>Regresar a Reporte</button></a><br/><br/>
     </div>
        </div>
        
         <footer class="redOt">
             <a href="#"><img src="../Imagenes/fbbn.png" id="fb" class="red" onmouseover="this.src='../Imagenes/fb.png'" onmouseout="this.src='../Imagenes/fbbn.png'"></a>
             <a href="#"><img src="../Imagenes/twitb.png"  class="red" onmouseover="this.src='../Imagenes/twit.png'" onmouseout="this.src='../Imagenes/twitb.png'"></a>
             <a href="#"><img src="../Imagenes/instb.png"  class="red" onmouseover="this.src='../Imagenes/inst.png'" onmouseout="this.src='../Imagenes/instb.png'"></a>
             <a href="#"><img src="../Imagenes/ytb.png" class="red" onmouseover="this.src='../Imagenes/yt.png'" onmouseout="this.src='../Imagenes/ytb.png'"></a>
             
         </footer>
	</body>
</html>   
