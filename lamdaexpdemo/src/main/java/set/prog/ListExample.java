package set.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ListExample {
    public static void main(String[] args) {
        //to Create a list
//        List list=new ArrayList(Arrays.asList(23,25,40));
//        System.out.println(list);
        List birds=List.of("sparrow","woodpeaker","ostritch");
        //to create a list
          List<String> names=Arrays.asList("Ankita","Ishani","Amruta","Deepika");
        //using consumer interface
           Consumer <List<String>> nameStartsWithA=(a)->{
                   for(int i=0;i< names.size();i++){
                       a.set(i, a.get(i).toUpperCase());
                   }

           };

        Consumer<List<String>> printConsumer= (x)->x.stream().forEach(System.out::println);
        nameStartsWithA.andThen(printConsumer).accept(names);


        //supplier interface




    }


}
