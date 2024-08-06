#include <stdio.h>
int main()
{
    float p,r,n,i;
    printf("Enter the value of principle amount p:\n");
    scanf("%f",&p);
    printf("Enter the value of rate of interest r:\n");
    scanf("%f",&r);
    printf("Enter the value of numbers of year n:\n");
    scanf("%f",&n);
    printf("The interest is %f",p*r*n/100);
    return 0;
}
