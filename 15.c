#include <stdio.h>

int main()
{
    int a = 22;
    int* ptr = &a;
    int* ptr2 = NULL;

    printf("The value of a is %d\n",a);
    printf("The value of a is %d\n", *ptr);
    printf("The address of a is %x\n", &a);
    printf("The address of ptr is %p\n", ptr); 
    printf("The address of ptr2 is %p\n", ptr2);
    
    return 0;
}
