#include <stdio.h>
void swap(int*x)
{
  *x = 222;
  return;
}

int main()
{
    int a = 22 , b = 11 ;
    printf("The value of a is %d\n", a);
    swap(&a);
    printf("The new value of a is %d\n", a);

    return 0;
}