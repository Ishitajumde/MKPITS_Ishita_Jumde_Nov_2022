import java.util.Scanner;
class one{
int x=15,y,n;
void get()
{
  Scanner take= new Scanner(System.in);
  System.out.println("enter the value of num:");
  n=take.nextInt();
}
void cond()
{
  if(n>0)
  {
  System.out.println("it is a positive num");
  System.out.println("the equation is:");
  y=x*n;
  System.out.println("y= "+y);
}
else
System.out.println(" oops! it is a negative num");
}
}
class prgnine{
 public static void main(String[]args)
 {
    one ob=new one();
    ob.get();
    ob.cond();
 }
}