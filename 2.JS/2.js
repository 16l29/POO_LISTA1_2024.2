/*25. Escreva um programa que leia 10 n�meros e:
a. Escreva o MENOR valor lido e o MAIOR valor lido
b. Some-os.
c. Imprima sua m�dia*/

let custom = 10;
let entrada = [2, 4, 6, 8, 10, 3, 6, 5, 11, 30];
let soma = 0;
let media;

for (let i = 0; i < custom; i++) {
    soma += entrada[i];
}

media = soma / custom;

console.log("SOMA: " + soma);
console.log("M�DIA: " + media.toFixed(2));
