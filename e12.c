#include <stdio.h>
int main()
{
    int n,count = 0;
    printf("Enter the number\n");
    scanf("%d",&n);
    printf("You enter %d\n",n);
    for ( int i = 1; i <= n; i++)
    {
     if (n%i == 0)
    {
        count ++;
    }   
    }
    if (count == 2)
    {
        printf("You enter prime number");
    }
    else
    {
        printf("Yon don't enter prime number");
    }
    
    
    
    
    return 0;
}