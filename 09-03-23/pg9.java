class pg9{
public static void main(String[]args)
{
   int count=0;
   int ar[]={1,5,3,5,5,6};
   for(int i=0;i<ar.length;i++)
   {
       if(ar[i]==5)
       {
           count++;
       }
   }
   if(count==3)
   {
       System.out.println("it is a triple");
   }
   else {
                    System.out.println("it is not a triple");
        }
}
}