#include <stdio.h>
int main()
{
    int a,b;
    printf("Enter the value of a and b\n");
    scanf("%d%d",&a,&b);
    printf("a&&b = %d\n",a&&b);
    printf(" a||b = %d\n",a||b);
    printf(" ++a = %d\n",++a);
    printf("--b = %d\n",--b);
    printf("a++ = %d\n",a++);
    printf("b-- = %d\n",b--);
    printf("!(a&&b) = %d\n",!(a&&b));
    return 0;
}