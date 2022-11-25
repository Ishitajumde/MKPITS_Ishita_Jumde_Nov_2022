#include<stdio.h>
#include<conio.h>
  //with return type with argument
int rev(int num)
{
	int n1,n2,n3,rev;
	n1=num %10;
	num=num/10;
	n2=num %10;
	num=num/10;
	n3=num %10;
	rev=n1*100+n2*10+n3*1;
	return rev;
}
void main()
{
 int num,n1,n2,n3,r;
 printf("enter the digit in num");
 scanf("%d",&num);
 r=rev(num);
 clrscr();
 printf("rev order=%d",r);
 getch();
}

