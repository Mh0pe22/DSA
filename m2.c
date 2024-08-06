#include <stdio.h>
int main()
{
    float b,c;
    int a;
    printf("Enter 1 for multiplication, 2 for subtraction, 3 for  sum, 4 for division\n");
    scanf("%d",&a);
    printf("Enter the value of b and c\n");
    scanf("%f%f", &b,&c);
    switch (a)
    {
    case 3:
    printf("The sum of c + b is = %f",c+b);
        break;

    case 4:
    printf("The dividesion of b / c is = %f",b / c);
        break;

    case 2:
    printf("The substaction of b - c  is = %f",b-c);
       break;

    case 1:
    printf("The multiplication of b * c is = %f",b*c);
        break;

    default:
    printf("Ypu enter invalid number");
        break;
    }
    return 0;
}