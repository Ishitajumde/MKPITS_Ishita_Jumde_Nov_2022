import java.util.Scanner;
class one
{
	int num;
  void set()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value of a");
    num=sc.nextInt();
  }
  void con()
  {
    if(num%3==0)
    {
      System.out.println("it is multiple of 3= "+num);
    }
    else if(num%7==0)
        {
          System.out.println("it is multiple of 7= "+num);
        }
       else
       {
          System.out.println("its not multiple of 3 and 7");
       }
    }
  }

  class prgnine{
    public static void main(String[]args)
    {
      one ob= new one();
      ob.set();
      ob.con();
    }
  }