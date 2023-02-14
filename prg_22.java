import java.util.Scanner;
class prg_22{
   public static void main(String[]args)
   {
      double total=0;
      Scanner val=new Scanner(System.in);
      System.out.println("Enter Customer ID");
      int id=val.nextInt();
      System.out.println("Enter the Name");
      String name=val.next();
      System.out.println("Enter the unit consumed by user");
      int unit=val.nextInt();
      if(unit<199)
      {
		  total=unit*1.20;
		 System.out.println("total unit consumed:"+total);
	  }
	  else if(unit>=200 && unit<400)
	  {
		 total=unit*1.50;
		 System.out.println("total unit consumed:"+total);
	  }
	  else if(unit>=400 && unit<600)
	  	  {
	  		 total=unit*1.80;
	  		 System.out.println("total unit consumed:"+total);
	  	  }
	  else if(unit>=600 )
	  	  {
	  		  total=unit*2;
	  		 System.out.println("total unit consumed:"+total);
	  	  }

       if(total>=400)
       {
		   double bill=total+60;
		   System.out.println("The Electricity Bill of Customer is "+bill);
		}
            else
            {
			   System.out.println("The Electricity Bill of Customer is "+total);
			}

   }
}