import java.util.Scanner;
class pg1 extends Exception{
public static void main(String[]args)
{
   int fact=1;
   Scanner val= new Scanner(System.in);
   System.out.println("enter non negative integer");
   int num=val.nextInt();
   try{
   	    if( num>0)
   	    {
			for(int i=num;i>=1;i--)
					 {
					 	fact=fact*i;
					 }
                System.out.println("Factorial of "+num+" "+fact);
			}
			else{
				    NumberException th=new  NumberException("invalid input");
				    throw th;
				}
      }
       catch(Exception e)
       {
		  System.out.println(th);
		}



}
}