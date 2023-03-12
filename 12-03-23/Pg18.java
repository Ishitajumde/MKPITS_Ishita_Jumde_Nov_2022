/* Write a java program to shift k element in left direction and return in new array. */

import java.util.Scanner;

class Pg18
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
	  System.out.println("enter element of shifting");
      int k=sc.nextInt();
      int temp [] = new int[k];
     int c=0;

    for(int i=0;i<k;i++)
    {
		temp[i] = arr[i];
	}

	int narr [] = new int[arr.length];

	for(int i=k;i<arr.length;i++)
	{
		 narr[c] = arr[i];
		 c++;
	}
	for(int i=0;i<temp.length;i++)
		{
			narr[c] = temp[i];
			 c++;
	}
	for(int i=0;i<narr.length;i++)
			{
			System.out.print(narr[i]+" ");

	}
  }
}