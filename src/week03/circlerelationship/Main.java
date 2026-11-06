package week03.circlerelationship;

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter circle1's center x: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter circle1's center y: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter radius circle1 r1: ");
        double r1 = sc.nextDouble();
        System.out.println("Enter circle2's center x: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter circle2's center y: ");
        double y2 = sc.nextDouble();
        System.out.println("Enter radius circle1 r2: ");
        double r2 = sc.nextDouble();

        double distance = Math.sqrt((Math.pow((x2-x1),2)) + Math.pow((y2-y1),2));
        double sum = r1+r2;
        double diff = Math.abs(r2-r1);

        if(distance < diff ){
            System.out.println("one circle is inside the other ");
        }else if(distance <= sum && distance >= diff){
            System.out.println("Overlaps");

        }else if(distance > sum){
            System.out.println("Separate");
        }
    }
}
