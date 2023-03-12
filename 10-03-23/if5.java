interface shape
{
    void getarea();

    void getparameter();

}

class square implements shape
{
   int s=12;
   int a,p;

  public void getarea()
   {
       a=s*s;
       System.out.println("Area of square = "+a);
   }

   public void getparameter()
       {
           p=2*(s);
           System.out.println("Perimeter of square = "+p);
       }
}

class triangle implements shape
{
   int a=5,b=7,c=4,h=12;
   double A;
   double p;
  public  void getarea()
      {
          A=0.5*b*h;
          System.out.println("Area of Triangle = "+A);
      }

     public void getparameter()
          {
              p=a+b+c;
              System.out.println("Perimeter of triangle = "+p);
          }

}

class if5{
public static void main(String[]args)
{
   square  ob1=new square ();
    ob1.getarea();
    ob1.getparameter();

triangle ob2=new triangle();
    ob2.getarea();
    ob2.getparameter();
}
}