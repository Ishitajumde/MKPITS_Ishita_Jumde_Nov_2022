class prg8_23jan{
   public static void main(String[]args)
   {
       int arr[]={2,3,7,8,6};
       int count=0;
       for(int i=0;i<arr.length;i++)
       {
          if(arr[i]%2==0)
          count++;
       }
       System.out.println("The even no count is:"+count);
   }
}