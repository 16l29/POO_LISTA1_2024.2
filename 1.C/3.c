/*17. Calcular se um n�mero � ou n�o primo*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int NUM, i, CONTAGEM = 0;

    printf("N�mero: ");
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
        printf("%d � primo\n", NUM);
    }
    else
    {
        printf("%d n�o � primo\n", NUM);
    }
}