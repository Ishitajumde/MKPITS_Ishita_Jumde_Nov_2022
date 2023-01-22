import java.util.Scanner;
class one
{
	int a,b,c;
	int mul;
  void set()
  {

  Scanner sc=new Scanner(System.in);
  System.out.println("enter value of a");
  a=sc.nextInt();
  System.out.println("enter value of b");
  b=sc.nextInt();
  System.out.println("enter value of c");
  c=sc.nextInt();
  }
  void exp()
  {
    mul=a*b*c;
  }
 void dis()
 {
   System.out.println(mul);
 }
}

class prgthree{
 public static void main(String[]args)
 {
    one ob= new one();
    ob.set();
    ob.exp();
    ob.dis();
 }
}