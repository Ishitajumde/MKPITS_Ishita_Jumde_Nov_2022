import java.util.Scanner;
class pg3{
public static void main(String[]args)
{
   boolean check=false;
   Scanner val=new Scanner(System.in);
   System.out.println("enter two integers ");
   int a=val.nextInt();
   int b=val.nextInt();
     if(a>20 && a<50|| b>20 && b<50)
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