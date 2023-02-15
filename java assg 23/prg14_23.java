class prg14_23{
  public static void main(String[]args){
     int arr[]={1,2,3,4,5};
     int i,n=5;
     for(i=0;i<n;i++)
     {
       System.out.println(arr[i]);
     }

	 System.out.println("reverse array");

     for(i=n-1;i>=0;i--)
	      {
	        System.out.println(arr[i]);
     }
  }
}