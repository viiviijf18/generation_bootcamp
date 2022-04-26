window.addEventListener('load', function(){
    this.alert('Se ha terminado de cargar la página')
});


function saludar(){
    alert('Hola!');
}

/*Manejador de eventos semántico*/
const $botonSemantico = document.getElementById('evento-semantico');

$botonSemantico.onclick = saludar;

$botonSemantico.onclick = function (evento){
    //alert('Hola desde un manejador semantico')
    console.log(evento.target);
}

/*Manejador de ventos múltiple */
const $botonMultiple = document.getElementById("evento-multiple");


$botonMultiple.addEventListener("click", saludarMultiple);

$botonMultiple.addEventListener("click", function(){
    console.log(e.target);
})

function saludarMultiple(){
    alert('Hola desde manejador multiple');
}