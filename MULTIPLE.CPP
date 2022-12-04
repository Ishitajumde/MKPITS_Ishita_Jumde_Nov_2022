#include<iostream.h>
#include<conio.h>
class two
{
public:
 int b;
void set1()
{
  b=3;
}
void dis1()
{
  cout<<b;
}
};
class three
{
public:
  int c;
void set2()
{
  c=4;
}
void dis2()
{
  cout<<c;
}
};
class one:public two,public three
{
public:
 int a;
 void set3()
 {
    a=2;
 }
 void dis3()
  {
    cout<<a;
 }
};
void main()
{
clrscr();
one ob;
ob.set1();
ob.set2();
ob.set3();
ob.dis1();
ob.dis2();
ob.dis3();
getch();
}


