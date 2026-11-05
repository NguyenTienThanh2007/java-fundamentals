//Yêu cầu:
//- Nhập hai số dưới dạng String.
//- Dùng Double.parseDouble() chuyển thành double.
//- Tính tổng, hiệu, tích và thương.
//- In kết quả.
//Ví dụ:
//Enter first number: 15.5
//Enter second number: 2.5
//
//Sum: 18.0
//Difference: 13.0
//Product: 38.75
//Division: 6.2
package week02.typeconversion;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        String firstNum = sc.next();
        System.out.println("Enter second number: ");
        String secondNum = sc.next();

        double sum = Double.parseDouble(firstNum) + Double.parseDouble(secondNum);
        double difference = Double.parseDouble(firstNum) - Double.parseDouble(secondNum);
        double product = Double.parseDouble(firstNum) * Double.parseDouble(secondNum);
        double division = Double.parseDouble(firstNum) / Double.parseDouble(secondNum);

        System.out.println("Sum: "+ sum);
        System.out.println("Difference: "+ difference);
        System.out.println("Product: "+ product);
        System.out.println("Division: "+ division);
    }
}
