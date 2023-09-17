package menudriven.prog.using.lamdaexpression;

import java.util.Scanner;

public class SwitchCall {
    public static void main(String[] args) {
         int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter count=1 for even number");
        System.out.println("Enter count=2 for odd number");
        System.out.println("Enter count=3 for squares number");
        count=sc.nextInt();
         switch (count) {
             case 1://using lamda expression in constructor
                 new PrintEvenNum();
                 break;
             case 2://using lamda expression in main method
                 Number num = () -> {
                     for (int i = 1; i < 10; i++) {
                         if (i % 2 != 0) {
                             System.out.println("odd Number are:" + i);
                         }
                     }
                 };
                 num.takenumber();
                 break;
             case 3://Using Anonymus claa
                 MyClass obj= new MyClass(new Number() {
                     @Override
                     public void takenumber() {
                         int sq;
                         for(int i=1;i<5;i++) {
                             sq = i * i;
                             System.out.println("Square of number:"+ sq);
                         }
                     }
                 });
                 break;
             default:
                 System.out.println("Inavalid case type");
         }

    }
}
