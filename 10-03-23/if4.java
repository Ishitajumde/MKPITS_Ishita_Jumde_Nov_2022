interface vehicle
{
  void start();

  void stop();
}

class car implements vehicle
{
   String m="toyota okan ";
  public void start()
  {
      System.out.println("model name "+m);
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

class if4{
public static void main(String[]args)
{
    car o1=new car();
    o1.start();
    o1.stop();
    motorcycle o2=new motorcycle();
    o2.start();
    o2.stop();
}
}