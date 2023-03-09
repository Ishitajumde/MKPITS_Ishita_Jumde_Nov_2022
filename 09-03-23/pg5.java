class pg5{
public static void main(String[]args)
{
   int count=0;
  int a[]={5,5,3,5,5,6,7,8};
  for(int i=0;i<a.length-1;i++)
  {
      if(a[i]==a[i+1])
      {
         count++;
      }
  }
  System.out.println("repetetion of 5 and 5 = "+count);
}
}