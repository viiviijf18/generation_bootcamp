/* Este es un nodo de comentario */

const $titulo = document.querySelector('h1');
const $parr = document.querySelector('p');

console.log($parr.nodeName);
console.log($titulo.nodeName);

console.log($parr.textContent);
$parr.textContent = "Hola Mundo!";

$titulo.textContent = 'Modificando elementos en javascript'

console.log($parr.innerHTML);

//Reemplaza lo que hay adentro del elemento seleccionado
//$parr.innerHTML = '<a href="#">Este es un enlace</a> ';

//outerHTML: Reemplaza todo, incluido el elemento que seleccionamos
$parr.outerHTML = '<a href="#">Este es un enlace</a> ';

//Crear elementos de HTML
function crearElemento(){
    const img = document.createElement('img');
    img.src = "https://www.purina-latam.com/sites/g/files/auxxlc391/files/styles/social_share_large/public/Que_debes_saber_antes_de_adoptar_un_gatito.jpg?itok=guFplHEU";

    //appendChild
    $card.appendChild(img);

}

crearElemento();