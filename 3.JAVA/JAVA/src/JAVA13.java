/*Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no
seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida.*/

import java.util.Scanner;

public class JAVA13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int i;
        double[][] IDADEALTURA = new double[5][2];

        for (i = 0; i < 5; i++) {
            System.out.printf("%d° Pessoa:\n", i + 1);
            System.out.print("Idade: ");
            IDADEALTURA[i][0] = leitor.nextDouble();
            System.out.printf("Altura: ");
            IDADEALTURA[i][1] = leitor.nextDouble();
            System.out.println(" ");
        }

        for (i = 4; i >= 0; i--) {
            System.out.printf("%d° Pessoa:\n", i + 1);
            System.out.printf("Idade: %.0f\n", IDADEALTURA[i][0]);
            System.out.printf("Altura: %.2f\n", IDADEALTURA[i][1]);
        }
    }
}