
const Sesai = {
    nombreCompleto: {
        nombre: "Sesai",
        apellido: "Cazares",
    },
    edad: 25,
    pasatiempos: ["fotografia","caminar","dibujar"],
    
}
const angel = {
    nombreCompleto: {
    nombre:"Angel",
    apellido: "Lopez"
    },
    edad : 23,
    pasatiempos: ["cine", "correr", "dibujar"],
}
const Alexander = {
    nombreCompleto: {
        nombre: "Alexander tovar",
        apellido: "martinez"
    },
    edad: 24,
    pasatiempos: ["descanzar","dibujar","plantas"],
}
const Ricardo = {
    nombreCompleto: {
        nombre:"Ricardo", 
        apellido:"Ortega"
    },
    edad:"27",
    pasatiempos: ['familia', 'musica','desarrollo'], 

}
const luis = {
    nombreCompleto: {
      nombre: "Luis",
      apellido: "Jimenez",
    },
    edad: 30,
    pasatiempos: ["leer", "guitarra", "ajedrez"],
  }

const Arantxa = { 
    nombreCompleto: {
        nombre: "Arantxa", 
        apellido: "Perez"
    },
    edad: 26,
    pasatiempos: ["caminar", "patinar", "musica"]
}
const gabriel = {
    nombreCompleto: {
        nombre: "gabriel",
        apellido: "gonzalez"
    },
    edad: 20,
    pasatiempos: ["jugar","salir","correr"],
}
const Donovan = {
    nombreCompleto: {
        nombre: "Donovan",
        apellido: "Martinez"
    },
    edad: 24,
    pasatiempos: ["futbol","Lectura","anime"]
}
const Luis = {
    nombreCompleto: {
      nombre: "Luis",
      apellido: "García",
    },
    edad: 23,
    pasatiempos: ["series", "ejercicio", "dormir"],
  };
  const Daniel = {
    nombreCompleto: {
        nombre: "Daniel",
        apellido: "Perez",
    },
    edad: 24,
    pasatiempos: ["fotografia", "peliculas", "leer"],
}

const santiago = {
    nombreCompleto: {
        nombre:"carlos",
        apellido:"cruz",
    },
    edad: 29,
    pasatiempos: ["futbol", "estudiar", "anime"],    
    }

const cohorte12 = [santiago,Daniel,Luis,Donovan,gabriel,Arantxa,luis,Ricardo,Alexander.angel,Sesai];

for(let i=0; i<cohorte12.length; i++){
    console.log(cohorte12[i]);
    
}
for(let i=0; i<cohorte12.length; i++){
    if(cohorte12[i].pasatiempos.includes("futbol")){
        console.log(cohorte12[i].nombreCompleto.nombre);;
    }
