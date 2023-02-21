import java.util.Scanner;
class prg4{
   public static void main(String[]args)
   {
      Scanner val=new Scanner(System.in);
      System.out.println("enter the integer value");
      int num=val.nextInt();
      if(num>0 && num<80)
      {
		  System.out.println("it is in range");
	  }
	  else if(num<0)
	  {
		 System.out.println("The value is negative not in range");
	  }
	      else{
	            System.out.println("The value is greater than 80 not in range");
		      }
   }
}