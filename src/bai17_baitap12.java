import java.util.Scanner;

public class bai17_baitap12 {
    public static void main(String[] args) {
        /* Viết chương trình nhập vào số nguyên n, in ra kết quả n! (5! = 1*2*3*4*5)
        - Dùng vòng lặp for
        - Dùng vòng lặp while
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số nguyên n: ");
        int n = sc.nextInt();

        //for
        int giaiThua1 = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua1 *= i;
        }
        System.out.println("Kết quả " + n + "! = " + giaiThua1);

        //while
        int j = n;
        int giaiThua2 = 1;
        while (j > 0) {
            giaiThua2 *= j;
            j--;
        }
        System.out.println("Kết quả " + n + "! = " + giaiThua2);
    }
}
