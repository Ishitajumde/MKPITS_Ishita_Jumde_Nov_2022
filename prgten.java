import java.util.Scanner;
class one{
int temp1,temp2;
   void set()
   {
     Scanner key= new Scanner(System.in);
     System.out.println("enter the value of temp1 and temp2 ");
     temp1= key.nextInt();
     temp2=key.nextInt();
  }

    void con()
    {
    if (temp1<0)
    {
       System.out.println("Temprature1 is less than 0");
    }
    else
    {
		System.out.println("Temprature is out of range");
	}

     if(temp2>100 )
     {
       System.out.println("temprature2 is greater than 100");
     }
     else
	     {
	 		System.out.println("Temprature is out of range");
	}
   }
}

class prgten{
   public static void main(String[]args)
   {
      one ob= new one();
      ob.set();
      ob.con();
   }
}