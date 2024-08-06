#include <stdio.h>

int main()
{
    /**
    
    Enter 1 if you want kms to miles(a)
    Enter 2 if you want inches to foot(b)
    Enter 3 if you want cms to inches(c)
    Enter 4 if you want pound to kgs(d)
    Enter 5 if you want inches to meters(e)

   **/

    int conversation;
    float a, b, c, d, e;

    
    
    printf("Enter 0 if you want to quit the programme");
    printf("Enter number 1, 2, 3, 4, 5 which conversation you want\n Enter 1 if you want kms to miles\n Enter 2 if you want inches to foot\n Enter 3 if you want cms to inches\n Enter 4 if you want pound to kgs\n Enter 5 if you want inches to meters\n");
    scanf("%d", &conversation);
    
    switch (conversation)
    {
      case 1:
           printf("Enter value of kms which you want convert into miles\n");
           scanf("%f", &a);
           printf("The value of miles is %f", a*0.621);
           
        break;

    case 2:
           printf("Enter value of inch which you want convert into foot\n");
           scanf("%f", &b);
           printf("The value of foot is %f", b*0.0833);
           
         break;

        case 3:
           printf("Enter value of cms which you want convert into inch\n");
           scanf("%f", &c);
           printf("The value of miles is %f", c*0.394);
          break;

        case 4:
           printf("Enter value of pound which you want convert into kgs\n");
           scanf("%f", &d);
           printf("The value of miles is %f", d*0.454);
           
          break;

        case 5:
           printf("Enter value of inch which you want convert into meterss\n");
           scanf("%f", &e);
           printf("The value of miles is %f", e*0.0254);
           
         break;
        
        default:
        break;
        printf("In default now");
    }
    
   return 0;
}
