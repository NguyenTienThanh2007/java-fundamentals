package week03.studentanalyzer;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        ArrayList<Double> numbers = new ArrayList<>();
        for (int i = 0; i<n; i++){
            System.out.println("Enter score for student "+(i+1)+":");
            double score = sc.nextDouble();
            numbers.add(score);
        }
        System.out.println("========== CLASS REPORT ==========");
        double result = inputScores();
        System.out.println(""+ result);
        double result2 = calculateAverage(numbers);
        System.out.println("Average score: "+ result2);
        double result3 = findHighest(numbers);
        System.out.println("Highest score"+ result3);
        double result4 = findLowest(numbers);
        System.out.println("Lowest score: "+ result4);
        int result5 = countPassed(numbers);
        System.out.println("Passed"+ result5);
        String result6 = getPerformance();
        System.out.println("Class performance: "+ result6);
        System.out.println("==================================");

    }
    public static double inputScores(){


    }
    public static double calculateAverage(ArrayList<Double> numbers){
        double sum = 0;
        for (double score: numbers){
            sum += score;

        }
        return sum/numbers.size();

    }
    public static double findHighest(ArrayList<Double> numbers){
        double highest_num = numbers.get(0);
        for (double score: numbers){
            if(highest_num <score){
                highest_num = score;

            }
        }
        return highest_num;

    }
    public static double findLowest(ArrayList<Double> numbers){
        double lowest_num = numbers.get(0);
        for (double score: numbers){
            if(lowest_num >score){
                lowest_num = score;

            }
        }
        return lowest_num;
    }
    public static int countPassed(ArrayList<Double> numbers){
        int count = 0 ;
        for (double score : numbers){
            if(score <0 || score> 100){
                System.out.println("Invalid");
                count++;
            }else if (score < 50){
                System.out.println("Failed");
            }else {
                System.out.println("Passed");
            }

        }
        return count;
    }
    public static String getPerformance(double average){
        if (average >=85){
            System.out.println("Excellent");


        }else if(){

        }else if (){

        }

    }

}




