import java.util.Arrays;
class asce_array{
public static void main(String[]args)
{
   String s="aurangabad";
   char c[]=s.toCharArray();
   Arrays.sort(c);
   System.out.print(new String(c));
}
}