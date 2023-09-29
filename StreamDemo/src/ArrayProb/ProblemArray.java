package ArrayProb;

import java.util.Scanner;

public class ProblemArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("enter the numbers:");
        for(int counter=0;counter<10;counter++){
            arr[counter]=sc.nextInt();
        }
        System.out.println();
    }
}
