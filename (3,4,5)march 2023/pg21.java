import java.util.HashMap;
class pg21{
public static void main(String[]args)
{
   HashMap al=new HashMap();
   System.out.println("size "+al.size());
   al.put(1 ,"tell");
   al.put(2 ,"ram");
   al.put(3 ,"rawan");
   al.put(4 ,"rt");
   System.out.println("values in list "+al);

   al.replace(2 ,"ram","sita");
   al.replace(4, "rt","ajay");

   System.out.println("size "+al.size());
    System.out.println("values in list "+al);

}
}