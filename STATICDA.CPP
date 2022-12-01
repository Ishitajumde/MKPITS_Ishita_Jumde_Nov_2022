#include<iostream.h>
#include<conio.h>
class one
{
public:
static int b;
void setdata()
{
  b++;
}
void display()
{
  cout<<b<<endl;
}
}; int one::b;
void main()
{
one ob1,ob2,ob3;
clrscr();
ob1.display();
ob2.display();
ob3.display();
ob3.setdata();
ob1.display();
ob2.display();
ob3.display();
getch();
}

