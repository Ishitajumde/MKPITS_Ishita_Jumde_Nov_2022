/* Write a java program to check if a triple is present in an array of integers or not .If a value appears three
    times in a row in aa array it is called a triple. */

   import java.util.Scanner;
    class Pg9
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
          try{
        for(int i=0;i< arr.length ;i++)
        {
          if(arr[i]==arr[i+1] && arr[i+1]==arr[i+2])
          {
            count++;
          }
        }
	   }catch(Exception e){}

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