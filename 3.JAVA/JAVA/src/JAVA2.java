/*Escreva um programa que leia 10 números e:
a. Escreva o menor valor lido e o maior valor lido
b. Some-os.
c. Imprima sua média*/

import java.util.Scanner;

public class JAVA2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int CUSTOM;

        System.out.print("Quantos números? ");
        CUSTOM = leitor.nextInt();

        int[] ENTRADA = new int[CUSTOM];
        float MEDIA;
        int SOMA = 0, i;
        int MENOR, MAIOR;

        System.out.print("1. Número: ");
        ENTRADA[0] = leitor.nextInt();
        SOMA = ENTRADA[0];
        MENOR = MAIOR = ENTRADA[0];

        for (i = 1; i < CUSTOM; i++) {
            System.out.printf("%d. Número: ", i + 1);
            ENTRADA[i] = leitor.nextInt();
            SOMA += ENTRADA[i];

            if (ENTRADA[i] < MENOR) {
                MENOR = ENTRADA[i];
            }

            if (ENTRADA[i] > MAIOR) {
                MAIOR = ENTRADA[i];
            }
        }

        MEDIA = (float) SOMA / CUSTOM;

        System.out.printf("Soma: %d\n", SOMA);
        System.out.printf("Média: %.2f\n", MEDIA);
        System.out.printf("Menor: %d\n", MENOR);
        System.out.printf("Maior: %d\n", MAIOR);
    }
}