class Persona{
/*Primero los ATRIBUTOS*/
    id=0;
    contador= 0;
    #nombre = ''; //Variable privada
    #edad = 0;
    #correo = '';


    constructor(nombree, edadd, correoo){
        this.#nombre = nombree;
        this.#edad = edadd;
        this.#correo = correoo;
        this.id = ++thid.contador;

    }

    //////////Setters y getters////////////////
    //Fijar y obtener
    get getNombre(){
        return this.#nombre;
    }
    set setNombre(name){
        this.#nombre = name;         
    }

    get getEdad(){
        return this.#edad;
    } 
    set setEdad(eda){
        this.#edad = eda;         
    }

    get getCorreo(){
        return this.#correo;
    }
    set setCorreo(corre){
        this.#correo = corre;         
    }

    /////////////MÉTODOS//////////////////

    cambiarNombre(nam){
        this.#nombre =nam;
    }

    //--Métodos Privados
    #saludar(){
        let mensaje = `Hola mi nombre es ${this.#nombre}`;
        return mensaje;
    }
    mostrarSaludo(){
        return this.#saludar;
    }


} //Fin de la clase

const persona1= new Persona("Pedro", 30, "pedro@gmail.com");
const persona2= new Persona('Gabriel', 25, 'gabriel@gmail.com');


persona1.setNombre = "José";
persona1.cambiarNombre("Antonio");

console.log(persona1);
console.log(persona2);

console.log(persona1.mostrarSaludo());
console.log(persona2.mostrarSaludo());