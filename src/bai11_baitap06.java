import java.util.Scanner;

public class bai11_baitap06 {
    public static void main(String[] args) {
       /* Viết chương trình nhập vào 1 năm dương lịch,
        kiểm tra năm đó có phải năm nhuận hay không
        Gợi ý: Năm nhuận là năm chia hết cho 4 và không chia hết cho 100
        hoặc chia hết cho 400
        Case test:
        Năm nhuận: 2004, 2008, 2012, 2016, 2020, 2024
        Năm không nhuận: 1900, 2005
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào 1 năm dương lịch: ");
        int soNam = sc.nextInt();
        if (((soNam % 4 == 0) && (soNam % 100 != 0)) || (soNam % 400 == 0)) {
            System.out.println("Năm " + soNam + " là năm nhuận");
        } else {
            System.out.println("Năm " + soNam + " không phải là năm nhuận");
        }
    }
}
