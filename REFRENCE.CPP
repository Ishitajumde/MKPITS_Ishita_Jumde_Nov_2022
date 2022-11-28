#include<iostream.h>
#include<conio.h>
void main()
{
  const int a=2;
  clrscr();
  int &b=a;
  cout<<"a="<<a;
  cout<<"b="<<b;
  b=3;
  cout<<"a="<<a;
  cout<<"b="<<b;
getch();
}
