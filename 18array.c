#include <stdio.h>

int func1(int array[])
{
    for (int i = 0; i < 5; i++)
    {
        printf("The value at %d is %d\n",i, array[i]);
    }
    array[0] = 222; 
    return 0;
}

void func2(int* ptr)
{
    for (int i = 0; i < 5; i++)
    {
        printf("The value at %d is %d\n",i, ptr[i]);
    }
}

void func3(int array[2][2])
{
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            printf("The value at %d , %d is %d\n",i, j, array[i][j]);
        }
        
    }
    
}

int main()
{
    int arr[2][2] = {{22,11,},{16,8,}};
    //printf("The value at 0 is %d\n",arr[0]);
    //func1(arr);
    //printf("The value at 0 is %d\n", arr[0]);
    
   // func2(arr);
    func3(arr);
    return 0;
}