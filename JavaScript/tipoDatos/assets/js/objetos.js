const nombre = "viivii";
const nombre2 = new String("ana");
console.log(nombre2);

const persona = new Object();
persona.nombre = "Viviana";
persona.apellido = "Juarez";
persona.edad = "26";

console.log(persona);

const nuevaPersona = {
    nombreCompleto:{
        nombre: "Vivi",
        apellido: "Fuentes"
    },
    edad: 26,
    pasaTiempos: ["reír","cantar","dormir"],
    tieneTrabajo: false,

    /*****MÉTODO ******/
    saludar: function(){
        console.log("Hola");
    },
    sumar:  function (n1,n2) {
        console.log(`El resultado de la suma es $(n1+n2)`);
        
    }
}

"Hola".length; //atributo o propiedad
"Hola".toLowerCase; //Método

console.log(nuevaPersona.edad);
console.log(nuevaPersona.nombreCompleto.nombre);
console.log(nuevaPersona.pasaTiempos);

nuevaPersona.saludar();
nuevaPersona.sumar(5,10);











