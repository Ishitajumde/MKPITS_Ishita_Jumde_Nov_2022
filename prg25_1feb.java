/* 25.	Write a program in C to read any digit, display in the word.*/

import java.util.Scanner;


 class prg25_1feb
   {
     public static void main(String[]args)
   {
     int digno;
     Scanner val=new Scanner(System.in);
     System.out.println("enter the num to print day");
     digno=val.nextInt();
   switch(digno)
   {
	case 0:
	       System.out.println("zero");
	       break;
	case 1:
	       System.out.println("One");
	       break;
	case 2:
	       System.out.println("Two");
	       break;
	case 3:
	       System.out.println("Three");
	       break;
	case 4:
	       System.out.println("Four");
	       break;
	case 5:
	       System.out.println("Five");
	       break;
	case 6:
	      System.out.println("Six");
	       break;
        case 7:
	      System.out.println("Seven");
	       break;
        case 8:
	       System.out.println("Eight");
	       break;
        case 9:
	       System.out.println("Nine");
	       break;
	default:
	       System.out.println("Invalid day number."+"Please try again ...");
	       break;
      }
   }
}