/*  Program to demonstrate method overriding in Java. */

class c5a{
  void dis()
  {
     System.out.println("this is 1st display");
  }
}

class c5b extends c5a{
void dis(){
      System.out.println("this is 2nd display");
}
}
class c5{
public static void main(String[]args)
{
   c5b ob=new c5b();
   ob.dis();
   
}
}