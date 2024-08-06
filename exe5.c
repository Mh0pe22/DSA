// Take 0 for traingular star pattern and take 1 for reversed traingular star pattern

#include <stdio.h>
int main()
{
    
    int a,b;
    printf("Type '0' for traiangular star pattern or Type '1' for reversed traiangular star pattern\n");
    scanf("%d",&a);

     switch (a)
     {
     case 0:
        printf("Enter the value of the star line you want to print\n ");
        scanf("%d",&b);
        printf("The angular traiangle starpattern %d is\n",b);
        for (int i = 0; i < b; i++)
        {
          for (int j = 0; j < i+1; j++)
          {
            printf("*");
          }
          printf("\n");
        }
        
        break;

        case 1:
        printf("Enter the value of the star line you want to print\n ");
        scanf("%d",&b);
        printf("The reversed traiangular starpattern %d is\n",b);
        for (int i = 0; i < b; i++)
        {
          for (int j = b; j > i; j--)
          {
            printf("*");
          }
          printf("\n");
        }
        
        break;
     
     default:
     printf("You selected invalid choice ");
        break;
     }


    return 0;
}