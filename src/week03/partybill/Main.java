//Ní và hai người bạn tổ chức một buổi party. Tổng số tiền phải trả là S.
//
//Chia tiền cho 3 người sao cho:
//1. Tổng số tiền cả 3 người trả phải chính xác bằng S.
//2. Chênh lệch lớn nhất giữa số tiền mỗi người trả không vượt quá 0.01.
//3. Nếu chia không hết, ní sẽ trả ít hơn bạn bè.
//Ví dụ từ tài liệu RMIT
//Tổng tiền S	Người 1 (ní)	Người 2	Người 3
//3.30	        1.10	        1.10	1.10
//10.00	        3.33	        3.33	3.34
//2.00	        0.66	        0.67	0.67
//
//Yêu cầu lập trình
//- Nhập tổng tiền S.
//- Tính số tiền mỗi người phải trả.
//- In ra số tiền của từng người với đúng 2 chữ số thập phân.
//- Đảm bảo tổng tiền không bị thiếu hoặc thừa do chia số thực.
package week03.partybill;

import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total money S: ");
        double S = sc.nextDouble();

        int totalCents = (int) S *100;
        int base = totalCents/3;
        int remainder = totalCents %3;

        int firstCents = base;
        int secondCents = base;
        int thirdCents = base;

        if (remainder ==1){
            thirdCents++;
        }else if (remainder ==2){
            secondCents++;
            thirdCents ++;

        }

        double firstPerson = (double) firstCents / 100;
        double secondPerson = (double) secondCents /100;
        double thirdPerson = (double) thirdCents/100;

        System.out.printf("First person: %.2f%n", firstPerson);
        System.out.printf("Second person: %.2f%n", secondPerson);
        System.out.printf("Third person: %.2f%n", thirdPerson);

    }
}