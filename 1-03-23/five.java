import java.util.Arrays;
class five{
public static void main(String[]args)
{
   int a1[]={12,4,6,89};
   int c=a1.length;
   Arrays.sort(a1);
   System.out.println("Sorted Array");
   for(int i=0;i<a1.length;i++)
   {
     System.out.println(a1[i]);
   }


}
}