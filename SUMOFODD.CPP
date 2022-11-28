#include<iostream.h>
#include<conio.h>
void main()
{
int fs,ls,sum=0;
cout<<"enter first to last no=\n";
cin>>fs>>ls;
while(fs<=ls)
{
if(fs%2!=0)
{
  sum=sum+fs;
}
  fs++;
}
  cout<<"the sum of odd number is="<<sum;
getch();
}


