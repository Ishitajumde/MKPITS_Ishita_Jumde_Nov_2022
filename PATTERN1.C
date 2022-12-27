#include<stdio.h>
#include<conio.h>
/*      A
      A B C
    A B C D E
  A B C D E F G  */
void main()
{
int sp,r,alp,n=1;
clrscr();
for(r=0;r<=7;r=r+2)
{
  for(sp=1;sp<=40-n;sp++)
  {
    printf(" ");
  }
for(alp=65;alp<=65+r;alp++)
{
  printf("%c",alp);
}
printf("\n");
n++;
}
getch();
}