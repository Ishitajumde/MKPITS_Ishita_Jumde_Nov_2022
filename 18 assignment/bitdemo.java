class bitop
{
   int a=10,value;
   void form()
   {
      value=a<<2;
      System.out.println("value shift left= "+value);
   }
}

class bitdemo{
public static void main(String[]args)
{
  bitop ob1= new bitop();
  ob1.form();
}
}