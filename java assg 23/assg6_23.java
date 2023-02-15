import java.util.Scanner;
class assg6_23{
  public static void main(String[]args)
  {
    int a,b,c;
    Scanner value = new Scanner(System.in);
    System.out.println("enter the value of a and b");
    a=value.nextInt();
    b=value.nextInt();
    c=value.nextInt();

    if(a+b==c)
    {
      System.out.println("it is possible a+b = c");
      System.out.println((a+b)+"="+c);
    }
  }
}