#include <stdio.h>

int main()
{
    printf("Hello World");
    int i, age;
    for ( i = 0; i < 10; i++)
    {
        printf("%d\n Enter your age\n",i);
        scanf("%d\n", &age);

        //if(age >10)
       // {
         //   break;
        //}

        if( age>10)
        {
            continue;
        }
        printf("my name is mohit");
    }
    
    return 0;
}
