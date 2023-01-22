class one
{
   void exp()
   {
     int res=(-1+4*6);
     System.out.println("expression One res= "+res);

     int res1=((35+5)%7);
     System.out.println("expression Two res= "+res1);

     int res2=(14+(-4)*6/11);
     System.out.println("expression Three res= "+res2);

     int res3=(2+(15/6)*(1-7)%2);
     System.out.println("expression Four res= "+res3);
   }
}
class prgtwo{
   public static void main(String[] args)
   {
     one ob= new one();
     ob.exp();
   }
}