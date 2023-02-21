import java.util.Scanner;
class prg2{
   public static void main (String[]args)
   {
      Scanner val=new Scanner(System.in);
      System.out.println("Enter the days");
      int days=val.nextInt();
       int yr=days/365;
           days=days%365;
       int mnt=days/30;
       int rday=days%30;
       System.out.println("year month and remaining days="+yr+"yr "+mnt+"month "+rday+"days ");
   }
}