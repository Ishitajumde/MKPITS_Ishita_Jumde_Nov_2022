class person{

void dis1()
{
   System.out.println("i am a person of family");
}
}
class parent extends person
{

   void dis2()
   {

       System.out.println("i am father");
   }



}
class child extends parent
{

   void dis3()
   {
       System.out.println("i am child of father and person too");
   }
}
class c19{
public static void main(String[]args)
{
 child ob=new child();
    ob.dis1();
     ob.dis2();
      ob.dis3();


    }
}
