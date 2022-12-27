//pattern
// DDDD
//  CCC
//   BB
//    A
#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,D=68;
clrscr();
for(i=3;i<=3;i--)
{
 for(j=0;j<=i;j++)
 {
   printf("%c",D);
 }
D=D-1;
printf("\n");
}
getch();
}