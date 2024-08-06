#include <stdio.h>
#include <string.h>

struct student
{   
    int id;
    int marks;
    char name[32];
}Mohit,Bhautik,Aryan;


int main()
{
    Mohit.id = 1;
    Bhautik.id = 2;
    Aryan.id = 3;
    Mohit.marks = 500;
    Bhautik.marks = 400;
    Aryan.marks = 450;
    Mohit.name ;
    Bhautik.name ;
    Aryan.name ;

    printf("Mohit's id is = %d\n",Mohit.id);
    printf("Bhautik's id is = %d\n",Bhautik.id);
    printf("Aryan's id is = %d\n",Aryan.id);
    printf("Mohit's marks is =%d\n",Mohit.marks);
    printf("Bhautik's marks is =%d\n",Bhautik.marks);
    printf("Aryan's marks is =%d\n",Aryan.marks);
    strcpy(Mohit.name,"Mohit is very haelpful person");
    strcpy(Bhautik.name,"Bhautik is very good designer");
    strcpy(Aryan.name," Aryan is very naugty friend");
    printf("%s\n",Mohit.name);
    printf("%s\n",Bhautik.name);
    printf("%s\n",Aryan.name);
   
    return 0;
}