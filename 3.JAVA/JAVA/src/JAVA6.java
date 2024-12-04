/*Leia uma temperatura a qual o usuário irá digitar o Valor e a escala atual: (Fahrenheit,
Celsius, Kelvin), e informar a escala para qual deseja converter.
a. /Celsius para Fahrenheit: F = C*(1.8) + 32
b. /Fahrenheit para Celsius: C = (F − 32) / 1.8
c. /Kelvin para Celsius: C = K – 273.15
d. /Celsius para Kelvin: K = C + 273.15
e. /Kelvin para Fahrenheit: F = 1,8(K-273.15) + 32*/

import java.util.Scanner;

public class JAVA6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char ESCALATUAL, ESCALANOVA;
        double TEMPATUAL, TEMPNOVA = 0;

        System.out.print("Temperatura atual: ");
        TEMPATUAL = leitor.nextDouble();
        System.out.print("Escala atual (C, F, K): ");
        ESCALATUAL = leitor.next().toUpperCase().charAt(0);
        System.out.print("Converter para (C, F, K): ");
        ESCALANOVA = leitor.next().toUpperCase().charAt(0);

        if (ESCALATUAL == ESCALANOVA) {
            TEMPNOVA = TEMPATUAL;
        } else if (ESCALATUAL == 'C' && ESCALANOVA == 'F') {
            TEMPNOVA = (TEMPATUAL * 1.8) + 32;
        } else if (ESCALATUAL == 'C' && ESCALANOVA == 'K') {
            TEMPNOVA = TEMPATUAL + 273.15;
        } else if (ESCALATUAL == 'K' && ESCALANOVA == 'C') {
            TEMPNOVA = TEMPATUAL - 273.15;
        } else if (ESCALATUAL == 'K' && ESCALANOVA == 'F') {
            TEMPNOVA = 1.8 * (TEMPATUAL - 273.15) + 32;
        } else if (ESCALATUAL == 'F' && ESCALANOVA == 'C') {
            TEMPNOVA = (TEMPATUAL - 32) / 1.8;
        } else if (ESCALATUAL == 'F' && ESCALANOVA == 'K') {
            TEMPNOVA = ((TEMPATUAL - 32) / 1.8) + 273.15;
        } else {
            System.out.print("Valor/Escala inválido");
            return;
        }

        System.out.printf("Temperatura convertida: %.3f%c", TEMPNOVA, ESCALANOVA);
    }
}