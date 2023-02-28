class pg8{
public static void main(String[]args)
{
   int a[]={2,4,3,5,6};
   int sum=0;
   int b=a.length;
   System.out.println("length of array is "+b);
   for (int i=0;i<a.length;i++)
   {
       sum=sum+a[i];
   }
   int avg=sum/b;
   System.out.println("the avg of array is "+avg);
}
}