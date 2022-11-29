#include<iostream.h>
#include<conio.h>
void main()
{
int x,y;
clrscr();
cout<<"enter the value of x and y\n";
cin>>x>>y;
if(x>=0 && y>=0)
{
 cout<<"belong to quadrant1";
}
if(x>=0 && y<=0)
{
 cout<<"belong to quadrant2";
}
if(x<=0 && y>=0)
{
 cout<<"belong to quadrant3";
}
if(x<=0 && y<=0)
{
 cout<<"belong to quadrant4";
}
getch();
}