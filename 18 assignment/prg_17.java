import java.util.Scanner;
class one
{
  int num,count;
  int n1,n2,n3,n4,n5,n6,n7;
  void set()
  {
   Scanner value= new Scanner(System.in);
   System.out.println("enter the value of num");
   num=value.nextInt();
  }
  void exp()
  {
    n1=num%10;
    num=num/10;
    n2=num%10;
    num=num/10;
    n3=num%10;
    num=num/10;
    n4=num%10;
    num=num/10;
    n5=num%10;
    num=num/10;
    n6=num%10;
    num=num/10;
    n7=num%10;
     System.out.println("the seprate digit are= "+n7+"  "+n6+"  "+n5+"  "+n4+"  "+n3+"  "+n2+"  "+n1);
    }
    }
    class prg_17{
      public static void main(String[]args)
      {
         one ob=new one();
         ob.set();
         ob.exp();

      }
}