#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
char name[]="ishita";
int i,j,len;
clrscr();
len=strlen(name);//length of name
for(i=0;i<len;i++) //no of rows
{
 for(j=0;j<=i;j++) //no of colums
 {
  printf("%c",name[j]);
 }
 printf("\n");
}
getch();
}