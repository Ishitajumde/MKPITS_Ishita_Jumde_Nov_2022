interface color
{
    void getcolorcode();
}

class red implements color
{
   public void getcolorcode(){

        System.out.println("color : red "+"code : #60c30");
   }
}
class green implements color
{
  public void getcolorcode(){
      System.out.println("color : green "+"code : #39f60c");
   }
}
class blue implements color
{
  public void getcolorcode(){
      System.out.println("color : green "+"code : #0c26f6");
   }
}
class if15{
public static void main(String[]args){
  green g=new green();
  g.getcolorcode();
   blue b=new blue();
  b.getcolorcode();
   red r=new red();
  r.getcolorcode();
}
}