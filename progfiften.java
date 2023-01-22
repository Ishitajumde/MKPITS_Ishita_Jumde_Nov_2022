import java.util.Scanner;
class one{
int n1,n2;
void set()
{
    Scanner value=new Scanner(System.in);
    System.out.println("enter the two integer");
    n1=value.nextInt();
    n2=value.nextInt();
}
void range()
{
  if (n1>40 && n1<50 || n2>40 && n2<50)
   {
      System.out.println("The n1 and n2 is in the range");
   }
   else
   {
       System.out.println("The n1 and n2 not in range");
   }
   if (n1>50 && n1<60 || n2>50 && n2<60)
   {
       System.out.println("The n1 and n2 is in the range");
   }
   else
   {
       System.out.println("the n1 and n2 is not in a range");
   }
}
}
class progfiften{
  public static void main(String[]args)
  {
    one ob= new one();
    ob.set();
    ob.range();
  }
}