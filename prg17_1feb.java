import java.util.Scanner;
class prg17_1feb{
public static void main(String[]args)
{
   int s1,s2,s3;
   Scanner val =new Scanner(System.in);
   System.out.print("Enter the side1 of triangle");
   s1=val.nextInt();
   System.out.print("Enter the side2 of triangle");
   s2=val.nextInt();
   System.out.print("Enter the side3 of triangle");
   s3=val.nextInt();
   if(s1==s2 && s2==s3)
   {
      System.out.println("It is a Eqilateral Triangle");
   }
       else if(s1==s2||s2==s3||s1==s3)
	       {
	           System.out.println("It is a Isoceles Triangle");
               }
                  else
		       {
		           System.out.println("It is a Scalene Triangle");
                       }
  }
}