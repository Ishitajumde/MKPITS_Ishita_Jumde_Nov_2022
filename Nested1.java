class Nested1{
public static void main(String[]args)
{
  int age=10;
  if(age<18)
  {
    System.out.println("You are not eligible");
    System.out.println("Try after your age is 18+");
  }
     else if(age>18)
        {
             System.out.println("You are eligible , Fill the form");
        }
          else if(age<60)
             {
	              System.out.println("You are eligible , Fill the form");
             }
                else
                {
					System.out.println("Your system is cracked");
				}

}
}