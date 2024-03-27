public class bai15_dowhile {
    public static void main(String[] args) {
        /* Tính tổng các số từ 1 đến 5
         */
        int a = 1;
        int tong = 0;
        do {
            tong += a; //tong = tong + a
            a++;
        } while (a <= 5);
        System.out.println("Tổng = " + tong);
    }
}
