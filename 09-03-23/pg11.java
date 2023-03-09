class pg11{
public static void main(String[]args)
{
   int a1[]={3,4,5,8,15,70};
   int a2[]=new int[a1.length];
   for(int i=0;i<a1.length;i++)
   {
      if(a1[i]>5)
      {
        a2[i]=a1[i];
      }
   }
   for(int i=0;i<a2.length;i++)
      {
         System.out.println(a2[i]);
      }
}
}