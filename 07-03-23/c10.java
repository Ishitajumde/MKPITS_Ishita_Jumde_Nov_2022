/* Program to demonstrate the use of method overloading in Java.
 */

 class c10{
        int c10(int x,int y)
        {
           return(x+y);
        }
        int c10(int x,int y,int z)
        {
			return(x+y+z);
		}
public static void main(String[]args)
{
    c10 ob=new c10();
    System.out.println(ob.c10(12,12));

    System.out.println(ob.c10(12,12,14));
}
 }