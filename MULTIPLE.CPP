#include<stdio.h>
#include<conio.h>
void main()
{
int a,b;
clrscr();
printf("enter the two numbers");
scanf("%d %d",&a,&b);
  if(b%a==0)
{
      printf("it is a multiple");
}
else
{
      printf("it is not a multiple");
}
getch();
}


