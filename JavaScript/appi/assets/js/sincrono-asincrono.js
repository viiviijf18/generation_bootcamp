
setTimeout(() =>{
    console.log("Ejecutando después de 3 segundos");

}, 3000)

console.log("Hola");

const datos = [
    {
        nombre: "Viivii",
        edad: 26,
    },
    {
        nombre: "Luis",
        edad: 32,
    },
    {
        nombre: "Saúl",
        eadad: 18,
    },

]

//console.log(datos);
/*function obtenerDatos(){
    return new Promise((resolve,reject) => {   
         setTimeout(() => {
             resolve(datos);
         }, 3000)
    })
}
console.log(obtenerDatos());

obtenerDatos().then((datos) => {
    console.log(datos);
})

async function obtenerDatosAsync(){
    const datosObtenidos =await obtenerDatos()
    console.log(datosObtenidos);
}

obtenerDatosAsync();
*/


function obtenerDatos(){
    setTimeout(() => {
        return datos;
    }, 3000)
}

obtenerDatos();