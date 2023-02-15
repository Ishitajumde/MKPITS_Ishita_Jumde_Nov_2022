import java.util.Scanner;
class assg7_23{
  public static void main(String[]args)
  {
    int x,y,z;
    Scanner value = new Scanner(System.in);
    System.out.println("enter the value of a and b");
    x=value.nextInt();
    y=value.nextInt();
    z=value.nextInt();

    if(y>x && z>y)
    {
      System.out.println(x + y +z);
      
    }
  }
}