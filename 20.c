#include <stdio.h>
#include <string.h>

int main()
{
    char s1[] = "mohit";
    char s2[] = "harsh";
    char s3[22];
    //puts(strcat(s1,s2));
    //printf("The length of s1 is  = %d\n",strlen(s1));
    //printf("The length of s2 is = %d\n",strlen(s2)); 
    printf("The reverse string for s1 :\n");
    puts(strrev(s1));
    printf("The reverse string for s2 :\n");
    puts(strrev(s2));
    printf("The string s3 is %d\n",strcmp(s1,s2));

    return 0;
}