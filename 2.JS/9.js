/*32. Crie um programa que receba tr�s valores (obrigatoriamente maiores que zero), representando as medidas
dos tr�s lados de um tri�ngulo. Elabore fun��es para:
a. Determinar se eles lados formam um triangulo, sabendo que:
i. O comprimento de cada lado de um tri�ngulo � menor do que a soma dos outros dois lados.
b. Determinar e mostrar o tipo de triangulo, caso as medidas formem um triangulo.
i. Equil�tero tr�s lados iguais.
ii. Is�sceles dois lados iguais.
iii. Escaleno tr�s lados diferentes*/

const lado1 = 5;
const lado2 = 5;
const lado3 = 5;

if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
    console.log("Os valores t�m que ser maiores que zero");
} else if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
    if (lado1 === lado2 && lado1 === lado3) {
        console.log("Equil�tero");
    } else if (lado1 !== lado2 && lado1 !== lado3 && lado2 !== lado3) {
        console.log("Escaleno");
    } else {
        console.log("Is�sceles");
    }
} else {
    console.log("N�o forma um tri�ngulo");
}
