/*29. Leia uma TEMPeratura a qual o usuário irá informar o Valor e a escala atual: (Fahrenheit, Celsius, Kelvin) e
informar a escala para qual deseja converter.
a. Celcius para Fahrenheit: F = C*(1.8) + 32
b. Fahrenheit para Celcius: C = (F ? 32) / 1.8
c. Kelvin para Celcius: C = K ? 273.15
d. Celcius para Kelvin: K = C + 273.15
e. Kelvin para Fahrenheit: F = 1,8(K-273) + 32*/

const tempAtual = 25.0;
const escalaAtual = 'C';
const escalaNova = 'F';

let tempNova;

if (escalaAtual === escalaNova) {
    tempNova = tempAtual;
} else if (escalaAtual === 'C' && escalaNova === 'F') {
    tempNova = (tempAtual * 1.8) + 32;
} else if (escalaAtual === 'C' && escalaNova === 'K') {
    tempNova = tempAtual + 273.15;
} else if (escalaAtual === 'K' && escalaNova === 'C') {
    tempNova = tempAtual - 273.15;
} else if (escalaAtual === 'K' && escalaNova === 'F') {
    tempNova = 1.8 * (tempAtual - 273.15) + 32;
} else if (escalaAtual === 'F' && escalaNova === 'C') {
    tempNova = (tempAtual - 32) / 1.8;
} else if (escalaAtual === 'F' && escalaNova === 'K') {
    tempNova = ((tempAtual - 32) / 1.8) + 273.15;
} else {
    console.log("Valor/Escala inválido");
    return;
}
console.log(`Temperatura convertida: ${tempNova.toFixed(3)}${escalaNova}`);
