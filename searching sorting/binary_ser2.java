import java.util.Scanner;
class binary_ser2{
	int a[]={3,5,9,10,24,65,43};
	       Scanner val =new Scanner(System.in);
	       System.out.println("enter your search number");
	       int serchno=val.nextInt();
	       int start=0;
	       int end=a.length-1;
       int mid=0;

      int binary(int n)
    {
    for(int i=0;i<a.length;i++){
            mid=(start+end)/2;

         if(serchno==a[mid])
         {
            System.out.println("it is found");
            return 0;


         }
         else if(serchno>a[mid])
         {
             start=mid+1;
         }
         else if(serchno<a[mid])
         {
              end=mid-1;
         }
     else {
         System.out.println("not found");
     }
   }
   return 0;
}
   public static void main(String[]args)
   {

    binary_ser2 ob=new binary_ser2();
    ob.binary();
}
}