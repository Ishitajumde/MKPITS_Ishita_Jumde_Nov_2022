import java.util.Scanner;
class prg6{
  public static void main(String[]args){
      int twh,ps;
      Scanner val=new Scanner(System.in);
      System.out.println("Enter employee ID");
      String id=val.next();
      System.out.println("enter total work hours");
      twh=val.nextInt();
      System.out.println("enter amout recieved per hours");
      ps=val.nextInt();
      int salary=twh*ps;
      System.out.println("Salary= "+salary);
  }
}