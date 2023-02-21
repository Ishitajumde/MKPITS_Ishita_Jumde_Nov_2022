import java.util.Scanner;
class prg3{
   public static void main(String[]args)
   {
      Scanner val=new Scanner(System.in);
      System.out.println("enter the value in integer of p,q,r,s");
      int p=val.nextInt();
      int q=val.nextInt();
      int r=val.nextInt();
      int s=val.nextInt();
      int s1=p+q;
           System.out.println("s1= "+s1);
      int s2=r+s;
           System.out.println("s2= "+s2);
      if(r>0 && s>0 && p%2==0)
      {
        if(q>r && s>p && s2>s1)
        {
			System.out.println("Coreect Value");
		}
		else{
			    System.out.println("Wrong Value");
			}
      }
   }
}