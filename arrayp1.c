#include<stdio.h>
#include<conio.h>
 main()
{
	int a[10],i,ser;
	printf("enter 10 numbers in array");
	for(i=0;i<=10;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("enter number to search");
	scanf("%d",&ser);
	for(i=0;i<=10;i++)
	{
		if(ser==a[i])
		{
			printf("present");
		}
	}
	getch();
	
	
}

