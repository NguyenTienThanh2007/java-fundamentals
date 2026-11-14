package week04.hollowsquarepattern;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        for (int i = 0; i<N; i++){
            for (int j =0; j<N; j++){
                if(i ==0 || i == N-1 || j==0 || j == N-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}