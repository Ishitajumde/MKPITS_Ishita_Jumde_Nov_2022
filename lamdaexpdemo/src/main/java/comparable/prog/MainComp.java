package comparable.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainComp {
    public static void main(String[] args) {
        ArrayList <Movie> list=new ArrayList<Movie>();
        Movie [] mov=new Movie[3];
        mov[0]=new Movie("Jawan",8);
        mov[1]=new Movie("Farzi",4);
        mov[2]=new Movie("Mission Mangal",7);
        list.addAll(Arrays.asList(mov));
        Collections.sort(list);
        System.out.println("List of Movies");
        for (Movie mv:list) {
            System.out.println(mv);
        }
    }
}

