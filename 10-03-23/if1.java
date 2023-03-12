interface shape
{
    void getarea();

    void getparameter();

}

class rectangle implements shape
{
   int l=45;
   int b=12;
   int a,p;

  public void getarea()
   {
       a=l*b;
       System.out.println("Area of rectangle = "+a);
   }

   public void getparameter()
       {
           p=2*(l*b);
           System.out.println("Perimeter of rectangle = "+p);
       }
}

class circle implements shape
{
   int r=5;
   double a;
   double c;
  public  void getarea()
      {
          a=3.14*r*r;
          System.out.println("Area of Circle = "+a);
      }

     public void getparameter()
          {
              c=2*3.14*r;
              System.out.println("Perimeter of Circle = "+c);
          }

}

class if1{
public static void main(String[]args)
{
    circle ob1=new circle();
    ob1.getarea();
    ob1.getparameter();

    rectangle ob2=new rectangle();
    ob2.getarea();
    ob2.getparameter();
}
}