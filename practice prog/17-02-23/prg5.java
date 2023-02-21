import java.util.Scanner;
class prg5{
    public static void main(String[]args)
    {
		int sum=0;
      Scanner val=new Scanner(System.in);
      System.out.println("Enter the five integer value");
      for(int n=1;n<=5;n++)
      {
         n=val.nextInt();
         if(n%2!=0)
         {
			   sum=sum+n;
		 }
      }
           System.out.println("The sum of odd no is "+sum);
    }
}