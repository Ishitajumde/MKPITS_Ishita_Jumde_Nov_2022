interface shape
{
    void getarea();

    void getparameter();

}

class ellipse implements shape
{
   double a=45;
   double b=12;
   double  A;

  public void getarea()
   {
       A=3.14*a*b;
       System.out.println("Area of ellipse = "+A);
   }

   public void getparameter()
       {

           System.out.println("Perimeter of rectangle = " +" invalid input");
       }
}

class rhombus implements shape
{
   int s=5;
   double d1=0.5,d2=1.5;
   double A;
   int P;
  public  void getarea()
      {
          A=d1+d2/2;
          System.out.println("Area of rhombus = "+A);
      }

     public void getparameter()
          {
              P=4*s;
              System.out.println("Perimeter of rhombus = "+P);
          }

}

class if14{
public static void main(String[]args)
{
    ellipse ob1=new ellipse();
    ob1.getarea();
    ob1.getparameter();

    rhombus ob2=new rhombus();
    ob2.getarea();
    ob2.getparameter();
}
}