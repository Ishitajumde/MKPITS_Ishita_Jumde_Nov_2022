#include<iostream.h>
#include<conio.h>
void main()
{
  int x;
  clrscr();
  cout<<"enter the correct password";
  cin>>x;
  if(x==1234)
  {
    cout<<"CORRECT PASSWORD";
  }
  else
  {
   cout<<"incorrect password";
  }
getch();
}