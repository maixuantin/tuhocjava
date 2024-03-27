import java.util.Scanner;

public class bai11_baitap05 {
    public static void main(String[] args) {
      /*  Viết chương trình nhập vào chiều cao, cân nặng, tính BMI và xuất ra thông báo:
        BMI < 15: Thân hình quá gầy
        BMI >= 15 và BMI < 16: Thân hình gầy
        BMI >= 16 và BMI < 18.5: Thân hình hơi gầy
        BMI >= 18.5 và BMI < 25: Thân hình bình thường
        BMI >= 25 và BMI < 30: Thân hình hơi béo
        BMI >= 30 và BMI < 35: Thân hình béo
        BMI >= 35: Thân hình quá béo
        Gợi ý cách tính: BMI = canNang/(chieuCao ^ 2)
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào chiều cao (m): ");
        double chieuCao = sc.nextDouble();
        System.out.print("Mời nhập vào cân nặng (kg): ");
        double canNang = sc.nextDouble();
        //tính BMI
        double BMI = canNang / (Math.pow(chieuCao, 2));
        System.out.println("BMI của bạn là: " + BMI);
        if (BMI < 15) {
            System.out.println("Thân hình quá gầy");
        } else if (BMI >= 15 && BMI < 16) {
            System.out.println("Thân hình gầy");
        } else if (BMI >= 16 && BMI < 18.5) {
            System.out.println("Thân hình hơi gầy");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Thân hình bình thường");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Thân hình hơi béo");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("Thân hình béo");
        } else {
            System.out.println("Thân hình quá béo");
        }
    }
}
