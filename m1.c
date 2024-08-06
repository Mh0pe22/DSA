#include <stdio.h>
int main()
{
    int a; 
    float b;
    double c;
    char d = ('m');
    printf("Enter the value of a\n");
    scanf("%d",&a);
    printf("The value of a is %d\n",a);
    printf("Enter the value of b\n");
    scanf("%f",&b);
    printf(" The value of b is  %f\n",b);
    printf("Enter the value of c\n");
    scanf("%lf",&c);
    printf(" The value of c is %lf\n",c);
    
    printf(" The value of d is %c",d);
    return 0;
}