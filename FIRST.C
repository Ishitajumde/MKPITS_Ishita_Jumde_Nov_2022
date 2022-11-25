#include<stdio.h>
#include<conio.h>
void rev()  //no returntype no argument
{
	int num,n1,n2,n3,rev;
	printf("enetr the digit in num");
	scanf("%d",num);
	n1=num %10;
	num=num/10;
	n2=num %10;
	num=num/10;
	n3=num %10;
	rev=n1*100+n2*10+n3*1;
	clrscr();
	printf("rev order=%d",rev);

}
void main()
{
 rev();
 getch();
}
