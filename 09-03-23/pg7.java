import java.util.Scanner;
class pg7{
public static void main(String[]args)
{
   Scanner val=new Scanner(System.in);
   System.out.println("enter the value for two integer");
   int a=val.nextInt();
   int b=val.nextInt();
   int n1,n2;
   n1=a/10;
   a=a%10;

   n2=b/10;
   b=b%10;
   if(a==b)
     {
	   System.out.print("the last digit of number is same");
	 }
	 else{
		      System.out.print("the last digit of number is not same");
		 }

}
}