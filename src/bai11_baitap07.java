import java.util.Scanner;

public class bai11_baitap07 {
    public static void main(String[] args) {
        /* Viết chương trình cho người dùng nhập vào 1 tháng bất kì từ 1 - 12 => Cho biết tháng dó có bao nhiều ngày?
        Gợi ý:
        - Tháng 1, 3, 5, 7, 8, 10, 12 có 31 ngày
        - Tháng 4, 6, 9, 11 có 30 ngày
        - Nếu tháng 2 thì yêu cầu nhập thêm năm:
             + nếu năm nhuận thì tháng 2 có 29 ngày
             + nếu năm không nhuận thì tháng 2 có 28 ngày
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào 1 tháng dương lịch: ");
        int thang = sc.nextInt();

        //kiểm tra điều kiên
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            System.out.println("Tháng " + thang + " có 31 ngày");
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("Tháng " + thang + " có 30 ngày");
        } else if (thang == 2) {
            System.out.print("Mời nhập vào năm dương lịch: ");
            int soNam = sc.nextInt();
            if (((soNam % 4 == 0) && (soNam % 100 != 0)) || (soNam % 400 == 0)) {
                System.out.println("Tháng " + thang + " năm " + soNam + " có 29 ngày");
            } else {
                System.out.println("Tháng " + thang + " năm " + soNam + " có 28 ngày");
            }
        } else {
            System.out.println("Bạn nhập tháng tào lao");
        }
    }
}
