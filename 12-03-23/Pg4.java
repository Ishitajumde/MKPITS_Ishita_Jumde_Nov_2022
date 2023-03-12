/* Write a java program to shift by 2 element in left direction and return in new array. */

class Pg4
{
  public static void main(String [] args)
  {
    int [] arr = {1,3,4,2,6};


    int [] a = new int[arr.length];
     a[arr.length-1] = arr[0];
     a[arr.length-2] = arr[1] ;

    for(int i=2;i<arr.length;i++)
    {

       	a[i-2]=arr[i];

	}

   for(int i=0;i<a.length;i++)
   {
     System.out.print(a[i]+" ");
   }
  }
}