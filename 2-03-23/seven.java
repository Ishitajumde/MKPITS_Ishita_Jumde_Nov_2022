/*The cumulative sum of an array in Java*/

class seven{
public static void main(String[]args)
{
    int a[]={6,5,1,-9,7,-2,0,-1,12};
    int sum=0;
    System.out.println("Positive values in array");
    for(int i=0;i<a.length;i++)
    {

			if(a[i]>0)
				{
					System.out.println(a[i]);
					sum=sum+a[i];
			     }

	}

	 System.out.println(" sum of Positive values in array= "+sum);
}
}