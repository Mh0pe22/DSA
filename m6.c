#include <stdio.h>
int main()
{
    float a;
    printf("Enter the value of kilometer:\n");
    scanf("%f",&a);
    printf("The value of meter is %f\n",a*1000);
    printf("The value of feet  is %f\n",a*3280.8);
    printf("The value of inches is %f\n",a*39370.1);
    printf("The value of centimeter is %f\n",a*100000);
    return 0;
}