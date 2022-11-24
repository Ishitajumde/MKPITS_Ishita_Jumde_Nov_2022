#include<stdio.h>
#include<conio.h>
void main()
{
    int cmp;
    char n1[10],n2[10];
    printf("enter any name");
    scanf("%s",n1);
    cmp=strcmp(n2,n1);
    if (cmp>0)
    {
	printf("n2 is greater");
    }
    else
    {
	printf("n2 is less");
    }
getch();
}
