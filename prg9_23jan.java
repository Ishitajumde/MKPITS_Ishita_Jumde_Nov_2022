class prg9_23jan{
  public static void main(String[]args)
  {
     int sum=0;
     int arr[]={3,5,17,4,9,17};
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]==17)
          continue;   //continue keyword is used to skip the number in a array
          sum=sum+arr[i];
     }
     System.out.println("the sum skiping integer 17 ="+sum);
  }
}