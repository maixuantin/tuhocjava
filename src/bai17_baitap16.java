public class bai17_baitap16 {
    public static void main(String[] args) {
        /* Viết chương trình: Tính tổng S = 1! + 2! + 3! +...+ 10!
         */

        int m = 1;
        int tong = 0;
        for (int i = 1; i <= 10; i++) {
            m *= i; //m = m * i
            tong += m;
        }
        System.out.println("Tổng S = " + tong);
    }
}
