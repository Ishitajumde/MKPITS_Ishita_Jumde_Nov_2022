#include<string.h>
#include<conio.h>
#include<iostream.h>
class one
{
char *name;
public:
int len;
one()
{
len=0;
name=new char[len];
}
one(char st[])
{
 len=strlen(st);
 name=new char[len+1];//plus 1 is becoz string ends with null character
 strcpy(name,st);
}
void dis()
{
 cout<<name;
}
};
void main()
{
 one ob("rameshwaram");
 ob.dis();
 getch();
}
