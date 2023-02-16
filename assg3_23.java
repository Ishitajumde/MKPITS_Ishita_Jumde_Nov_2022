import java.util.Scanner;
class assg3_23{
  public static void main(String[]args)
  {
    int num;
    Scanner value = new Scanner(System.in);
    System.out.println("enter the value of a and b");
    num=value.nextInt();

     if(num%13==0 || num%13==1)
    {
      System.out.println("it is multiple of 13 = "+num);

    }
    else
    {
		System.out.println("it is not multiple ");
    }
  }
}