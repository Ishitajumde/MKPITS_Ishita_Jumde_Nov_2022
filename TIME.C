#include<stdio.h>
#include<conio.h>
void main()
{
	int num,hr,min,sec;
	clrscr();
	printf("enter the value for num in seconds:");
	scanf("%d",&num);
	hr=num/3600;
	min=(num/3600)/60;
	sec=min*60;
	printf("time=%d",hr,min,sec);
getch();
}
