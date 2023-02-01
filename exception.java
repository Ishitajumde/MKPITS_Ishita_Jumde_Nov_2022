class exception {
  public static void main(String[]args)
  {
    int a=4;
    int b=0;
    System.out.println("first execution");

     try{
		    b=a/0;      //error will be monitor
		 }
     catch(ArithmeticException e){
		    System.out.println("exception is handle");
		 }
    System.out.println("second execution"+b);
  }
}
output:/* first execution
          exception is handle(catch block error handle)
           second execution  */