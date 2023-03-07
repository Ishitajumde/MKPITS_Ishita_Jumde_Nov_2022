/* Program to demonstrate the use of the abstract keyword in Java. */

abstract class c9a{
    void dis()
    {
       System.out.println("this is a abstract class");
    }
    abstract void absmethod();

 }
 class c9b extends c9a
 {
   void dis()
   {
       System.out.println("overriden function of abstract class c9a");
   }
 }
class c9{
public static void main(String[]args)
{
    c9b ob=new c9b();
    ob.dis();
}
}