import java.util.Scanner;

public class bai1_baitap08 {
    public static void main(String[] args) {
        /* Viết chương trình giải phương trình bậc 2:
        ax^2 + bx + c = 0
        ở đây chỉ viết cho trường hợp a # 0 (a = 0 là trở thành phương trình bậc 1)
        1. Case 1: a = 1, b = 2, c = -3
        Phương trình có 2 nghiệm: x1 = 1.0, x2 = -3.0
        2. Case 2: a = 1, b = 2, c = 3
        Phương trình có nghiệm kép x1 = x2 = -1.0
        3. Case 3: a = 1, b = 1, c = 1
        Phương trình vô nghiệm
        */

        Scanner sc = new Scanner(System.in);
        //nhập vào 3 hệ số a, b, c
        System.out.print("Mời nhập vào hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("Mời nhập vào hệ số b: ");
        double b = sc.nextDouble();
        System.out.print("Mời nhập vào hệ số c: ");
        double c = sc.nextDouble();
        //tính delta
        double delta = Math.pow(b, 2) - (4 * a * c);
        //kiểm tra điều kiện
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
