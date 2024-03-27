import java.util.ArrayList;
import java.util.Scanner;

public class bai28_baitap29 {
    public static void main(String[] args) {
         /* Viết chương trình nhập vào 1 danh sách list có n phần tử, n do người dùng nhập, sau đó:
    #1. Tạo ra 1 list mới bình phương các phần tử
    #2. Xác định bao nhiêu phần tử lớn hơn 50
    * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số phần tử của list: ");
        int n = sc.nextInt();
        //cho người dùng nhập từng phần tử
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Mời nhập vào phần tử thứ: " + (i + 1));
            int soNhap = sc.nextInt();
            list.add(soNhap);
        }
        //in ra danh sách
        System.out.println(list);

        //1. Tạo ra 1 list mới bình phương các phần tử
        ArrayList<Integer> binhPhuong = new ArrayList<>();
        for (int x : list) {
            binhPhuong.add(x * x);
        }
        System.out.println("Danh sách mới là: ");
        System.out.println(binhPhuong);

        //2. Xác định bao nhiêu phần tử lớn hơn 50
        int count = 0;
        for (int x : binhPhuong) {
            if (x > 50) {
                count++;
            }
        }
        //in ra kết quả
        if (count > 0) {
            System.out.println("Số lượng phần tử lớn hơn 50 là: " + count);
        } else {
            System.out.println("Không có phần tử nào trong list lớn hơn 50");
        }
    }
}