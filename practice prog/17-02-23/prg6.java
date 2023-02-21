import java.util.Scanner;
class prg6{
   public static void main(String[]args)
   {
       float s1,s2,s3;
       double p=0;
       Scanner val=new Scanner(System.in);
       System.out.println("enter the 3 sides value");
       s1=val.nextFloat();
       s2=val.nextFloat();
       s3=val.nextFloat();
       if(s1==s2 && s2==s3 && s1==s3)
       {
		   System.out.println("It is a triangle");
		   p=s1+s2+s3;
		   System.out.println("Perimeter of triangle= "+p);
	   }
	   else{
		      System.out.println("It is not a triangle");
		   }
   }
}

