/*23. Crie um programa que receba tr�s valores (obrigatoriamente maiores que zero), representando as medidas
dos tr�s lados de um tri�ngulo. Elabore fun��es para:
a. Determinar se eles lados formam um triangulo, sabendo que:
i. O comprimento de cada lado de um tri�ngulo � menor do que a soma dos outros dois lados.
b. Determinar e mostrar o tipo de triangulo, caso as medidas formem um triangulo.
i. Equil�tero tr�s lados iguais.
ii. Is�sceles dois lados iguais.
iii. Escaleno tr�s lados diferentes*/

#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

    int LADO1, LADO2, LADO3;

    printf("Lado 1: ");
    scanf("%d", &LADO1);
    printf("Lado 2: ");
    scanf("%d", &LADO2);
    printf("Lado 3: ");
    scanf("%d", &LADO3);

    if (LADO1 <= 0 || LADO2 <= 0 || LADO3 <= 0){
        printf("Os valores t�m que ser maiores que zero");
        return 1;
    }
    if ((LADO1 + LADO2 > LADO3) && (LADO1 + LADO3 > LADO2) && (LADO2 + LADO3 > LADO1)){
        if ((LADO1 == LADO2) && (LADO1 == LADO3)){
            printf("Equil�tero");
        } else if ((LADO1 != LADO2) && (LADO1 != LADO3) && (LADO2 != LADO3)){
            printf("Escaleno");
        } else {
            printf("Is�sceles");
        }
    }else{
        printf("N�o forma um tri�ngulo");
    }
}