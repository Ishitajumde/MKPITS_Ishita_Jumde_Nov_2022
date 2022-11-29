#include<iostream.h>
#include<conio.h>
class arraydemo
{
  public:
  int a[5],i;
  void setdata();
  void display();
};
void arraydemo::setdata()
{
     cout<<"enter five numbers";
    for(i=1;i<=4;i++)
    {
      cin>>a[i];
    }
}
void arraydemo::display()
  {
  for(i=1;i<=4;i++)
  {
    cout<<a[i];
  }
  }
void main()
{
 arraydemo ob;
 clrscr();
 ob.setdata();
 ob.display();
getch();
}
