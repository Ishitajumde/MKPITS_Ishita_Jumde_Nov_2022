import java.util.Scanner;
class prg3{
  public static void main(String[]args){
      int days;
      Scanner val=new Scanner(System.in);
      System.out.println("Enter Days");
      days=val.nextInt();
      int yr=days/365;
          days=days%365;
      int week=days/7;
      int rday=days%7;
      System.out.println("year week and remaining days= "+yr+" "+week+" "+rday);
  }
}