import java.util.LinkedList;
class pg14{
public static void main(String[]args)
{
   LinkedList <Integer>li=new LinkedList();
   System.out.println("size "+li.size());
   li.add(23);
   li.add(55);
   li.add(102);
   li.add(78);
   li.add(12);
    li.removeFirst();
    li.removeLast();

   System.out.println("size "+li.size());
    System.out.println("values in list "+li);

}
}