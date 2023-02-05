/*27.Write a program in C to read any Month Number in integer and display the number of days for this month.*/

import java.util.Scanner;

class prg27_1feb
   {
     public static void main(String[]args)
   {
     int mnthno;
     Scanner val=new Scanner(System.in);
     System.out.println("enter the num to print day");
     mnthno=val.nextInt();
   switch(mnthno)
   {
	case 1:
	       System.out.println("01");
	       System.out.println("JANUVARY");
	       break;
	case 2:
	 	   System.out.println("02");
	       System.out.println("FEBRUVARY");
	       break;
	case 3:
		   System.out.println("03");
	       System.out.println("MARCH");
	       break;
	case 4:
		   System.out.println("04");
	       System.out.println("APRIL");
	       break;
	case 5:
		   System.out.println("05");
	       System.out.println("MAY");
	       break;
	case 6:
		   System.out.println("06");
	       System.out.println("JUNE");
	       break;
	case 7:
		   System.out.println("07");
	      System.out.println("JULLY");
	       break;
	case 8:
		   System.out.println("08");
	       System.out.println("AUGUST");
	       break;
	case 9:
		   System.out.println("09");
	       System.out.println("SEPTEMBER");
	       break;
	case 10:
		    System.out.println("10");
	       System.out.println("OCTOBER");
	       break;
	case 11:
		   System.out.println("11");
	       System.out.println("NOVEMBER");
	       break;
	case 12:
	       System.out.println("12");
	       System.out.println("DECEMBER");
	       break;
	default:
	       System.out.println("Invalid day number."+"Please try again ...");
	       break;
      }
   }
}