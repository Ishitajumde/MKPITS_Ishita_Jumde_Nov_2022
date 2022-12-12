#include<iostream.h>
#include<conio.h>
class one
{
public:
 int a;
};
class two:public one
{
 public:
 int b;
 void set1()
 {
  a=2;
  b=3;
 }
 void dis1()
 {
   cout<<a<<b;
 }
};
class three:public one
{
public:
  int c;
  void set2()
  {
     a=3;
     c=4;
  }
  void dis2()
  {
     cout<<a<<c;
  }
};
void main()
{
clrscr();
 two ob;
 ob.set1();
 ob.dis1();
 three ob1;
 ob1.set2();
 ob1.dis2();
getch();
}

