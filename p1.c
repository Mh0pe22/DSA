#include <stdio.h>
int main()
{
    int n1,n2,n3;
    printf("Enter the value of n1,n2,n3\n");
    scanf("%d%d%d",&n1,&n2,&n3);
    if(n1>n2)
    {
        if(n1>n3)
        printf("N1 is grater");
    }
    else
    {
        if(n2>n3)
        {
            printf("N2 is grate");
        }
        printf("N3 is grater");
    }
    return 0;
}