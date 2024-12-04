/*32. Crie um programa que receba três valores (obrigatoriamente maiores que zero), representando as medidas
dos três lados de um triângulo. Elabore funções para:
a. Determinar se eles lados formam um triangulo, sabendo que:
i. O comprimento de cada lado de um triângulo é menor do que a soma dos outros dois lados.
b. Determinar e mostrar o tipo de triangulo, caso as medidas formem um triangulo.
i. Equilátero três lados iguais.
ii. Isósceles dois lados iguais.
iii. Escaleno três lados diferentes*/

const lado1 = 5;
const lado2 = 5;
const lado3 = 5;

if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
    console.log("Os valores têm que ser maiores que zero");
} else if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
    if (lado1 === lado2 && lado1 === lado3) {
        console.log("Equilátero");
    } else if (lado1 !== lado2 && lado1 !== lado3 && lado2 !== lado3) {
        console.log("Escaleno");
    } else {
        console.log("Isósceles");
    }
} else {
    console.log("Não forma um triângulo");
}
