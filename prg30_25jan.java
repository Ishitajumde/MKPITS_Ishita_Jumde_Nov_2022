class prg30_25jan{
   public static void main(String[]args)
   {
     int arr[]={2,3,3,6};

      {
         if(arr[1]>arr[0] || arr[1]==arr[0])
	    System.out.println(arr[1]);

         if(arr[2]>arr[1] || arr[2]==arr[1])
	    System.out.println(arr[2]);

         if(arr[3]>arr[2] || arr[3]==arr[2])
	   System.out.println(arr[3]);
	  else
	    {
	       System.out.println("not equal or greater than previous one");
	    }

      }
   }
}