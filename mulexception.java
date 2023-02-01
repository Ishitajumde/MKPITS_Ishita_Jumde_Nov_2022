class mulexception{
  public static void main(String[]args){
     System.out.println("Start of program");
     int a=2;
     int b=0,i;
     int arr[]={1,2,3,4};
     try{
		  b=a/0;
          for(i=0;i<arr.length;i++)
          System.out.println("array values "+arr[i]);  //in try section whichever operation is first ,the first preference goes to that
                                                           //and output is related to them.
        }
     catch(Exception e){
                           System.out.println("exception perform");
                           System.out.println(e.getMessage());
                       }
               System.out.println("end of program");

  }
}