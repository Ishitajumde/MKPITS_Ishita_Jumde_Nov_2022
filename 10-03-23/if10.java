interface vehicle
{
  void drive();

  void stop();
}

class car implements vehicle
{
   String m="toyota okan";
  public void drive()
  {
      System.out.println("model name "+m);
  }

  public void stop()
  {
     System.out.println("the car has good average");
  }
}

class truck implements vehicle
{
   int c=15;
   public void drive()
     {
         System.out.println("The towing capacity of truck is "+c+"ton");
     }

     public void stop()
     {
          System.out.println("the truck gives us good services");
     }
}

class if10{
public static void main(String[]args)
{
    car o1=new car();
    o1.drive();
    o1.stop();
  truck o2=new truck();
    o2.drive();
    o2.stop();
}
}