/*18. Informar se um n�mero inteiro est� ou n�o dentro de um intervalo de 2 n�mero digitado*/

#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    int NUM, INTERVALO1, INTERVALO2, MENOR, MAIOR;

    printf("N�mero: ");
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
        printf("%d est� dentro do intervalo\n", NUM);
    } else {
        printf("%d n�o est� no intervalo\n", NUM);
    }

    return 0;
}