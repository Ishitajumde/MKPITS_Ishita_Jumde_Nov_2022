import java.util.LinkedList;
class pg19{
public static void main(String[]args)
{
   LinkedList <Integer>li=new LinkedList();
   System.out.println("size "+li.size());
   li.add(23);
   li.add(55);
   li.add(102);
   li.add(78);
   li.add(12);
    li.remove(1);
    li.remove(3);
   System.out.println("size "+li.size());
    System.out.println("values in list "+li);

}
}