/*Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa digitar um
número diferente, mostrar a mensagem "entrada inválida" e solicitar o número novamente.
Se digitar correto mostrar o número digitado*/

import java.util.Scanner;

public class JAVA5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int NUM;

        System.out.print("Número: ");
        NUM = leitor.nextInt();

        while(NUM <= 12 || NUM >= 20){
            System.out.print("Número fora do intervalo\n");
            System.out.print("Tente novamente: ");
            NUM = leitor.nextInt();
        }
        System.out.printf("%d dentro do intervalo", NUM);
    }
}