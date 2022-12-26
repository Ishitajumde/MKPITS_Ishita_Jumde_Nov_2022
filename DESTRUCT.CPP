#include<iostream.h>
#include<conio.h>
#include<string.h>
class one
{
private:
char* name;
int len;
public:
 one(char*);//constructor
 ~one();   //destructor
};
one::one(char st[])
{
 len=strlen(st);
 name=new char[len+1];
 strcpy(name,st);
}
void dis()
{
cout<<"name";
}
one:: ~one()
{
 cout<<"\ndetail is vanished";
}
void main()
{
    clrscr();
    one ob("gopal");
    ob.dis();
    getch();
}
