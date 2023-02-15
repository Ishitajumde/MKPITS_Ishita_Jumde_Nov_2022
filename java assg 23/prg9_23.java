import java.util.Scanner;
class one{
  int a,b,res1,res2;
  int max,min;
    void set1(){
    Scanner val = new Scanner(System.in);
    System.out.println("Enter two integers");
     a=val.nextInt();
     b=val.nextInt();
     }
// to check greater one
     void set2(){
     if(a>b ){
		 max=a;
       System.out.println("a is greater");

       }
       else{
            max=b;
            System.out.println("b is greater");

            }
     }
// to check min and return min if reminder is equal
     int set3(){
      if(a<b ){
		       min=a;
            System.out.println("a is smaller");

            }
            else{
				   min=b;
                 System.out.println("b is smaller");
			 }

            res1=a%5;
            res2=b%5;
       if(res1==res2){
               System.out.println(" reminder is equal");
       }
           return min;
       }
// two integer is equal return 0
       int set4(){
           if(a==b)
           {
			   }
           return 0;
       }
 }

       class prg9_23
       {
     public static void main(String[]args)
 {
   one ob = new one();
   ob.set1();
   ob.set2();
   ob.set3();
   ob.set4();

 }
  }