class animal{

void dis1()
{
   System.out.println("animal block");
}
}
class mammal extends animal
{

   void dis2()
   {

       System.out.println("this is mammal");
   }



}
class bird extends mammal
{

   void dis3()
   {
       System.out.println("bird zoo");
   }
}
class c18{
public static void main(String[]args)
{
  bird ob=new bird();
    ob.dis1();
     ob.dis2();
      ob.dis3();


    }
}
