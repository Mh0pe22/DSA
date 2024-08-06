#include <stdio.h>

int fib_recurssive(int n)
{
if(n == 1 || n == 2 )
{
    return n-1;
}
else
{
    return fib_recurssive(n-1) + fib_recurssive(n-2);
}
}

int fib_itertive(int n)
{
    int a = 0;
    int b = 1;

    for (int i = 0; i < n-1; i++)
    {
        b=a+b;
        a=b-a;
    }
    return a;
}



int main()
{
    int number;
    printf("Enter the number to index\n");
    scanf("%d",&number);
    printf("The value of fibonacci at position %d using iterative approach %d is\n",number, fib_itertive(number));
    printf("The value of fibonacci at position %d using recursive approach %d is\n",number, fib_recurssive(number));
    return 0;
}
