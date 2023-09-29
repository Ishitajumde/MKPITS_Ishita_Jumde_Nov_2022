import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List <Integer> l1 = Arrays.asList(2,80,10,15,40,21,7);
//        //filter method of Stream
//       int prg= l1.stream().filter(x->x%2!=0).map(d->d*2).reduce(0, Integer::sum);
//       System.out.println(prg);
////        //sorted method of Stream
////        l1.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
////
////        //Map method of Stream
////        l1.stream().map(x->x*x).forEach(System.out::println);
//        List<String> names=Arrays.asList("Ishita","Ankita","Vrukshu","shub");
//             Map<Integer,Long> count=names.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
//             count.forEach((key,value)->System.out.println(count));

        /////////////////////////////////////////////////////////
//        List<Student> students=new ArrayList<Student>();
//        Student []stud=new Student[3];
//        stud[0]=new Student("Ishita",23);
//        stud[1]=new Student("Ankita",28);
//        stud[2]=new Student("Pavan",22);
//        students.addAll(Arrays.asList(stud));
//        Student min=students.stream().min(Comparator.comparing(Student::getAge)).get();
//        System.out.println(min);
//        Student max=students.stream().max(Comparator.comparing(Student::getAge)).get();
//        System.out.println(max);
    ////////////////////////////Using custom predicate/////////////////////////////////////////
        List<Integer> num=Arrays.asList(54,67,12,3,5,10,12);
        Predicate<Integer> predicate=number->number>10;
        List<Integer> numberGreater=num.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(numberGreater);
    ///////////////Flat map////////////////////////////////////////////////////////////////////
        List<Integer> primeNo=Arrays.asList(1,3,5,7,11);
        List<Integer> evenNo=Arrays.asList(2,4,10);
        List<Integer> oddNo=Arrays.asList(1,9,15,7,21);
        List<List<Integer>> noOfList=Arrays.asList(primeNo,evenNo,oddNo);
        List<Integer> allNumbers=noOfList.stream().flatMap(x->x.stream()).reduce(Integer::sum).stream().collect(Collectors.toList());
        System.out.println(allNumbers);
    }
}