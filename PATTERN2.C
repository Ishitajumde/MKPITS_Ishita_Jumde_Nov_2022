#include<stdio.h>
#include<conio.h>
/*      A
      C B A
    E D C B A
  G F E D C B A  */
void main()
{
int sp,r,alp,n=1;
clrscr();
for(r='A';r<='G';r=r+2)
{
  for(sp=1;sp<=40-n;sp++)
  {
    printf(" ");
  }
for(alp=r;alp>=65;alp--)
{
  printf("%c",alp);
}
printf("\n");
n++;
}
getch();
}