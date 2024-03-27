import java.util.Arrays;
import java.util.Scanner;

public class bai27_vidu {
    public static void main(String[] args) {
        /* Viết chương trình tạo một mảng 1 chiều gồm các phần tử là số nguyên có n phần tử,
        n do người dùng nhập từ bàn phím
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số phần tử tối đa của mảng: ");
        int n = sc.nextInt();
        //tạo mảng có n phần tử (cấp phát bộ nhớ cho mảng)
        int[] M = new int[n];
        //nhập dữ liệu cho từng phần tử
        System.out.println("Số phần tử của mảng: " + M.length);
        for (int i = 0; i < M.length; i++) {
            System.out.println("M[" + i + "]= "); // M[0] =
            M[i] = sc.nextInt();
        }
        //xuất mảng để xem
        System.out.println("Mảng M được tạo là: ");
        System.out.println(Arrays.toString(M));
    }
}
