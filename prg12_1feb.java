import java.util.Scanner;
class prg12_1feb{
public static void main(String[]args)
{
   int a,b;
   Scanner val = new Scanner(System.in);
   System.out.println("take a value of a and b");
   a=val.nextInt();
   b=val.nextInt();
   if(a>0 && b>0)
   {
       System.out.println("it is in 1st Quadrant");
   }
      else if(a>0 && b<0)
        {
            System.out.println(" it is in 2nd Quadrant");
        }
           else if(a<0 && b<0)
              {
                 System.out.println(" it is in 3rd Quadrant");
               }
                      else if(a<0 && b>0)
		               {
		                   System.out.println(" it is in 4thnd Quadrant");
                               }
}
}