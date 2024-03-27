import java.sql.SQLOutput;
import java.util.Scanner;

public class bai21_vidugiaiphuongtrinhbac2 {
    public static void main(String[] args) {
        /* Viết phương trình bậc 2 dùng hàm:
        1. Tìm nghiệm của phương trình bậc 2 với: a = 1, b = 2, c = 3
        2. Tìm nghiệm của phương trình bậc 2 với: a = 1, b = 2, c = 1
        3. Tìm nghiệm của phương trình bậc 2 với: a = 1, b = 2, c = -3
        */
        String kq = giaiPhuongTrinhBac2(1, 2, 3);
        String kq1 = giaiPhuongTrinhBac2(1, 2, 1);
        String kq2 = giaiPhuongTrinhBac2(1, 2, -3);
        System.out.println(kq);
        System.out.println(kq1);
        System.out.println(kq2);

        //nâng cao: Cho người dùng nhập vào a, b, c
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số a: ");
        double a = sc.nextDouble();
        System.out.print("Mời nhập vào số b: ");
        double b = sc.nextDouble();
        System.out.print("Mời nhập vào số c: ");
        double c = sc.nextDouble();
        String kq4 = giaiPhuongTrinhBac2(a, b, c);
        System.out.println(kq4);
    }

    //hàm giải phương trình bậc hai
    public static String giaiPhuongTrinhBac2(double a, double b, double c) {
        //nếu a = 0 thì phương trình trở thành phương trình bậc nhất bx + c = 0
        if (a == 0) {
            if (b == 0 && c == 0) {
                return "Phương trình bậc nhất vô số nghiệm";
            } else if (b == 0 && c != 0) {
                return "Phương trình bậc nhất vô nghiệm";
            } else {
                return "Phương trình bậc nhất có nghiệm: " + (-c / b);
            }
        } else {
            //giải phương trình bậc 2
            double delta = Math.pow(b, 2) - (4 * a * c);
            if (delta < 0) {
                return "Phương trình bậc 2 vô nghiệm";
            } else if (delta == 0) {
                double x = -b / (2 * a);
                return "Phương trình bậc 2 có nghiệm kép x = " + x;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "Phương trình bậc 2 có hai nghiệm phân biệt x1 = " + x1 + " ; x2 = " + x2;
            }
        }
    }
}
