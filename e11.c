#include <stdio.h>
int main()
{
    int num,a = 0,b = 1,c;
    printf("Enter the number you want to print in fiboncci series\n");
    scanf("%d",&num);
    for (int i = 1; i < num; i++)
    {
     printf("%d",a);
     c = a + b;
     a = b;
     b = c;
    }
    return 0;
}