#include <stdio.h>
int main()
{
    int i,sum=0,n;
    printf("Enter the value of number:");
    scanf("%d",&n);
    for(i=0; i<=n; i++)
    {
        sum=sum+i;
    }
    printf("\nThe sum of first %d term is %d",n,sum);
    
    return 0;
}