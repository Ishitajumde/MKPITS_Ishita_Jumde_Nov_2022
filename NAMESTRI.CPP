#include<iostream.h>
#include<conio.h>
#include<string.h>
void main()
{
int c1,c2,i=0;
char user[10]={"ram"},pass[10]={"xyz"},userk[10],passk[10],ch;
cout<<"enter the user name:";
cin>>userk;
cout<<"enter the password:";
do
{
ch=getch();
cout<<"*";
passk[i]=ch;
i++;
}while(ch!='\r');
passk[i-1]='\0';
cout<<passk;
getch();
c1=strcmp(user,userk);
c2=strcmp(pass,passk);
clrscr();
if(c1==0 && c2==0)
{
  cout<<"Welcome to XYZ Bank";
}
else
{
  cout<<"invalid user";
}
getch();
}