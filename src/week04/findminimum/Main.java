//Implement a method getIndexMinFrom(int[] numbers, int from) that returns the index of the
//smallest value in the sub-array starting from index 'from' to the end. If there are multiple smallest
//values, return the index of any of them.
//Examples:
//getIndexMinFrom([4, 1, 3, 5], 2) --> returns 2 (index of 3)
//getIndexMinFrom([4, 4, 9, 7], 1) --> returns 1 (index of second 4)
package week04.findminimum;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = sc.nextInt();
        int [] numbers = new int[N];
        for (int i =0; i<N;i++){
            System.out.println("Enter number["+ i +"]: ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter from: ");
        int from = sc.nextInt();

        if (from <0 || from >= numbers.length){
            System.out.println("Invalid from index");
        }else{
            int minIndex = getIndexFrom (numbers, from);
            System.out.println("Array: "+ Arrays.toString(numbers));
            System.out.println("Min index: " + minIndex);
            System.out.println("Min value index: "+ numbers[minIndex]);
        }
        sc.close();
    }
    public static int getIndexFrom (int [] numbers, int from){
        int minIndex = from;
        for (int i = from +1; i < numbers.length; i++){
            if (numbers[i] < numbers[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
}
