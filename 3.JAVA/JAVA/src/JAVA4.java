/*Informar se um número inteiro está ou não dentro de um intervalo de 2 número digitado*/

import java.util.Scanner;

public class JAVA4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int NUM, INTERVALO1, INTERVALO2, MENOR, MAIOR;

        System.out.print("Número: ");
        NUM = leitor.nextInt();
        System.out.print("Primeiro intervalo: ");
        INTERVALO1 = leitor.nextInt();
        System.out.print("Segundo intervalo: ");
        INTERVALO2 = leitor.nextInt();

        if (INTERVALO1 < INTERVALO2) {
            MENOR = INTERVALO1;
            MAIOR = INTERVALO2;
        } else {
            MENOR = INTERVALO2;
            MAIOR = INTERVALO1;
        }

        if (NUM >= MENOR && NUM <= MAIOR){
            System.out.print("Número dentro do intervalo");
        }else{
            System.out.print("Número fora do intervalo");
        }
    }
}
