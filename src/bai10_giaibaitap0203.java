import java.util.Scanner;

public class bai10_giaibaitap0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào bán kình đường tròn r: ");
        double r = sc.nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r, 2);
        //xuất kết quả
        System.out.println("Chu vi là: " + cv);
        System.out.println("Diện tích là: " + dt);

        //bài tập 03
        System.out.println("Mời nhập vào chiều dài a: ");
        double a = sc.nextDouble();
        System.out.println("Mời nhập vào chiều rộng b: ");
        double b = sc.nextDouble();
        double p = (a + b) * 2;
        double s = a * b;
        System.out.println("Chu vi là: " + p);
        System.out.println("Diện tích là: " + s);
    }
}
