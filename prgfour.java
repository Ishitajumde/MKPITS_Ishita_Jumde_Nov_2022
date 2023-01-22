import java.util.Scanner;
class one
{
  int num=12321,count;
  int n1,n2,n3,n4,n5;
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
    num=num/10;
    n4=num%10;
    num=num/10;
    n5=num%10;
    count=n1*10000+n2*1000+n3*100+n4*10+n5*1;
    }
    void cond()
    {
      if(count==num)
      {
        System.out.println("its a pallindrom ");
      }
      else
      {
         System.out.println("its not a pallindrom ");
      }
    }
}
class prgfour{
  public static void main(String[]args)
  {
     one ob=new one();
     ob.set();
     ob.exp();
     ob.cond();
  }
}