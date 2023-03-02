/*Find average and numbers greater than average in array*/
class eight{
public static void main(String[]args)
{
   int arr[]={3,6,4,8,3,8};
   int sum=0;
   int len=arr.length;
   for(int i=0;i<arr.length;i++)
   {
      System.out.println(arr[i]);
      sum=sum+arr[i];
   }
   int avg=sum/len;
      System.out.println("avg of array elements"+avg);
   for(int i=0;i<arr.length;i++)
   {
      if(avg>arr[i])
      {
          System.out.println("the greater value than avg "+arr[i]);
      }
      else
      {
         System.out.println("no greater value than avg ");
      }
      }


}
}