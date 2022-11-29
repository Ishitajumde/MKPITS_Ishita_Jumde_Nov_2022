#include<iostream.h>
#include<conio.h>
class one
{
  public:
  int a,b;
  void setvalue()
  {
    a=2;
    b=3;
  }
  void display()
  {
    cout<<a<<" "<<b;
  }
};
void main()
{
 one ob;
 ob.setvalue();
 ob.display();
getch();
}
