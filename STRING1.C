#include<stdio.h>          //with retuntype no argument
#include<conio.h>
char stri()
{
  char name[10];
  clrscr();
  printf("enter any name");
  scanf("%s",&name);
  return stri();
}
void main()
{
 char r;
 r=stri();
 printf("output=%c",r);
  getch();
}