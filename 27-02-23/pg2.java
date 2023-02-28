import java.util.Scanner;
class pg2{
public static void main(String[]args){
Scanner val=new Scanner(System.in);
System.out.println("enter the number");
int num=val.nextInt();

int n1=num%10;
    num=num/10;
int n2=num%10;
 int   n3=num/10;

int res=n3*100+n2*10+n1*1;
System.out.println(res);
int temp=(n3*n3*n3)+(n2*n2*n2)+(n1*n1*n1);
System.out.println(temp);
if(res==temp)
{
	System.out.println("its an amstrong number");
}
else{
	    System.out.println("its not amstrong");
	}
}
}