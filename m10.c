#include <stdio.h>
int main()
{
    int a,b,c;
    printf("Enter the value of a ,b and c:\n");
    scanf("%d%d%d",&a,&b,&c);
    printf("The value of a ,b and c is %d,%d,%d\n",a,b,c);
    if(a>b)
    {
        if(a>c)
        {
            printf("The value of a is maximum");
        }
        

    }
    else
    {
        if(b>c)
        {
            printf("The value of b is maximum");
        }
    else
        {
        printf("The value of c is maximum");
        }
    }
    return 0;
}