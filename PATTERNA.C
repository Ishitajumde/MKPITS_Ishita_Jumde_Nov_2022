//pattern DCBA
//        DCBA
//        DCBA
#include<stdio.h>
#include<conio.h>
void main()
{
int i,j;
clrscr();
for(i=0;i<=2;i++)
{
  for(j=68;j>=65;j++)
  {
   printf("%c",j);
  }//for close
  printf("/n");
}//for close
getch();
}//main close