#include<iostream.h>
#include<conio.h>
class addtime
{
public:
int hr,min,sec;
void setdata(int x,int y,int z)
{
 hr=x;
 min=y;
 sec=z;
}
void add(addtime ob1,addtime ob2)
{
 hr=ob1.hr+ob2.hr;
 min=ob1.min+ob2.min;
 sec=ob1.sec+ob2.sec;
}
void dis()
{
   cout<<"hrs ="<<hr;
    cout<<"minutes ="<<min;
     cout<<"seconds ="<<sec;
}
};
void main()
{
addtime ob1,ob2,ob3;
clrscr();
ob1.setdata(1,40,50);
ob2.setdata(1,10,20);
ob3.add(ob1,ob2);
ob3.dis();
getch();
}


