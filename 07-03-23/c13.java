class shape{
int r;
double t,c;
void area()
{

}
}
class rectangle extends shape
{
 int l=3,b=4;
   void area()
   {
      System.out.println("area of rectangle");
      r=l*b;

   }
   void dis1()
   {
        System.out.println(r);
   }
}
class triangle extends shape
{
   int h=4,b=2;
  void area()
   {
      System.out.println("area of triangle");
      t=0.5*b*h;

   }
   void dis2()
   {
       System.out.println(t);
   }
}
class circle extends shape
{
 double ra=0.2;
void area()
   {

      System.out.println("area of circle");
      c=3.14*ra*ra;

   }
   void dis3()
   {
       System.out.println(c);
   }
}
class c13{
public static void main(String[]args)
{
    circle ob=new  circle();
    ob.area();
    ob.dis3();
    rectangle ob1=new  rectangle();
    ob1.area();
    ob1.dis1();
    triangle ob2=new  triangle();
    ob2.area();
    ob2.dis2();

}
}
