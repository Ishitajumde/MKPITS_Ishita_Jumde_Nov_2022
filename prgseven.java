import java.util.Scanner;
class one
{
	int a,b;
  void set()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value of a");
    a=sc.nextInt();
    System.out.println("enter value of b");
    b=sc.nextInt();
  }
  void cmp()
  {
    if(a==30 || b==30 || a+b==30)
    {
      System.out.println("The condition is True");
    }
    else
    {
       System.out.println("The condition is False");
    }
  }

}
class prgseven
{
  public static void main(String[]args)
  {
  one ob= new one();
  ob.set();
  ob.cmp();
  }
}