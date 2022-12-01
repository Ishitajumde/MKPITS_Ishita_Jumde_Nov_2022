#include<iostream.h>
#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
int a=0,e=0,i=0,o=0,u=0,x,n;
clrscr();
char str[100];
cout<<"enter the string:";
gets(str);
n=strlen(str);  //for length
for(x=0;x<=n;x++)
{
  if(str[x]=='A')
  {
    a=a+1;
  }
  else if(str[x]=='E')
  {
    e=e+1;
  }
   else if(str[x]=='I')
   {
    i=i+1;
   }
    else if(str[x]=='O')
    {
     o=o+1;
    }
     else if(str[x]=='u')
     {
      u=u+1;
     }
}       //for loop close
cout<<"A = "<<a<<endl;
cout<<"E = "<<e<<endl;
cout<<"I = "<<i<<endl;
cout<<"O = "<<o<<endl;
cout<<"U = "<<u<<endl;
getch();
}   //main close
