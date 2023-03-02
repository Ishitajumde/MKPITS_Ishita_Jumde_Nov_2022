/*Reverse an Array in Java*/

class nine{
public static void main(String[]args)
{
   int arr[]={1,2,3,4,5};
  // try{
	   System.out.println("Orignal Array");
	  for(int i=0;i<arr.length;i++)
	     {
	        System.out.println(arr[i]);
         }

    System.out.println("Reverse of Array");
   for(int i=arr.length-1;i>=0;i--)
   {
      System.out.println(arr[i]);
   }
//}catch
}
}