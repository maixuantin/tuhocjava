import java.util.Scanner;

public class bai21_baitap19 {
    public static void main(String[] args) {
        /* Viết chương trình nhập vào từ bàn phím hai số a, b
        Nhập 1 ký tự + , - , * , /
        Dùng function:
        1. Nếu nhập + : Tính a + b và in ra kết quả
        2. Nếu nhập - : Tính a - b và in ra kết quả
        3. Nếu nhập * : Tính a * b và in ra kết quả
        4. Nếu nhập / : Tính a / b và in ra kết quả (chú ý kiểm tra mẫu khác 0)
        */

        //cho người dùng nhập liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số a: ");
        double a = sc.nextInt();
        System.out.print("Mời nhập vào số b: ");
        double b = sc.nextInt();
        //cho người dùng chọn phép tính
        System.out.print("Mời chọn phép tính (+, -, *, /) : ");
        String phepTinh = new Scanner(System.in).nextLine();
        switch (phepTinh) {
            case ("+"): {
                add(a, b);
                break;
            }
            case ("-"): {
                minus(a, b);
                break;
            }
            case ("*"): {
                multiply(a, b);
                break;
            }
            case ("/"): {
                divide(a, b);
                break;
            }
            default: {
                System.out.println("Phím bấm không hợp lệ");
                break;
            }

        }
    }

    //hàm cộng
    public static void add(double a, double b) {
        double kq = a + b;
        System.out.println("Kết quả phép cộng: " + kq);
    }

    //hàm trừ
    public static void minus(double a, double b) {
        double kq = a - b;
        System.out.println("Kết quả phép trừ: " + kq);
    }

    //hàm nhân
    public static void multiply(double a, double b) {
        double kq = a * b;
        System.out.println("Kết quả phép nhân: " + kq);
    }

    //hàm chia
    public static void divide(double a, double b) {
        if (b == 0) {
            System.out.println("0 thì sao chia");
        } else {
            double kq = a / b;
            System.out.println("Kết quả phép chia: " + kq);
        }
    }
}
