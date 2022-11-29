#include<iostream.h>
#include<conio.h>
class one
{
  public:
  int a,b;
  void display()
  {
    cout<<a<<" "<<b;
  }
};
void main()
{
 clrscr();
 one ob;
 ob.a=2;
 ob.a=3;
 ob.display();
getch();
}
