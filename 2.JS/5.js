/*28. Fa�a um programa que pe�a ao usu�rio um n�mero entre 12 e 20. Se a pessoa digitar um n�mero
diferente, mostrar a mensagem "entrada inv�lida" e solicitar o n�mero novamente. Se digitar correto
mostrar o n�mero digitado*/

const readline = require('readline');

const leitor = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function perguntarNumero() {
    leitor.question("Digite um n�mero entre 12 e 20: ", (entrada) => {
        let numero = parseInt(entrada);

        if (numero >= 12 && numero <= 20) {
            console.log(numero + " est� dentro do intervalo");
            leitor.close();
        } else {
            console.log("Entrada inv�lida. Tente novamente.");
            perguntarNumero();
        }
    });
}

perguntarNumero();