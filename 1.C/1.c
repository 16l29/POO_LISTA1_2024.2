/*1. Diferenciar dentre 3 n�meros, qual � o maior e qual � o menor*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int ENTRADA[3];
    int i, MAIOR, MENOR;

    for (i = 0; i < 3; i++)
    {
        printf("%d.N�mero: ", i + 1);
        scanf("%d", &ENTRADA[i]);
    }

    MENOR = ENTRADA[0];
    MAIOR = ENTRADA[0];

    for (i = 0; i < 3; i++)
    {
        if (ENTRADA[i] > MAIOR)
        {
            MAIOR = ENTRADA[i];
        }
        if (ENTRADA[i] < MENOR)
        {
            MENOR = ENTRADA[i];
        }
    }

    printf("MENOR: %d\n", MENOR);
    printf("MAIOR: %d\n", MAIOR);
}