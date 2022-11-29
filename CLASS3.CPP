#include<iostream.h>
#include<conio.h>
class adddemo
{
  public:
  int num1,num2,res;
  void setdata()
  {
    cout<<"enter two values";
    cin>>num1>>num2;
  }
  void calculate()
  {
      res=num1+num2;
  }
  void display()
  {
    cout<<"result="<<res;
  }
};
void main()
{
 adddemo ob;
 clrscr();
 ob.setdata();
 ob.calculate();
 ob.display();
getch();
}
