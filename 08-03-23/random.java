import java.util.Scanner;
class random{
public static void main(String[]args)
{
  Scanner val=new Scanner(System.in);
  System.out.println("enter the number");
  int num=val.nextInt();
   for(int i=2;i<num;i++)
   {
     while(num%i==0)
     {
        System.out.println(i+" ");
        num=num/i;
     }

   if(num>2)
   {
      System.out.println(num);
   }
}
}
}