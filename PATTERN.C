#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,k,sp;
for(i=0;i<=3;i++);
{
for(j=65;j<=67-i;j++)
{
   printf("%c",j);
 }
  for(sp=1;sp<=i*2;sp++)
   {
     printf(" ");
   }
   for(k=67-i;k>=65;k--)
   {
     if(k==67)
     {
     printf("%c",k);
   }  }
}
getch();
}