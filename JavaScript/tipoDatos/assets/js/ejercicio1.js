
/**********NIVEL 1*************/

/*const edad = prompt("Dime en qué año naciste: "); 
const edad2 = 2022 - parseInt(edad); 

console.log(`¡No puede ser! ¡Ya tienes ${edad2} años!

         Ay no :c`);
//console.log("¡No puede ser! ¡Ya tienes " +edad2+ " años!"); 
//console.log("Ay no :c");

/******NIVEL 2*********/


function calcularEdad(){
    
    const anioActual = 2022;
    const anioNacimiento = parseInt(document.getElementById("anio").value);
    console.log(`Tienes ${anioActual - anioNacimiento} años`);

}

/*********NIVEL 3************/

const fecha = new Date();

const anioActual = fecha.getFullYear();
console.log(anioActual);

const mesActual = fecha.getMonth();
console.log(mesActual);

const diaActual = fecha.getDay();
console.log(diaActual);

/*
const anioActual = 2022;
const mesActual = 4;
const diaActual = 27;
*/

function mostrarDatos(){
    const nacimiento = document.getElementById("anio").value;
    console.log(nacimiento);
    const nacimientoDividido = nacimiento.split("-");
    console.log(nacimientoDividido);
    const anioNacimiento = parseInt(nacimientoDividido[0]);
    const mesNacimiento = parseInt(nacimientoDividido[1]);
    const diaNacimiento = parseInt(nacimientoDividido[2]);
    console.log(anioNacimiento, mesNacimiento,diaNacimiento);

    if(mesNacimiento <= mesActual && diaNacimiento<= diaActual){
        console.log(`Tienes $(anioActual - anioNacimiento) años`);;
    }else{
        console.log(`Tienes $(anioActual - anioNacimiento - 1) años`);;

    }

}