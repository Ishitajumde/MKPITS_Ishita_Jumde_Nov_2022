import java.util.Scanner;
class two{
public static void main(String[]args)
{
    int sum=0;
   System.out.println("Enter the Number");
   Scanner val=new Scanner(System.in);
   int num=val.nextInt();
   for(int i=1;i<num;i++)
   {
      int rev=num%i;
      if(rev==0)
      {
          sum=sum+i;
      }
   } 
   if(sum==num)
   {
        System.out.println("It is a perfect number");
   }
   else
   {
        System.out.println("It is not a perfect number");
   }
}
}