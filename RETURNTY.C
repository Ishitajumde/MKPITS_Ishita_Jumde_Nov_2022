#include<stdio.h>
#include<conio.h>
int mul(int x,int y)
{
	int c;
	c=x*y;
	return c;
}
void main()
{
	int a=2,b=3,r;
	clrscr();
	r=mul(a,b);
	printf("%d",r);
getch();
}
