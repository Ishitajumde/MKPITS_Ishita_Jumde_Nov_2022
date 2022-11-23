#include<stdio.h>
#include<string.h>
#include<conio.h>
void main()
{
  int len=0,i ;
  char name[10];
  printf("enter any value");
  scanf("%s",name);
  for(i=0;name[i]!='\0';i++)
  {
     len=len+1;
  }
  for(i=len;i>=0;i--)
  {
     printf("%c",name[i]);
  }
getch();
}



