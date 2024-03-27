import java.util.Scanner;

public class bai13_switchcase {
    public static void main(String[] args) {
        /* Nhập vào một số và tính chẵn lẻ của số đó (dùng switch case)
         */

        Scanner sc = new Scanner(System.in);
        /*System.out.print("Mời nhập vào 1 số nguyên: ");
        int a = sc.nextInt();
        //kiểm tra số dư của a khi chia cho 2
        int div = a % 2;
        switch (div) {
            case 0:
                System.out.println(a + " là số chẵn");
                break;
            default:
                System.out.println(a + " là số lẻ");
                break;*/
        /* Nhập vào 1 tháng tính ra tháng đó có bao nhiêu ngày (dùng switch case)
         */
        System.out.print("Mời nhập vào 1 tháng dương lịch: ");
        int thang = sc.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + thang + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + thang + " có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng " + thang + " có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Bạn nhập tào lao");
                break;
        }
    }
}