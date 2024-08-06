#include <stdio.h>

int main()
{
    int age;
    printf("Enter your age\n");
    scanf("%d",&age);
     printf("Your age is %d\n",age);

     if (age>=18)
     {
     printf("You can vote for youth");
     }
    
     else if (age>=10 )
     {
        printf("You are between 10 to 18 you can vote for teenagers");
     }
     else if (age>=3)
     {
        printf("Your age betwween 3 to 10 you can vote for children");
     }
     
     else if (age<=2)
     {
        ("You can not vote");
     }


    return 0;
}

