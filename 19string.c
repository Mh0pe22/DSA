#include <stdio.h>

void printstr(char str[])
{
    int i = 0;
    while (str[i]!= '\0')
    {
        printf("%c",str[i]);
        i++;
    }
    printf("\n");
}

int main()
{
    //char str[] = {'m', 'o', 'h', 'i', 't','\0'};
    char str[22];
    gets(str);
    printf("Using printf %s\n",str);
    printf("Using custom function\n");
    printstr(str);
    printf("Using puts :\n");
    puts(str);
    return 0;
}