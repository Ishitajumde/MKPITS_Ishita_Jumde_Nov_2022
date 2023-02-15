import java.util.Scanner;
class assg4_23{
  public static void main(String[]args)
  {
    int num;
    Scanner value = new Scanner(System.in);
    System.out.println("enter the value of a and b");
    num=value.nextInt();

     if(num%3==0 )
    {

      System.out.println("it is multiple of 3 is "+num);

    }
    if (num%7==0)
    {
		System.out.println("it is multiple of 7 is"+num);
		}
    if(num%3==num%7)
    {
       System.out.println("it is multiple of both");

    }

  }
}