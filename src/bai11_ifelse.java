import java.util.Scanner;

public class bai11_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào điểm trung bình: ");
        double dtb = sc.nextDouble();

        //kiểm tra điều kiện
        if (dtb >= 8.0 && dtb<10) {
            System.out.println("Bạn xếp loại giỏi");
        }
        else if (dtb>=7.0 && dtb <8) {
            System.out.println("Bạn xếp loại khá");
        }
        else if (dtb>=5.0 && dtb <7) {
            System.out.println("Bạn xếp loại trung bình");
        }
        else {
            System.out.println("Bạn đã tạch");
        }
    }
}
