class BankAccount{
double bal;

void deposit()
{

}
}
class checkingacc extends BankAccount
{

   void deposit()
   {
       bal=5000;
       System.out.println("checking account bal "+bal);
   }



}
class savingacc extends BankAccount
{

   void deposit()
   {
       System.out.println("it is my saving account");
   }
}
class c15{
public static void main(String[]args)
{
    checkingacc ob=new checkingacc();
    ob.deposit();
    savingacc ob1=new savingacc();
    ob1.deposit();

    }
}
