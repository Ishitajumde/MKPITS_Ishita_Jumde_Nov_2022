#include<stdio.h> //no returntype no argument
#include<conio.h>
void mat()
{
 int i,a[2],sum=0;
 clrscr();
 printf("enter the value for matrix a\n");
 for(i=0;i<2;i++)
 {
  scanf("%d",&a[i]);
 }
 for(i=0;i<2;i++)
 {
  sum=sum+a[i];
 }
 printf("add of mat a value=%d",sum);
}
void main()
{
 mat();
 getch();
}