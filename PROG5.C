//covert days into yr,month,days
#include<stdio.h>
#include<conio.h>
void main()
{
	int days,yr,mnth,day;
	clrscr();
	printf("enter a number in days");
	scanf("%d",&days);
	yr=days/365;
	days=days%365;
	mnth=days/30;
	day=days%30;
	printf("yr%d month%d day%d",yr,mnth,day);
	getch();
}