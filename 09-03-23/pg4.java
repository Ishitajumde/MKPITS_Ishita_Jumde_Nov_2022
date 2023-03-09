import java.util.Scanner;
class pg4{
public static void main(String[]args)
{
    int upr=0,lwr=0,dg=0,sc=0,sp=0;
    Scanner data=new Scanner(System.in);
    System.out.println("Enter the string");
    String s=data.nextLine();
    char c[]=s.toCharArray();
    for(int i=0;i<c.length;i++)
    {
       if(c[i]>='A' && c[i]<='Z')
       {
           upr++;
       }
       else  if(c[i]>='a' && c[i]<='z')
       {
           lwr++;
       }
       else  if(c[i]>='0' && c[i]<='9')
              {
                  dg++;
              }
       else  if(c[i]==' ')
              {
                  sp++;
              }
       else{
          sc++;
       }
    }
    System.out.println("uppercase "+upr);
    System.out.println("lowercase "+lwr);
    System.out.println("digit "+dg);
    System.out.println("space "+sp);
    System.out.println("special character "+sc);
}
}
