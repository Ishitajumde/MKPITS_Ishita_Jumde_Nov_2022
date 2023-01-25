import java.util.Scanner;
class one
{
int n1,n2,n3,n4,n5,sum;
int avg;
void set()
{
  Scanner value= new Scanner(System.in);
  System.out.println("enter 5 postive value");
  n1=value.nextInt();
  n2=value.nextInt();
  n3=value.nextInt();
  n4=value.nextInt();
  n5=value.nextInt();
  }

void cond1()
{
   if(n1<n2&& n1<n3 && n1<n4 && n1<n5)
   {
      System.out.println("the min is n1:" +n1);
    }
      else if(n2<n1 && n2<n3 && n2<n4 && n2<n5)
     {
      System.out.println("the  min is:" +n2);
     }
     else if(n3<n1 && n3<n2 && n3<n4 && n4<n5)
	      {
	       System.out.println("the  min is:" +n3);
     }
     else if(n4<n1 && n4<n3 && n4<n3 && n4<n5)
	      {
	       System.out.println("the  min is:" +n4);
     }
     else
     {
         System.out.println("the  min is:"+n5);
    }
 }
 void cond2()
 {
	if(n1>n2&& n1>n3 && n1>n4 && n1>n5)
   {
      System.out.println("the max is n1:" +n1);
    }
      else if(n2>n1 && n2>n3 && n2>n4 && n2>n5)
     {
      System.out.println("the max is:" +n2);
     }
     else if(n3>n1 && n3>n2 && n3>n4 && n4>n5)
	      {
	       System.out.println("the max is:" +n3);
     }
     else if(n4>n1 && n4>n3 && n4>n3 && n4>n5)
	      {
	       System.out.println("the max is:" +n4);
     }
     else
     {
         System.out.println("the max is:"+n5);
    }
 }
 void avg()
 {
	 sum=n1+n2+n3+n4+n5;
	System.out.println("the sum of number is: " +sum);
     avg=sum/5;
    System.out.println("the avg of number is: " +avg);
}
}
class prgsix{
  public static void main(String[]args)
  {
     one ob =new one();
     ob.set();
     ob.cond1();
     ob.cond2();
     ob.avg();
  }
}



