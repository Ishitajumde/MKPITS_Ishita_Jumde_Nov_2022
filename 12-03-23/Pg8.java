/* Write a java program to count the number of two 5's are next to each other in an array of integers.
   Also count the situation where the secon 5is actually 6. */

   import java.util.Scanner;

   class Pg8
   {
     public static void main(String [] args)
     {
	    Scanner sc = new Scanner(System.in);
		 System.out.println("enter length of array");
		 int len = sc.nextInt();
       int [] arr = new int[len];
       int count1 =0;
       int count2 =0;
        System.out.println("enter array");
       for(int i=0;i<len;i++)
       {
		   arr[i] = sc.nextInt();
	   }
       for(int i=0;i<arr.length;i++)
       {
         if(arr[i]==5 && arr[i+1]==5)
         {
            count1++;
         }
         else
         {
           if(arr[i]==5 && arr[i+1]==6)
           {
              count2++;
           }
         }
       }
       System.out.println(" ");
       System.out.println("count for two 5's are next to each other : "+count1);
       System.out.println("count for 6's are next to 5 :"+count2);
     }
   }