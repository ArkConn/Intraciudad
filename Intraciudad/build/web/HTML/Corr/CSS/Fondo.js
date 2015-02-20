window.onload = function() {
 
    function bgadj(){
             
        var element = document.getElementById("fondo");
         
        var ratio =  element.width / element.height;   
         
        if ((window.innerWidth / window.innerHeight) < ratio){
         
            element.style.width = 'auto';
            element.style.height = '100%';
             
            //<!-- si la imagen es mas ancha que la ventana la centro -->
            if (element.width > window.innerWidth){
             
                var ajuste = (window.innerWidth - element.width)/2;
                 
                element.style.left = ajuste+'px';
             
            }
         
        }
        else{  
         
            element.style.width = 'auto';
            element.style.height = '100%';
            element.style.left = '17.5%';
 
        }
         
    }
//<!-- llamo a la función bgadj() por primera vez al terminar de cargar la página -->
    bgadj();
   // <!-- vuelvo a llamar a la función  bgadj() al redimensionar la ventana -->
    window.onresize = function() {
        bgadj();
    }
    
    
function sMenu()
{
    var MenuBar = document.getElementById('MenuBar');
	var ContentWrapper = document.getElementById('lolr');
	var state = MenuBar.style.width;

	var width = window.innerWidth;

	if(!(state.match("45%")))
	{
		MenuBar.style.opacity = 1;
		MenuBar.style.width = '45%';
		ContentWrapper.style.width = '80%';
		ContentWrapper.style.marginLeft = '20%';
	}
	else
	{
		MenuBar.style.zIndex = "0";
		MenuBar.style.opacity = 0;
		MenuBar.style.width = '0%';
		ContentWrapper.style.width = '80%';
		ContentWrapper.style.marginLeft = '20%';
	}

	if(width > 995)
	{
		MenuBar.style.opacity = 1;
		MenuBar.style.width = '20%';
		ContentWrapper.style.width = '80%';
		ContentWrapper.style.marginLeft = '20%';
	}
}
    
    
    
}

function Cambiar(Img){
    document.getElementById("MMetro").src=Img;
}