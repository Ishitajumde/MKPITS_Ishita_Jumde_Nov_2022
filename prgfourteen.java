import java.util.Scanner;
class one
{
  int a,b;


  void set()
  {
   Scanner value= new Scanner(System.in);
   System.out.println("enter the value of num");
   a=value.nextInt();
   b=value.nextInt();

  }

    void cond()
    {
      if(a>95 && a<100 || b>95 && b<100)
      {
        System.out.println("nearest to 100"+a+b);

      }
        return 0 ;
    }
}
class prgfourteen{
  public static void main(String[]args)
  {
     one ob=new one();
     ob.set();
     ob.cond();
    }
}