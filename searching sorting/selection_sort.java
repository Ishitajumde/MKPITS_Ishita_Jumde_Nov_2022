class selection_sort{
public static void main(String[]args)
{
	int temp;
     int arr[]={4,5,1,3,6,10};
     for(int i=0;i<arr.length;i++)
     {
         for(int j=i+1;j<arr.length;j++)
         {
             if(arr[i]>arr[j])
             {
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
             }
         }
     }
    for(int i=0;i<arr.length;i++)
    {
		System.out.println(arr[i]);
		}
}
}