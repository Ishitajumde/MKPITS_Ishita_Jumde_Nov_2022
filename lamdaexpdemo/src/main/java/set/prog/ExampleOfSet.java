package set.prog;

import java.util.HashSet;

public class ExampleOfSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("ishita");
        set.add("Ankita");
        HashSet<String> set1=new HashSet<>();
        set1.add("pranay");
        set1.add("pavan");
        set1.add("ishita");
           //union return all
//        set.addAll(set1);
//        System.out.println(set);

           //duplicate return
//        set.retainAll(set1);
//        System.out.println(set);

           //duplicate not allowed and remove element of second
          set.removeAll(set1);
        System.out.println(set);
    }
}
