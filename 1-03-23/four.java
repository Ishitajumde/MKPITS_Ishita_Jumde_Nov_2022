class four{
public static void main(String[]args)
{
   int a1[]={2,4,5};
   int c=a1.length;
   int cpy[]=new int[c];
   System.out.println("1st array");
   for(int i=0;i<a1.length;i++)
   {
     System.out.println(a1[i]);
   }

   System.out.println("copy of array");
   for(int i=0;i<c;i++)
      {

        cpy[i]=a1[i];
        System.out.println(cpy[i]);
   }
   //for(int val: sum)
   //System.out.println(val);
}
}