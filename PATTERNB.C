//pattern  A
	// AB
	// ABC
	// ABCD
#include<stdio.h>
#include<conio.h>
void main()
{
int i,j;
clrscr();
for(i=0;i<5;i++)
{
  for(j=65;j<=65+i;j++)
  {
    printf("%c",j);
  }
printf("\n");
}
getch();
}