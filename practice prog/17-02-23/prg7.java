import java.util.Scanner;
class prg7{
   public static void main(String[]args)
   {
       int m1,m2;
       Scanner val=new Scanner(System.in);
       System.out.println("enter the 2 integer value");
       m1=val.nextInt();
       m2=val.nextInt();

       if(m2%m1==0)
       {
		   System.out.println("It is a Multiple");

	   }
	   else{
		      System.out.println("It is not a Multiple");
		   }
   }
}
