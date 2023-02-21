import java.util.Scanner;
class prg5{
  public static void main(String[]args){
      int iwt,np;
      Scanner val=new Scanner(System.in);
      System.out.println("Enter two item wt");
      iwt=val.nextInt();
      System.out.println("Enter the no of purchase");
      np=val.nextInt();
      int avg=(iwt+np)/2;
      System.out.println("Average= "+avg);
  }
}