class prg1_25jan{
 public static void main(String[]args)
 {
     int a[]={2,3,4,};
     int b[]={5,6,7};
     int sum1,sum2;
     sum1=(a[0]+a[1]+a[2]);
     System.out.println("The addition of 1st array= "+sum1);
     sum2= (b[0]+b[1]+b[2]);
     System.out.println("The addition of 2nd array= "+sum2);
     if(sum1>sum2)
     {
        System.out.println("The sum1 is greater= " + sum1);
        }
      else{
          System.out.println("The sum2 is greater= " +sum2);
      }

 }
}