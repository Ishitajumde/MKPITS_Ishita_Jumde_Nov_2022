#include<stdio.h>
#include<conio.h>
void main()
{
	int a,avg;
	float b;
	printf("total distance travel in km:");
	scanf("%d",&a);
	printf("spent fuel in lit:");
	scanf("%f",&b);
	avg=a/b;
	clrscr();
	  printf("bike avg=%d%f",a,b);
getch();
}
