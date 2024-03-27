import java.util.Scanner;

public class bai12_baitap10 {
    public static void main(String[] args) {
        /* Viết chương trình nhập vào điêm trunb bình, và kết quả xếp loại của học sinh theo tiêu chuẩn sau
        (dùng toán tử 3 ngôi)
        Giỏi: nếu điểm >= 8 và điểm <= 10
        Khá: nếu điểm < 8 và điểm >= 6.5
        Trung bình: nếu diểm < 6.5 và điểm >= 5
        Yếu: nếu điểm <5
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào điểm trung bình: ");
        double dtb = sc.nextDouble();
        //xử lý lệnh để tính toán
        String traloi = (dtb >= 8 && dtb <= 10) ? "Giỏi" :
                ((dtb < 8 && dtb >= 6.5) ? "Khá" :
                        (dtb < 6.5 && dtb >= 5) ? "Trung Bình" :
                                (dtb < 5) ? "Yếu" : "tào lao");
        System.out.println("Bạn xếp loại " + traloi);


    }
}
