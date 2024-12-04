/*Criar um programa que receba 3 notas de 3 alunos. Caso o aluno não obtenha nota superior a
6 na média entre a duas notas AV1 e AV2, inserir nota AV3 e substituir a menor entre Av1 e
Av2, recalcular a média e mostrar o resultado da aprovação ou reprovação dos alunos*/

import java.util.Scanner;

public class JAVA8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double[][] NOTAS = new double[3][3];
        double[] MEDIAS = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Aluno %d\n", i + 1);

            System.out.print("AV1: ");
            NOTAS[i][0] = leitor.nextDouble();
            System.out.print("AV2: ");
            NOTAS[i][1] = leitor.nextDouble();

            MEDIAS[i] = (NOTAS[i][0] + NOTAS[i][1]) / 2;

            if (MEDIAS[i] <= 6.0) {
                System.out.print("AV3: ");
                NOTAS[i][2] = leitor.nextDouble();

                if (NOTAS[i][0] > NOTAS[i][1]) {
                    NOTAS[i][1] = NOTAS[i][2];
                } else {
                    NOTAS[i][0] = NOTAS[i][2];
                }
                MEDIAS[i] = (NOTAS[i][0] + NOTAS[i][1]) / 2;
            }
        }

        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            if (MEDIAS[i] > 6) {
                System.out.printf("Aluno %d: APROVADO\n", i + 1);
                System.out.printf("MEDIA: %.2f\n", MEDIAS[i]);
            }else{
                System.out.printf("Aluno %d: REPROVADO\n", i + 1);
                System.out.printf("MEDIA: %.2f\n", MEDIAS[i]);
            }
            System.out.println(" ");

        }
    }
}

