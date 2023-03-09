import java.util.Scanner;
class pg2{
public static void main(String[]args)
{
   boolean check=false;
   Scanner val=new Scanner(System.in);
   System.out.println("enter two integers ");
   int a=val.nextInt();
   int b=val.nextInt();
     if(a>90 && a<110 || b>190 && b<210)
     {
          check=true;
          System.out.println(check);
     }
     else
     {
        check=false;
        System.out.println(check);
     }
}
}