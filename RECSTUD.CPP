#include<iostream.h>
#include<conio.h>
class stud
{
public:
int id;
char name[10];
char add[50];
void set1()
{
  cout<<"enter stud id:";
  cin>>id;
  cout<<"enter stud name:";
  cin>>name;
  cout<<"enter stud add:";
  cin>>add;
}
void dis1()
{
 cout<<id<<endl;
 cout<<name<<endl;
 cout<<add<<endl;
}
};
class exam:public stud
{
public:
int pr1,pr2;
void set2()
{
pr1=30;
pr2=25;
}
void dis2()
{
  cout<<"paper1="<<pr1<<endl;
  cout<<"paper2="<<pr2<<endl;
}
};
class sport
{
public:
int spr;
void set3()
{
 spr=40;
}
void dis3()
{
  cout<<"sport="<<spr;
}
};
class result:public exam,public sport
{
public:
int sum;
void set4()
{
 sum=pr1+pr2+spr;
}
void dis4()
{
  cout<<"sum="<<sum<<endl;
}
};
void main()
{
clrscr();
result ob;
ob.set1();
ob.dis1();
ob.set2();
ob.set3();
ob.set4();
ob.dis1();
ob.dis2();
ob.dis3();
ob.dis4();
getch();
}


