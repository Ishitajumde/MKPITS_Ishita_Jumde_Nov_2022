import java.util.Scanner;
class assg5_23{
  public static void main(String[]args)
  {
    int num;
    Scanner value = new Scanner(System.in);
    System.out.println("enter the value of a and b");
    num=value.nextInt();

     if(num%10<=0 || num%10>=8 )
    {
        System.out.println("it is 2 of  a multiple of 10 is "+num);
    }
}
}
