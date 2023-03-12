interface animal
{
   void makesound();

   void makemove();
}
class dog implements animal
{
  String s="Rottviller";
    public void makesound()
    {
      System.out.println("breed : "+s);
      System.out.println("sound : harsh");
    }
    public void makemove()
    {
        System.out.println("sharp move");
    }
}
class cat implements animal
{
  String s="jully";
    public void makesound()
    {
      System.out.println("cat's name : "+s);
      System.out.println("sound : soft ");
    }
    public void makemove()
        {
            System.out.println("sharp move");
        }
}
class if2{
public static void main(String[]args)
{
      dog o1=new dog();
      o1.makesound();
      o1.makemove();

      cat o2=new cat();
	  o2.makesound();
	  o2.makemove();

}
}