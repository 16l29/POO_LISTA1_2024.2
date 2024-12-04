/*Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os
números PARES no vetor par e os números ÍMPARES no vetor ímpar. Imprima os três vetores.*/

import java.util.Scanner;

public class JAVA10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] ENTRADA = new int[20];
        int[] PAR = new int[20];
        int[] IMPAR = new int[20];
        int i;

        for (i = 0; i < 20; i++) {
            System.out.printf("%d. Número: ", i + 1);
            ENTRADA[i] = leitor.nextInt();

            if (ENTRADA[i] % 2 == 0) {
                PAR[i] = ENTRADA[i];
            } else {
                IMPAR[i] = ENTRADA[i];
            }
        }

        System.out.println("VALORES DIGITADOS:");
        for (i = 0; i < 20; i++) {
            System.out.printf(" " + "%d", ENTRADA[i]);
        }

        System.out.println("\nNÚMEROS PARES:");
        for (i = 0; i < 20; i++) {
            if (PAR[i] != 0) {
                System.out.printf(" " + "%d", PAR[i]);
            }
        }

        System.out.println("\nNÚMEROS IMPARES:");
        for (i = 0; i < 20; i++) {
            if (IMPAR[i] != 0) {
                System.out.printf(" " + "%d", IMPAR[i]);
            }
        }
    }
}
