#include<stdio.h> //with returntype with argument
#include<conio.h>
int mat(int sum)
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
 return sum;
}
void main()
{
 int res,sum=0;
 int a[2];
 clrscr();
 printf("enter the value for matrix a\n");
 res=mat(sum);
 printf("add of mat a value=%d",res);
 getch();
}