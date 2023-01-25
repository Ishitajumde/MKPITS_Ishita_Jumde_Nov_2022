import java.util.Scanner;
class one
{
int a1,a2,a3,a4;
int max,min,diff;
void set()
{
	Scanner val= new Scanner(System.in);
	System.out.println("Enter five integer value");
	a1= val.nextInt();
	a2= val.nextInt();
	a3= val.nextInt();
	a4= val.nextInt();
}
   void exp()
   {
    if(a1 >= a2 && a1 >= a3 && a1 >= a4)
      max = a1;
    else if (a2 >= a1 && a2 >= a3 && a2 >= a4)
      max = a2;
    else if (a3 >= a1 && a3 >= a2 && a3 >= a4)
      max = a3;
    else
      max = a4;

    if (a1 <= a2 && a1 <= a3 && a1 <= a4)
      min = a1;
    else if (a2 <= a1 && a2 <= a3 && a2 <= a4)
      min = a2;
    else if (a3 <= a1 && a3 <= a2 && a3 <= a4)
      min = a3;
    else
      min = a4;

      diff=max-min;
      System.out.println("The difference between max and min is = " +diff);
      }
 }
 class prg_4{
    public static void main(String[]args)
    {
       one obj =new one();
       obj.set();
       obj.exp();
    }
 }