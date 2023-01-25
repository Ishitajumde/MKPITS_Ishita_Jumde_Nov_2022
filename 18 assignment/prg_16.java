class one
{
      char c;
  void value()
   {
	   System.out.println("capital A to Z");
         for (c = 'A'; c <= 'Z'; ++c)
	         System.out.println(c);
   }
    void value2()
      {
		  System.out.println("small a to z");
            for (c = 'a'; c <= 'z'; ++c)
   	         System.out.println(c);
      }
}
class prg_16{
   public static void main(String[]args)
   {
      one obj= new one();
      obj.value();
      obj.value2();
   }
}