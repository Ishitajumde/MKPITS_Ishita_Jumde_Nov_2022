 import java.util.Scanner;
 class prg24_1feb
   {
     public static void main(String[]args)
   {
     int dayno;
     Scanner val=new Scanner(System.in);
     System.out.println("enter the num to print day");
     dayno=val.nextInt();
   switch(dayno)
   {
	case 1:
	       System.out.println("Monday");
	       break;
	case 2:
	       System.out.println("Tuesday");
	       break;
	case 3:
	       System.out.println("Wednesday");
	       break;
	case 4:
	       System.out.println("Thursday");
	       break;
	case 5:
	       System.out.println("Friday");
	       break;
	case 6:
	       System.out.println("Saturday");
	       break;
	case 7:
	      System.out.println("Sunday");
	       break;
	default:
	       System.out.println("Invalid day number."+"Please try again ...");
	       break;
      }
   }
}