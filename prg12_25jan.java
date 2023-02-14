class one
   {
      int arr[]={5,7,3,5,7,7};
      int count=0 ,count1=0;
     void set1()
     {
       for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==5)
           count++;
	    }
	   System.out.println("The count of 5 = " +count);
     }
     void set2()
	       {
	         for(int i=0;i<arr.length;i++)
               {
                 if(arr[i]==7)
                  count1++;
               }
              System.out.println("The count of 7 = " +count1);
            }
}
class prg12_25jan
{
   public static void main(String[]args)
   {
	   one ob = new one();
	   ob.set1();
	   ob.set2();
   }
}