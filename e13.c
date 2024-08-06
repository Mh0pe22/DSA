#include <stdio.h>
int main()
{
    int n,i = 0;
    float sum ,avg,num;
    sum =0;
    printf("Enter the numbers you want sum and average\n");
    scanf("%d",&n);
    printf("Enter numbers\n");
    do
    { 
        scanf("%f",&num);
        sum = sum + num;
        i ++;
    } while (i < n);
    {
        avg = sum/n;
    }
    printf("The sum is %f\n",sum);
    printf("The average value is %f",avg);

    return 0;
}
