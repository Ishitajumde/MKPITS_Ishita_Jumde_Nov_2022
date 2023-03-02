
class three{
public static void main(String[]args)
{
   int sum1=0,sum2=0;
  int a[]={1,5,7,2,4,6};
  for(int i=0;i<a.length;i++)
  {
     if(a[i]%2==0)
     {
        System.out.println("even no is");
        System.out.println(" "+a[i]);
        sum1=sum1+i;


	}
	else{
            System.out.println("odd no is ");
		    System.out.println(" "+a[i]);
		    sum2=sum2+i;
		}
  }
  System.out.println("sum of even no is "+sum1);

  System.out.println("sum of odd no is "+sum2);
}
}
