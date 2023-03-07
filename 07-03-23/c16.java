class Building{

void dis1()
{
   System.out.println("this is my building");
}
}
class house extends Building
{

   void dis2()
   {

       System.out.println("this is my house");
   }



}
class apartment extends house
{

   void dis3()
   {
       System.out.println("this is my apartment");
   }
}
class c16{
public static void main(String[]args)
{
   apartment ob=new apartment();
    ob.dis1();
     ob.dis2();
      ob.dis32();


    }
}
