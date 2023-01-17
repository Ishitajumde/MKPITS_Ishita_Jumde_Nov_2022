class squ
{
  int i,sum=0;
  void set()
  {
    for(i=1;i<10;i++)
    {
		sum=i*i;
       System.out.println(sum);
    }

  }
}

class Square
{
  public static void main(String[]args)
  {
     squ ob=new squ();
     ob.set();
  }
}