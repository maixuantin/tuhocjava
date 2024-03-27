import java.util.Scanner;

public class bai11_baitap04 {
    public static void main(String[] args) {
       /* Tìm x, y khi biết tổng và hiệu của chúng
        case test: Tong = 14, hieu = 4 => x = 9, y = 5
        case 2: Tong = 8, hieu = 5 => x = 6.5, y = 1.5
        Gợi ý: x + y = 14 (tổng)
               x - y = 4 (hiệu)
               => 2x = tổng + hiệu => x = (tổng + hiệu)/2
               */

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào tổng 2 số: ");
        float tong = sc.nextFloat();
        System.out.print("Mời nhập vào hiệu 2 số: ");
        float hieu = sc.nextFloat();

        //tính toán
        float x = (tong + hieu) / 2;
        float y = tong - x;

        //xuất kết quả
        System.out.println("Giá trị x cần tìm là: " + x);
        System.out.println("Giá trị y cần tìm là: " + y);
    }
}
