#include<stdio.h>
#include<conio.h>
void main()
{

	int *p1,a=2;
	p1=&a;
	clrscr();
	printf("%u\n",a);
	printf("%u\n",&a);
	printf("%u\n",*&a);
	printf("%u\n",p1);
	printf("%u\n",&p1);
	printf("%u\n",*p1);

getch();
}