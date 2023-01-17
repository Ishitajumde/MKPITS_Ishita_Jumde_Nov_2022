class adddemo
{
  static int b;
    void set()
    {
        b++;
    }
    void dis()
    {
      System.out.println(b);
    }
}

 public class static
{
  public static void main(String[] args)
  {
      addemo ob1= new adddemo();
      adddemo ob2= new adddemo();
      ob1.dis();
       ob2.dis();
       adddemo.b=13;
       ob1.dis();
       ob2.dis();

  }
}