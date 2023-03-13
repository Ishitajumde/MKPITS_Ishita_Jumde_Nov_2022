class rec5{

public static int fibonacci(int n) {
 if (n < 0) {
 return -1;
 }
 if (n == 0 || n == 1) {
 return n;
 }
  int fib= fibonacci(n-1) + fibonacci(n-2);
   System.out.println(fib);
   return fib;
 }

 public static void main(String[]args)
 {
   rec5 ob = new rec5();
   ob.fibonacci(4);
   //int series=fibonacci(4);
   //System.out.println(series);
 }
}