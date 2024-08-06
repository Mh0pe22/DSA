#include <stdio.h>
int main()
{
  /*  int a=12;
    int* ptra= &a;
    printf("%d\n",ptra);
    printf("%d",ptra+1);
    return 0;
    */

   int arr[] = {1,22,16,8,13,11};
   int* arrayptr = arr;
   printf("%d\n", arr[1]);
   printf("%d\n", arr+1);

   return 0;

}