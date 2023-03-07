class vehicle{
void dis1()
{
   System.out.println("this is a block of vehicle");
}
}
class car extends vehicle
{
   void dis2()
   {
       System.out.println("this is a block of car");
   }
}
class motorcycle extends car
{
   void dis3()
   {
       System.out.println("this is a block of motorcycle");
   }
}
class c11{
public static void main(String[]args)
{
    motorcycle ob=new  motorcycle();
    ob.dis3();
    ob.dis2();
     ob.dis1();
}

}

