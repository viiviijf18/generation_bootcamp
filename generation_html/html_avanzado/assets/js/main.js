const color = document.querySelector("#inputCololr")
console.log(color)

function name1(){
    alert("Hola");
}

name1()
color.addEventListener("change", function(e){
    document.body.style.backgroundColor = e.target.value;

})

const formulario = document.querySelector("#formularioDatos");
console.log(formulario);

formulario.addEventListener("submit", name1);