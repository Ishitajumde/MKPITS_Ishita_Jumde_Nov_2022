class one{
  int i,sum=0;
  void set()
  {
     for(i=1;i<500;i++)
     {
        sum=sum+i;
        System.out.println("the sum of no: "+sum);
     }
  }
}

class pg5_18{
  public static void main(String[]args)
  {
  one ob= new one();
  ob.set();
  }
}