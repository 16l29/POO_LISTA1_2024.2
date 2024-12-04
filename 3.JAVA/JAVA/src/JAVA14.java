/*Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de
20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois
outros vetores*/

import java.util.Scanner;


public class JAVA14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] VETOR1 = new int[10];
        int[] VETOR2 = new int[10];
        int[] RESULTANTE = new int[20];

        for (int i = 0; i < 10; i++) {
          System.out.printf("%d.Número: ", i + 1);
          VETOR1[i] = leitor.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d.Número: ", i + 1);
            VETOR2[i] = leitor.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            RESULTANTE[i * 2] = VETOR1[i];
            RESULTANTE[i * 2 + 1] = VETOR2[i];
        }

        System.out.println("RESULTANTE:");
        for (int i = 0; i < 20; i++){
            System.out.printf(" " + "%d", RESULTANTE[i]);
        }
    }
}
