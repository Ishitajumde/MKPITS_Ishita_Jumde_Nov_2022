#include<stdio.h>        //array of structure variable
#include<conio.h>
struct stud
{
 int id;
 char name[10];
 char add[10];
};
void main()
{
 int i;
 struct stud s[4];
 clrscr();
 for(i=0;i<=4;i++)
 {
    printf("enter student %d rec",i);
    printf("enter student id\n");
    scanf("%d",&s[i].id);
    printf("enter student name\n");
    scanf("%s",&s[i].name);
    printf("enter student add\n");
    scanf("%s",&s[i].add);
 }
 for(i=0;i<=4;i++)
 {
   printf("student id=%d\n",s[i].id);
   printf("student name=%s\n",s[i].name);
   printf("student add=%s\n",s[i].add);
 }
getch();
}