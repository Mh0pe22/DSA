#include <stdio.h>
int main()
{
    char a,e,i,o,u;
    printf("Enter the character:\n");
    scanf("%c",&a);
    if( a == a || a == e || a == i || a == o || a == u)
    {
        printf("You enter vowel");
    }
    else
    {
        printf("You enter consonants");
    }
    return 0;
}