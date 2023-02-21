import java.util.Scanner;
class prg1{
  public static void main(String[]args){
      Scanner val=new Scanner(System.in);
      System.out.println("Enter the integer in seconds");
      int sec=val.nextInt();
      int min=sec/60;
           sec=sec%60;
           if(min<60){
                   System.out.println("time: "+min+"min "+sec+"sec");
              }
              else if(min>60){
                  int hr=min/60;
                     min=min%60;
                  System.out.println("time: "+hr+"hr "+min+"min "+sec+"sec");
              }
  }
}