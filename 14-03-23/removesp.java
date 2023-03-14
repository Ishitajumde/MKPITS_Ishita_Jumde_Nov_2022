/*Java program to replace the string space with a given character.*/
class removesp{
public static void main(String[]args)
{
 String s="i got my mobile";
 char c[]=s.toCharArray();
 for(int i=0;i<c.length;i++)
 {
    if(c[i]==' ')
    {
       c[i]=65;
    }
    System.out.print(c[i]);
 }

}
}