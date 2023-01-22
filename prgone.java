class one{
int x;
int res,res1,res2,res3;
void dis()
{
   System.out.println("x   "+"x+2   "+"x+4    "+"x+6   ");
   System.out.println(".............................. ");

}
void set()
{
   for(x=1;x<=15;x=x+3)
   {
      res=x;
      res1=x+2;
      res2=x+4;
      res3=x+6;
      System.out.print("  "+res);
      System.out.print("  "+res1);
      System.out.print("  "+res2);
      System.out.print("  "+res3);
      System.out.println("  ");
   }

}
}
class prgone{
   public static void main(String[]args)
   {
      one obj= new one();
      obj.dis();
      obj.set();
   }
}