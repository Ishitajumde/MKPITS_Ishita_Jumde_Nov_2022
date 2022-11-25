#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int x1,x2,y1,y2,dist;
	clrscr();
	printf("enter the vale of x1 & x2\n");
	scanf("%d %d",&x1,&x2);
	printf("enter the vale of x1 & x2\n");
	scanf("%d %d",&y1,&y2);
	dist=sqrt(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
	printf("distance=%d",dist);
	getch();
}