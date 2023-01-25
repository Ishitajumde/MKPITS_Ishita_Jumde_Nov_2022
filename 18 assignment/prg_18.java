class one{
int i,sq,cub;

void set()
{
	for(i=0;i<=20;i++)
   {
       sq=i*i;
       System.out.println("The square of "+i +"= "+sq);
   }
}

   void set2()
   {
	   for(i=0;i<=20;i++)
    {
	   cub=i*i*i;
       System.out.println("The cube of "+i +"= "+cub);
	}
}

}

class prg_18{
  public static void main(String[]args)
  {
  one obj =new one();
  obj.set();
  obj.set2();
  }
}