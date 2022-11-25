#include<stdio.h>
#include<conio.h>
  //no return type with argument
void rev(num)
{
	int n1,n2,n3,rev;
	n1=num %10;
	num=num/10;
	n2=num %10;
	num=num/10;
	n3=num %10;
	rev=n1*100+n2*10+n3*1;
	printf("rev order=%d",rev);
}
void main()
{
 int num,n1,n2,n3;
 printf("enter the digit in num");
 scanf("%d",&num);
 rev(num);
 getch();
}

