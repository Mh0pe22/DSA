#include <stdio.h>
#include <string.h>

union Student
{
    int id;
    int marks;
    char name[32];
};


int main()
{
    union Student mohit;
    mohit.id = 1;
    mohit.marks = 720;
    mohit.name ;
    strcpy(mohit.name,"karan");
    
    printf("The mohit's id is %d\n",mohit.id);
    printf("The marks of kemil is %d\n",mohit.marks);
    printf("The name is %s\n",mohit.name);

    return 0;
}