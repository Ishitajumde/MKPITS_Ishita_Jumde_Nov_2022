#include<stdio.h>            //with returntype no argument
#include<conio.h>                  //if else
int evenodd(int num)
{
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
    int num,res;
    clrscr();
    printf("enter the number\n");
    scanf("%d",&num);
    res= evenodd(num);
    printf("output=%d",res);
  getch();
}