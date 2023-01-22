import java.util.Scanner;
class one
{
	int a,b;
	int triple,res;
  void set()
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter value of a");
     a=sc.nextInt();
     System.out.println("enter value of b");
     b=sc.nextInt();
  }
  void cond()
  {
     if(a==b)
     {
        System.out.println("It is equal");
        triple=(a+b)*3;
        System.out.println("triple="+triple);
     }
     else
     {
        System.out.println("It is  not equal");
        res=a+b;
        System.out.println(res);
     }
  }
}

  class prgfive{
     public static void main(String[]args)
      {
         one ob= new one();
         ob.set();
         ob.cond();

      }
}
