class pg1{
 public static void main(String[]args){
   int count=0,i;
   for(i=2;i<10;i++)
   {
      if(i%2!=0)
      {
         count++;
      }

   if(count==1 && count==0)
   {
     System.out.println(i+ "it is prime");
   }
   else{
     System.out.println(i+ "it is not prime");
   }
}
 }
}