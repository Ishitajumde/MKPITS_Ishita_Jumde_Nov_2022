class tri
{
  int i,sum=0;
  void set()
  {
    for(i=1;i<30;i++)
    {
		sum=sum+i;
       System.out.println(sum);
    }

  }
}

class triangle
{
  public static void main(String[]args)
  {
     tri ob=new tri();
     ob.set();
  }
}