import java.util.Scanner;
class prg7{
  public static void main(String[]args){
      int a,b,c;
      Scanner val=new Scanner(System.in);
      System.out.println("Enter thre integers");
      a=val.nextInt();
      b=val.nextInt();
      c=val.nextInt();
      if(a>b && a>c){
          System.out.println("a is greater");
      }
      else if(b>a && b>c){
          System.out.println("b is greater");
      }
      else if(c>a && c>b){
                System.out.println("c is greater");
      }
  }
}