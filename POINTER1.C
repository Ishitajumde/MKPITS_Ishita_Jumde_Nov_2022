#include<stdio.h>
#include<conio.h>
void fun(int * x,* y);
{
  * x=12;
  * y=13;
}
void main()
{
	int a=2,b=3
	printf("a=%d b=%d"a,b);
	fun(a,b);
	printf("a=%d b=%d"a,b);
getch();
}