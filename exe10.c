#include <stdio.h>
#include <string.h>
struct Travelagency
{   
    char name[50];
    char dl[25];
    char route[50];
    float kms;

}d1,d2,d3;


int main()
{
    int num;
    printf("Welcome to the all drivers to our travel agency\n");
    printf("Please anter your number to start fill your deatail\n");
    scanf("%d",&num);
    switch (num)
    {
    case 1:
        printf("Enter your name:\n");
        scanf("%s",d1.name);
        printf("Enter your Driving licence No:\n");
        scanf("%s",d1.dl);
        printf("Enter your driving route:\n");
        scanf("%s",d1.route);
        printf("Enter kilometre you drive:\n");
        scanf("%f",d1.kms);
        printf("\n");
        printf("The detail of driver no 1 is :\n %s \n%s \n%s \n%f \n ",d1.name,d1.dl,d1.route,d1.kms);
        break;
    
    default:
        break;
    }
    return 0;
}