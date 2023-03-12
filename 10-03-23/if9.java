interface geometricshape
{
    void getarea();


}

class rectangle implements geometricshape
{
   int l=45;
   int b=12;
   int a;

  public void getarea()
   {
       System.out.println("the shape is rectangle");
       a=l*b;
       System.out.println("Area of rectangle = "+a);
   }


}

class circle implements geometricshape
{
   int r=5;
   double a;

  public  void getarea()
      {
          System.out.println("the shape is circle");
          a=3.14*r*r;
          System.out.println("Area of Circle = "+a);
      }


}

class if9{
public static void main(String[]args)
{
    circle ob1=new circle();
    ob1.getarea();


    rectangle ob2=new rectangle();
    ob2.getarea();

}
}