/*30. Faça um programa que, para um número indeterminado de pessoas: leia a idade de cada uma, sendo que
a idade 0 (zero) indica o fim da leitura e não deve ser considerada. A seguir calcule:
a) O número de pessoas;
b) A idade média do grupo;
c) Menor idade e a maior idade.*/

const IDADES = [25, 30, 18, 40, 90];
let SOMA = 0;
let QTD = 0;
let MENOR;
let MAIOR;

for (let i = 0; i < IDADES.length; i++){
    const idade = IDADES[i];

    if (idade === 0){
        break;
    }

    if (QTD === 0){
        MENOR = idade;
        MAIOR = idade;
    }else if (idade < MENOR){
        MENOR = idade;
    }else if (idade > MAIOR){
        MAIOR = idade;
    }

    QTD++;
    SOMA += idade;
}

if (QTD > 0){
    const mediaIDADES = SOMA / QTD;
    console.log(`Pessoas: ${QTD}`);
    console.log(`Idade média: ${mediaIDADES.toFixed(2)}`);
    console.log(`Menor idade: ${MENOR}`);
    console.log(`Maior idade: ${MAIOR}`);
}else{
    console.log("0 pessoas");
}