import java.util.Scanner;
class pg3{
public static void main(String[]args){
int i ,fact=1;
Scanner val=new Scanner(System.in);
System.out.println("enter the number");
 int num=val.nextInt();
for(i=1;i<=num;i++)
{
    fact=fact*i;
}
System.out.println("factorial of "+ num +"="+fact);
}
}