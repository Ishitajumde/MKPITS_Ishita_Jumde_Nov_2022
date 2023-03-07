/*Program to demonstrate the creation of a class and object in Java.*/

class c1{
int a=5,b=6,c=1;
void set()
{
    System.out.println("Multiplication of two number");
    c=a*b;
}
void dis()
{
     System.out.println(c);
}
public static void main(String[]args){
     c1 obj=new c1();
     obj.set();
     obj.dis();
}
}