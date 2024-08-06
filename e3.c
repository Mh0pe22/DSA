#include <stdio.h>
int main()
{
    int num,rev = 0,rem;
    printf("Enter a number:\n");
    scanf("%d",&num);
    while (num>0)
    {
        rem = num%10;
        rev = rev*10 + rem;
        num = num/10;
    }
    
    printf("The reverse number is %d\n",rev);
    if(num == rev)
    {
        printf("The number is palindrome");
    }
    else
    {
        printf("The number is not pelindrome");
    }
    
    return 0;
}