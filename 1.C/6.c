/*20. Leia uma temperatura a qual o usuário irá informar o Valor e a escala atual: (Fahrenheit, Celsius, Kelvin) e
informar a escala para qual deseja converter.
a. Celcius para Fahrenheit: F = C*(1.8) + 32
b. Fahrenheit para Celcius: C = (F ? 32) / 1.8
c. Kelvin para Celcius: C = K ? 273.15
d. Celcius para Kelvin: K = C + 273.15
e. Kelvin para Fahrenheit: F = 1,8(K-273) + 32*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    char ESCALATUAL, ESCALANOVA;
    double TEMPATUAL, TEMPNOVA = 0;

    printf("Temperatura atual: ");
    scanf("%lf", &TEMPATUAL);

    printf("Escala atual (C, F, K): ");
    scanf(" %c", &ESCALATUAL);

    printf("Escala nova (C, F, K): ");
    scanf(" %c", &ESCALANOVA);

    if (ESCALATUAL == ESCALANOVA){
        TEMPNOVA = TEMPATUAL;
    }
    else if (ESCALATUAL == 'C' && ESCALANOVA == 'F'){
        TEMPNOVA = (TEMPATUAL * (1.8)) + 32;
    }
    else if (ESCALATUAL == 'C' && ESCALANOVA == 'K'){
        TEMPNOVA = TEMPATUAL + 273.15;
    }
    else if (ESCALATUAL == 'K' && ESCALANOVA == 'C'){
        TEMPNOVA = TEMPATUAL - 273.15;
    }
    else if (ESCALATUAL == 'K' && ESCALANOVA == 'F'){
        TEMPNOVA = 1.8 * (TEMPATUAL - 273.15) + 32;
    }
    else if (ESCALATUAL == 'F' && ESCALANOVA == 'C'){
        TEMPNOVA = (TEMPATUAL - 32) / 1.8;
    }
    else if (ESCALATUAL == 'F' && ESCALANOVA == 'K'){
        TEMPNOVA = ((TEMPATUAL - 32) / 1.8) + 273.15;
    }
    else{
        printf("Valor/Escala inválido");
        return 1;
    }

    printf("Temperatura convertida: %.3lf%c", TEMPNOVA, ESCALANOVA);
}