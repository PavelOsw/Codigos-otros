// Tenemos un li de productos

const productos = [
  {nombre: "Zapato negro", tipo: "zapato", color: "negro", img: "./taco-negro.jpg"},
  {nombre: "Zapato azul", tipo: "zapato", color: "azul", img: "./taco-azul.jpg"},
  {nombre: "Bota negra", tipo: "bota", color: "negro", img: "./bota-negra.jpg"},
  {nombre: "Bota azul", tipo: "bota", color: "azul", img: "./bota-azul.jpg"},
  {nombre: "Zapato rojo", tipo: "zapato", color: "rojo", img: "./zapato-rojo.jpg"}
];

// Variables cambiadas a const
const $li = document.querySelector("#lista-de-productos");
const $i = document.querySelector("#input");

for (let i = 0; i < productos.length; i++) {
  const d = document.createElement("div");
  d.classList.add("producto");

  const ti = document.createElement("p");
  ti.classList.add("titulo");
  ti.textContent = productos[i].nombre;
  
  const imagen = document.createElement("img");
  imagen.setAttribute("src", productos[i].img);

  d.appendChild(ti);
  d.appendChild(imagen);

  li.appendChild(d);
}

displayProductos(productos, $lista);

const botonDeFiltro = document.querySelector("button");

botonDeFiltro.addEventListener("click", function() {
  while (li.firstChild) {
    li.removeChild(li.firstChild);
  }

  const texto = $i.value;
  console.log(texto);
  const productosFiltrados = filtrado(productos, texto);

  for (let i = 0; i < productosFiltrados.length; i++) {
    const d = document.createElement("div");
    d.classList.add("producto");
  
    const ti = document.createElement("p");
    ti.classList.add("titulo");
    ti.textContent = productosFiltrados[i].nombre;
    
    const imagen = document.createElement("img");
    imagen.setAttribute("src", productosFiltrados[i].img);
  
    d.appendChild(ti);
    d.appendChild(imagen);
  
    li.appendChild(d);
  }
});

displayProductos(productos, $lista);

const botonDeFiltro = document.querySelector("button");

botonDeFiltro.onclick = function() {
  while ($lista.firstChild) {
    $lista.removeChild($lista.firstChild);
  }

  const texto = $input.value;
  const productosFiltrados = filtrado(productos, texto);

displayProductos(productosFiltrados, $lista);
};

const filtrado = (productos = [], texto) => {
  return productos.filter(item => item.tipo.includes(texto) || item.color.includes(texto));
}; 
