class bubble_sort{
public static void main(String[]args)
{
	int temp;
     int arr[]={4,5,1,3,6,10};
     for(int i=1;i<arr.length;i++)
     {
         for(int j=0;j<arr.length-i;j++)
         {
             if(arr[j]>arr[j+1])
             {
               temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
             }
         }
     }
    for(int i=0;i<arr.length;i++)
    {
		System.out.println(arr[i]);
		}
}
}