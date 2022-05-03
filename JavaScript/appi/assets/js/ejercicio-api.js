//const url = "https://jsonplaceholder.typicode.com/albums/1/photos"; const container = document.getElementById("card-container"); fetch(url).then(resp=> resp.json()).then(datos =>{ //console.log(datos.message.terrier); const arreglo = datos; //console.log(arreglo); arreglo.forEach(element => { console.log(element); const template = `<div class="col mb-4"> <div class="card"> <img src="${element.thumbnailUrl}" class="card-img-top col-2" alt="..."> <div class="card-body"> <p class="card-text">${element.title}</p> </div> <
const urlAPI ="https://jsonplaceholder.typicode.com/albums/1/photos";
const $cartas = document.querySelector("#cartas");

fetch(urlAPI)
    .then((resp) => resp.json())
    .then((data) => {
        data.forEach((dato) => {
            const imagen = dato.thumbaiUrl;
            const titulo = dato.title;

            const contenido = `<div class="col mb-4">
                                    <div class="card">
                                        <img src="${imagen}" class="card-img-top" alt="...">
                                        <div class="card-body">
                                            <h5 class="card-title">${titulo}</h5>
                                        </div>
                                    </div>
                               </div>`

        $cartas.innerHTML += contenido;

        

        });
    });