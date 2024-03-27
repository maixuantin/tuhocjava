import java.util.Scanner;

public class bai17_baitap14 {
    public static void main(String[] args) {
        /* Viết chương trình tính tổng các số lẻ từ 1 đến n, n nhập từ bàn phím
        1. Nhập n = 7, bỏ qua cộng tổng với số 3 => in ra kết quả (gợi ý đáp án: 1 + 5 + 7 = 13)
        2. Thử break khi vòng lặp chạy đến giá trị n = 3
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập số từ bàn phím n = ");
        int n = sc.nextInt();
        int tong = 0;
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i += 2) {
                if (i == 3) {
                    continue;
                    //break;
                } else {
                    tong += i;
                }
            }
        }
        System.out.println("Tổng các số lẻ từ 1 đến " + n + " = " + tong);
    }
}
