 /*/  one interface
          |
          |
      class two  (class two implements interface one) */

 interface one {
	void set();
 void dis();
}
 class two implements one{
	@Override
 public void dis()
 {
    System.out.println("first interface display.");
 }
  public void set()
 {
	  System.out.println("first interface set.");
}
}
class inter_face{
 public static void main(String[]args)
 {
    two obj= new two();
    obj.dis();
    obj.set();
 }
}
