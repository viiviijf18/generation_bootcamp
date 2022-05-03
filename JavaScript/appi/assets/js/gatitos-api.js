const url = "https://api.thecatapi.com/v1/images/search" 
const imagen = document.getElementById("imagenGatito") 
const imagen2 = document.getElementById("imagenGatito2") 

async function obtenerGatito(){ 
    const infoGatitos = await fetch(url) 
    const gatito = await infoGatitos.json() 
    console.log(gatito); 
    imagen.src = gatito.message 
    imagen2.src = gatito.message 
} 
obtenerGatito(); 