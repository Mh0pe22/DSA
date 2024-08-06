#include <stdio.h>
int main()
{
    char a ;
    printf("Enter character\n");
    scanf("%c",&a);
    printf("You enter character %c\n",a);
    if(a <='a' && a <= 'z' )
    {
        printf("You enter small character");
    }
    else if(a <='A' && a <= 'Z' )
    {
        printf("You enter capital character");
    }

    else 
    {
        printf("You enter digit as character");
    }
    return 0;
}