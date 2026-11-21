//Implement a method exchangeMinFrom(int[] numbers, int from) that exchanges the value at
//position 'from' with the smallest value in the sub-array starting from index 'from' through the end.
//Return the updated array.
//RMIT Classification: TrustedHint: Call getIndexMinFrom() to find the target index, then swap the two values.
//Examples:
//exchangeMinFrom([4, 1, 3, 5], 0) --> returns [1, 4, 3, 5]
//exchangeMinFrom([1, 4, 3, 5], 1) --> returns [1, 3, 4, 5]
package week04.exchangeminfrom;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = sc.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++){
            System.out.println("Enter number [" +i+ "]"+ ":");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter from: ");
        int from = sc.nextInt();
        if(from <0 || from >= numbers.length){
            System.out.println("Invalid");
        }else {
            System.out.println("Array: "+ Arrays.toString(numbers));
            int [] result = exchangeMinFrom(numbers, from);
            System.out.println("Updated array: "+ Arrays.toString(result));
        }
    }

    public static int getIndexMinFrom (int[] numbers, int from){
        int indexMin = from;
        for(int i = from +1; i < numbers.length ; i++){
            if (numbers[i] < numbers[indexMin]){
                indexMin = i;
            }
        }
        return indexMin;
    }
    public static int[] exchangeMinFrom(int[] numbers, int from) {
        int indexMin = getIndexMinFrom(numbers, from);
        int temp = numbers[from];
        numbers[from] = numbers[indexMin];
        numbers[indexMin] = temp;
        return numbers;

    }
}
