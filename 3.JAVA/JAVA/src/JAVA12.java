/*Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e
os números*/

import java.util.Scanner;

class JAVA12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] ENTRADA = new int[5];
        int SOMA = 0;
        int MULTIPL = 1;

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d.Número:", i + 1);
            ENTRADA[i] = leitor.nextInt();
            SOMA += ENTRADA[i];
            MULTIPL *= ENTRADA[i];
        }

        int i;
        System.out.println("Números digitados:");
        for (i = 0; i < 5; i++) {
            System.out.printf("%d" + " ", ENTRADA[i]);
        }
        System.out.printf("\nSoma:\n%d", SOMA);
        System.out.printf("\nMultiplicação:\n%d", MULTIPL);
    }
}

