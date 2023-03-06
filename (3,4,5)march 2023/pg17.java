import java.util.Stack;

class pg17{
public static void main(String[]args)
{
   Stack s=new Stack();
   System.out.println("size "+s.empty());
   s.push(14);
   s.push(1);
   s.push(98);
   s.push(23);

   System.out.println("size "+s.empty());
    System.out.println("values in list "+s);

}
}