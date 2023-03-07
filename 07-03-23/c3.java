/*  Program to demonstrate the use of static variables and methods in Java. */

class c3{
static int a=2;
int b=3,c;
 static void set()
{

  a++;
}
void set2()
{
   c=a*b;
}
void dis1()
{

   System.out.println(c);
}
public static void main(String[]args){
  c3 ob1=new c3();
  ob1.set();
  ob1.set2();
  ob1.dis1();
}
}