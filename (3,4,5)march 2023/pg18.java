import java.util.TreeMap;

class pg18{
public static void main(String[]args)
{
   TreeMap tm=new TreeMap();
   System.out.println("size "+tm.size());
  tm.put(6,25);
  tm.put(3,3);
  tm.put(5,65);
  tm.put(1,2);

  tm.entrySet();
   System.out.println("size "+tm.size());
    System.out.println("values in list "+tm);

}
}