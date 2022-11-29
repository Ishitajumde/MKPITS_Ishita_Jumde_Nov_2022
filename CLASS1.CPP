#include<iostream.h>
#include<conio.h>
class one
{
  public:
  int a,b;
  void setvalue(int x,int y)
  {
    a=x;
    b=y;
  }
  void display()
  {
    cout<<a<<" "<<b;
  }
};
void main()
{
 one ob;
 ob.setvalue(2,3);
 ob.display();
getch();
}
