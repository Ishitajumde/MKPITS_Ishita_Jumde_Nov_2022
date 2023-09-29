package comparator.proj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CompRun {
    public static void main(String[] args) {
        ArrayList<Movie> list=new ArrayList<Movie>();
        Movie []mov=new Movie[4];
        mov[0]=new Movie("Kali",5);
        mov[1]=new Movie("Besharam",7);
        mov[2]=new Movie("Bheeshma",8);
        mov[3]=new Movie("Joker",2);
        list.addAll(Arrays.asList(mov));
        //implementing anonymous class
//        Collections.sort(list, new Comparator<Movie>() {
//            @Override
//            public int compare(Movie o1, Movie o2) {
//                return o1.getMovieName().compareTo(o2.getMovieName());
//            }
//
//
//        });
//        System.out.println(list);

        //implementing lamda expression
        Comparator<Movie> comparator;
        Collections.sort(list,comparator=(Movie m1,Movie m2)->{

            return m1.getRating()-m2.getRating();

        });

        System.out.println(list);

    }
}
