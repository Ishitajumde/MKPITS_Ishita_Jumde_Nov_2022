#include<iostream.h>
#include<conio.h>
void main()
{
  int x,y,i,temp;
  clrscr();
  cout<<"enter the value for x and y";
  cin>>x>>y;
  if(x>y)
  {
   temp=y;
   y=x;
   x=temp;
   }
  for(i=x+1;i<y;i++)
  {
  if(i%7==2 || i%7==3)
  {
    cout<<"division number"<<i;
  }
  }
getch();
}