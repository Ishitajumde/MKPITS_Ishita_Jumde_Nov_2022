#include<stdio.h>
#include<conio.h>
void main()
{
 int i,j,a[2][2],b[2][2],c[2][2];
 printf("enter the matrix A");
 for(i=0;i<2;i++)
 {
	for(j=0;j<2;j++)
	{
	  printf("mat a[%d][%d]=",i,j);
	  scanf("%d",&a[i][j]);
	}//inner for loop close
 }//outer for loop close
printf("enter the matrix B");
for(i=0;i<2;i++)
{
	for(j=0;j<2;j++)
	{
	pintf("matb[%d][%d]=",i,j);
	    scanf("%d",&b[i][j]);
	}//inner for loop close
}//outer for loop close
printf("addition of matix");
for(i=0;i<2;i++)
{
	for(j=0;j<2;j++)
	{
	c[i][j]=a[i][j]+b[i][j];
	}//inner for loop close
}//outer for loop close
printf("addition of element");
for(i=0;i<2;i++)
{
	for(j=0;j<2;j++)
	{
	    printf("c[%d][%d]=%d",i,j,c[i][j]);
	}//inner for loop close
}//outer for loop close
getch();
}//main close