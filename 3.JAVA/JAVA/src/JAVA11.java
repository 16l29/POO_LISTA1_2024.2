/*Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a
média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0*/

import java.util.Scanner;

public class JAVA11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int i;
        int[][] NOTAS = new int[10][4];
        double[] MEDIAS = new double[10];
        int CONTMEDIAS = 0;

        for (i = 0; i < 10; i++) {
            int SOMA = 0;
            System.out.printf("%d° Aluno:\n", i + 1);
            for (int j = 0; j < 4; j++) {
                System.out.printf("Nota %d: ", j + 1);
                NOTAS[i][j] = leitor.nextInt();
                SOMA += NOTAS[i][j];
            }
            System.out.println(" ");
            MEDIAS[i] = (double) SOMA / 4;

            if (MEDIAS[i] >= 7.0) {
                CONTMEDIAS++;
            }
        }

        System.out.printf("%d alunos com média >= a 7.0", CONTMEDIAS);
    }
}
