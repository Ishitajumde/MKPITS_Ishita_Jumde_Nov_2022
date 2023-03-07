class employee{
int s=25000;
void dis1()
{
   System.out.println("employee of company");
}
}
class fulltimeemp extends employee
{

   void dis2()
   {

       System.out.println("i am full time employee nd my salary is "+s);
   }



}
class parttimeemp extends  fulltimeemp
{

   void dis3()
   {
       System.out.println("i am part time employee nd my salary is same as full time employee "+s);
   }
}
class c20{
public static void main(String[]args)
{
 parttimeemp ob=new parttimeemp();
    ob.dis1();
     ob.dis2();
      ob.dis3();


    }
}
