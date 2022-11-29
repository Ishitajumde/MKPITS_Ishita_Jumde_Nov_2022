#include<iostream.h>
#include<conio.h>
void main()
{
int a,b,c,p;
clrscr();
cout<<"enter three values";
cin>>a>>b>>c;
if(a+b>c && b+c>a && a+c>b)
{
  cout<<"its a triangle";
    p=a+b+c;
}
cout<<"\nparameter="<<p;
getch();
}