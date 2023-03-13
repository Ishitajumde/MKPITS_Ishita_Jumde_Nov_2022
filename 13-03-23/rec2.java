class rec2{

public static int power(int n)
{
   if(n<1)
   {
       return 1;
   }
   else{
       int pow=2*power(n-1);
       System.out.println(pow);
       return pow;
   }



}
public static void main(String[]args)
{

    rec2 ob=new rec2();
    ob.power(5);
  //int  pow=power(5);
  //  System.out.println(pow);
}
}