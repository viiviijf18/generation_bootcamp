// 1 Crea un archivo ejercicios.js 
//1- Programa una función que valide si una palabra o frase dada, es un palíndromo (que se lee igual en un sentido que en otro), pe. mifuncion("Salas") devolverá true. 
//2- Programa una función que repita un texto X veces, pe. miFuncion('Hola Mundo', 3) devolverá Hola Mundo Hola Mundo Hola Mundo. 
//3- Programa una función que te devuelva el texto recortado según el número de caracteres indicados, pe. miFuncion("Hola Mundo", 4) devolverá "Hola". 
//4- Programa una función que calcule el factorial de un número (El factorial de un entero positivo n, se define como el producto de todos los números enteros positivos desde 1 hasta n), pe. miFuncion(5) devolverá 120.

/*******Ejercicio 1 ********
function palindromo(palabra) {
    const reverso = palabra.split("").reverse().join("");
  
    return reverso.toLowerCase() === palabra.toLowerCase() ? "true" : "false";
  }
  //console.log(palindromo("oso")); // es palindromo
  console.log(palindromo("Oso")); // no es palindromo
  //console.log(palindromo("asa")); // es palindromo
*/
  /**
   * / 1 const palindromo = (word) => { 
   * let volteada; 
   * nospaces = word.replace(/\s/g, ''); 
   * volteada = nospaces.split('').reverse().join('') 
   * if (volteada.toLowerCase() == nospaces.toLowerCase()) 
   * { 
   *    return true 
   * } else { 
   *    return false } 
   * } 
   * console.log(palindromo('anita lava la tina')); 
   */

  /***********Ejercicio 2 **********/
  /*const repetir = (word, num) => { 
      let phrase = []; 
      for (let i = 0; i < num; i++) { 
          phrase.push(word) 
        } 
        return phrase.join(' '); 
    } 
    console.log(repetir('Adiós mundo',10)); */
    
    
    /************Ejercicio 3 ***********/
/*const recorte = (word, num) => { 
    if (word.length < num) { 
        return console.error('No hay suficientes caracteres') 
    } else { 
        return word.substring(0,num); 
    } 
} 
console.log(recorte('Adiós mundo', 5));*/

/*********Ejercicio 4*********/
/*const factorial = (n) => { 
    if (n >= 0) { 
        var total = 1; 
        for (i=1; i<=n; i++) { 
            total = total * i; 
        } 
        return total; 
    } else { 
        console.error('Introduce un número mayor o igual a 1'); 
    } 
} 
console.log(factorial(5));  */