#include<stdio.h>
#include<conio.h>
void main()
{
	int a[2][2],i,j,sum=0;
	printf("enter the matrix a");
	for(i=0;i<=1;i++)
	{
	   for(j=0;j<=1;j++)
		{
		     scanf("%d",&a[i][j]);
		 }//inner close
	}//outer close
	printf("sum of matrix a");
	for(i=0;i<=1;i++)
	{
	   for(j=0;j<=1;j++)
		{
		     sum=sum+a[i][j];
		 }//inner close
	}//outer close
	printf("%d",sum);

getch();
}