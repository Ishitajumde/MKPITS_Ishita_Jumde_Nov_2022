import java.util.Scanner;
class one
{
  int num,rev,n1,n2,n3;
  void set()
  {
   Scanner value= new Scanner(System.in);
   System.out.println("enter the value of num");
   num=value.nextInt();
  }
  void exp()
  {
    n1=num%10;
    num=num/10;
    n2=num%10;
    num=num/10;
    n3=num%10;
    rev=n1*100+n2*10+n3*1;
    System.out.println("The reverse of num is: "+rev);
   }
}
class pg3_18{
  public static void main(String[]args)
  {
     one ob=new one();
     ob.set();
     ob.exp();
  }
}