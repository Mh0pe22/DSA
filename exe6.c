#include <stdio.h>
void changevalue(int* a, int* b)
{
  *a = *a + *b;
  *b = *a - *b - *b;
  return;
}
int main()
{
    int x = 22 , y = 11;
    printf("The value of x and y is %d and %d\n", x, y);
    changevalue(&x, &y);
    printf("The new value of x and y is %d and %d\n", x , y);
    return 0;
}