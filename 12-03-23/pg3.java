/* Write a java program that accepts integers from user until a zero or negative number.*/

import java.util.Scanner;

class pg3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the num");
    int num = sc.nextInt();
     int n;
     if(num > 0)
  {
    for(int i=1;i>0;i++)
    {
	  System.out.println("enter the number");
       n= sc.nextInt();
      if(n<=0)
      {
		 break;
      }
    }
   }
  }
}