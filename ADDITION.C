#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void add()
{
 int a,b,res;
 printf("enter the number");
 scanf("%d %d",&a,&b);
 res=a+b;
 printf("the addition of two no=%d\n",res);
}
void sub()
{
int a,b,res;
printf("enter the nummber");
scanf("%d%d",&a,&b);
res=a-b;
printf("the subtraction of two no=%d\n",res);
}
void mul()
{
 int a,b,res;
 printf("enter the number");
 scanf("%d %d",&a,&b);
 res=a*b;
 printf("the multiplicatin of two no=%d\n",res);
}
void main()
{
   int choice;
   while(1)
   {
   printf("enter 1 for choice\n");
   printf("enter 2for choice\n");
   printf("enter3 for choice\n");
   printf("enter 4 to exit");
   printf("enter your choice");
   scanf("%d",&choice);
   switch(choice)
   {
	case 1:
	add();
	break;
	case 2:
	sub();
	break;
	case 3:
	mul();
	break;
	case 4:
	exit(0);
	default:
	printf("enter invalid choice");
   }
   }
   getch();
   clrscr();
}


