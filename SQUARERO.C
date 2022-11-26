#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
   float a,b,res;
   clrscr();
   printf("enter any two num\n");
   scanf("%f%f",&a,&b);
   res=sqrt(a-b);
   printf("result=%f",a,b,res);
   getch();
}