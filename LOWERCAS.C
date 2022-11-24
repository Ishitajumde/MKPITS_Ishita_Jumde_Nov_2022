#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
	char n1[10];
	printf("enter any name");
	scanf("%s",n1);
	strlwr(n1);
	printf("%s",n1);
getch();
}