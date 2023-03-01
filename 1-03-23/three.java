class three{
public static void main(String[]args)
{
   int a1[]={2,4,5};
   int a2[]={3,6,8};
   int c=a1.length;
   int sum[]=new int[c];
   System.out.println("1st array");
   for(int i=0;i<a1.length;i++)
   {
     System.out.println(a1[i]);
   }
   System.out.println("2nd array");
   for(int i=0;i<a2.length;i++)
      {
        System.out.println(a2[i]);
   }
   System.out.println("sum of array");
   for(int i=0;i<c;i++)
      {

        sum[i]=a1[i]+a2[i];
        System.out.println(sum[i]);
   }
   //for(int val: sum)
   //System.out.println(val);
}
}