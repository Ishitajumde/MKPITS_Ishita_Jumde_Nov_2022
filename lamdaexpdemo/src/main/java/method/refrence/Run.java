package method.refrence;

public class Run {
    public static void main(String[] args) {
        //using method refrence implementetion of functional interface for static method of class
//        Shape s = MyClass::display;
//        s.disp();

        //using method refrence implementetion of functional interface for non-static method of class
//        MyClassNonStatic myClassNonStatic =new MyClassNonStatic();
//        Shape s= myClassNonStatic::mssg;
//        s.disp();

        //inbuilt interface using non-static method of MyClassNonStatic
        MyClassNonStatic myClassNonStatic =new MyClassNonStatic();
        Runnable runnable =myClassNonStatic::mssg;
        Thread t=new Thread(runnable);
        t.start();
    }
}
