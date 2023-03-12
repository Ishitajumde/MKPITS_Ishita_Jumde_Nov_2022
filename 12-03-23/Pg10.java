/* Write a java program to check a given array of integers, if there is 5 in
   the 5 in the given array immediately followed by a 7 then set 7 to 1. */
 import java.util.Scanner;

   class Pg10
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
         System.out.print(arr[i]+" ");
       }
       for(int i=0;i<arr.length;i++)
       {
         if(arr[i]==5 && arr[i+1]==7)
         {
           arr[i+1]=1;
         }
       }
        System.out.println(" ");
       for(int i=0;i<arr.length;i++)
       {
         System.out.print(arr[i]+" ");
       }
     }
   }