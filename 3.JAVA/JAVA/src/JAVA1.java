/*Diferenciar dentre 3 números, qual é o maior e qual é o menor*/

import java.util.Scanner;

public class JAVA1 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int[] ENTRADA = new int[3];
        int i;
        int MAIOR, MENOR;

        for(i = 0; i < 3; i++){
            System.out.print("Número? ");
            ENTRADA[i] = leitor.nextInt();
        }

        MENOR = ENTRADA[0];
        MAIOR = ENTRADA[0];

        for(i = 0; i < 3; i++){
            if(ENTRADA[i] > MAIOR){
                MAIOR = ENTRADA[i];
            }
            if(ENTRADA[i] < MENOR){
                MENOR = ENTRADA[i];
            }
        }

        System.out.printf("MENOR: %d\n", MENOR);
        System.out.printf("MAIOR: %d\n", MAIOR);

    }
}