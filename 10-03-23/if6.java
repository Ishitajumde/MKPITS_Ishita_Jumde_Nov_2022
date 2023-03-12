interface musician
{
  void playinstrument();

  void sing();
}

class guitarist implements musician
{
   String m=" gibson brand ";
  public void playinstrument()
  {
      System.out.println("plays guitar of brand"+m);
  }

  public void sing()
  {
     System.out.println(" classic songs");
  }
}

class Drummer implements musician
{
   double s=12.6;
   public void playinstrument()
     {
         System.out.println("plays drum"+s+"m");
     }

     public void sing()
     {
          System.out.println(" rock bands");
     }
}

class if6{
public static void main(String[]args)
{
     guitarist o1=new  guitarist();
    o1.playinstrument();
    o1.sing();
    Drummer o2=new Drummer();
    o2.playinstrument();
    o2.sing();
}
}