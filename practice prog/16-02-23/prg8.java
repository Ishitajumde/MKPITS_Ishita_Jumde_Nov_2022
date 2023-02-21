import java.util.Scanner;
class prg8{
  public static void main(String[]args){
      float td, f;
      Scanner val=new Scanner(System.in);
      System.out.println(" Enter Total distance");
      td=val.nextInt();
      System.out.println(" Enter Total fuel spent");
      f=val.nextInt();
      double avg=(td+f)/2;
      System.out.println("Average= "+avg);
  }
}