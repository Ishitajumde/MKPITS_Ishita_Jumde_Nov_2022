import java.util.HashMap;
class pg20{
public static void main(String[]args)
{
   HashMap al=new HashMap();
   System.out.println("size "+al.size());
   al.put(1 ,"tell");
   al.put(2 ,"ram");
   al.put(3 ,"rawan");
   al.put(4 ,"rt");
   al.remove(2);
   al.remove(4);
   
   System.out.println("size "+al.size());
    System.out.println("values in list "+al);

}
}