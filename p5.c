#include <stdio.h>
int main()
{
    int i,n,sum,sumo,a;
    printf("Enter a number:");
    scanf("%d",&n);
    for ( i = 0; i <=n; i++)
    {
        scanf("%d",&a);
        if (a%2==0)
        {
            sum=sum+a;
        }
        else{
            sumo=sumo+a;
        }
        printf("The sum of first odd term is %d\n",sum);
        printf("The sum of first even term is %d",sumo);
        
    }
    
    return 0;
}