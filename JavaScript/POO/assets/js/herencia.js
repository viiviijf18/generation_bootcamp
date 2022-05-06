class Pokemon{
    #nombre = '';
    #edad = 0;
    #evolucion = '';

    get getNombre(){
        return this.#nombre;    
    }

    constructor(nombre, edad, evolucion){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#evolucion =evolucion;
    }//Fin del constructor

    atacar(){
        return console.log(`${this.#nombre}, está atacando D:`);
    }//Fin de atacar

    evolucionar(){
        let mensaje = ''; 
        
        if(this.#evolucion === ''){ 
            mensaje = 'No puedo evolucionar'; 
            console.log(mensaje) 
        }else{ 
            mensaje = `${this.#nombre} ha evolucionado a ${this.#evolucion}`; 
            this.#nombre = this.#evolucion; 
            console.log(mensaje); 
        } 

    } //Fin de evolucionar

}//Fin de la clase

/*const charmander = new Pokemon("Charmander",2,"Charmeleon","Fuego");
const bulbasaur = new Pokemon("Bulbasaur", 1, "Ivysaur", "Planta");

console.log(charmander);
console.log(bulbasaur);

charmander.atacar();
bulbasaur.atacar();

charmander.evolucionar();*/

class TipoFuego extends Pokemon{
    #tipo = '';

      
    constructor(nombre, edad, evolucion){
        super(nombre, edad, evolucion);
        this.#tipo = "Fuego";
    }//Fin del constructor

    atacar(){
        return console.log(`${super.nombre}, está lanzando un ataque tipo ${this.#tipo}`);
    }//Fin atacar

}//Fin de la clase

const charmander = new TipoFuego ("Charmander", 2, "Charmeleon");
console.log(charmander);
charmander.atacar();
