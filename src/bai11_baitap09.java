import java.util.Scanner;

public class bai11_baitap09 {
    public static void main(String[] args) {
        /* Viết chương trình nhập vaào tháng trong năm, cho biết tháng đó thuộc quý mấy
        Gợi ý:
        1 năm có 4 quý, mỗi quý 3 tháng:
            + Quý 1: tháng 1, 2, 3
            + Quý 2: tháng 4, 5, 6
            + Quý 3: tháng 7, 8, 9
            + Quý 4: tháng 10, 11, 12
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào 1 tháng dương lịch: ");
        int thang = sc.nextInt();
        if (thang == 1 || thang == 2 || thang == 3) {
            System.out.println("Tháng " + thang + " thuộc Quý 1");
        } else if (thang == 4 || thang == 5 || thang == 6) {
            System.out.println("Tháng " + thang + " thuộc Quý 2");
        } else if (thang == 7 || thang == 8 || thang == 9) {
            System.out.println("Tháng " + thang + " thuộc Quý 3");
        } else if (thang == 10 || thang == 11 || thang == 12) {
            System.out.println("Tháng " + thang + " thuộc Quý 4");
        } else {
            System.out.println("Bạn nhập tháng tào lao");
        }
    }
}