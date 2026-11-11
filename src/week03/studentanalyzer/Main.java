package week03.studentanalyzer;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println("Enter total of students: ");
        int n = sc.nextInt();
        while (n <=0){
            System.out.println("Invalid number. Enter again: ");
            n = sc.nextInt();
        }
        //InputScore
        ArrayList<Double> numbers = inputScore(n);
        //Calculate
        double result = calculateAverage(numbers);
        double result2 = findHighest(numbers);
        double result3 = findLowest(numbers);
        int result4 = countPassed(numbers);
        int failed = n - result4;
        String result5 = getPerformance(result);
        //Report
        printReport(result, result2,result3,result4,failed, result5);


    }
    public static ArrayList<Double> inputScore(int n ){
        ArrayList<Double> numbers = new ArrayList<>();

        for (int i = 0; i<n; i++){
            System.out.println("Enter score for student "+(i+1)+":");
            double score = sc.nextDouble();
            while (score<0 || score >100){
                System.out.println("Invalid score.Enter again: ");
                score = sc.nextDouble();
            }
            numbers.add(score);
        }
        return numbers;
    }
    public static double calculateAverage(ArrayList<Double>numbers){
        double sum = 0;
        for (double score: numbers){
            sum+= score;
        }
        return sum/numbers.size();
    }
    public static double findHighest(ArrayList<Double> numbers){
        double highestScore = numbers.get(0);
        for (double score: numbers){
            if (highestScore < score){
                highestScore = score;
            }
        }
        return highestScore;
    }
    public static double findLowest(ArrayList<Double> numbers){
        double lowestScore = numbers.get(0);
        for (double score: numbers){
            if (lowestScore > score){
                lowestScore = score;
            }
        }
        return lowestScore;

    }
    public static int countPassed (ArrayList<Double> numbers){
        int count = 0;
        for (double score :numbers){
            if (score >= 50) {
                count++;
            }
        }
        return count;
    }
    public static String getPerformance(double result){
        if (result >= 85) {
            return "Excellent";
        } else if (result >= 70) {
            return "Good";
        } else if (result >= 50) {
            return "Average";
        } else {
            return "Poor";
        }
    }
    public static void printReport(double average,
                                   double highest,
                                   double lowest,
                                   int passed,
                                   int failed,
                                   String performance){
        System.out.println("========== CLASS REPORT ==========");
        System.out.printf("Average score: %.2f%n", average);
        System.out.printf("Highest score: %.2f%n", highest);
        System.out.printf("Lowest score: %.2f%n", lowest);
        System.out.println("Passed student: "+ passed);
        System.out.println("Class performance: "+performance);
        System.out.println("==================================");

    }


}


