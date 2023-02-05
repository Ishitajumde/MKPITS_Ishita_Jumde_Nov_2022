/*26. Write a program in C to read any Month Number in integer and display Month name in the word. */

import java.util.Scanner;

class prg26_1feb
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

	       System.out.println("JANUVARY");
	       break;
	case 2:

	       System.out.println("FEBRUVARY");
	       break;
	case 3:
		   System.out.println("MARCH");
	       break;
	case 4:

	       System.out.println("APRIL");
	       break;
	case 5:

	       System.out.println("MAY");
	       break;
	case 6:

	       System.out.println("JUNE");
	       break;
	case 7:

	      System.out.println("JULLY");
	       break;
	case 8:

	       System.out.println("AUGUST");
	       break;
	case 9:

	       System.out.println("SEPTEMBER");
	       break;
	case 10:

	       System.out.println("OCTOBER");
	       break;
	case 11:

	       System.out.println("NOVEMBER");
	       break;
	case 12:

	       System.out.println("DECEMBER");
	       break;
	default:
	       System.out.println("Invalid day number."+"Please try again ...");
	       break;
      }
   }
}