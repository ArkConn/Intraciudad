//sMenu hace todo lo necesario para ordenar el menu, y sin JQuery

function sMenu()
{
    var MenuBar = document.getElementById('MenuBar');
	
        var ContentWrapper = document.getElementById('lols');
        var Barra = document.getElementById('NavigationBar');
	var state = MenuBar.style.width;

	var width = window.innerWidth;

	if(!(state.match("45%")))
	{
		MenuBar.style.opacity = 1;
		MenuBar.style.width = '45%';
		ContentWrapper.style.width = '70%';
		ContentWrapper.style.marginLeft = '45%';
                ContentWrapper.style.marginRight = '0%';
                Barra.style.marginLeft = '0%';
	}
	else
	{
		MenuBar.style.zIndex = "0";
		MenuBar.style.opacity = 0;
		MenuBar.style.width = '0%';
		ContentWrapper.style.width = '92%';
		ContentWrapper.style.marginLeft = '3%';
                ContentWrapper.style.marginRight = '3%';
                Barra.style.marginLeft = '0%';
	}

	if(width > 995)
	{
//		MenuBar.style.opacity = 1;
//		MenuBar.style.width = '20%';
//		ContentWrapper.style.width = '80%';
//		ContentWrapper.style.marginLeft = '20%';
	}
}

//Esta funcion ajusta el icono de menu

function adjust()
{
	var width = window.innerWidth;

	if(width > 995)
	{
//		MenuBar.style.opacity = 1;
//		MenuBar.style.width = '20%';
//		ContentWrapper.style.width = '80%';
//		ContentWrapper.style.marginLeft = '20%';
	}
	else
	{
		MenuBar.style.zIndex = "0";
		MenuBar.style.opacity = 0;
		MenuBar.style.width = '0%';
		ContentWrapper.style.width = '100%';
		ContentWrapper.style.marginLeft = '0%';
                ContentWrapper.style.marginRight = '0%';
	}
        
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

//Esta funcion ajusta los iFrames si utilizas videos externos de YouTube

function resVideo()
{
	frame = document.getElementById("video");
	frameWidth = frame.offsetWidth;
	frame.style.height = (frameWidth * 0.56) + "px";
}
