import java.util.Scanner;
class one
{
   int a,b;
   void set(){
     Scanner take= new Scanner(System.in);
     System.out.println("enter the value of two integer");
     a=take.nextInt();
     b=take.nextInt();
    }
    int cond()
    {
       if(a>20 && a<30 || b>20 && b<30)
       {
           System.out.println("it is in range");

       }

          return 0;

    }
}
class prgsixteen{
  public static void main(String[]args)
  {
  one ob= new one();
  ob.set();
  ob.cond();
  }
}