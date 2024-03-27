import java.util.Random;

public class bai24_randomjava {
    public static void main(String[] args) {
        //Khởi tạo 1 đối tượng ngẫu nhiên
        Random rd = new Random();

        //1. Lấy ngẫu nhiên một số nguyên
        int soNguyen = rd.nextInt(50, 51); //chạy từ -50 cho đến < 51
        System.out.println(soNguyen);

        //2. Chạy ngẫu nhiên số thực
        double x = rd.nextDouble(-100, 100); //chạy từ -100 cho đến < 100 (có thể ra số 99.999999)
        System.out.println(x);
    }
}
