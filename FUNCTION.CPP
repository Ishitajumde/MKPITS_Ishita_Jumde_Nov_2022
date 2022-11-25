#include<stdio.h>
#include<conio.h>
void main()
{
 int a[2][2],i,j;
 printf("enter matrix A");
 for(i=0;i<=1;i++)
 {
   for(j=0;j<=1;j++)
     {
	scanf("%d",a[i][j]);
     }//inner close
 }//outer close
 printf("enter matrix B");
 for(i=0;i<=1;i++)
 {
   for(j=0;j<=1;j++)
     {
	 if(i==j)
	 {
	      a[i][j]=0;
	 }//if bracket close
     }//inner close
 }//outer close
 for(i=0;i<=1;i++)
 {
    for(j=0;j<=1;j++)
    {
	printf("%d",a[i][j]);
    }//inner close
 }//outer close
 getch();
}

