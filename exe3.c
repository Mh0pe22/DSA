#include <stdio.h>

int main()
{
    int birthdate;
    printf("Enter your birthdate\n");
    scanf("%d", &birthdate);
    printf("Your birthdate is %d\n", birthdate);

    switch (birthdate)      
    {   
    case 1:
        printf("Happy birthday my lovely father(june)\n");
        break;

    case 8:
        printf("Happy birthday my brother bhaglu(july)\n");
        break;
    
    case 11:
        printf("Happy birthday my sweet mother(july)\n");
        break;
    
    case 13:
        printf("Happy birthday my handsome jiju(january)\n");
        break;
       
    case 16:
        printf("Happy birthday my cute sister dundhi(september)\n");
        break;
    
    case 22:
    printf("Happy birthday to me ...\n");
        break;
    
    default:
    printf("Birthday is not 1,8,11,13,16 or 22");
        break;
    }

    return 0;
}
