#include<stdio.h>        //structure constant
#include<conio.h>
struct stud
{
 int id;
 char name[10];
 char add[10];
};
void main()
{
 struct stud s1={32,"Ajay","xyz"};
 clrscr();
 printf("student id=%d\n",s1.id);
 printf("student name=%s\n",s1.name);
 printf("student address=%s\n",s1.add);
getch();
}