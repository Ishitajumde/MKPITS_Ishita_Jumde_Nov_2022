import java.util.Scanner;
class assg2_23{
  public static void main(String[]args)
  {
    int a,b,sum=0;
    boolean check=false;
    Scanner value = new Scanner(System.in);
    System.out.println("enter the value of a and b");
    a=value.nextInt();
    b=value.nextInt();
    sum=a+b;
    if(a==5 || b==5 || a+b==5 || a-b==5)
    {
      check=true;
      System.out.println("The given condition is:  "+check);
    }
    else
    {
		System.out.println("the given consition is "+check);
		}
  }
}