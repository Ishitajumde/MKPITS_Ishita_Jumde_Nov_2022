/* Write a java program to check whether the sequence of number 1,2,3appears in a given array of integers somewhere. */

import java.util.Scanner;

class Pg7
{
  public static void main(String [] args)
  {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter length of array");
	 int len = sc.nextInt();
     int [] arr = new int[len];
     int count=0;
      System.out.println("enter array");
      for(int i=0;i<len;i++)
      {
		arr[i] = sc.nextInt();
	  }
     for(int i=0;i<arr.length;i++)
     {
      if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3)
      {
		  count++;

	  }

     }
     if(count>0)
     {
		  System.out.println("true");
	 }
	 else
	 {
		  System.out.println("false");
	 }
  }
}