package treeproblems;

import java.util.Map;
import java.util.TreeMap;

public class TreeDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(1,"Ishita");
        tm.put(2,"Abhay");
        tm.put(3,"Shubhayu");
        tm.put(4,"Shinchan");
        for (Map.Entry<Integer,String> entry: tm.entrySet()){

            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
