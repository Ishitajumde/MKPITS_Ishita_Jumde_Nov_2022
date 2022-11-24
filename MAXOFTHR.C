#include<stdio.h>
#include<conio.h>
void main()
{

	int a,b,c;
	printf("enter any three numbers");
	scanf("%d%d%%d",&a,&b,&c);
	if(a>b && a>c)
	{
	  printf("%d is greater \n",a);
	}
	else if(b>c)
	{
	   printf("%d is greater \n",b);
	}
	else
	{
	   printf("%d is greater \n",c);
	}
	clrscr();
getch();
}