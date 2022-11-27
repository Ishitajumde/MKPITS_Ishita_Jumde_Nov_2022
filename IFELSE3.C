#include<stdio.h>            //no  returntype with argument
#include<conio.h>                  //if else
void evenodd(int num)
{

    if(num%2==0)
    {
      printf("it is even");
    }
    else
    {
       printf("it is odd");
    }
}
void main()
{
    int num;
    clrscr();
    printf("enter the number\n");
    scanf("%d",&num);
    evenodd(num);
  getch();
}