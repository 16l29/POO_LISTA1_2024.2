/*26. Calcular se um n�mero � ou n�o primo*/

let num = 29;
let contagem = 0;

for (let i = 1; i <= num; i++) {
    if (num % i === 0) {
        contagem++;
    }
}

if (contagem === 2) {
    console.log(num + " � primo");
} else {
    console.log(num + " n�o � primo");
}
