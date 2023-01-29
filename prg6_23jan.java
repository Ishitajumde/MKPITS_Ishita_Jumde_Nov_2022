import java.util.Scanner;
class prg6_23jan
{
  public static void main(String[]args)
  {
     int add,sub,mul,div,a,b;

     Scanner val= new Scanner(System.in);

     System.out.println("enter value of a and b");
     a=val.nextInt();
     b=val.nextInt();

      add=a+b;
     System.out.println("addition(a+b)= "+add);

      sub=a-b;
     System.out.println("addition(a-b)= "+sub);

      mul=a*b;
     System.out.println("addition(a*b)= "+mul);

      div=a/b;
     System.out.println("addition(a/b)= "+div);

  }
}