//Write a method that asks the user to enter a number N. Generate N random integers, store them
//in an array of size N (where each element is in the inclusive range 0 to N), and return the array to
//the caller. (Assume user input is valid).
package week04.randomarray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] result = generateArray(sc);
        System.out.println("Generate Array: "+ Arrays.toString(result));
        sc.close();
    }
    public static int[] generateArray (Scanner sc){
        System.out.println("Enter N: ");
        int N = sc.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i<N; i++){
            numbers[i] = (int) (Math.random() * (N+1));
        }
        return numbers;
    }
}