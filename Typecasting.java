class Typecasting{
 public static void main(String[]args)
 {
   byte a=4;
   short s=a; //implicit byte to short
   long l1=14;
   a=(byte)l1;//explicit long to byte
   System.out.println(s);
   System.out.println(a);

 }
}