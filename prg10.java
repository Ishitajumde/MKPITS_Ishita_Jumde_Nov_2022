class one
{
int tab,i,tab2;
  void table()
  {
     for(i=0;i<=10;i++)
     {
        tab=2*i;
        System.out.println("2 to the power"+i +"= "+tab );
     }
  }
  void table2()
  {
     for(i=-1;i<=-10;i++)
          {
             tab2=2*(i);
             System.out.println("2 to the power"+i +"= "+tab2 );
     }
}
}

class prg10{
  public static void main(String[]args)
  {
  one ob= new one();
  ob.table();
  ob.table2();
  }
}