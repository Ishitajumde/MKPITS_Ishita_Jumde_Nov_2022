import java.util.*;
import java.util.Scanner;
class one{
 public static void main(String[]args)
 {
    Scanner val=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=val.next();
    int l=s.length();
    char c[]=s.toCharArray();
     char rev[]=new char[l];
    for(int i=0;i<c.length;i++)
    {

		System.out.println(c[i]);
	}
	try{
		for(int i=2; i<=c.length;i--)
	{
			rev[i]=c[i];
			 System.out.println(rev[i]);
	}
}catch(Exception e)
{
	}
	String s1= String.valueOf(rev);

    //StringBuilder rev= news.reverse();
    System.out.println(s1);
 }
}