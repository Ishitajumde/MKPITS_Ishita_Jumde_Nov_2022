/*count positive negative and zero from Array*/
class four{
public static void main(String[]args)
{
    int a[]={6,-9,8,-2,0,-1};
    System.out.println("Positive values in array");
    for(int i=0;i<a.length;i++)
    {
		if(a[i]>0)
		{
			System.out.println(a[i]);
		}
	}
	System.out.println("Negative values in array");
	for(int i=0;i<a.length;i++)
	    {
			if(a[i]<0)
			{
				System.out.println(a[i]);
			}
	}

}
}


