import java.util.Scanner;
class prg4{
  public static void main(String[]args){
      int a,b;
      Scanner val=new Scanner(System.in);
      System.out.println("Enter two integers");
      a=val.nextInt();
      b=val.nextInt();
      int sum=a+b;
      System.out.println("sum of two integers= "+sum);
  }
}