class kangalexception extends Exception
{
     kangalexception(String s)
     {
        super(s);
        System.out.println(s);
     }
}
class excthrow{
public static void main(String[]args)throws Exception
{
 int bal=3000;
 int with=5000;
 if(bal>with)
 {
   System.out.println("rupay le lo");
 }
 else
 {
   kangalexception ob = new kangalexception("paisa nhi hei");
   throw ob;
 }
}
}