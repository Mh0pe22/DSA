#include <stdio.h>

int main()
{
    int num;
    
    /* maths subject number is 1 and science subject number is 2.
    If you passed both subjects then it's number is 3 */

    printf("Enter the subject number you passed\n");
    scanf("%d", &num);

    printf("Congratulation you passed subject number %d\n", num);

    if (num >= 3)
    {
        printf("You passed both subjects and you win 45 rupees as gift\n");
    }
    
    else if (num <= 1)
    {
        printf("Congratulation you passed maths subject and you win 15 rupees as your gift");
    }

    else if (num <= 2)
    {
        printf("Congratulation you passed science subject and you win 15 rupees as your gift");
    }
    
    


    return 0;
}
