//Input:
//- Product name (String).
//- Unit price (double).
//- Quantity (int).
//- Discount percentage (double).
//Yêu cầu:
//1. Nhập tên sản phẩm.
//2. Nhập đơn giá và số lượng.
//3. Nhập phần trăm giảm giá.
//4. Tính subtotal.
//5. Tính discount amount.
//6. Tính final total.
//7. In hóa đơn với giá tiền có đúng 2 chữ số thập phân.
//Ví dụ:
//Enter product name: Keyboard
//Enter unit price: 125.50
//Enter quantity: 2
//Enter discount (%): 10
//
//========== RECEIPT ==========
//Product: Keyboard
//Unit price: 125.50
//Quantity: 2
//Subtotal: 251.00
//Discount: 25.10
//Final total: 225.90
//=============================
package week02.shoppingbill;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String productName = sc.next();
        System.out.println("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Enter discount percentage: ");
        double disPer = sc.nextDouble();

        System.out.println("========== RECEIPT ==========");
        double subtotal = unitPrice * (double) quantity;
        double finalTotal = subtotal - (subtotal * disPer/100);
        double discount = subtotal - finalTotal;

        System.out.println("Product: "+ productName);
        System.out.printf("Unit price: %.2f%n", unitPrice);
        System.out.println("Quantity: "+ quantity);
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("Final total: %.2f%n", finalTotal);
        System.out.println("=============================");



    }
}
