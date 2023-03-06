import java.util.HashSet;
class pg10{
public static void main(String[]args)
{
   HashSet hs=new HashSet();
   System.out.println("before size "+hs.size());
   hs.add(8);
   hs.add(5);
   hs.add(4);
   hs.add(1);
   System.out.println("After addition size "+hs.size());
   System.out.println(hs);
}
}