class one{
void set1()
{
	int x=5,y=10;
}
void dis1()
{
	System.out.println(x+" "+y);
}
}
class two extends one{
void set2()
{
    final(5,8);
}
void dis1()
{
	System.out.println(x+" "+y);
}
}

class finalone{
  public static void main(String[]args)
  {
     two ob= new two();
     ob.set1();
     ob.dis1();

  }
}
