#include<stdio.h>            //with returntype no argument
#include<conio.h>                  //if else
int evenodd()
{
    int num;
    clrscr();
    printf("enter the number\n");
    scanf("%d",&num);
    if(num%2==0)
    {
      return 1;
    }
    else
    {
       return 0;
    }
}
void main()
{
   int res;
 res= evenodd();
 printf("output=%d",res);
  getch();
}