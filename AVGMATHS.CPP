#include<iostream.h>
#include<conio.h>
void main()
{
  int num,i,total=0,count=0;
  float avg;
  clrscr();
  cout<<"enter the marks of maths 0 to terminate";
  cin>>num;
  for(i=0;num>0;i++)
  {
    cin>>num;
    if(num>0)
    {
      total=total+num;
      count=count+1;
    }
  }
    avg=total/count;
    cout<<"the avg of marks="<<avg;
getch();
}