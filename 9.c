#include <stdio.h>

int main()
{

   

    int i, j, num;

    for ( i = 0; i < 10; i++)
    {
            printf("%d\n",i);

            for ( j = 0; j < 7; j++)
            {
                printf("Enter a number.enter 0 to exist\n");
                scanf("%d",&num);
                if(num==0)
                {
                    goto end;
                }
            }
            
    }
    end:

    return 0; 
}
