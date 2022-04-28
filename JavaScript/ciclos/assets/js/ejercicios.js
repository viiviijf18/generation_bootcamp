
 //Ejercicio 1 
 //Escribe un ciclo que haga lo siguiente: 
  //Repetidamente imprime el valor de la variable xValue, disminuyendo por 0.5 su valor cada iteración. 
  //El ciclo se mantendrá mientras que el valor de xValue sea positivo. 
input1.addEventListener("change", function(){ let input1= document.getElementById("input1").value; 
  
  while(input1>0){ 
      document.getElementById("res1").innerHTML += input1 + " -- "; input1 -= .5; 
    } 

}); 
  
  
  //Ejercicio 2 
  //Imprime todos los números impares entre 1 y 100 
  /*var num1 = parseInt(prompt("Introduzca el primer número")); 
  var num2 = parseInt(prompt("Introduzca el segundo número")); 
  
  document.write( "Los números impares que existen entre " + num1 + " y " + num2 + " son: " ); 
  
  let contador=0;
  for (var i = num1; i < num2; i++) {
    
       if (i % 2 != 0) {
            document.write("<br>" + i); 
            contador=contador+1;
        } 
    
    }
    document.write("<br>"+ "Los numeros totales son: "+ contador); */
  
  //Ejercicio 3 
  //Escribe un ciclo while que imprima de 1 a n dentro de corchetes cuadrados 
  //Por ejemplo: si n = 6 imprime [1] [2] [3] [4] [5] [6] 
  /*var num1 = parseInt(prompt("Introduzca el primer número")); 
  var num2 = parseInt(prompt("Introduzca el segundo número")); 
  
  document.write( "Los números enteros que existen entre " + num1 + " y " + num2 + " son: " ); 
  
  let contador=0;
  for (var i = num1; i <= num2; i++) {
    
       if (i>=0) {
            document.write(`[${i}] `); 
            
        } 
    
    }*/
 
  //Ejercicio 4 
  //Escribe un ciclo que calcule la suma de los numeros positivos entre 1 y n 
  //ejemplo: n = 5 sum = 15 
  //por que (1 + 2 + 3 + 4 +5 )

 /*var num1 = parseInt(prompt("Introduzca el primer número")); 
 var num2 = parseInt(prompt("Introduzca el segundo número")); 
  
  document.write( "Los números enteros que existen entre " + num1 + " y " + num2 + " son: " ); 
  
  let total=0;
  
  for (var i = num1; i <= num2; i++) {
      total= total+i
  }
    document.write("La suma total es: "+total);
*/  
 






/******EJERCICIO 1 *******/
/*Escribir un ciclo anidado que imprima el siguiente patrón.

*
**
***
****
*****

*/

/*
for(let i=1; i<=5; i++){
    for(let j=1; j<=i; j++){
        document.write("*");
    }
    document.write("<br>");
    
} 
*/

/******* EJERCICIO 2*********/
