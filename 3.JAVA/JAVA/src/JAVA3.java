/*Calcular se um número é ou não primo?*/
import java.util.Scanner;

public class JAVA3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int NUM, i;
        int CONTAGEM = 0;

        System.out.print("Número: ");
        NUM = leitor.nextInt();
        for (i = 1; i <= NUM; i++){
            if(NUM % i == 0){
                CONTAGEM++;
            }
        }
        if(CONTAGEM == 2){
            System.out.printf("%d é primo\n", NUM);
        }else{
            System.out.printf("%d não é primo\n",NUM);
        }

    }
}
