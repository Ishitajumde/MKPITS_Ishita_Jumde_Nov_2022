import java.util.Scanner;
class prg9{
  public static void main(String[]args){
      int ip, fp;
      Scanner val=new Scanner(System.in);
      System.out.println(" Enter the distance points");
      ip=val.nextInt();
      fp=val.nextInt();
      int dis=fp-ip;
      System.out.println("Distance= "+dis);
  }
}