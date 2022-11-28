#include<iostream.h>
#include<conio.h>
void main()
{
int num,i,pos,neg;
clrscr();
for(i=1;i<=5;i++)
{
 cout<<"enter any five number\n";
 cin>>num;
   if(num>0)
     {
       cout<<"pos\n";
     }
    if(num<0)
     {
       cout<<"neg\n";
     }
 }
getch();
}