class prg2_25jan{
 public static void main(String[]args)
 {
     int a1[]={2,3,4,5};
     int x,y;
     if(a1.length%2==0)
     {
		System.out.println("The aray is even ="+a1.length);
		x=a1[a1.length/2-1];
		System.out.println("The middle no is "+x);
        y=a1[a1.length/2];
        System.out.println("The middle no is "+y);
        System.out.println("the middle term of array is: "+x+" "+y);
     }
     else{
		     System.out.println("The length is not even");
		 }
}
}