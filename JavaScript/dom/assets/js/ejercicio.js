const $card = document.querySelector('.card');
const $form = document.querySelector('.form');

$form.addEventListener('submit', (e) => {
    e.preventDefault();

    const datos = Object.fromEntries{
        new FormData(e.target)
    }

    crearElemento(datos.url, datos.texto);
    $form.reset();

});


function crearElemento(url, texto){
    const img = document.createElement('img');
    const txt = document.createElement('figcaption');

    img.src = url;
    img.alt = texto;

    txt.textContent = text;

    //appendChild
    $card.appendChild(img);
    $card.appendChild(txt);
}
