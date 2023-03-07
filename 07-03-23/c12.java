class animal{
void dis1()
{
   System.out.println("this is a block of animal");
}
}
class dog extends animal
{
   void dis2()
   {
       System.out.println("this is a dog");
   }
}
class cat extends dog
{
   void dis3()
   {
       System.out.println("this is a cat");
   }
}
class bird extends cat
{
   void dis4()
   {
       System.out.println("this is a bird");
   }
}
class c12{
public static void main(String[]args)
{
    bird ob=new bird();
    ob.dis1();
    ob.dis2();
    ob.dis3();
    ob.dis4();
}
}
