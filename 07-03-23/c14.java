class person{
int roll;
String s;

}
class student extends person
{

   void info()
   {
       roll=12;
       s="ishita";
       System.out.println(roll);
        System.out.println(s);

   }

}
class teacher extends student
{

   void info2()
   {
       System.out.println("i am teacher");
   }
}
class c14{
public static void main(String[]args)
{
    teacher ob=new  teacher();
    ob.info();
    ob.info2();

    }
}
