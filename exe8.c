#include <stdio.h>
#include <string.h>

void reversevalue(int* ptr)
{
    printf("The actual array's value at every position is:\n");
    int i = 0;
    for (int i = 0; i < 6 ; i++)
    {
        printf("The value at %d is %d\n",i,ptr[i]);
    }
   printf("\n"); 

   printf("The reverse value of array is:\n");
   int temp;
   temp = ptr[i];
   ptr[i] = ptr[6-i];
   for ( i = 0; i < 6; i++)
   {
      printf("The value at %d is %d\n",i,ptr[6-i]);
   }
}

int main()
{
    int arr[] = {1,8,11,13,16,22};
    reversevalue(arr);
    return 0;
}