import java.util.Scanner;
class prg15_1feb{
public static void main(String[]args)
{
   int math,phy,chem;
   double perc;
   int total;
   int roll;
   Scanner sc= new Scanner(System.in); //System.in is a standard input stream
   System.out.print("Enter a student name: ");
   String str= sc.nextLine();

   Scanner val = new Scanner(System.in);
   System.out.print("enter the Roll No: ");
    roll=val.nextInt();

   System.out.println("enter the marks of three subject: ");
    System.out.println("enter the marks of Maths: ");
   math=val.nextInt();
    System.out.println("enter the marks of Physics: ");
   phy=val.nextInt();
    System.out.println("enter the marks of Chemistry: ");
   chem=val.nextInt();

    total=phy+math+chem;
    System.out.println("Total marks is "+total);

                   perc= total/3.0;
                    System.out.println("Percentage : "+perc+" %");
                   if(perc>45)
                   {
                      System.out.println("Second"+perc);
				   }
				     else if(perc>70){
					      System.out.println("First class"+perc);
					   }
					   else if(perc<35){
						     System.out.println("fail"+perc);
						   }


}
}