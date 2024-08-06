// str1 is str2 friend

#include <stdio.h>
#include <string.h>

int main()
{
    char s1[32];
    char s2[32];
    char s3[32] = " is friend of ";
    
   printf("Enter your name\n");
   gets(s1);

   printf("Enter your friend name\n");
   gets(s2);

   puts(strcat(strcat(s1,s3),s2));
   return 0;
}