/* Program to demonstrate inheritance in Java.*/

class c4a{
int a=2;
}
class c4b extends c4a{
int b=3;
int c;
void set()
{
    c=a+b;
}
 void dis()
 {
     System.out.println(c);
 }
}
class c4{
public static void main(String[]args)
{
    c4b ob=new c4b();
    ob.set();
    ob.dis();
}
}
