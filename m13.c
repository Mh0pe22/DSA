#include <stdio.h>
int main()
{
    int fact = 1,n;
    printf("Enter the number which you want factorial:\n");
    scanf("%d",&n);
    printf("You enter %d\n",n);
    for (int i = 1; i <= n; i++)
    {
        fact = fact*i;
    }
    printf("The factorial of %d is %d",n,fact);
    

    return 0;
}