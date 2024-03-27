public class bai16_forjava {
    public static void main(String[] args) {
        //i = i + 2
        /*for (int i = 2; i < 12; i += 2) {
            System.out.println("i= " + i); // 2, 4, 6, 8, 10
        }*/

        //tính tổng các số từ 0 - 10 sử dụng vòng for
        int tong = 0;
        for (int i = 0; i <= 10; i++) {
            tong += i; //tong = tong + i
        }
        System.out.println("Tổng: " + tong);
    }
}
