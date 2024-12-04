/*21. Fa�a um programa que, para um n�mero indeterminado de pessoas: leia a idade de cada uma, sendo que
a idade 0 (zero) indica o fim da leitura e n�o deve ser considerada. A seguir calcule:
a) O n�mero de pessoas;
b) A idade m�dia do grupo;
c) Menor idade e a maior idade.*/

#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    int IDADE, CONTAGEM = 0, SOMA = 0, MENOR = 0, MAIOR = 0;
    float MEDIA;

    printf("(0 p/ cancelar)\n");
    while(1){
        printf("Idade: ");
        scanf("%d", &IDADE);

        if (IDADE == 0){
            break;
        }

        if (CONTAGEM == 0){
            MENOR = IDADE;
            MAIOR = IDADE;
        }else{
            if (IDADE > MAIOR){
                MAIOR = IDADE;
            }
            if (IDADE < MENOR){
                MENOR = IDADE;
            }
        }
        SOMA += IDADE;
        CONTAGEM++;
    }

    if (CONTAGEM > 0) {
        MEDIA = (float) SOMA / CONTAGEM;
        printf("Idade m�dia: %.2f\n", MEDIA);
        printf("N�mero de pessoas: %d\n", CONTAGEM);
        printf("Maior: %d\n", MAIOR);
        printf("Menor: %d\n", MENOR);
    } else {
        printf("Nenhuma idade inserida.\n");
    }

    return 0;
}