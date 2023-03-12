/* Write a java program to print the elements of an array present on even position. */

 import java.util.Scanner;

class Pg11
{
 public static void main(String [] args)
 {
	 Scanner sc = new Scanner(System.in);

     System.out.println("enter length of array");
         int len = sc.nextInt();
         int [] arr = new int[len];
      System.out.println("enter array");

   for(int i=0;i<len;i++)
    {
	   arr[i] = sc.nextInt();
	}
   for(int i=0;i<arr.length;i++)
   {
     if(i%2==0)
     {
        System.out.println("element present in even position : "+arr[i]);
     }
   }
 }
}