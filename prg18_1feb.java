/*equilateral triangle(a1=30,a2=30,a3=30)
  isoceles triangle(a1=30,a2=45,a3=45)
  scalene triangle(a1=30,a2=45,a3=75)*/


import java.util.Scanner;
class prg18_1feb{
public static void main(String[]args)
{
   int a1,a2,a3;
   Scanner val =new Scanner(System.in);
   System.out.print("Enter the side1 of triangle");
   a1=val.nextInt();
   System.out.print("Enter the side2 of triangle");
   a2=val.nextInt();
   System.out.print("Enter the side3 of triangle");
   a3=val.nextInt();
   if(a1==a2 && a2==a3)
   {
      System.out.println("It is a Eqilateral Triangle");
   }
       else if(a1==a2||a2==a3||a1==a3)
	       {
	           System.out.println("It is a Isoceles Triangle");
               }
                  else
		       {
		           System.out.println("It is a Scalene Triangle");
                       }
  }
}