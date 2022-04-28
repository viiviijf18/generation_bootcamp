/**Funciones, nos permiten reutilizar código */

function saludar(){
    let nombre='Viivii';
    console.log(`Hola mi nombre es ${nombre}`); //Template Strings || Plantillas literales || Backtips //Alt gr+}
    //console.log('Hola mi nombre es: ', nombre);
}

saludar();

/*****Funcion declarada ******/
function suma(a,b) {
    return a+b;
    
}

console.log(suma(10,20));

/*****Funciones expresadas | función expresión ********/
const resta= function(a,b) {
    return a-b;
    
}

console.log(30,10);
