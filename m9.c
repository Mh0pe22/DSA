#include <stdio.h>
int main()
{
    int a;
    printf("Enter the number\n");
    scanf("%d",&a);
    if(a>0)
    {
        printf("You ente positive number as vale");
    }
    else if(a<0)
    {
    printf("You enter negative number as value");
    }
    else
    {
        printf("You enter 0 as value");
    }

    return 0;
}