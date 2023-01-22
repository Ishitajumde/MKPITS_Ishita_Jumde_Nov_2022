class swap{
int a=5,b=10;
   void form()
   {
      System.out.println("previous value");
      System.out.println("a= "+a);
      System.out.println("b= "+b);
       a=a+b;
       b=a-b;
       a=a-b;
  }
  void ans()
  {
       System.out.println("after value");
       System.out.println("a= "+a);
       System.out.println("b= "+b);
   }
}

class demoswap
{
  public static void main(String[]args)
  {
     swap ob1= new swap();
     ob1.form();
     ob1.ans();
  }
}