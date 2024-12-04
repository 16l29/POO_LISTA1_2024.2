/*31. Criar um programa que receba 3 NOTAS de 3 ALUNOS. Caso o aluno não obtenha nota superior a 6 na média
entre a duas NOTAS AV1 e AV2, inserir nota AV3 e substituir a menor entre Av1 e Av2, recalcular a
média e mostrar o resultado da aprovação ou reprovação dos ALUNOS*/

const alunos = 3;
const notas = [
    [7.0, 5.0],
    [4.0, 6.0],
    [6.5, 6.0]
];
const medias = [];

for (let i = 0; i < alunos; i++) {
    console.log(`Aluno ${i + 1}`);

    let av1 = notas[i][0];
    let av2 = notas[i][1];
    let av3 = 0;
    let media = (av1 + av2) / 2;

    if (media <= 6) {
        av3 = [3.0][0];
        if (av1 > av2) {
            av2 = av3;
        } else {
            av1 = av3;
        }
        media = (av1 + av2) / 2;
    }
    
    medias[i] = media;

    if (media > 6) {
        console.log(`Aluno ${i + 1}: APROVADO`);
    } else {
        console.log(`Aluno ${i + 1}: REPROVADO`);
    }
    console.log(`MÉDIA: ${media.toFixed(2)}`);
}

