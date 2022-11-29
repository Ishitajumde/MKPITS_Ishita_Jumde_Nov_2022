#include<iostream.h>
#include<conio.h>
void main()
{
int a,b,i,sum=0;
clrscr();
cout<<"enter two numbers";
cin>>a>>b;
for(i=a;i<=b;i++)
{
 if((i%17)!=0)
 {
    sum=sum+i;
 }
}
cout<<"\n sum="<<sum;
getch();
}