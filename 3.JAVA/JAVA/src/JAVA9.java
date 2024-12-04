/*Crie um programa que receba três valores (obrigatoriamente maiores que zero), representando
as medidas dos três lados de um triângulo. Elabore funções para:
a. Determinar se eles lados formam um triangulo, sabendo que:
i. O comprimento de cada lado de um triângulo é menor do que a soma dos outros dois
lados.
b. Determinar e mostrar o tipo de triangulo, caso as medidas formem um triangulo.
i. Equilátero três lados iguais.
ii. Isósceles dois lados iguais.
iii. Escaleno três lados diferentes.*/

import java.util.Scanner;

public class JAVA9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int LADO1, LADO2, LADO3;

        System.out.print("Lado 1: ");
        LADO1 = leitor.nextInt();
        System.out.print("Lado 2: ");
        LADO2 = leitor.nextInt();
        System.out.print("Lado 3: ");
        LADO3 = leitor.nextInt();

        if (LADO1 <= 0 || LADO2 <= 0 || LADO3 <= 0) {
            System.out.print("Os valores têm que ser maiores que zero");
            return;
        }
        if ((LADO1 + LADO2 > LADO3) && (LADO1 + LADO3 > LADO2) && (LADO2 + LADO3 > LADO1)) {
            if ((LADO1 == LADO2) && (LADO1 == LADO3)) {
                System.out.print("Equilátero");
            } else if ((LADO1 != LADO2) && (LADO1 != LADO3) && (LADO2 != LADO3)) {
                System.out.print("Escaleno");
            } else {
                System.out.print("Isósceles");
            }
        } else {
            System.out.print("Não forma um triângulo");
        }
    }
}





