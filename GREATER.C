#include<stdio.h>
#include<conio.h>
void main()
{
int p1,p2,p3,p4;
clrscr();
printf("enter the value:");
scanf("%d%d%d%d",&p1,&p2,&p3,&p4);
if(p1>p2&&p1>p3&&p1>p4)
{
  printf("p1 is grater");
}
else if(p2>p1&&p2>p3&&p2>p4)
{
  printf("p2 is greater");
}
else if(p3>p1&&p3>p2&&p3>p4)
{
printf("p3 is greater");
}
else if(p4>p1&&p4>p3&&p4>p2)
{
 printf("p4 is greater");
}
getch();
}