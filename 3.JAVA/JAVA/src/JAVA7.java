/*Faça um programa que, para um número indeterminado de pessoas: leia a idade de cada
uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser considerada. A seguir
calcule:
a. O número de pessoas;
b. A idade média do grupo;
c. Menor idade e a maior idade.*/

import java.util.Scanner;

public class JAVA7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int IDADE;
        float MEDIA;
        int CONTAGEM = 0, SOMA = 0, MENOR = 0, MAIOR = 0;

        System.out.print("(0 p/ cancelar)\n");
        while (true) {
            System.out.print("Idade: ");
            IDADE = leitor.nextInt();

            if (IDADE == 0) {
                break;
            }

            if (CONTAGEM == 0) {
                MENOR = IDADE;
                MAIOR = IDADE;
            } else {
                if (IDADE > MAIOR) {
                    MAIOR = IDADE;
                }
                if (IDADE < MENOR) {
                    MENOR = IDADE;
                }
            }
            SOMA += IDADE;
            CONTAGEM++;
        }

        if (CONTAGEM > 0) {
            MEDIA = (float) SOMA / CONTAGEM;
            System.out.printf("Idade média: %.2f\n", MEDIA);
            System.out.printf("Número de pessoas: %d\n", CONTAGEM);
            System.out.printf("Maior: %d\n", MAIOR);
            System.out.printf("Menor: %d\n", MENOR);
        } else {
            System.out.println("Nenhuma inserida.");
        }
    }
}