/* Program to demonstrate the use of the "super" keyword in Java.*/
/* by using super keyword we can see the overhide method*/

class c6a{
  void dis()
  {
     System.out.println("this is 1st display");
  }
}

class c6b extends c6a{
void dis()
{
      super.dis();
      System.out.println("this is 2nd display");
}
}
class c6{
public static void main(String[]args)
{
   c6b ob=new c6b();
   ob.dis();

}
}