/*18. Informar se um número inteiro está ou não dentro de um intervalo de 2 número digitado*/

#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    int NUM, INTERVALO1, INTERVALO2, MENOR, MAIOR;

    printf("Número: ");
    scanf("%d", &NUM);
    printf("Primeiro intervalo: ");
    scanf("%d", &INTERVALO1);
    printf("Segundo intervalo: ");
    scanf("%d", &INTERVALO2);

    if (INTERVALO1 < INTERVALO2) {
        MENOR = INTERVALO1;
        MAIOR = INTERVALO2;
    } else {
        MENOR = INTERVALO2;
        MAIOR = INTERVALO1;
    }

    if (NUM >= MENOR && NUM <= MAIOR) {
        printf("%d está dentro do intervalo\n", NUM);
    } else {
        printf("%d não está no intervalo\n", NUM);
    }

    return 0;
}