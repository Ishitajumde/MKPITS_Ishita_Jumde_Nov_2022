#include<stdio.h> //no returntype with argument
#include<conio.h>
void mat(int sum)
{
 int i,a[2];
 for(i=0;i<2;i++)
 {
  scanf("%d",&a[i]);
 }
 for(i=0;i<2;i++)
 {
  sum=sum+a[i];
 }
 printf( "addition of mat a=%d",sum);
}
void main()
{
 int a[2],sum=0;
 clrscr();
 printf("enter the value for matrix a\n");
 mat(sum);
 getch();
}