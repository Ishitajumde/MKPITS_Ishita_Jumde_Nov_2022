interface sports
{
  void playgame();

  void getequipment();
}

class basketball implements sports
{
   String s="5";
  public void playgame()
  {
      System.out.println("size of basketball "+s);
  }

  public void getequipment()
  {
     System.out.println("required ball");
  }
}

class football implements sports
{
   String s="sphere or elongated sphere";
   public void playgame()
     {
         System.out.println("shape of football "+s+);
     }

     public void getequipment()
     {
          System.out.println("required ball");
     }
}

class if7{
public static void main(String[]args)
{
      basketball o1=new   basketball();
      o1.playgame();
      o1.getequipment();
   football o2=new football();
    o2.playgame();
    o2.getequipment();
}
}