import java.util.Scanner;
class one
{
int p,r,t;
float si;
void set()
{
  Scanner value= new Scanner(System.in);
  System.out.println("enter principle amount");
  p=value.nextInt();
  System.out.println("enter the Rate of Intrest");
  r=value.nextInt();
  System.out.println("enter no of days");
  t=value.nextInt();
 }
 void cal()
 {
   si=p*r*t;
   System.out.println("the simple intrest is= "+ si);
 }
}
class prg_19{
  public static void main(String[]args)
  {
     one ob =new one();
     ob.set();
     ob.cal();
  }
}