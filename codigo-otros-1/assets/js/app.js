// Obtiene e imprime información (Nombre, Blog, Localización) 
// sobre un usuario a traves de una usando una funcion asincrona

const baseEndpoint = 'https://api.github.com';  
const usersEndpoint = `${baseEndpoint}/users`;
const $n = document.querySelector('.name'); // Faltaba un .
const $b = document.querySelector('.blog'); // Se cambio a un . en sustitución de #
const $l = document.querySelector('.location');

async function displayUser(username) { // No sé declaro Async en la función
  $n.textContent = 'cargando...';
  const response = await fetch(`${usersEndpoint}/${username}`);
  data = await response.json();  // Faltaba esta línea, que sirve para usar la const response
  console.log(data);
  $n.textContent = `${data.name}`;     // Sustitución de 
  $b.textContent = `${data.blog}`;     // comillas simples por
  $l.textContent = `${data.location}`; // tildes inversas
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  n.textContent = `Algo salió mal: ${err}`
}

displayUser('stolinski').catch(handleError);