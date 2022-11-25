#include<stdio.h>
#include<conio.h>
void main()
{
 int id,work,perhr,salary;
 printf("enter employe id");
 scanf("%d",&id);
 printf("total worked hr of month");
 scanf("%d",&work);
 printf("amount recieved per hr");
 scanf("%d",&perhr);
 salary=(work*perhr);
 clrscr();
 printf("employid=%d\n salary=%d",id,salary);
 getch();
}