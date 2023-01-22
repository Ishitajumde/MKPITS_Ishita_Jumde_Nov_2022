import java.util.Scanner;
class one
{
  int a,b,c;

  boolean check = false;
  void set()
  {
   Scanner value= new Scanner(System.in);
   System.out.println("enter the value of num");
   a=value.nextInt();
   b=value.nextInt();
   c=value.nextInt();
  }

    void cond()
    {
      if(a>20 && a<50 || b>20 && b<50  || c>20 && c<50 )
      {
        check=true;
        System.out.println("true");
      }
        return ;
    }
}
class prgtwelve{
  public static void main(String[]args)
  {
     one ob=new one();
     ob.set();
     ob.cond();
  }
}