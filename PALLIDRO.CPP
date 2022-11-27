#include<stdio.h>
#include<string.h>
#include<conio.h>
void main()
{
 int st;
 char name[10],bak[10];
 printf("enter any name:");
 scanf("%s",name);
 strcpy(bak,name);
 strrev(name);
 st=strcmp(bak,name);
 if(st==0)
 {
   printf("pallidrome");
 }
   else
   {
      printf("not pallidrome");
   }
getch();
}