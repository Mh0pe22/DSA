#include <stdio.h>
int main()
{
    int m1,m2,m3,m;
    float p;
    printf("Enter your maths marks\n");
    scanf("%d",&m1);
    printf("Enter your computer marks\n");
    scanf("%d",&m2);
    printf("Enter your physic marks\n");
    scanf("%d",&m3);
    m = m1+m2+m3;
    printf("Your total marks is %d\n",m);
    p = (m*100)/300;
    printf("Your percentage is %f\n",p);
    if(p<=100 && p>=80)
    {
        printf("Your perfomance in exam was distinction");
    }
    else if(p<=60 &&  p>=79 )
    {
        printf("Your perfomance in exam was first class");
    }
    else if(p<=40 && p>=59)
    {
        printf("Your peromance in exam was second class");
    }
    else
    {
        printf("Sorry you fail in this exam ");
    }
    
    return 0;

}
