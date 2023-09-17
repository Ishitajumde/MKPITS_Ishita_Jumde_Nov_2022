import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List <Integer> l1 = Arrays.asList(2,80,10,15,40,21,7);
        //filter method of Stream
        int maxNum=l1.stream().filter(x->x%2==0).reduce(0, Integer::sum);
        System.out.println(maxNum);
        //sorted method of Stream
        l1.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        //Map method of Stream
        l1.stream().map(x->x*x).forEach(System.out::println);
    }
}