class rec4{

 void recursive(int n) {

 if (n<1) {
 System.out.println("n is less than 1");
 }
 else {
 recursive(n-1);
 System.out.println(n);
 }
}
 public static void main(String[]args)
 {
     rec4 ob=new rec4();
     ob.recursive(4);
 }
}
