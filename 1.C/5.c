/*19. Fa�a um programa que pe�a ao usu�rio um n�mero entre 12 e 20. Se a pessoa digitar um n�mero
diferente, mostrar a mensagem "entrada inv�lida" e solicitar o n�mero novamente. Se digitar correto
mostrar o n�mero digitado*/

#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    int NUM;

    printf("N�mero: ");
    scanf("%d", &NUM);

    while(NUM <= 12 || NUM >= 20){
        printf("N�mero fora do intervalo\n");
        printf("Tente novamente: ");
        scanf("%d", &NUM);
    }
    printf("%d est� dentro do intervalo", &NUM);
}