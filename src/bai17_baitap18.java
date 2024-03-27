import java.util.Scanner;

public class bai17_baitap18 {
    public static void main(String[] args) {
        /* Viết chương trình nhập số nguyên a > 0 từ bàn phím
        Cho biết đó có phải số nguyên tố (số nguyên tố là số > 1, và chỉ chia hết cho 1 và chính nó)
        Kết thúc chương trình hỏi người dùng: Bạn có muốn tiếp tục sử dụng phần mềm không? Nếu chọn không thì thoát chương trình
        */

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Mời nhập vào số a: ");
            int a = sc.nextInt();

            //check điều kiện đảm bảo người dùng nhập số nguyên a > 0
            while (a <= 0) {
                System.out.print("Nhập lại a, a phải > 0: ");
                a = sc.nextInt();
            }
            System.out.println("Bạn đã nhập a thành công a = " + a);

            //kiểm tra số nguyên tố (số nguyên tố là số chỉ có 2 ước là 1 và chính nó)
            int demUoc = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    demUoc++;
                }
            }
            if (demUoc == 2) {
                System.out.println(a + " là số nguyên tố");
            } else {
                System.out.println(a + " không phải là số nguyên tố");
            }
            System.out.println("Bạn có muốn thoát không, bấm y để thoát");
            String traLoi = new Scanner(System.in).nextLine();
            if (traLoi.equals("y") || traLoi.equals("Y")) {
                break;
            }
        }
    }
}