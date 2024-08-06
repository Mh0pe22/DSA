#include <stdio.h>
//No Argument and No Return Value 
void Star_pattern() 
 


{ 
	int a, i; 
	printf("Enter how many stars(*) you want : \n"); /* In this both declaration and definition of function are done together.*/ 
	scanf("%d", &a ); 
	for ( i = 0; i<a; i++) 
	{
		printf("*"); 
	} 
} 
