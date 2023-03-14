class rec7{
int sum(int n)
{
   if(n==0)
   {
     return 0;
   }
int res=n%10+sum(n/10);
System.out.println(res);
return res;
}
public static void main(String[]args)
{
   rec7 ob=new rec7();
   ob.sum(4568);
}
}