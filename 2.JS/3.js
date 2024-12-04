/*26. Calcular se um número é ou não primo*/

let num = 29;
let contagem = 0;

for (let i = 1; i <= num; i++) {
    if (num % i === 0) {
        contagem++;
    }
}

if (contagem === 2) {
    console.log(num + " é primo");
} else {
    console.log(num + " não é primo");
}
