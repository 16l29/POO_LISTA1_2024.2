/*22. Criar um programa que receba 3 notas de 3 alunos. Caso o aluno não obtenha nota superior a 6 na média
entre a duas notas AV1 e AV2, inserir nota AV3 e substituir a menor entre Av1 e Av2, recalcular a
média e mostrar o resultado da aprovação ou reprovação dos alunos*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    double NOTAS[3][3];
    double MEDIAS[3];

    for (int i = 0; i < 3; i++)
    {
        printf("Aluno %d\n", i + 1);

        printf("AV1: ");
        scanf("%lf", &NOTAS[i][0]);
        printf("AV2: ");
        scanf("%lf", &NOTAS[i][1]);

        MEDIAS[i] = (NOTAS[i][0] + NOTAS[i][1]) / 2;

        if (MEDIAS[i] <= 6) 
        {
            printf("AV3: ");
            scanf("%lf", &NOTAS[i][2]);

            if (NOTAS[i][0] > NOTAS[i][1])
            {
                NOTAS[i][1] = NOTAS[i][2];
            }
            else
            {
                NOTAS[i][0] = NOTAS[i][2];
            }
            MEDIAS[i] = (NOTAS[i][0] + NOTAS[i][1]) / 2;
        }
    }

    for (int i = 0; i < 3; i++)
    {
        if (MEDIAS[i] > 6)
        {
            printf("Aluno %d: APROVADO\n", i + 1);
            printf("MÉDIA: %.2f\n", MEDIAS[i]);
        }
        else
        {
            printf("Aluno %d: REPROVADO\n", i + 1);
            printf("MÉDIA: %.2f\n", MEDIAS[i]);
        }
    }
}
