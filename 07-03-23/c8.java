/*  Program to demonstrate the use of final methods in Java.
 */

 class c8a{

 final void dis()
 {
      System.out.println("this is a final method");
 }
}
 class c8b extends c8a
 {
	 void dis()
	 {

     }
	 }
  class c8{
  public static void main(String[]args)
  {
	  c8b ob=new c8b();
	   ob.dis();
  }
 }