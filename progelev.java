import java.util.Scanner;
class one{
int num1,num2;
void set()
{
    Scanner value=new Scanner(System.in);
    System.out.println("enter the two integer");
    num1=value.nextInt();
    num2=value.nextInt();
}
void range()
{
  if (num1>100 && num1<200)
   {
      System.out.println("the num1 is in the range");
   }
   else
   {
       System.out.println("the num1 is not in a range");
   }
   if (num2>100 && num2<200)
   {
       System.out.println("the num2 is in the range");
   }
   else
   {
       System.out.println("the num2 is not in a range");
   }
}
}
class progelev{
  public static void main(String[]args)
  {
    one ob= new one();
    ob.set();
    ob.range();
  }
}