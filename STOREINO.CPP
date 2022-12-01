#include<iostream.h>
#include<conio.h>
class one
{
public:
int a,b;
 void setdata(int x, int y)
{
  a=x;                                          
  b=y;
}
one add(one tob,one ob2)
{
  tob.a=a+ob2.a;
  tob.b=b+ob2.b;
  return (tob);
  }
void display()
{
  cout<<a<<b;
}
};
void main()
{
one ob1,ob2,ob3;
ob1.setdata(2,3);
ob2.setdata(4,5);
ob3=add(ob1,ob2);
getch();
}

