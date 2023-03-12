interface vehicle
{
  void start();

  void stop();
}

class bicycle implements vehicle
{
   int g=2;
  public void start()
  {
      System.out.println("this is a block of bicycle");
      System.out.println("gear "+g);
  }

  public void stop()
  {
     System.out.println("the car has good average");
  }
}

class motorcycle implements vehicle
{
   double s=12.6;
   public void start()
     {
         System.out.println("The overall length of bike is "+s+"m");
     }

     public void stop()
     {
          System.out.println("the bike has good average");
     }
}

class if13{
public static void main(String[]args)
{
   bicycle o1=new bicycle();
    o1.start();
    o1.stop();
    motorcycle o2=new motorcycle();
    o2.start();
    o2.stop();
}
}