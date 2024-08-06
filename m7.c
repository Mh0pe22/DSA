#include <stdio.h>
int main()
{
    float f,c;
    printf("Enter the value of fahrenheit:\n");
    scanf("%f",&f);
    printf("The value of centigrade is %f",(f-32)/1.8);
    return 0;
}