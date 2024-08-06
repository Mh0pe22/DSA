#include <stdio.h>
int main()
{
    float a,b,c,d,e,r;
    printf("Enter the value of square side a\n");
    scanf("%f",&a);
    printf("The area of square is %f\n",a*a);
    printf("Enter the value of length b and width c\n");
    scanf("%f%f",&b,&c);
    printf("The area of rectangle is %f\n",b*c);
    printf("Enter the value of base d and height e\n");
    scanf("%f%f",&d,&e);
    printf("The area of triangle is %f\n",0.5*d*e);
    printf("Enter the value of radius r\n");
    scanf("%f",&r);
    printf("The area of circle is %f",3.14*r*r);
    return 0;
}