#include<iostream.h>
#include<conio.h>
int sum(int a,int b)
{
   return(a+b);
}
int sum(int a,int b,int c)
{
    return(a+b+c);
}
int sum(int a,int b,int c,int d)
{
     return(a+b+c+d);
}
int sum(int a,int b,int c,int d,int e)
{
   return(a+b+c+d+e);
}
void main()
{
  clrscr();
  cout<<sum(2,3,4,5,6);
getch();
}