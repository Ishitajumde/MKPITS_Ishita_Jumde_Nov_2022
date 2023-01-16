class Adddemo
{
  int a=3,b=4;
  int res;
  void sum()
  {
     res=a+b;
  }
  void dis()
  {
    System.out.println(res);
  }
}

 public class refobj
 {
  public static void main(String[]args)
  {
    Adddemo obj=new Adddemo();
    obj.sum();
    obj.dis();

    Adddemo obj2=obj;
    obj2.dis();

    //change value a
    obj2.a=15;
    System.out.println(obj2.a);
    obj2.dis();

     Adddemo obj3=new Adddemo();
       //adress of object
     System.out.println(obj);
     System.out.println(obj2);
     System.out.println(obj3);

  }
 }
