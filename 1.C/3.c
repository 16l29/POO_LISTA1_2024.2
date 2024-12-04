/*17. Calcular se um número é ou não primo*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int NUM, i, CONTAGEM = 0;

    printf("Número: ");
    scanf("%d", &NUM);

    for (i = 1; i <= NUM; i++)
    {
        if (NUM % i == 0)
        {
            CONTAGEM++;
        }
    }
    if (CONTAGEM == 2)
    {
        printf("%d é primo\n", NUM);
    }
    else
    {
        printf("%d não é primo\n", NUM);
    }
}