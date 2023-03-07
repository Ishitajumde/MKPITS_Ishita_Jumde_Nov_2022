/*Program to demonstrate the use of constructors in Java.*/

class c2{
int a;
c2()
{
	System.out.println("Constructor is called");
    a=2;

}
void dis()
{
   System.out.println("a="+a);
}
public static void main(String[]args)
{
    c2 ob1=new c2();
    ob1.dis();

}
}
