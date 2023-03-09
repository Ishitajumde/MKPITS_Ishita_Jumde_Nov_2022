class pg8{
public static void main(String[]args)
{
   int c=0;
   int ar1[]={1,2,3,4,5,6,7,8,9,10};
   int ar2[]=new int[ar1.length];
   for(int i=0;i<ar1.length;i++)
   {
      if(ar1[i]%2==0)
      {
         ar2[c]=ar1[i];
          c++;
      }
   }
    for(int i=0;i<ar1.length;i++)
      {
         if(ar1[i]%2!=0)
         {
            ar2[c]=ar1[i];
             c++;
         }
   }
   for(int i=0;i<ar2.length;i++)
   {
          System.out.println(ar2[i]);
   }
}
}