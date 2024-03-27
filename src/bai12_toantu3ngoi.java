import java.util.Scanner;

public class bai12_toantu3ngoi {
    public static void main(String[] args) {
        // Nhâp vào ba phím 1 số, kiểm tra chẵn lẻ
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào một số n: ");
        int n = sc.nextInt();
        String traloi = (n % 2 == 0) ? "Chẵn" : "Lẻ";
        System.out.println("Số " + n + " vừa nhập là số " + traloi);
    }
}
