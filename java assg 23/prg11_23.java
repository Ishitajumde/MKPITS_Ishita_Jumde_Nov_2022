class prg11_23{
  public static void main(String[]args){
     int arr[]={1,2,1};
     int i,n=3;
     boolean check=false;
     for(i=0;i<n;i++)
     {
       System.out.println(arr[i]);
     }

	 System.out.println("checking first and last number");

     if(arr[0]==arr[2])
	      {
	         check =true;
	        System.out.println(check);
     }
     else{
           System.out.println(check);
     }
  }
}