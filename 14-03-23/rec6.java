class rec6{
int decno(int n)
{
  int bin=0;
if (n==0)
{
  return 0;
}
bin=n%2+10*decno(n/2);
System.out.println(bin);
return bin;
}
public static void main(String[]args)
{
   rec6 ob=new rec6();
   ob.decno(10);
}
}