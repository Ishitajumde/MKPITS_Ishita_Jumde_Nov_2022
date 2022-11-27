#include<stdio.h>     //perfect number
#include<conio.h>
void main()
{
   int num,i,s=0;
   clrscr();
   printf("enter any number");
   scanf("%d",&num);
   for(i=1;i<num;i++);
   {
      if(num%i==0)
	{
	   s=s+i;
	}
   }
   if(num==s)
     {
       printf("it is perfect");
     }
   else
     {
     printf("it is not perfect");
     }
getch();
}