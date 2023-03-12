/*  Write a java program to shift an element in rigth direction and return in new array. */

class Pg5
{
  public static void main(String [] args)
   {
     int [] arr = {5,2,3,6,9,1,7};
     int count=0;
     int [] a = new int[arr.length];
     a[0]=arr[arr.length-1];


     for(int i=1;i<arr.length;i++)
     {
        a[i] = arr[i-1];

     }
      for(int i=0;i<a.length;i++)
	  {
	     System.out.print(a[i]+" ");
     }
   }
}