class num
{
  int i;
  void set()
  {
     for(i=1;i<30;i=i+3)
       {
         System.out.println(i);
       }
  }
}

class aritpat
{
  public static void main(String [] args)
  {
    num ob1= new num();
    ob1.set();
  }
}