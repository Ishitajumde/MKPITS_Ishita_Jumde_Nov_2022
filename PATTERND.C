//pattern
// A
// BB
// CCC
// DDDD
#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,A=65;
for(i=0;i<=3;i++)
{
 for(j=0;j<=i;j++)
 {
   printf("%c",A);
 }
A=A+1;
printf("\n");
}
getch();
}