class rec1{

public static int fact(int n)
{
   if(n<1)
   {
       return -1;
   }
   if(n==0 || n==1)
   {
     return 1;
   }

    return n*fact(n-1);

}
public static void main(String[]args)
{
	int n=5,factorial;
    rec1 ob=new rec1();
    ob.fact(5);
    factorial=fact(5);
    System.out.println("factorail of "+n+" = "+factorial);
}
}