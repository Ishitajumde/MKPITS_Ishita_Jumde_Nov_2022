/* program to demonstrate the use of the abstract keyword in Java. */

final class c7a{
  void dis()
  {
     System.out.println("this is 1st display");
  }
}

class c7b extends c7a{
void dis()
{
      
      System.out.println("this is 2nd display");
}
}
class c7{
public static void main(String[]args)
{
   c7b ob=new c7b();
   ob.dis();

}
}