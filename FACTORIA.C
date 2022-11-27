#include<stdio.h>         //no returntype with argument
#include<conio.h>
void fact(int num)
{
	int i,s=1;
	for(i=1;i<=num;i++)
	{
		s=s*i;
	}
	printf("factorial is=%d",s);
}
void main()
{
   int num;
   clrscr();
   printf("enter the number");
   scanf("%d",&num);
   fact(num);
   getch();
}