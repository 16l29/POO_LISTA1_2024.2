/*24. Diferenciar dentre 3 números, qual é o maior e qual é o menor*/

let entrada = [5, 2, 8];
let menor = entrada[0];
let maior = entrada[0];
let tamanho = entrada.length;

for (let i = 0; i < tamanho; i++) {
    if (entrada[i] > maior) {
        maior = entrada[i];
    }
    if (entrada[i] < menor) {
        menor = entrada[i];
    }
}

console.log("MENOR: " + menor);
console.log("MAIOR: " + maior);
