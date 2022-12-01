#include<iostream.h>
#include<conio.h>
class one
{
public:
int a,b;
one(int x, int y)
{
  a=x;
  b=y;
}
one(one &ob1)
{
  a=ob1.a;
  b=ob1.b;
}                                                        gets
void display()
{
  cout<<a<<b<<endl;
}
};
void main()
{
clrscr();
cout<<"constructor called";
one ob1(2,3); //implicit calling//
one ob2=one(ob1);//explicit calling//
ob1.display();
ob2.display();
getch();
}

