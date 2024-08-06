#include <stdio.h>
int main()
{
    int a;
    printf("Enter the value you want to check it's even or odd\n");
    scanf("%d",&a);
    printf("You enter %d \n",a);
    if(a%2==0)
    {
        printf("You enter even number");
    }
    else
    {
        printf("You enter odd number");
    }
    return 0;
}