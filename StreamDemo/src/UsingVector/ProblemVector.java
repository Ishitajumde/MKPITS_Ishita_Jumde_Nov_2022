package UsingVector;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class ProblemVector {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0));
        Scanner sc=new Scanner(System.in);
        int value;
        for(int counter=0;counter<10;counter++){
            System.out.println("Enter a number");
            value=sc.nextInt();
            vector.set(value%10,value);
        }
        Vector<Integer> vector1=new Vector<>();

        for(int count=0;count<vector.size();count++)
        {
            if (vector.elementAt(count)!=0){
                vector1.add(vector.elementAt(count));
            }
        }
        System.out.println(vector1);

    }
}
