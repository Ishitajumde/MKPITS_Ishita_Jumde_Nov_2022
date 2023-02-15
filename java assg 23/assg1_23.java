import java.util.Scanner;
class assg1_23{
  public static void main(String[]args)
  {
    int a,b,sum=0;
    Scanner value = new Scanner(System.in);
    System.out.println("enter the value of a and b");
    a=value.nextInt();
    b=value.nextInt();
    sum=a+b;
     if(sum>10 && sum<20)
    {
      System.out.println("it is in range");

    }
  }
}