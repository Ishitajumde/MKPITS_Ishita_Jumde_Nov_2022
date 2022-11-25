#include<stdio.h>
#include<conio.h>
void fun(int i)
{
	if(i==10)
	return ;
	printf("%d",i);
	getch();
	fun(i+1);
	printf("\n %d",i);
}
void main()
{
	fun(1);
	getch();
}

