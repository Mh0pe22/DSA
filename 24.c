#include <stdio.h>

int a = 54;

int func1(int a1)
{ 
    static int m = 12;
    printf("The value of m is %d\n",m);
    m++;
   // printf("The value of a is %d\n",a);
    return a * 10;
}

int main()
{
    int a = 11;
    int val = func1(a);
    val = func1(a);
    val = func1(a);
    val = func1(a);
    val = func1(a);
    printf("The value of func1 is %d\n",val);

    return 0;
}