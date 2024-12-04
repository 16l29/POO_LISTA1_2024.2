/*19. Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa digitar um número
diferente, mostrar a mensagem "entrada inválida" e solicitar o número novamente. Se digitar correto
mostrar o número digitado*/

#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    int NUM;

    printf("Número: ");
    scanf("%d", &NUM);

    while(NUM <= 12 || NUM >= 20){
        printf("Número fora do intervalo\n");
        printf("Tente novamente: ");
        scanf("%d", &NUM);
    }
    printf("%d está dentro do intervalo", &NUM);
}