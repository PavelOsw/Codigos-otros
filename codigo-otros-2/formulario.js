let formulario = document.querySelector("#form");

formulario.onsubmit = function(e) {
  e.preventDefault();
  
  // Remplazo de Var por Let en variables
  // Obtener mediante querySelector
  // Renombramiento de variables
  let nombre = formulario.querySelector("[name='name']").value;
  let edad = formulario.querySelector("[name='age']").value;
  let nacionalidad = formulario.querySelector("[name='nationality']").value;

  console.log(nombre, edad);
  console.log(nacionalidad);

  // Validador de nombre
  if (nombre.length === 0) {
    formulario.querySelector("[name='name']").classList.add("error");
  }
  // if (edad < 18 || edad > 120) {
  //   formulario.querySelector("[name='age']").classList.add("error");
  // }
  
  // Validador de rango de edad
  if (nombre.length > 0 && edad >= 18 && edad <= 120) {
    agregarInvitado(nombre, edad, nacionalidad);
  }
};

// Creación de nuevo botón borrar
let botonBorrar = document.createElement("button");
botonBorrar.textContent = "Eliminar invitado";
botonBorrar.id = "boton-borrar";
document.body.appendChild(botonBorrar);

function agregarInvitado(nombre, edad, nacionalidad) {
  // Simplificación de condicionales if
  if (nacionalidad === "ar") nacionalidad = "Argentina";
  if (nacionalidad === "mx") nacionalidad = "Mexicana";
  if (nacionalidad === "vnzl") nacionalidad = "Venezolana";
  if (nacionalidad === "per") nacionalidad = "Peruana";

  let lista = document.getElementById("lista-de-invitados");
  let elementoLista = document.createElement("div");
  elementoLista.classList.add("elemento-lista");
  lista.appendChild(elementoLista);

  // Refactorización en la función de creación de elementos
  function crearElemento(descripcion, valor) {
    let spanNombre = document.createElement("span");
    let inputNombre = document.createElement("input");
    let espacio = document.createElement("br");
    spanNombre.textContent = descripcion + ": ";
    inputNombre.value = valor;
    elementoLista.appendChild(spanNombre);
    elementoLista.appendChild(inputNombre);
    elementoLista.appendChild(espacio);
  }

  // Creación de elementos en el listado
  crearElemento("Nombre", nombre);
  crearElemento("Edad", edad);
  crearElemento("Nacionalidad", nacionalidad);

  let botonBorrar = document.createElement("button");
  botonBorrar.textContent = "Eliminar invitado";
  botonBorrar.id = "boton-borrar";

}
