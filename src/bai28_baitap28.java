import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bai28_baitap28 {
    public static void main(String[] args) {
        /*  Viết chương trình tạo ra 1 list có n phần tử, n nhập từ bàn phím
         * Các phần tử là số ngẫu nhiên từ (1, 100)
         * */
        Scanner sc = new Scanner(System.in);
        //Hỏi người dùng số lượng phần tử cần taạo
        System.out.println("Nhâ vào số lượng phần tử: ");
        int n = sc.nextInt();
        //Tạo một đối tượng Random dể tạo các số ngẫu nhiên
        Random rd = new Random();
        //Tạo một danh sách (kiểu dữ liệu các phần tử là số nguyên)
        ArrayList<Integer> list = new ArrayList<>();
        //Tạo các phần tử ngẫu nhiên và thêm vào danh sách
        for (int i = 0; i < n; i++) {
            int ngauNhien = rd.nextInt(1, 101);
            list.add(ngauNhien);
        }
        //In ra danh sách
        System.out.println(list);
    }
}
