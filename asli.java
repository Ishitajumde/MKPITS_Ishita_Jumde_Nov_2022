class nakli
{
  int a=5,b=10;
  int res;
  void form()
  {
     res= a*b;
  }
  void out()
  {
    System.out.println(res);
  }
}

 public class asli
 {
  public static void main(String[]args)
  {
    nakli obj=new nakli();
    obj.form();
    obj.out();
  }
 }
