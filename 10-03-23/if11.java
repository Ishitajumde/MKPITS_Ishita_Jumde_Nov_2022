interface bankaccount
{
   void getbalance();

   void deposite();

   void withdraw();
}
class checkingacct implements bankaccount
{
     int limit=10000;
      public void getbalance(){
          System.out.println("your balance is 12000");
      }

       public void deposite(){
          System.out.println("your deposit money is 5000");
        }

   public void withdraw(){
       System.out.println("the withdraw limit is "+limit+"per day");
   }
}

class savingacct implements bankaccount
{
	int intrest=2;
    public void getbalance(){
           System.out.println("your saved balance is 1,20000");
           System.out.println("intrest is "+ intrest+" %");
     }

      public void deposite(){
              System.out.println("no deposit");
       }

  public void withdraw(){
        System.out.println("your ammount is 2000");
   }
}


class if11{
public static void main(String[]arggs)
{
    checkingacct o1=new checkingacct();
    o1.getbalance();
    o1.deposite();
    o1.withdraw();
    savingacct o2=new savingacct();
    o2.getbalance();
	o2.deposite();
    o2.withdraw();
}
}