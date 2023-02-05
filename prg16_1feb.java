import java.util.Scanner;
class prg16_1feb{
public static void main(String[]args)
{
   int temp;
   Scanner val =new Scanner(System.in);
   System.out.println("Enter the temprature to know about weather");
   temp=val.nextInt();
   if(temp<0)
   {
      System.out.println("Freezing Weather");
   }
       else if(temp>0 && temp<10)
	       {
	           System.out.println("Very Cold Weather");
               }
                  else if(temp>=10 && temp<=20)
		       {
		           System.out.println("Cold Weather");
                       }
                           else if(temp>20 && temp<30)
			      {
			           System.out.println("Normal in temp");
                              }
                                    else if(temp>30 && temp<40)
				         {
				   		 System.out.println("Hot Weather");
                                          }
                                                else if(temp>=40)
					               {
					       			 System.out.println("Very Hot Weather");
                                                        }
        }
   }
