import java.util.Scanner;

public class bai17_baitap13 {
    public static void main(String[] args) {
        /* Viết chương trình nhập số a từ bàn phím:
        - Nếu a chẵn thì tính tổng các số chẵn từ 0 đến a
        - Nếu a lẻ thì in ra dòng chữ "Tui không tính tổng số lẻ, bye bye" và thoát chương trình
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số a: ");
        int a = sc.nextInt();
        int tong = 0;
        if (a % 2 == 0) {
            for (int i = 0; i <= a; i += 2) {
                tong += i;
            }
            System.out.println("Tổng các số chẵn từ 0 đến " + a + " = " + tong);
        } else {
            System.out.println("Tui không tính tổng số lẻ, bye bye");
        }
    }
}
