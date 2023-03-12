/* Write a java program to shift by 2 element in right direction and return in new array. */

class Pg6
{
  public static void main(String [] args)
   {
     int [] arr = {5,2,3,6,9,1,7};

     int [] a = new int[arr.length];
     a[0] = arr[arr.length-1];
     a[1] = arr[arr.length-2];

     for(int i=2;i<arr.length;i++)
     {
        a[i] = arr[i-2];

     }
      for(int i=0;i<a.length;i++)
	  {
	     System.out.print(a[i]+" ");
     }
   }
}