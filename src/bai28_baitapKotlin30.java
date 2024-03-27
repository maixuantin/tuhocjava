import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai28_baitapKotlin30 {
    public static void main(String[] args) {
        /* Viết chương trình trả lời kết quả các phép tính
    quest = {"2 + 5 + 7 =","5 * 10 = ","sqrt(16) = ","12 % 2 = "}
    * */
        Scanner sc = new Scanner(System.in);
        //khai báo list đề bài cho
        ArrayList<String> quest = new ArrayList<>(List.of("2 + 5 + 7 =", "5 * 10 = ", "sqrt(16) = ", "12 % 2 = "));
        // List đáp án
        ArrayList<Float> traLoi = new ArrayList<>(List.of(14f, 50f, 4f, 0f));
        //duyệt list câu hỏi:
        for (int i = 0; i < quest.size(); i++) {
            System.out.println(quest.get(i));
            //nhập kết quả
            System.out.println("Nhập kết quả: ");
            Float kq = sc.nextFloat();
            //kiểm tra với đáp án
            if (kq.equals(traLoi.get(i))) {
                System.out.println("Đúng cmnr");
            } else {
                System.out.println("Sai rồi bạn ei, đáp án là: " + traLoi.get(i));
            }
        }
    }
}
