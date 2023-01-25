 import java.util.Scanner;
 import java.lang.Math;
 class one{
 int num,abs,num1;
 void set()
 {
    Scanner value= new Scanner(System.in);
   System.out.println("enter the negative value");
   num=value.nextInt();
   num1=Math.abs(num);
   System.out.println("Before= "+num);
   System.out.println("After= "+num1);
 }
}
class prg_14{
  public static void main(String[]args)
  {
     one ob =new one();
     ob.set();

  }
}
